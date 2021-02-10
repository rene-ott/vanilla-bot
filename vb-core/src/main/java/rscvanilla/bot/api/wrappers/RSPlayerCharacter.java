package rscvanilla.bot.api.wrappers;

import rscvanilla.bot.api.models.Position;
import rscvanilla.bot.infrastructure.annotations.DependsOnExternal;
import rscvanilla.bot.mc.MudClientHooker;

public class RSPlayerCharacter extends RSEntity<com.rsc.e.k> {

    public RSPlayerCharacter(com.rsc.e.k object, MudClientHooker hooker) {
        super(object, hooker);
    }

    @DependsOnExternal
    public String getName() { return object.na; }

    public Position getLocalPosition() { return getCharacterLocalPosition(); }
}
