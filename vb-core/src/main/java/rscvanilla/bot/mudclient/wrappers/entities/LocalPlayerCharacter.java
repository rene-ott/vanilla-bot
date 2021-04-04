package rscvanilla.bot.mudclient.wrappers.entities;

import rscvanilla.bot.mudclient.enums.OpCodeOut;
import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.mudclient.wrappers.MudClientWrapper;

public class LocalPlayerCharacter extends PlayerCharacter {

    public LocalPlayerCharacter(com.rsc.e.k internalObject, MudClientWrapper mudClientWrapper) {
        super(internalObject, mudClientWrapper);
    }

    @Override
    public Position getLocalPosition() {
        return new Position(mudClientWrapper.localPlayerPositionX.getValue(), mudClientWrapper.localPlayerPositionY.getValue());
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