package rscvanilla.bot.mudclient.models.wrappers;

import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.infrastructure.annotations.DependsOnExternal;
import rscvanilla.bot.mudclient.MudClientWrapper;

public class RSWallObject extends RSEntityWrapper<com.rsc.e.m> {

    public RSWallObject(com.rsc.e.m internalObject, MudClientWrapper hooker) {
        super(internalObject, hooker);
    }

    @DependsOnExternal
    public int getDirection() { return this.<Integer>getField("getDirection", "mf", Integer.class).getValue(); }

    public Position getLocalPosition() { return getStaticLocalPosition(); }
}
