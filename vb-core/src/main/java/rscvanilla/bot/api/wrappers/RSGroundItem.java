package rscvanilla.bot.api.wrappers;

import rscvanilla.bot.api.models.Position;
import rscvanilla.bot.mc.MudClientHooker;

public class RSGroundItem extends RSEntity<com.rsc.e.f> {

    public RSGroundItem(com.rsc.e.f object, MudClientHooker hooks) {
        super(object, hooks);
    }

    public Position getLocalPosition() { return getObjectLocalPosition(); }
}
