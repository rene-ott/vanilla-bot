package rscvanilla.bot.mudclient.models.wrappers;

import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.infrastructure.annotations.DependsOnExternal;
import rscvanilla.bot.mudclient.MudClientWrapper;

public abstract class RSCharacter<T extends com.rsc.e.i> extends RSEntityWrapper<T> {

    public RSCharacter(T object, MudClientWrapper hooker) {
        super(object, hooker);
    }

    @DependsOnExternal public int getBubbleTimeout() { return this.<Integer>getField("getBubbleTimeout", "mE", Integer.class).getValue(); }
    @DependsOnExternal public int getCurrentHealthLevel() { return this.<Integer>getField("getCurrentHealthLevel", "mN", Integer.class).getValue(); }
    @DependsOnExternal public int getHealthLevel() { return this.<Integer>getField("getHealthLevel", "mO", Integer.class).getValue(); }
    @DependsOnExternal protected Direction getDirection() { return Direction.of(this.<Integer>getField("getDirection", "mF", Integer.class).getValue()); }
    @DependsOnExternal public int getCombatLevel() { return this.<Integer>getField("getCombatLevel", "mQ", Integer.class).getValue(); }

    public boolean isInCombat() { return getDirection() == Direction.COMBAT1 || getDirection() == Direction.COMBAT2; }

    public boolean isBusy() { return getBubbleTimeout() - 60 > 0; }

    public abstract Position getLocalPosition();
}
