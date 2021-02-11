package rscvanilla.bot.mudclient.models.wrappers;

import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.mudclient.MudClientWrapper;

public class RSNonPlayerCharacter extends RSCharacter<com.rsc.e.j> {

    public RSNonPlayerCharacter(com.rsc.e.j object, MudClientWrapper hooker) {
        super(object, hooker);
    }

    @Override
    public Position getLocalPosition() { return getDynamicLocalPosition(); }
}
