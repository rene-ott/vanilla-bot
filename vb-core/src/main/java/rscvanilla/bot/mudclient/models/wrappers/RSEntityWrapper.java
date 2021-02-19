package rscvanilla.bot.mudclient.models.wrappers;

import rscvanilla.bot.mudclient.models.contracts.GloballyPositionable;
import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.mudclient.utils.PositionConverter;
import rscvanilla.bot.mudclient.MudClientWrapper;
import rscvanilla.cjci.model.classes.rsentity.RSEntityClassFields;

public abstract class RSEntityWrapper<T extends com.rsc.e.d> extends RSObjectWrapper<T> implements GloballyPositionable {

    protected RSEntityWrapper(T internalObject, MudClientWrapper mudClientWrapper) {
        super(internalObject, mudClientWrapper);
    }

    // Players have id set as 0
    public int getId() { return this.<Integer>getFieldValue("getId", getClassFields().id, Integer.class); }
    private int getPixelX() { return this.<Integer>getFieldValue("getPixelX", getClassFields().pixelX, Integer.class); }
    private int getPixelY() { return this.<Integer>getFieldValue("getPixelY", getClassFields().pixelY, Integer.class); }
    public int getServerIndex() { return this.<Integer>getFieldValue("getServerIndex", getClassFields().serverIndex, Integer.class); }
    private int getLocalPositionX() { return this.<Integer>getFieldValue("getLocalPositionX", getClassFields().localPositionX, Integer.class); }
    private int getLocalPositionY() { return this.<Integer>getFieldValue("getLocalPositionY", getClassFields().localPositionY, Integer.class); }

    protected Position getStaticLocalPosition() { return new Position(getLocalPositionX(), getLocalPositionY()); }
    protected Position getDynamicLocalPosition() { return new Position((getPixelX() - 64) / 128, (getPixelY() - 64) / 128); }

    @Override
    public Position getGlobalPosition() {
        return PositionConverter.toGlobalPosition(getLocalPosition(), mudClientWrapper.getMidRegionBase());
    }

    public abstract Position getLocalPosition();

    private RSEntityClassFields getClassFields() {
        return mudClientWrapper.getClientJarClassInfo().rsEntity.fields;
    }
}
