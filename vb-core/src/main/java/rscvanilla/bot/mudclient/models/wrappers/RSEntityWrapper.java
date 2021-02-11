package rscvanilla.bot.mudclient.models.wrappers;

import rscvanilla.bot.mudclient.models.contracts.GloballyPositionable;
import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.mudclient.utils.PositionConverter;
import rscvanilla.bot.infrastructure.annotations.DependsOnExternal;
import rscvanilla.bot.mudclient.MudClientWrapper;

public abstract class RSEntityWrapper<T extends com.rsc.e.d> implements GloballyPositionable {

    protected T internalObject;
    protected MudClientWrapper hooker;

    protected RSEntityWrapper(T internalObject, MudClientWrapper hooker) {
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
