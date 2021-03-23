package rscvanilla.bot;

import com.google.inject.Guice;
import org.slf4j.LoggerFactory;
import rscvanilla.bot.infrastructure.BotException;
import rscvanilla.bot.infrastructure.di.BotModule;

import java.io.File;

public class Main {

    private static final String WORKING_DIRECTORY_PATH = System.getProperty("user.dir");
    private static final String SCRIPTS_DIRECTORY_PATH = WORKING_DIRECTORY_PATH + File.separator + "scripts";
    private static final String CONFIG_DIRECTORY_PATH = WORKING_DIRECTORY_PATH + File.separator + "config";
    private static final String ASSETS_DIRECTORY_PATH = WORKING_DIRECTORY_PATH + File.separator + "assets";

    public static void main(String [] args) {
        try {
            Guice.createInjector(new BotModule(SCRIPTS_DIRECTORY_PATH, CONFIG_DIRECTORY_PATH, ASSETS_DIRECTORY_PATH))
                .getInstance(VanillaBot.class)
                .load();

        } catch (BotException e) {
            LoggerFactory.getLogger(Main.class).error("BOT FAILED:", e);
        }
    }
}
