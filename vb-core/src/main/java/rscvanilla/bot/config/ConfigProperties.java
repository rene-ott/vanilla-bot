package rscvanilla.bot.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {

    private static final Logger logger = LoggerFactory.getLogger(ConfigProperties.class);

    private final Properties prop = new Properties();

    public ConfigProperties() {
        try {
            prop.load(new FileInputStream("config.properties"));
        } catch (IOException e) {
            logger.warn("Failed to load [config.properties].");
        }
    }

    public String getProxyIP() {
        return prop.getProperty("proxy.ip", null);
    }

    public String getProxyPort() {
        return prop.getProperty("proxy.port", null);
    }
}
