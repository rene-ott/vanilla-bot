package rscvanilla.bot.api.models.wrappers;

import rscvanilla.bot.api.models.Position;
import rscvanilla.bot.mc.MudClientWrapper;

public class RSNonPlayerCharacter extends RSCharacter<com.rsc.e.j> {

    public RSNonPlayerCharacter(com.rsc.e.j object, MudClientWrapper hooker) {
        super(object, hooker);
    }

    @Override
    public Position getLocalPosition() { return getDynamicLocalPosition(); }
}
