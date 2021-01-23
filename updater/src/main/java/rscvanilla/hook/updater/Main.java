package rscvanilla.hook.updater;

import com.beust.jcommander.JCommander;
import com.google.inject.Guice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rscvanilla.hook.updater.infrastructure.AppParameters;
import rscvanilla.hook.updater.infrastructure.modules.FilePathModule;
import rscvanilla.hook.updater.infrastructure.modules.MainModule;
import rscvanilla.hook.updater.infrastructure.modules.ClassMemberNameMatcherModule;
import rscvanilla.hook.updater.services.HooksFileGenerator;

import java.io.File;

public class Main {

    private static final AppParameters parameters = new AppParameters();

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    private static final String WORKING_DIR_PATH = System.getProperty("user.dir");
    private static final String TEMP_DIR_PATH = WORKING_DIR_PATH + File.separator + "temp";
    private static final String OUTPUT_DIR_PATH = WORKING_DIR_PATH + File.separator + "output";

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
                new FilePathModule(WORKING_DIR_PATH, TEMP_DIR_PATH, OUTPUT_DIR_PATH),
                new ClassMemberNameMatcherModule()
        );

        injector.getInstance(HooksFileGenerator.class).generateHooksFile();
    }
}
