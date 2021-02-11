package rscvanilla.bot.api.models.wrappers;

import com.rsc.e.m;
import rscvanilla.bot.api.models.Position;
import rscvanilla.bot.infrastructure.annotations.DependsOnExternal;
import rscvanilla.bot.mc.MudClientWrapper;

public class RSWallObject extends RSEntityWrapper<m> {

    public RSWallObject(com.rsc.e.m object, MudClientWrapper hooker) {
        super(object, hooker);
    }

    @DependsOnExternal
    public int getDirection() { return internalObject.cl(); }

    public Position getLocalPosition() { return getStaticLocalPosition(); }
}
