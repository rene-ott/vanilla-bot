package rscvanilla.hooker;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.google.inject.Guice;
import rscvanilla.hooker.infrastructure.modules.FieldMatcherModule;
import rscvanilla.hooker.infrastructure.modules.FilePathModule;
import rscvanilla.hooker.infrastructure.modules.MainModule;
import rscvanilla.hooker.paramvalidator.ValidateHasValue;
import rscvanilla.hooker.paramvalidator.ValidateJarExists;
import rscvanilla.hooker.services.HooksFileGenerator;

import java.io.File;

public class Main {

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

    // TODO Add logger
    public static void main(String[] args) {

        var main = new Main();
        JCommander.newBuilder().addObject(main).build().parse(args);
        main.run();
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
