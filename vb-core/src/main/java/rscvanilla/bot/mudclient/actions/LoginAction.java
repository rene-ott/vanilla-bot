package rscvanilla.bot.mudclient.actions;

import rscvanilla.bot.mudclient.wrappers.MudClientWrapper;

import javax.inject.Inject;

public class LoginAction extends BaseAction {

    @Inject
    public LoginAction(MudClientWrapper hooker) {
        super(hooker);
    }

    public boolean isInGame() { return mudClientWrapper.isInGame(); }
    public boolean isOnLoginScreen() { return mudClientWrapper.isOnLoginScreen(); }

    public void login() {
        mudClientWrapper.autoLoginTimeOut.setValue(1);
        mudClientWrapper.login();
    }

    public void setLoginTimeOut() {

    }

    public void logout() { mudClientWrapper.logout(); }
}
