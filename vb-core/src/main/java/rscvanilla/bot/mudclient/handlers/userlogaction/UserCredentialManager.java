package rscvanilla.bot.mudclient.handlers.userlogaction;

import com.google.common.eventbus.EventBus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rscvanilla.bot.mudclient.wrappers.MudClientWrapper;
import rscvanilla.bot.mudclient.handlers.userlogaction.events.UserUsernameChangedEvent;

import javax.inject.Inject;

public class UserCredentialManager {

    private final Logger logger = LoggerFactory.getLogger(UserCredentialManager.class);

    private final MudClientWrapper mudClientWrapper;
    private EventBus eventBus;

    private String cachedUsername;
    private String cachedPassword;

    @Inject
    public UserCredentialManager(MudClientWrapper mudClientWrapper, EventBus eventBus) {
        this.mudClientWrapper = mudClientWrapper;
        this.eventBus = eventBus;
    }

    public void setCredentials(String username, String password) {
        var previousUsername = getUsername();

        mudClientWrapper.setUserCredentials(username, password);
        eventBus.post(new UserUsernameChangedEvent(username));

        logger.debug("Set user from [{}] to [{}].", previousUsername, username);
    }

    public void clearCredentials() {
        var previousUsername = getUsername();

        mudClientWrapper.setUserCredentials("", "");
        eventBus.post(new UserUsernameChangedEvent(null));

        logger.debug("Set user from [{}] to [null] .", previousUsername);
    }

    public void saveCredentialsToCache() {
        cachedUsername = getUsername();
        cachedPassword = getPassword();
    }

    public void loadCredentialsFromCache() {
        mudClientWrapper.setUserCredentials(cachedUsername, cachedPassword);

        clearCachedCredentials();
    }

    private void clearCachedCredentials() {
        cachedUsername = null;
        cachedPassword = null;
    }

    public String getUsername() {
        return mudClientWrapper.userName.getValue();
    }

    public String getPassword() {
        return mudClientWrapper.userPassword.getValue();
    }
}
