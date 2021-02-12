package rscvanilla.bot.mudclient.models.wrappers;

import rscvanilla.bot.mudclient.enums.OpCodeOut;
import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.mudclient.MudClientWrapper;

public class RSLocalPlayerCharacter extends RSPlayerCharacter {

    public RSLocalPlayerCharacter(com.rsc.e.k object, MudClientWrapper hooker) {
        super(object, hooker);
    }

    @Override
    public Position getLocalPosition() {
        return new Position(mudClientWrapper.userTileX.getValue(), mudClientWrapper.userTileY.getValue());
    }

    public int getFatigue() { return mudClientWrapper.userFatigueStat.getValue() * 100 / 750; }
    public int getCombatStyle() { return mudClientWrapper.combatStyle.getValue(); }
    public boolean isSleeping() { return mudClientWrapper.isSleeping.getValue(); }

    public void setCombatStyle(int value) {
        mudClientWrapper.combatStyle.setValue(value);
        mudClientWrapper.getPacketBuilder()
                .setOpCode(OpCodeOut.COMBAT_STYLE)
                .putByte(value)
                .send();
    }
}