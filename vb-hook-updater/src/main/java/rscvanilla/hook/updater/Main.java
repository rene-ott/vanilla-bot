package rscvanilla.hook.updater;

import com.beust.jcommander.JCommander;
import com.google.inject.Guice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rscvanilla.hook.updater.infrastructure.AppParameters;
import rscvanilla.hook.updater.infrastructure.modules.MainModule;
import rscvanilla.hook.updater.infrastructure.modules.ClassMemberNameMatcherModule;
import rscvanilla.hook.updater.services.HooksFileGenerator;

import java.io.File;

public class Main {

    private static final AppParameters parameters = new AppParameters();

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        try {
            var main = new Main();
            JCommander.newBuilder().addObject(parameters).build().parse(args);

            logger.info("Old JAR path: {}", parameters.oldJarPath);
            logger.info("New JAR path: {}", parameters.newJarPath);

            main.run();

            logger.info("Hooker ended.");
        } catch (Exception e) {
            logger.error("Hooker failed: ", e);
        }
    }

    public void run() {

        var injector = Guice.createInjector(
                new MainModule(parameters),
                new ClassMemberNameMatcherModule()
        );

        injector.getInstance(HooksFileGenerator.class).generateHooksFile();
    }
}
