package rscvanilla.bot.api.models.wrappers;

import rscvanilla.bot.api.enums.OpCodeOut;
import rscvanilla.bot.infrastructure.annotations.DependsOnExternal;
import rscvanilla.bot.mc.MudClientHooker;

public class RSUser extends RSPlayerCharacter {

    public RSUser(com.rsc.e.k object, MudClientHooker hooker) {
        super(object, hooker);
    }

    @DependsOnExternal
    public boolean isInCombat() {
        return com.rsc.c.al != 0 && (object.cl() == 8 || object.cl() == 9) || com.rsc.c.al == 2;
    }

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