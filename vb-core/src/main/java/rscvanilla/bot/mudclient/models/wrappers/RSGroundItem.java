package rscvanilla.bot.mudclient.models.wrappers;

import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.mudclient.MudClientWrapper;

public class RSGroundItem extends RSEntityWrapper<com.rsc.e.f> {

    public RSGroundItem(com.rsc.e.f internalObject, MudClientWrapper mudClientWrapper) {
        super(internalObject, mudClientWrapper);
    }

    public Position getLocalPosition() { return getStaticLocalPosition(); }
}
