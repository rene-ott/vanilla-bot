package rscvanilla.bot.api.models.wrappers;

import rscvanilla.bot.api.models.Position;
import rscvanilla.bot.infrastructure.annotations.DependsOnExternal;
import rscvanilla.bot.mc.MudClientHooker;

public class RSPlayerCharacter extends RSEntity<com.rsc.e.k> {

    public RSPlayerCharacter(com.rsc.e.k object, MudClientHooker hooker) {
        super(object, hooker);
    }

    @DependsOnExternal
    public String getName() { return object.na; }

    @DependsOnExternal
    public int getBubbleTimeout() { return object.mE; }

    public boolean isBusy() { return getBubbleTimeout() - 60 > 0; }

    public Position getLocalPosition() { return getDynamicLocalPosition(); }
}
