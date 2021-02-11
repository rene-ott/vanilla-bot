package rscvanilla.bot.api.models.wrappers;

import rscvanilla.bot.mc.MudClientHooker;

public class RSNonPlayerCharacter extends RSCharacter<com.rsc.e.j> {

    public RSNonPlayerCharacter(com.rsc.e.j object, MudClientHooker hooks) {
        super(object, hooks);
    }
}
