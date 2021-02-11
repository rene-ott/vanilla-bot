package rscvanilla.bot.api.models.wrappers;

import rscvanilla.bot.api.models.contracts.GloballyPositionable;
import rscvanilla.bot.api.models.Position;
import rscvanilla.bot.api.utils.PositionConverter;
import rscvanilla.bot.infrastructure.annotations.DependsOnExternal;
import rscvanilla.bot.mc.MudClientHooker;

public abstract class RSEntity<T extends com.rsc.e.d> implements GloballyPositionable {

    protected T internalObject;
    protected MudClientHooker hooker;

    protected RSEntity(T internalObject, MudClientHooker hooker) {
        this.internalObject = internalObject;
        this.hooker = hooker;
    }

    // Players have id set as 0
    @DependsOnExternal
    public int getId() { return internalObject.at(); }

    @DependsOnExternal
    private int getPixelX() { return internalObject.ch(); }

    @DependsOnExternal
    private int getPixelY() { return internalObject.ci(); }

    @DependsOnExternal
    public int getServerIndex() { return internalObject.ce(); }

    @DependsOnExternal
    protected Position getStaticLocalPosition() { return new Position(internalObject.cf(), internalObject.cg()); }
    protected Position getDynamicLocalPosition() { return new Position((getPixelX() - 64) / 128, (getPixelY() - 64) / 128); }

    @Override
    public Position getGlobalPosition() {
        return PositionConverter.toGlobalPosition(getLocalPosition(), hooker.getMidRegionBase());
    }

    public abstract Position getLocalPosition();
}
