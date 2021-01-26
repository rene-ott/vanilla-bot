package rscvanilla.bot.api.action;

import rscvanilla.bot.api.BaseAction;
import rscvanilla.bot.api.models.OpCodeOut;
import rscvanilla.bot.mc.MudClientHooker;

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
