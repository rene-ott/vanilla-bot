package rscvanilla.bot.mudclient.handlers.userlogaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserProxyManager {

    private final Logger logger = LoggerFactory.getLogger(UserProxyManager.class);

    private String savedProxyAddress;

    private static final String SOCKS_PROXY_HOST_KEY = "socksProxyHost";
    private static final String SOCKS_PROXY_PORT_KEY = "socksProxyPort";

    public void setProxy(String address) {
        var previousProxyAddress = savedProxyAddress;
        savedProxyAddress = address;
        var proxy = address.split(":");

        System.setProperty(SOCKS_PROXY_HOST_KEY, proxy[0]);
        System.setProperty(SOCKS_PROXY_PORT_KEY, proxy[1]);

        logger.debug("Set proxy address from [{}] to [{}].", previousProxyAddress, savedProxyAddress);
    }

    public void clearProxy() {
        System.clearProperty(SOCKS_PROXY_HOST_KEY);
        System.clearProperty(SOCKS_PROXY_PORT_KEY);

        logger.debug("Set proxy address from [{}] to [null].", savedProxyAddress);

        savedProxyAddress = null;
    }
}
