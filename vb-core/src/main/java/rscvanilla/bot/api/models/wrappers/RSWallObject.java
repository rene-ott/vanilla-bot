package rscvanilla.bot.api.models.wrappers;

import rscvanilla.bot.api.models.Position;
import rscvanilla.bot.infrastructure.annotations.DependsOnExternal;
import rscvanilla.bot.mc.MudClientHooker;

public class RSWallObject extends RSEntity<com.rsc.e.m> {

    public RSWallObject(com.rsc.e.m object, MudClientHooker hooker) {
        super(object, hooker);
    }

    @DependsOnExternal
    public int getDirection() { return internalObject.cl(); }

    public Position getLocalPosition() { return getStaticLocalPosition(); }
}
