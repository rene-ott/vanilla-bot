package rscvanilla.bot.mudclient.wrappers.entities;

import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.mudclient.wrappers.MudClientWrapper;

public class GroundObject extends GameEntity<com.rsc.e.e> {

    public GroundObject(com.rsc.e.e internalObject, MudClientWrapper mudClientWrapper) {
        super(internalObject, mudClientWrapper);
    }

    public Position getLocalPosition() { return getStaticLocalPosition(); }
}
