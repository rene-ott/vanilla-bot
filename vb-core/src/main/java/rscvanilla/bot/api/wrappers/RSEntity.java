package rscvanilla.bot.api.wrappers;

import com.rsc.e.d;
import rscvanilla.bot.api.contracts.GloballyPositionable;
import rscvanilla.bot.api.models.Position;
import rscvanilla.bot.api.utils.PositionConverter;
import rscvanilla.bot.mc.MudClientHooker;

public abstract class RSEntity<T extends d> extends WrappedObject<T> implements GloballyPositionable {

    protected RSEntity(T object, MudClientHooker hooker) {
        super(object, hooker);
    }

    public int getId() { return object.at(); }
    private int getPixelX() { return object.ch(); }
    private int getPixelY() { return object.ci(); }
    public int getServerIndex() { return object.ce(); }

    protected Position getObjectLocalPosition() { return new Position(object.cf(), object.cg()); }
    protected Position getCharacterLocalPosition() { return new Position((getPixelX() - 64) / 128, (getPixelY() - 64) / 128); }

    @Override
    public Position getGlobalPosition() {
        return PositionConverter.toGlobalPosition(getLocalPosition(), hooker.getMidRegionBase());
    }

    public abstract Position getLocalPosition();
}
