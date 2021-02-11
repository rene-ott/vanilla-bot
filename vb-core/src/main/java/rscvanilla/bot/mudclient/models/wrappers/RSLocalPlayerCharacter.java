package rscvanilla.bot.api.models.wrappers;

import rscvanilla.bot.api.enums.OpCodeOut;
import rscvanilla.bot.api.models.Position;
import rscvanilla.bot.mc.MudClientWrapper;

public class RSLocalPlayerCharacter extends RSPlayerCharacter {

    public RSLocalPlayerCharacter(com.rsc.e.k object, MudClientWrapper hooker) {
        super(object, hooker);
    }

    @Override
    public Position getLocalPosition() {
        return new Position(hooker.userTileX.getValue(), hooker.userTileY.getValue());
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