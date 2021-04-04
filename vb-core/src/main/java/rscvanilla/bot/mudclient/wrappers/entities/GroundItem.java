package rscvanilla.bot.mudclient.wrappers.entities;

import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.mudclient.wrappers.MudClientWrapper;

public class GroundItem extends GameEntity<com.rsc.e.f> {

    public GroundItem(com.rsc.e.f internalObject, MudClientWrapper mudClientWrapper) {
        super(internalObject, mudClientWrapper);
    }

    public Position getLocalPosition() { return getStaticLocalPosition(); }
}
