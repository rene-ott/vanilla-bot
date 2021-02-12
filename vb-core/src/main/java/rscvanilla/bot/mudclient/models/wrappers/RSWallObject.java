package rscvanilla.bot.mudclient.models.wrappers;

import com.rsc.e.m;
import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.infrastructure.annotations.DependsOnExternal;
import rscvanilla.bot.mudclient.MudClientWrapper;

public class RSWallObject extends RSEntityWrapper<m> {

    public RSWallObject(com.rsc.e.m object, MudClientWrapper hooker) {
        super(object, hooker);
    }

    @DependsOnExternal
    public int getDirection() { return this.<Integer>getField("getDirection", "mf", Integer.class).getValue(); }

    public Position getLocalPosition() { return getStaticLocalPosition(); }
}
