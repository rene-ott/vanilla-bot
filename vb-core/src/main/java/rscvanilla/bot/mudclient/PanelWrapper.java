package rscvanilla.bot.mudclient;

import rscvanilla.bot.infrastructure.BotException;
import rscvanilla.cjci.model.ClientJarClassInfo;

public class PanelWrapper {

    private final Object internalLoginPanel;
    private final ClientJarClassInfo clientJarClassInfo;

    private MethodWrapper<MethodWrapper.Unit> setText;

    public PanelWrapper(Object internalLoginPanel, ClientJarClassInfo clientJarClassInfo) {
        this.internalLoginPanel = internalLoginPanel;
        this.clientJarClassInfo = clientJarClassInfo;

        initMethods();
    }

    public void setText(int panelId, String text) {
        setText.invokeAction(panelId, text);
    }

    private void initMethods() {
        try {
            setText = initMethod("setText", clientJarClassInfo.panel.methods.setText, int.class, String.class);
        } catch (BotException e) {
            throw BotException.of("Failed to initialize [PanelWrapper] login panel methods!", e);
        }
    }

    private <T> MethodWrapper<T> initMethod(String displayMethodName, String methodName, Class<?>...methodParamTypes) {
        return WrapperTool.loadMethod(internalLoginPanel, null, displayMethodName, methodName, methodParamTypes);
    }
}
