package rscvanilla.bot.mudclient.models.wrappers;

import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.mudclient.MudClientWrapper;
import rscvanilla.cjci.model.classes.rswallobject.RSWallObjectClassFields;

public class RSWallObject extends RSEntityWrapper<com.rsc.e.m> {

    public RSWallObject(com.rsc.e.m internalObject, MudClientWrapper mudClientWrapper) {
        super(internalObject, mudClientWrapper);
    }

    public int getDirection() { return this.<Integer>getFieldValue("getDirection", getClassFields().direction, Integer.class); }

    public Position getLocalPosition() { return getStaticLocalPosition(); }

    private RSWallObjectClassFields getClassFields() {
        return mudClientWrapper.getClientJarClassInfo().rsWallObject.fields;
    }
}
