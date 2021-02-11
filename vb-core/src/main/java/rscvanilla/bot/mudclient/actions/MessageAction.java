package rscvanilla.bot.api.actions;

import rscvanilla.bot.mc.MudClientWrapper;

import javax.inject.Inject;

public class MessageAction extends BaseAction {

    @Inject
    public MessageAction(MudClientWrapper hooker) {
        super(hooker);
    }


    public void sendChatMessage(String s) { hooker.sendChatMessage(s); }
}
