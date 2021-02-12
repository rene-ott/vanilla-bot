package rscvanilla.bot.mudclient.models.wrappers;

import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.mudclient.MudClientWrapper;

public class RSGroundObject extends RSEntityWrapper<com.rsc.e.e> {

    public RSGroundObject(com.rsc.e.e internalObject, MudClientWrapper mudClientWrapper) {
        super(internalObject, mudClientWrapper);
    }

    public Position getLocalPosition() { return getStaticLocalPosition(); }
}
