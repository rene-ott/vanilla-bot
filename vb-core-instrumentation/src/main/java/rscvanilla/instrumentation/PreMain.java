package rscvanilla.instrumentation;

import com.google.inject.Guice;
import rscvanilla.instrumentation.infrastructure.BotInstrumentationModule;

import java.lang.instrument.Instrumentation;

public class PreMain {
    public static void agentmain(String agentArgs, Instrumentation inst) {
        try {
            Guice.createInjector(new BotInstrumentationModule(inst))
                    .getInstance(BotInstrumentation.class)
                    .transform();
        } catch (Exception e) {
            //TODO Add logger
            System.out.println(e.toString());
        }
    }
}
