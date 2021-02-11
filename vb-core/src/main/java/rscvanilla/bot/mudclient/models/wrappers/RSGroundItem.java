package rscvanilla.bot.mudclient.models.wrappers;

import com.rsc.e.f;
import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.mudclient.MudClientWrapper;

public class RSGroundItem extends RSEntityWrapper<f> {

    public RSGroundItem(com.rsc.e.f object, MudClientWrapper hooks) {
        super(object, hooks);
    }

    public Position getLocalPosition() { return getStaticLocalPosition(); }
}
