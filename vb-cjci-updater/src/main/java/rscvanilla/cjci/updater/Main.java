package rscvanilla.cjci.updater;

import com.beust.jcommander.JCommander;
import com.google.inject.Guice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rscvanilla.cjci.updater.infrastructure.AppParameters;
import rscvanilla.cjci.updater.infrastructure.modules.ClassMemberNameMatcherModule;
import rscvanilla.cjci.updater.infrastructure.modules.MainModule;
import rscvanilla.cjci.updater.services.ClientJarClassInfoFileGenerator;

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

            logger.info("CJCI updater ended.");
        } catch (Exception e) {
            logger.error("CJCI updater: ", e);
        }
    }

    public void run() {
        var injector = Guice.createInjector(
            new MainModule(parameters),
            new ClassMemberNameMatcherModule()
        );

        injector.getInstance(ClientJarClassInfoFileGenerator.class).generateFile();
    }
}
