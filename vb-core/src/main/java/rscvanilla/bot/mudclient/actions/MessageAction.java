package rscvanilla.bot.mudclient.actions;

import rscvanilla.bot.mudclient.wrappers.MudClientWrapper;

import javax.inject.Inject;

public class MessageAction extends BaseAction {

    @Inject
    public MessageAction(MudClientWrapper hooker) {
        super(hooker);
    }


    public void sendChatMessage(String s) { mudClientWrapper.sendChatMessage(s); }
}
