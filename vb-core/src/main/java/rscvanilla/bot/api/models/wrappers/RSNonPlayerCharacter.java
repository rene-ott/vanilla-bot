package rscvanilla.bot.api.models.wrappers;

import rscvanilla.bot.api.models.Position;
import rscvanilla.bot.mc.MudClientHooker;

public class RSNonPlayerCharacter extends RSCharacter<com.rsc.e.j> {

    public RSNonPlayerCharacter(com.rsc.e.j object, MudClientHooker hooker) {
        super(object, hooker);
    }

    @Override
    public Position getLocalPosition() { return getDynamicLocalPosition(); }
}
