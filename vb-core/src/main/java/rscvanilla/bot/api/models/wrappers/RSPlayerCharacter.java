package rscvanilla.bot.api.models.wrappers;

import rscvanilla.bot.api.models.Position;
import rscvanilla.bot.infrastructure.annotations.DependsOnExternal;
import rscvanilla.bot.mc.MudClientHooker;

public class RSPlayerCharacter extends RSCharacter<com.rsc.e.k> {

    public RSPlayerCharacter(com.rsc.e.k object, MudClientHooker hooker) {
        super(object, hooker);
    }

    @Override
    public Position getLocalPosition() { return getDynamicLocalPosition(); }

    @DependsOnExternal
    public String getName() { return internalObject.na; }
}
