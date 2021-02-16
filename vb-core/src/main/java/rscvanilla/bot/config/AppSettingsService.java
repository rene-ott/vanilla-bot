package rscvanilla.bot.config;

import com.google.common.base.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rscvanilla.bot.mudclient.MudClientWrapper;

import javax.inject.Inject;

public class AppSettingsService {

    private final Logger logger = LoggerFactory.getLogger(AppSettingsService.class);

    private final MudClientWrapper mudClientWrapper;
    private final AppSettings appSettings;

    private static final String SOCKS_PROXY_HOST_KEY = "socksProxyHost";
    private static final String SOCKS_PROXY_PORT_KEY = "socksProxyPort";

    @Inject
    public AppSettingsService(MudClientWrapper mudClientWrapper,
                              AppSettings appSettings) {
        this.mudClientWrapper = mudClientWrapper;
        this.appSettings = appSettings;
    }

    public String selectDefaultUser() {
        if (appSettings.getValidUsers().size() == 0) {
            return setGlobalProxySelected();
        } else {
            return setUserSelected(appSettings.getValidUsers().get(0));
        }
    }

    private String setGlobalProxySelected() {
        if (Strings.isNullOrEmpty(appSettings.globalProxyAddress)) {
            logger.debug("User and global proxy missing.");
            return "";
        } else {
            setProxyAddress(appSettings.globalProxyAddress);
            logger.info("Selected global proxy [{}].", appSettings.globalProxyAddress);
            return String.format("[%s]", appSettings.globalProxyAddress);
        }
    }

    public String setUserSelected(AppSettingsUser user) {

        mudClientWrapper.userName.setValue(user.username);
        mudClientWrapper.userPassword.setValue(user.password);

        if (!Strings.isNullOrEmpty(user.proxyAddress)) {
            setProxyAddress(user.proxyAddress);
            logger.info("Selected user [{}] with user proxy address [{}].", user.username, user.proxyAddress);
        } else if (!Strings.isNullOrEmpty(appSettings.globalProxyAddress)) {
            setProxyAddress(appSettings.globalProxyAddress);
            logger.info("Selected user [{}] with global proxy address [{}].", user.username, appSettings.globalProxyAddress);
        } else {
            logger.info("Selected user [{}] without proxy address.", user.username);
        }

        return getSelectedUserInfo(user);
    }

    private void setProxyAddress(String proxyAddress) {
        var proxy = proxyAddress.split(":");

        System.setProperty(SOCKS_PROXY_HOST_KEY, proxy[0]);
        System.setProperty(SOCKS_PROXY_PORT_KEY, proxy[1]);
    }

    private String getSelectedUserInfo(AppSettingsUser user) {
        var proxyAddress = getProxyAddress(user.proxyAddress);
        if (Strings.isNullOrEmpty(proxyAddress))
            return user.username;

        return String.format("%s [%s]", user.username, proxyAddress);
    }

    private String getProxyAddress(String userProxyAddress) {
        if (!Strings.isNullOrEmpty(userProxyAddress)) {
            return userProxyAddress;
        }

        if (!Strings.isNullOrEmpty(appSettings.globalProxyAddress)){
            return appSettings.globalProxyAddress;
        }

        return "";
    }
}
