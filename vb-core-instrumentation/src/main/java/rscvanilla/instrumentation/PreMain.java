package rscvanilla.instrumentation;

import com.google.inject.Guice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rscvanilla.instrumentation.infrastructure.BotInstrumentationModule;

import java.io.File;
import java.lang.instrument.Instrumentation;

public class PreMain {

    private static final Logger logger = LoggerFactory.getLogger(PreMain.class);
    private static final String WORKING_DIRECTORY_PATH = System.getProperty("user.dir");
    private static final String CONFIG_DIRECTORY_PATH = WORKING_DIRECTORY_PATH + File.separator + "config";

    public static void premain(String agentArgs, Instrumentation inst) {
        try {
            System.setProperty("logback.configurationFile", CONFIG_DIRECTORY_PATH + File.separator + "logback.xml");

            Guice.createInjector(new BotInstrumentationModule(inst))
                    .getInstance(BotInstrumentation.class)
                    .transform();
        } catch (Throwable e) {
            logger.error("Agent failed", e);
        }
    }
}
