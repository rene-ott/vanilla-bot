package rscvanilla.bot.api.wrappers;

import com.rsc.e.m;
import rscvanilla.bot.api.contracts.Positionable;
import rscvanilla.bot.api.models.Position;
import rscvanilla.bot.api.utils.PositionConverter;
import rscvanilla.bot.infrastructure.annotations.DependsOnExternal;
import rscvanilla.bot.mc.MudClientHooker;

//TODO BASE CLASS
public class RSWallObject extends WrappedObject<m> implements Positionable {
    public RSWallObject(m object, MudClientHooker hooker) {
        super(object, hooker);
    }

    @DependsOnExternal
    public int getId() {
        return object.at();
    }

    @DependsOnExternal
    public int getDirection() {
        return object.cl();
    }

    @Override
    @DependsOnExternal
    public Position getLocalPosition() {
        return new Position(object.cf(), object.cg());
    }

    @Override
    public Position getGlobalPosition() {
        return PositionConverter.toGlobalPosition(getLocalPosition(), hooker.getMidRegionBase());
    }
}
