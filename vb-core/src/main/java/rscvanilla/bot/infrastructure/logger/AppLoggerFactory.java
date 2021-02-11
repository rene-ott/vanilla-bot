package rscvanilla.bot.infrastructure.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppLoggerFactory {
    public static Logger getSimpleLogger() {
        return LoggerFactory.getLogger("SimpleLogger");
    }
}
