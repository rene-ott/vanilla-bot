package com.rscvanilla.bot.api.action;

import com.rscvanilla.bot.api.BaseAction;
import com.rscvanilla.bot.api.models.OpCodeOut;
import com.rscvanilla.bot.api.wrappers.RSCharacter;
import com.rscvanilla.bot.mc.MudClientHooker;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class NpcAction extends BaseAction {

    private final WalkAction walkAction;
    private final PlayerAction playerAction;

    @Inject
    public NpcAction(MudClientHooker hooks,
                     WalkAction walkAction,
                     PlayerAction playerAction
    ) {
        super(hooks);
        this.walkAction = walkAction;
        this.playerAction = playerAction;
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

        return hooker.getUser().getGlobalPosition().distanceTo(nearestNpc.getGlobalPosition()) <= distance;
    }

    public void castOnNpc(int spellId, int...ids) {
        var npc = getNearestNpcById(ids);
        if (npc == null)
            return;

        hooker.getPacketBuilder()
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

        hooker.getPacketBuilder()
                .setOpCode(opCodeOut)
                .putShort(npc.getServerIndex())
                .send();
    }

    private RSCharacter getNearestNpcById(int...ids) {
        var matchedNpcs = hooker.getNpcList()
                .stream()
                .filter(Objects::nonNull)
                .filter(it -> Arrays.stream(ids).anyMatch(id -> id == it.getId()))
                .collect(Collectors.toList());

        if (matchedNpcs.isEmpty())
            return null;

        return (RSCharacter) hooker.getUser().getNearest(matchedNpcs);
    }
}
