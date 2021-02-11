package rscvanilla.bot.mudclient.models.wrappers;

import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.infrastructure.annotations.DependsOnExternal;
import rscvanilla.bot.mudclient.MudClientWrapper;

public class RSPlayerCharacter extends RSCharacter<com.rsc.e.k> {

    public RSPlayerCharacter(com.rsc.e.k object, MudClientWrapper hooker) {
        super(object, hooker);
    }

    @Override
    public Position getLocalPosition() { return getDynamicLocalPosition(); }

    @DependsOnExternal
    public String getName() { return internalObject.na; }
}
