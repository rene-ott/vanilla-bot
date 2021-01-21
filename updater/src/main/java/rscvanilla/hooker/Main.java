package rscvanilla.hooker;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.google.inject.Guice;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rscvanilla.hooker.infrastructure.modules.FieldMatcherModule;
import rscvanilla.hooker.infrastructure.modules.FilePathModule;
import rscvanilla.hooker.infrastructure.modules.MainModule;
import rscvanilla.hooker.paramvalidator.ValidateHasValue;
import rscvanilla.hooker.paramvalidator.ValidateJarExists;
import rscvanilla.hooker.services.HooksFileGenerator;

import java.io.File;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    @Parameter(
        names = "-n",
        description = "New client.jar path from which field names are matched. Hooks file is generated based on matched values.",
        validateWith = { ValidateHasValue.class, ValidateJarExists.class },
        required = true
    )
    String newJarPath;

    @Parameter(
        names = "-o",
        description = "Old client.jar path from which field names are matched (Optional). Used for manual verification.",
        validateWith = { ValidateJarExists.class }
    )
    String oldJarPath;

    private static final String WORKING_DIR_PATH = System.getProperty("user.dir");
    private static final String TEMP_DIR_PATH = WORKING_DIR_PATH + File.separator + "temp";
    private static final String OUTPUT_DIR_PATH = WORKING_DIR_PATH + File.separator + "output";

    public static void main(String[] args) {

        try {
            var main = new Main();
            JCommander.newBuilder().addObject(main).build().parse(args);

            logger.info("Old JAR path: {}", main.oldJarPath);
            logger.info("New JAR path: {}", main.newJarPath);

            main.run();

            logger.info("Hooker ended.");
        } catch (Exception e) {
            logger.error("Hooker failed: ", e);
        }
    }

    public void run() {

        var injector = Guice.createInjector(
                new MainModule(),
                new FilePathModule(WORKING_DIR_PATH, TEMP_DIR_PATH, OUTPUT_DIR_PATH, newJarPath, oldJarPath),
                new FieldMatcherModule()
        );

        injector.getInstance(HooksFileGenerator.class).generateHooksFile();
    }
}
