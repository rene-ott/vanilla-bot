package rscvanilla.bot.mudclient.handlers.logingui;

import rscvanilla.bot.mudclient.MudClientWrapper;
import rscvanilla.bot.mudclient.handlers.InterceptionHandler;
import rscvanilla.contracts.interceptors.MudClientInitGameScreenVariablesMethodInterceptor;
import rscvanilla.contracts.interceptors.MudClientResetLoginScreenVariablesMethodInterceptor;
import rscvanilla.contracts.interceptors.MudClientSendLoginMethodInterceptor;

import javax.inject.Inject;

public class LoginGUIHandler implements InterceptionHandler,
    MudClientSendLoginMethodInterceptor, MudClientInitGameScreenVariablesMethodInterceptor, MudClientResetLoginScreenVariablesMethodInterceptor  {

    private final MudClientWrapper mudClientWrapper;

    @Inject
    public LoginGUIHandler(MudClientWrapper mudClientWrapper) {
        this.mudClientWrapper = mudClientWrapper;
    }

    @Override
    public void onBeforeSendLogin(boolean isReconnect) {
        System.out.println("onBeforeSendLogin");
    }

    @Override
    public void onBeforeResetLoginScreenVariables() {
        System.out.println("onBeforeResetLoginScreenVariables");
    }

    @Override
    public void onBeforeInitGameScreenVariables() {
        System.out.println("onBeforeInitGameScreenVariables");
    }
}
