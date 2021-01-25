package com.rscvanilla.bot.api.action;

import com.rscvanilla.bot.api.BaseAction;
import com.rscvanilla.bot.mc.MudClientHooker;

import javax.inject.Inject;

public class MessageAction extends BaseAction {

    @Inject
    public MessageAction(MudClientHooker hooker) {
        super(hooker);
    }


    public void sendChatMessage(String s) { hooker.sendChatMessage(s); }
}
