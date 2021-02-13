package rscvanilla.bot;

import com.google.inject.Guice;
import rscvanilla.bot.infrastructure.BotException;
import rscvanilla.bot.infrastructure.di.BotModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    private static final String WORKING_DIRECTORY_PATH = System.getProperty("user.dir");
    private static final String SCRIPTS_DIRECTORY_PATH = WORKING_DIRECTORY_PATH + File.separator + "scripts";

    public static void main(String [] args) {

        try {
            Guice.createInjector(new BotModule(SCRIPTS_DIRECTORY_PATH)).getInstance(VanillaBot.class).load();
        } catch (BotException e) {
            logger.error("BOT FAILED:", e);
        }
    }
}
