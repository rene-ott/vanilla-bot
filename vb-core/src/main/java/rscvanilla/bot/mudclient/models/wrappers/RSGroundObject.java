package rscvanilla.bot.mudclient.models.wrappers;

import com.rsc.e.e;
import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.mudclient.MudClientWrapper;

public class RSGroundObject extends RSEntityWrapper<e> {

    public RSGroundObject(com.rsc.e.e object, MudClientWrapper hooks) {
        super(object, hooks);
    }

    public Position getLocalPosition() { return getStaticLocalPosition(); }
}
