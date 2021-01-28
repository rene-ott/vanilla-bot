package rscvanilla.bot.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

public class ConfigService {

    private static final Logger logger = LoggerFactory.getLogger(ConfigService.class);

    private static final String SOCKS_PROXY_HOST_KEY = "socksProxyHost";
    private static final String SOCKS_PROXY_PORT_KEY = "socksProxyPort";

    private final ConfigProperties configProperties;

    @Inject
    public ConfigService(ConfigProperties configProperties) {
        this.configProperties = configProperties;
    }

    public void configure() {
        setProxy();
    }

    private void setProxy() {
        var jvmOptProxyHost = System.getProperty(SOCKS_PROXY_HOST_KEY);
        var jvmOptProxyPort = System.getProperty(SOCKS_PROXY_PORT_KEY);

        if (jvmOptProxyHost == null || jvmOptProxyPort == null) {

            var configProxyPort = configProperties.getProxyPort();
            var configProxyHost = configProperties.getProxyIP();
            if (configProxyHost == null || configProxyPort == null) {
                logger.debug("Not using proxy.");
            } else {
                System.setProperty(SOCKS_PROXY_PORT_KEY, configProxyPort);
                System.setProperty(SOCKS_PROXY_HOST_KEY, configProxyHost);
                logger.info("Using [config.properties] proxy:[{}:{}].", configProxyHost, configProxyPort);
            }
        } else {
            logger.info("Using [JVM options] proxy:[{}:{}].", jvmOptProxyHost, jvmOptProxyPort);
        }
    }
}
