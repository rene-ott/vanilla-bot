package rscvanilla.bot.api.models.wrappers;

import rscvanilla.bot.infrastructure.annotations.DependsOnExternal;
import rscvanilla.bot.mc.MudClientHooker;

public class RSPlayerCharacter extends RSCharacter<com.rsc.e.k> {

    public RSPlayerCharacter(com.rsc.e.k object, MudClientHooker hooker) {
        super(object, hooker);
    }

    @DependsOnExternal
    public String getName() { return object.na; }
}
