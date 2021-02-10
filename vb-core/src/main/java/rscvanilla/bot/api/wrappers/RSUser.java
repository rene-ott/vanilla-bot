package rscvanilla.bot.api.wrappers;

import rscvanilla.bot.api.models.OpCodeOut;
import rscvanilla.bot.api.models.Position;
import rscvanilla.bot.infrastructure.annotations.DependsOnExternal;
import rscvanilla.bot.mc.MudClientHooker;

public class RSUser extends RSEntity<com.rsc.e.k> {

    public RSUser(com.rsc.e.k object, MudClientHooker hooker) {
        super(object, hooker);
    }

    public String getName() {
        return hooker.userName.getValue();
    }

    public boolean isBusy() {
        return (getBubbleTimeout() - 60) > 0;
    }

    @DependsOnExternal
    public boolean isInCombat() {
        return com.rsc.c.al != 0 && (object.cl() == 8 || object.cl() == 9) || com.rsc.c.al == 2;
    }

    @DependsOnExternal
    private int getBubbleTimeout() {
        return hooker.user.getValue().mE;
    }

    public Position getLocalPosition() { return getCharacterLocalPosition(); }

    public int getFatigue() { return hooker.userFatigueStat.getValue() * 100 / 750; }
    public int getCombatStyle() { return hooker.combatStyle.getValue(); }
    public boolean isSleeping() { return hooker.isSleeping.getValue(); }

    public void setCombatStyle(int value) {
        hooker.combatStyle.setValue(value);
        hooker.getPacketBuilder()
                .setOpCode(OpCodeOut.COMBAT_STYLE)
                .putByte(value)
                .send();
    }
}