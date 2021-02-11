package rscvanilla.bot.api.models.wrappers;

import com.rsc.e.f;
import rscvanilla.bot.api.models.Position;
import rscvanilla.bot.mc.MudClientWrapper;

public class RSGroundItem extends RSEntityWrapper<f> {

    public RSGroundItem(com.rsc.e.f object, MudClientWrapper hooks) {
        super(object, hooks);
    }

    public Position getLocalPosition() { return getStaticLocalPosition(); }
}
