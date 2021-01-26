package rscvanilla.bot.api;

import rscvanilla.bot.mc.MudClientHooker;

public abstract class BaseAction {
    protected MudClientHooker hooker;

    public BaseAction(MudClientHooker hooker) {
        this.hooker = hooker;
    }
}
