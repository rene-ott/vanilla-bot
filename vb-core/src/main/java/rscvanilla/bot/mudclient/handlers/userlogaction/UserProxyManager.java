package rscvanilla.bot.mudclient.handlers.userlogaction;

import com.google.common.eventbus.EventBus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rscvanilla.bot.mudclient.handlers.userlogaction.events.UserProxyChangedEvent;

import javax.inject.Inject;

public class UserProxyManager {

    private final Logger logger = LoggerFactory.getLogger(UserProxyManager.class);

    private String savedProxyAddress;

    private static final String SOCKS_PROXY_HOST_KEY = "socksProxyHost";
    private static final String SOCKS_PROXY_PORT_KEY = "socksProxyPort";

    private EventBus eventBus;

    @Inject
    public UserProxyManager(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    public void setProxy(String address) {
        var previousProxyAddress = savedProxyAddress;
        savedProxyAddress = address;
        var proxy = address.split(":");

        System.setProperty(SOCKS_PROXY_HOST_KEY, proxy[0]);
        System.setProperty(SOCKS_PROXY_PORT_KEY, proxy[1]);
        eventBus.post(new UserProxyChangedEvent(address));

        logger.debug("Set proxy address from [{}] to [{}].", previousProxyAddress, savedProxyAddress);
    }

    public void clearProxy() {
        System.clearProperty(SOCKS_PROXY_HOST_KEY);
        System.clearProperty(SOCKS_PROXY_PORT_KEY);

        eventBus.post(new UserProxyChangedEvent(null));
        logger.debug("Set proxy address from [{}] to [null].", savedProxyAddress);

        savedProxyAddress = null;
    }
}
