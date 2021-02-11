package rscvanilla.bot.api.actions;

import rscvanilla.bot.api.enums.OpCodeOut;
import rscvanilla.bot.mc.MudClientWrapper;

import javax.inject.Inject;

public class OptionsAction extends BaseAction {

    @Inject
    public OptionsAction(MudClientWrapper hooker) {
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
