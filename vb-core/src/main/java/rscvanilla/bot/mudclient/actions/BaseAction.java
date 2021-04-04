package rscvanilla.bot.mudclient.actions;

import rscvanilla.bot.mudclient.wrappers.MudClientWrapper;
import rscvanilla.bot.mudclient.wrappers.misc.PacketBuilder;

public abstract class BaseAction {
    protected MudClientWrapper mudClientWrapper;

    public BaseAction(MudClientWrapper mudClientWrapper) {
        this.mudClientWrapper = mudClientWrapper;
    }

    protected PacketBuilder getPacketBuilder() {
        return mudClientWrapper.getPacketBuilder();
    }
}
