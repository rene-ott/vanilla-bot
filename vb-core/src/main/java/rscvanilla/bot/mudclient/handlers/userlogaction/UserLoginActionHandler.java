package rscvanilla.bot.mudclient.handlers.userlogaction;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rscvanilla.bot.config.AppSettings;
import rscvanilla.bot.gui.events.AppSettingsProxySelectedEvent;
import rscvanilla.bot.gui.events.AppSettingsUserSelectedEvent;
import rscvanilla.bot.mudclient.handlers.InterceptorHandler;
import rscvanilla.bot.mudclient.handlers.userlogaction.events.UserLoginActionEvent;
import rscvanilla.contracts.interceptors.MudClientInitGameScreenVariablesMethodInterceptor;
import rscvanilla.contracts.interceptors.MudClientResetLoginScreenVariablesMethodInterceptor;
import rscvanilla.contracts.interceptors.MudClientSendLoginMethodInterceptor;

import javax.inject.Inject;

public class UserLoginActionHandler implements InterceptorHandler,
    MudClientSendLoginMethodInterceptor, MudClientInitGameScreenVariablesMethodInterceptor, MudClientResetLoginScreenVariablesMethodInterceptor  {

    private final Logger logger = LoggerFactory.getLogger(UserLoginActionHandler.class);

    private final UserProxyManager userProxyManager;
    private final UserCredentialManager userCredentialManager;
    private final AppSettings appSettings;

    private final EventBus eventBus;

    @Inject
    public UserLoginActionHandler(UserProxyManager userProxyManager,
                                  UserCredentialManager userCredentialManager,
                                  AppSettings appSettings,
                                  EventBus eventBus) {
        this.userProxyManager = userProxyManager;
        this.userCredentialManager = userCredentialManager;
        this.appSettings = appSettings;
        this.eventBus = eventBus;
    }

    @Override
    public void onBeforeSendLogin(boolean isReconnect) {
        logger.trace("onBeforeSendLogin: [{}]", isReconnect);
        if (isReconnect) {
            return;
        }

        var username = userCredentialManager.getUsername();
        eventBus.post(UserLoginActionEvent.sentLoggingIn(username));

        var appSettingsUser = appSettings.getUserByUsername(username);
        if (appSettingsUser == null) {
            userProxyManager.clearProxy();
        } else {
            if (appSettingsUser.proxy == null) {
                userProxyManager.clearProxy();
            } else {
                userProxyManager.setProxy(appSettingsUser.proxy.address);
            }
        }
    }

    @Override
    public void onBeforeResetLoginScreenVariables() {
        logger.trace("onBeforeResetLoginScreenVariables");

        userCredentialManager.saveCredentialsToCache();
        eventBus.post(UserLoginActionEvent.loggedOut());
    }

    @Override
    public void onAfterResetLoginScreenVariables() {
        logger.trace("onAfterResetLoginScreenVariables");

        userCredentialManager.loadCredentialsFromCache();
    }

    @Override
    public void onBeforeInitGameScreenVariables() {
        logger.trace("onBeforeInitGameScreenVariables");

        eventBus.post(UserLoginActionEvent.loggedIn());
    }

    @Subscribe
    @SuppressWarnings("unused")
    public void onAppSettingsUserSelected(AppSettingsUserSelectedEvent event) {
        logger.trace("onAppSettingsUserSelected");

        var user = event.getUser();
        if (user == null) {
            userCredentialManager.clearCredentials();
        } else {
            userCredentialManager.setCredentials(user.username, user.password);
        }
    }

    @Subscribe
    @SuppressWarnings("unused")
    public void onAppSettingsProxySelected(AppSettingsProxySelectedEvent event) {
        logger.trace("onAppSettingsProxySelected");
        var proxy = event.getProxy();
        if (proxy == null) {
            userProxyManager.clearProxy();
        } else {
            userProxyManager.setProxy(proxy.address);
        }
    }
}
