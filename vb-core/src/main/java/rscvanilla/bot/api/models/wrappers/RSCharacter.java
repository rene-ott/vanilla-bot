package rscvanilla.bot.api.models.wrappers;

import rscvanilla.bot.api.models.Position;
import rscvanilla.bot.infrastructure.annotations.DependsOnExternal;
import rscvanilla.bot.mc.MudClientHooker;

public abstract class RSCharacter<T extends com.rsc.e.i> extends RSEntity<T> {

    public RSCharacter(T object, MudClientHooker hooker) {
        super(object, hooker);
    }

    @DependsOnExternal
    public int getBubbleTimeout() { return object.mE; }

    @DependsOnExternal
    public int getCurrentHealthLevel() { return object.mN; }

    @DependsOnExternal
    public int getHealthLevel() { return object.mO; }

    @DependsOnExternal
    protected Direction getDirection() { return Direction.of(object.cl()); }

    @DependsOnExternal
    public int getCombatLevel() { return object.mQ; }

    public boolean isInCombat() {
        return getDirection() == Direction.COMBAT1 || getDirection() == Direction.COMBAT2;
    }

    public boolean isBusy() { return getBubbleTimeout() - 60 > 0; }
    public Position getLocalPosition() { return getDynamicLocalPosition(); }
}
