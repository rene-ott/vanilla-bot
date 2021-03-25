package rscvanilla.bot.mudclient.actions;

import rscvanilla.bot.mudclient.enums.OpCodeOut;
import rscvanilla.bot.mudclient.MudClientWrapper;

import javax.inject.Inject;
import java.util.stream.Collectors;

public class OptionsAction extends BaseAction {

    @Inject
    public OptionsAction(MudClientWrapper hooker) {
        super(hooker);
    }

    public void answerOption(int pos) {
        mudClientWrapper.getPacketBuilder()
                .setOpCode(OpCodeOut.ANSWER)
                .putByte(pos)
                .send();
    }

    public boolean isOptionsMenuVisible() {
        return mudClientWrapper.isOptionsMenuVisible.getValue();
    }

    public boolean hasAnswerOptionText(String answerTextPrefix) {
        var answerOptions = mudClientWrapper.getOptionsMenuList()
            .stream().map(String::toLowerCase).filter(it -> it.startsWith(answerTextPrefix.toLowerCase()))
            .collect(Collectors.toList());

        return answerOptions.size() == 1;
    }
}
