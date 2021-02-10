package rscvanilla.bot.api.actions;

import rscvanilla.bot.mc.MudClientHooker;

import javax.inject.Inject;

public class MessageAction extends BaseAction {

    @Inject
    public MessageAction(MudClientHooker hooker) {
        super(hooker);
    }


    public void sendChatMessage(String s) { hooker.sendChatMessage(s); }
}
