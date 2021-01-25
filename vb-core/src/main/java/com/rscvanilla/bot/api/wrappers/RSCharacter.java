package com.rscvanilla.bot.api.wrappers;

import com.rscvanilla.bot.api.contracts.Positionable;
import com.rscvanilla.bot.api.models.Position;
import com.rscvanilla.bot.api.utils.PositionConverter;
import com.rscvanilla.bot.infrastructure.annotations.DependsOnExternal;
import com.rscvanilla.bot.mc.MudClientHooker;

//TODO: BASE CLASS
public class RSCharacter extends WrappedObject<com.rsc.e.j> implements Positionable {

    public RSCharacter(com.rsc.e.j object, MudClientHooker hooks) {
        super(object, hooks);
    }

    @DependsOnExternal
    public int getId() {
        return object.at();
    }

    @Override
    public Position getLocalPosition() {
        return new Position((getPixelX() - 64) / 128, (getPixelY() - 64) / 128); }

    @Override
    public Position getGlobalPosition() {
        return PositionConverter.toGlobalPosition(getLocalPosition(), hooker.getMidRegionBase());
    }

    @DependsOnExternal
    private int getPixelX() { return object.ch(); }

    @DependsOnExternal
    private int getPixelY() { return object.ci(); }

    @DependsOnExternal
    public int getServerIndex() { return object.ce(); }
}
