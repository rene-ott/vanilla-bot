package rscvanilla.bot.mudclient.handlers.userlogaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rscvanilla.bot.mudclient.MudClientWrapper;

import javax.inject.Inject;

public class UserCredentialManager {

    private final Logger logger = LoggerFactory.getLogger(UserCredentialManager.class);

    private final MudClientWrapper mudClientWrapper;

    private String cachedUsername;
    private String cachedPassword;

    @Inject
    public UserCredentialManager(MudClientWrapper mudClientWrapper) {
        this.mudClientWrapper = mudClientWrapper;
    }

    public void setCredentials(String username, String password) {
        var previousUsername = getUsername();

        mudClientWrapper.userName.setValue(username);
        mudClientWrapper.userPassword.setValue(password);

        logger.debug("Set user from [{}] to [{}].", previousUsername, username);
    }

    public void clearCredentials() {
        var previousUsername = getUsername();

        mudClientWrapper.userName.setValue(null);
        mudClientWrapper.userPassword.setValue(null);

        logger.debug("Set user from [{}] to [null] .", previousUsername);
    }

    public void saveCredentialsToCache() {
        cachedUsername = getUsername();
        cachedPassword = getPassword();
    }

    public void loadCredentialsFromCache() {
        mudClientWrapper.userName.setValue(cachedUsername);
        mudClientWrapper.userPassword.setValue(cachedPassword);

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
