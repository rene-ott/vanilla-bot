package rscvanilla.bot.mudclient.actions;

import rscvanilla.bot.mudclient.MudClientWrapper;

public abstract class BaseAction {
    protected MudClientWrapper mudClientWrapper;

    public BaseAction(MudClientWrapper mudClientWrapper) {
        this.mudClientWrapper = mudClientWrapper;
    }
}
