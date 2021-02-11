package rscvanilla.bot.mudclient.actions;

import rscvanilla.bot.mudclient.MudClientWrapper;

public abstract class BaseAction {
    protected MudClientWrapper hooker;

    public BaseAction(MudClientWrapper hooker) {
        this.hooker = hooker;
    }
}
