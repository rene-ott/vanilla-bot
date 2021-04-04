package rscvanilla.bot.mudclient.wrappers.misc;

import rscvanilla.bot.infrastructure.BotException;
import rscvanilla.bot.mudclient.wrappers.MudClientWrapper;
import rscvanilla.bot.mudclient.wrappers.MudClientWrapperObject;
import rscvanilla.bot.mudclient.wrappers.utils.MethodWrapper;

public class Panel extends MudClientWrapperObject<Object> {

    private MethodWrapper<MethodWrapper.Unit> setText;

    public Panel(Object internalObject, MudClientWrapper mudClientWrapper) {
        super(internalObject, mudClientWrapper);

        initMethods();
    }

    public void setText(int panelId, String text) {
        setText.invokeAction(panelId, text);
    }

    private void initMethods() {
        try {
            setText = getMethod("setText", getClientJarClassInfo().panel.methods.setText, int.class, String.class);
        } catch (BotException e) {
            throw BotException.of("Failed to initialize [PanelWrapper] login panel methods!", e);
        }
    }
}
