package rscvanilla.bot.api.wrappers;

import com.rsc.e.e;
import rscvanilla.bot.api.contracts.Positionable;
import rscvanilla.bot.api.models.Position;
import rscvanilla.bot.api.utils.PositionConverter;
import rscvanilla.bot.infrastructure.annotations.DependsOnExternal;
import rscvanilla.bot.mc.MudClientHooker;

//TODO BASE CLASS
public class RSObject extends WrappedObject<e> implements Positionable {

    public RSObject(e object, MudClientHooker hooks) {
        super(object, hooks);
    }

    @DependsOnExternal
    public int getId() {
        return object.at();
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
