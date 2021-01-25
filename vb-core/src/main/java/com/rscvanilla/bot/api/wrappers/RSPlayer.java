package com.rscvanilla.bot.api.wrappers;

import com.rscvanilla.bot.api.contracts.Positionable;
import com.rscvanilla.bot.api.models.Position;
import com.rscvanilla.bot.api.utils.PositionConverter;
import com.rscvanilla.bot.infrastructure.annotations.DependsOnExternal;
import com.rscvanilla.bot.mc.MudClientHooker;

//TODO BASE CLASS, MIGHT GET POSITION BY X, Y
public class RSPlayer extends WrappedObject<com.rsc.e.k> implements Positionable {

    public RSPlayer(com.rsc.e.k object, MudClientHooker hooker) {
        super(object, hooker);
    }

    @DependsOnExternal
    public String getName() {
        return object.na;
    }

    @DependsOnExternal
    public boolean isInCombat() { return object.cl() == 8 || object.cl() == 9; }

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
}
