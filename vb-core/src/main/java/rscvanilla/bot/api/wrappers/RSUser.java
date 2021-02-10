package rscvanilla.bot.api.wrappers;

import com.rsc.e.k;
import rscvanilla.bot.api.contracts.Positionable;
import rscvanilla.bot.api.models.OpCodeOut;
import rscvanilla.bot.api.models.Position;
import rscvanilla.bot.api.utils.PositionConverter;
import rscvanilla.bot.infrastructure.annotations.DependsOnExternal;
import rscvanilla.bot.mc.MudClientHooker;

//TODO BASE CLASS
public class RSUser extends WrappedObject<k> implements Positionable {

    public RSUser(k object, MudClientHooker hooker) {
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

    @Override
    public Position getLocalPosition() {
        return new Position(hooker.userTileX.getValue(), hooker.userTileY.getValue());
    }

    @Override
    public Position getGlobalPosition() {
        return PositionConverter.toGlobalPosition(getLocalPosition(), hooker.getMidRegionBase());
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