package rscvanilla.bot.mudclient.actions;

import rscvanilla.bot.mudclient.MudClientWrapper;
import rscvanilla.bot.mudclient.PacketBuilderWrapper;

public abstract class BaseAction {
    protected MudClientWrapper mudClientWrapper;

    public BaseAction(MudClientWrapper mudClientWrapper) {
        this.mudClientWrapper = mudClientWrapper;
    }

    protected PacketBuilderWrapper getPacketBuilder() {
        return mudClientWrapper.getPacketBuilder();
    }
}
