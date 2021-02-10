package rscvanilla.bot.api.actions;

import rscvanilla.bot.mc.MudClientHooker;

public abstract class BaseAction {
    protected MudClientHooker hooker;

    public BaseAction(MudClientHooker hooker) {
        this.hooker = hooker;
    }
}
