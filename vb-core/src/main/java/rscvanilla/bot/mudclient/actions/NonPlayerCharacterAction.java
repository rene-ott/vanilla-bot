package rscvanilla.bot.mudclient.actions;

import rscvanilla.bot.mudclient.MudClientWrapper;
import rscvanilla.bot.mudclient.enums.OpCodeOut;
import rscvanilla.bot.mudclient.models.wrappers.RSNonPlayerCharacter;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.stream.Collectors;

public class NonPlayerCharacterAction extends BaseAction {

    private final WalkAction walkAction;

    @Inject
    public NonPlayerCharacterAction(MudClientWrapper hooks,
                                    WalkAction walkAction
    ) {
        super(hooks);
        this.walkAction = walkAction;
    }

    public boolean isNpcNear(int...ids) {
        return getNearestNpcById(false, ids) != null;
    }

    public void attackNpcById(int...ids) {
        atNpc(true, true, OpCodeOut.NPC_ATTACK1, ids);
    }

    public void pickpocketNpcById(int...ids) {
        atNpc(false, true, OpCodeOut.NPC_COMMAND1, ids);
    }

    public void talkToNpc(int...ids) {
        atNpc(false, true, OpCodeOut.NPC_TALK_TO, ids);
    }

    public void castOnNpc(int spellId, int...ids) {
        var npc = getNearestAttackableNpcById(false, ids);
        if (npc == null)
            return;

        mudClientWrapper.getPacketBuilder()
                .setOpCode(OpCodeOut.NPC_CAST_SPELL)
                .putShort(spellId)
                .putShort(npc.getServerIndex())
                .send();
    }

    private void atNpc(boolean mustBeAttackable, boolean mustNotBeInCombat, OpCodeOut opCodeOut, int...ids) {
        var npc = mustBeAttackable
            ? getNearestAttackableNpcById(mustNotBeInCombat)
            : getNearestNpcById(mustNotBeInCombat, ids);

        if (npc == null)
            return;

        walkAction.walkToAction(npc.getGlobalPosition());

        mudClientWrapper.getPacketBuilder()
                .setOpCode(opCodeOut)
                .putShort(npc.getServerIndex())
                .send();
    }

    private RSNonPlayerCharacter getNearestAttackableNpcById(boolean mustNotBeInCombat, int...ids) {
        return getNearestNpcById(true, mustNotBeInCombat, ids);
    }

    private RSNonPlayerCharacter getNearestNpcById(boolean mustNotBeInCombat, int...ids) {
        return getNearestNpcById(false, mustNotBeInCombat, ids);
    }

    private RSNonPlayerCharacter getNearestNpcById(boolean mustBeAttackable, boolean mustNotBeInCombat, int...ids) {
        var matchedNpcs = mudClientWrapper.getNpcList()
            .stream()
            .filter(it -> (!mustBeAttackable || it.isAttackable()))
            .filter(it -> (!mustNotBeInCombat || !it.isInCombat()))
            .filter(it -> Arrays.stream(ids).anyMatch(id -> id == it.getId()))
            .collect(Collectors.toList());

        if (matchedNpcs.isEmpty())
            return null;

        return (RSNonPlayerCharacter) mudClientWrapper.getUser().getNearest(matchedNpcs);
    }
}
