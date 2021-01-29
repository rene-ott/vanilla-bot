package rscvanilla.bot.api.action;

import rscvanilla.bot.api.BaseAction;
import rscvanilla.bot.mc.MudClientHooker;

import javax.inject.Inject;

public class LoginAction extends BaseAction {

    @Inject
    public LoginAction(MudClientHooker hooker) {
        super(hooker);
    }

    public boolean isInGame() { return hooker.isInGame(); }
    public boolean isOnLoginScreen() { return hooker.isOnLoginScreen(); }

    public void login() {
        hooker.autoLoginTimeOut.setValue(1);
        hooker.login();
    }

    public void setLoginTimeOut() {

    }

    public void logout() { hooker.logout(); }
}
