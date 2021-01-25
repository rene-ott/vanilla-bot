package com.rscvanilla.bot.api.wrappers;

import com.rsc.e.m;
import com.rscvanilla.bot.api.contracts.Positionable;
import com.rscvanilla.bot.api.models.Position;
import com.rscvanilla.bot.infrastructure.annotations.DependsOnExternal;
import com.rscvanilla.bot.mc.MudClientHooker;

//TODO BASE CLASS
public class RSWallObject extends WrappedObject<m> implements Positionable {
    public RSWallObject(m object, MudClientHooker hooker) {
        super(object, hooker);
    }

    @DependsOnExternal
    public int getId() {
        return object.at();
    }

    @DependsOnExternal
    public int getDirection() {
        return object.cl();
    }

    @Override
    @DependsOnExternal
    public Position getLocalPosition() {
        return new Position(object.ce(), object.cf());
    }

    @Override
    public Position getGlobalPosition() {
        return new Position(getLocalPosition().getX() + hooker.midRegionBaseX.getValue(), getLocalPosition().getY() + hooker.midRegionBaseZ.getValue());
    }
}
