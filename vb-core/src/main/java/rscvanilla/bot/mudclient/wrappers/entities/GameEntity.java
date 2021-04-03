package rscvanilla.bot.mudclient.wrappers.entities;

import rscvanilla.bot.mudclient.models.contracts.GloballyPositionable;
import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.mudclient.wrappers.MudClientWrapperObject;
import rscvanilla.bot.mudclient.models.converters.PositionConverter;
import rscvanilla.bot.mudclient.wrappers.MudClientWrapper;
import rscvanilla.cjci.model.classes.rsentity.RSEntityClassFields;

public abstract class GameEntity<T extends com.rsc.e.d> extends MudClientWrapperObject<T> implements GloballyPositionable {

    protected GameEntity(T internalObject, MudClientWrapper mudClientWrapper) {
        super(internalObject, mudClientWrapper);
    }

    // Players have id set as 0
    public int getId() { return this.<Integer>getFieldValue("getId", getClassFields().id, int.class); }
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
