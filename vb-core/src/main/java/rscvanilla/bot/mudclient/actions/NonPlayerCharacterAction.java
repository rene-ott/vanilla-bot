package rscvanilla.bot.mudclient.actions;

import rscvanilla.bot.mudclient.enums.OpCodeOut;
import rscvanilla.bot.mudclient.models.wrappers.RSNonPlayerCharacter;
import rscvanilla.bot.mudclient.MudClientWrapper;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class NonPlayerCharacterAction extends BaseAction {

    private final WalkAction walkAction;
    private final PlayerCharacterAction playerCharacterAction;

    @Inject
    public NonPlayerCharacterAction(MudClientWrapper hooks,
                                    WalkAction walkAction,
                                    PlayerCharacterAction playerCharacterAction
    ) {
        super(hooks);
        this.walkAction = walkAction;
        this.playerCharacterAction = playerCharacterAction;
    }

    public boolean isNpcNear(int...ids) {
        return getNearestNpcById(ids) != null;
    }

    public void attackNpcById(int...ids) {
        atNpc(OpCodeOut.NPC_ATTACK1, ids);
    }

    public void pickpocketNpcById(int...ids) {
        atNpc(OpCodeOut.NPC_COMMAND1, ids);
    }

    public void talkToNpc(int...ids) {
        atNpc(OpCodeOut.NPC_TALK_TO, ids);
    }

    public boolean isNpcInDistance(int id, int distance) {
        var nearestNpc = getNearestNpcById(id);
        if (nearestNpc == null)
            return false;

        return mudClientWrapper.getUser().getGlobalPosition().distanceTo(nearestNpc.getGlobalPosition()) <= distance;
    }

    public void castOnNpc(int spellId, int...ids) {
        var npc = getNearestNpcById(ids);
        if (npc == null)
            return;

        mudClientWrapper.getPacketBuilder()
                .setOpCode(OpCodeOut.NPC_CAST_SPELL)
                .putShort(spellId)
                .putShort(npc.getServerIndex())
                .send();
    }

    private void atNpc(OpCodeOut opCodeOut, int...ids) {
        var npc = getNearestNpcById(ids);
        if (npc == null)
            return;

        walkAction.walkToAction(npc.getGlobalPosition());

        mudClientWrapper.getPacketBuilder()
                .setOpCode(opCodeOut)
                .putShort(npc.getServerIndex())
                .send();
    }

    private RSNonPlayerCharacter getNearestNpcById(int...ids) {
        var matchedNpcs = mudClientWrapper.getNpcList()
                .stream()
                .filter(Objects::nonNull)
                .filter(it -> Arrays.stream(ids).anyMatch(id -> id == it.getId()))
                .collect(Collectors.toList());

        if (matchedNpcs.isEmpty())
            return null;

        return (RSNonPlayerCharacter) mudClientWrapper.getUser().getNearest(matchedNpcs);
    }
}
