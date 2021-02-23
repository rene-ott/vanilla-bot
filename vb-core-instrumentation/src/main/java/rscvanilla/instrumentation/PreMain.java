package rscvanilla.instrumentation;

import com.google.inject.Guice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rscvanilla.instrumentation.infrastructure.BotInstrumentationModule;

import java.lang.instrument.Instrumentation;

public class PreMain {

    private static final Logger logger = LoggerFactory.getLogger(PreMain.class);

    public static void premain(String agentArgs, Instrumentation inst) {
        try {
            Guice.createInjector(new BotInstrumentationModule(inst))
                    .getInstance(BotInstrumentation.class)
                    .transform();
        } catch (Throwable e) {
            logger.error("Agent failed", e);
        }
    }
}
