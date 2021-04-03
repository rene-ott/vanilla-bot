package rscvanilla.bot.mudclient.wrappers.entities;

import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.mudclient.wrappers.MudClientWrapper;
import rscvanilla.cjci.model.classes.rswallobject.RSWallObjectClassFields;

public class WallObject extends GameEntity<com.rsc.e.m> {

    public WallObject(com.rsc.e.m internalObject, MudClientWrapper mudClientWrapper) {
        super(internalObject, mudClientWrapper);
    }

    public int getDirection() { return this.<Integer>getFieldValue("getDirection", getClassFields().direction, Integer.class); }

    public Position getLocalPosition() { return getStaticLocalPosition(); }

    private RSWallObjectClassFields getClassFields() {
        return mudClientWrapper.getClientJarClassInfo().rsWallObject.fields;
    }
}
