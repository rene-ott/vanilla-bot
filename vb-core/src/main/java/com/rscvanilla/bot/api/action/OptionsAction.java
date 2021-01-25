package com.rscvanilla.bot.api.action;

import com.rscvanilla.bot.api.BaseAction;
import com.rscvanilla.bot.api.models.OpCodeOut;
import com.rscvanilla.bot.mc.MudClientHooker;

import javax.inject.Inject;

public class OptionsAction extends BaseAction {

    @Inject
    public OptionsAction(MudClientHooker hooker) {
        super(hooker);
    }

    public void answerOption(int pos) {
        hooker.getPacketBuilder()
                .setOpCode(OpCodeOut.ANSWER)
                .putByte(pos)
                .send();
    }

    public boolean isOptionsMenuVisible() {
        return hooker.isOptionsMenuVisible.getValue();
    }
}
