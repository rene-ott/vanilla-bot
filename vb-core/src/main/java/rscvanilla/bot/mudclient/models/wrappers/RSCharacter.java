package rscvanilla.bot.api.models.wrappers;

import rscvanilla.bot.api.models.Position;
import rscvanilla.bot.infrastructure.annotations.DependsOnExternal;
import rscvanilla.bot.mc.MudClientWrapper;

public abstract class RSCharacter<T extends com.rsc.e.i> extends RSEntityWrapper<T> {

    public RSCharacter(T object, MudClientWrapper hooker) {
        super(object, hooker);
    }

    @DependsOnExternal
    public int getBubbleTimeout() { return internalObject.mE; }

    @DependsOnExternal
    public int getCurrentHealthLevel() { return internalObject.mN; }

    @DependsOnExternal
    public int getHealthLevel() { return internalObject.mO; }

    @DependsOnExternal
    protected Direction getDirection() { return Direction.of(internalObject.cl()); }

    @DependsOnExternal
    public int getCombatLevel() { return internalObject.mQ; }

    public boolean isInCombat() { return getDirection() == Direction.COMBAT1 || getDirection() == Direction.COMBAT2; }

    public boolean isBusy() { return getBubbleTimeout() - 60 > 0; }

    public abstract Position getLocalPosition();
}
