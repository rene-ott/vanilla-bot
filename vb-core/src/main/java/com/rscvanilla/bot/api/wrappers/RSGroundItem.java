package com.rscvanilla.bot.api.wrappers;

import com.rscvanilla.bot.api.contracts.Positionable;
import com.rscvanilla.bot.api.models.Position;
import com.rscvanilla.bot.infrastructure.annotations.DependsOnExternal;
import com.rscvanilla.bot.mc.MudClientHooker;

//TODO BASE CLASS
public class RSGroundItem extends WrappedObject<com.rsc.e.f> implements Positionable {

    public RSGroundItem(com.rsc.e.f object, MudClientHooker hooks) {
        super(object, hooks);
    }

    @DependsOnExternal
    public int getId() {
        return object.at();
    }

    @Override
    @DependsOnExternal
    public Position getLocalPosition() {
        return new Position(object.cf(), object.cg());
    }

    @Override
    public Position getGlobalPosition() {
        return new Position(getLocalPosition().getX()+ hooker.midRegionBaseX.getValue(), getLocalPosition().getY() + hooker.midRegionBaseZ.getValue());
    }
}
