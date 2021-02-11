package rscvanilla.bot.api.actions;

import rscvanilla.bot.mc.MudClientWrapper;

public abstract class BaseAction {
    protected MudClientWrapper hooker;

    public BaseAction(MudClientWrapper hooker) {
        this.hooker = hooker;
    }
}
