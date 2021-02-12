package rscvanilla.bot.mudclient.models.wrappers;

import rscvanilla.bot.infrastructure.annotations.DependsOnExternal;
import rscvanilla.bot.mudclient.FieldWrapper;
import rscvanilla.bot.mudclient.WrapperTool;
import rscvanilla.bot.mudclient.models.contracts.GloballyPositionable;
import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.mudclient.utils.PositionConverter;
import rscvanilla.bot.mudclient.MudClientWrapper;

public abstract class RSEntityWrapper<T extends com.rsc.e.d> implements GloballyPositionable {

    protected T internalObject;
    protected MudClientWrapper mudClientWrapper;

    protected RSEntityWrapper(T internalObject, MudClientWrapper mudClientWrapper) {
        this.internalObject = internalObject;
        this.mudClientWrapper = mudClientWrapper;
    }

    // Players have id set as 0
    @DependsOnExternal public int getId() { return this.<Integer>getField("getId", "bq", Integer.class).getValue(); }
    @DependsOnExternal private int getPixelX() { return this.<Integer>getField("getPixelX", "mc", Integer.class).getValue(); }
    @DependsOnExternal private int getPixelY() { return this.<Integer>getField("getPixelY", "md", Integer.class).getValue(); }
    @DependsOnExternal public int getServerIndex() { return this.<Integer>getField("getServerIndex", "lZ", Integer.class).getValue(); }
    @DependsOnExternal private int getLocalPositionX() { return this.<Integer>getField("getLocalPositionX", "ma", Integer.class).getValue(); }
    @DependsOnExternal private int getLocalPositionY() { return this.<Integer>getField("getLocalPositionY", "mb", Integer.class).getValue(); }

    protected Position getStaticLocalPosition() { return new Position(getLocalPositionX(), getLocalPositionY()); }
    protected Position getDynamicLocalPosition() { return new Position((getPixelX() - 64) / 128, (getPixelY() - 64) / 128); }

    @Override
    public Position getGlobalPosition() {
        return PositionConverter.toGlobalPosition(getLocalPosition(), mudClientWrapper.getMidRegionBase());
    }

    public abstract Position getLocalPosition();

    protected <TField> FieldWrapper<TField> getField(String fieldDisplayName, String fieldName, Class<?> fieldReturnType) {
        return WrapperTool.loadField(this, null, fieldDisplayName, fieldName, fieldReturnType);
    }
}
