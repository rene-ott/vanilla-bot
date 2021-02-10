package rscvanilla.bot.api.models.wrappers;

import com.rsc.e.d;
import rscvanilla.bot.api.models.contracts.GloballyPositionable;
import rscvanilla.bot.api.models.Position;
import rscvanilla.bot.api.utils.PositionConverter;
import rscvanilla.bot.infrastructure.annotations.DependsOnExternal;
import rscvanilla.bot.mc.MudClientHooker;

public abstract class RSEntity<T extends d> extends WrappedObject<T> implements GloballyPositionable {

    protected RSEntity(T object, MudClientHooker hooker) {
        super(object, hooker);
    }

    @DependsOnExternal
    public int getId() { return object.at(); }

    @DependsOnExternal
    private int getPixelX() { return object.ch(); }

    @DependsOnExternal
    private int getPixelY() { return object.ci(); }

    @DependsOnExternal
    public int getServerIndex() { return object.ce(); }

    @DependsOnExternal
    protected Position getStaticLocalPosition() { return new Position(object.cf(), object.cg()); }
    protected Position getDynamicLocalPosition() { return new Position((getPixelX() - 64) / 128, (getPixelY() - 64) / 128); }

    @Override
    public Position getGlobalPosition() {
        return PositionConverter.toGlobalPosition(getLocalPosition(), hooker.getMidRegionBase());
    }

    public abstract Position getLocalPosition();

}
