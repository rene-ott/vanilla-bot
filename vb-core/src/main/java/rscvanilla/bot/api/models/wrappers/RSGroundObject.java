package rscvanilla.bot.api.models.wrappers;

import com.rsc.e.e;
import rscvanilla.bot.api.models.Position;
import rscvanilla.bot.mc.MudClientWrapper;

public class RSGroundObject extends RSEntityWrapper<e> {

    public RSGroundObject(com.rsc.e.e object, MudClientWrapper hooks) {
        super(object, hooks);
    }

    public Position getLocalPosition() { return getStaticLocalPosition(); }
}
