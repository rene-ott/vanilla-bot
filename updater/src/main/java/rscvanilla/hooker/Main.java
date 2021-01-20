package rscvanilla.hooker;

import com.google.inject.Guice;
import rscvanilla.hooker.infrastructure.modules.FieldMatcherModule;
import rscvanilla.hooker.infrastructure.modules.FilePathModule;
import rscvanilla.hooker.infrastructure.modules.MainModule;

import java.io.File;

public class Main {

    private static final String WORKING_DIR_PATH = System.getProperty("user.dir");
    private static final String TEMP_DIR_PATH = WORKING_DIR_PATH + File.separator + "temp";
    private static final String OUTPUT_DIR_PATH = WORKING_DIR_PATH + File.separator + "output";

    // TODO Add logger
    public static void main(String[] args) {

        var injector = Guice.createInjector(
            new MainModule(),
            new FilePathModule(WORKING_DIR_PATH, TEMP_DIR_PATH, OUTPUT_DIR_PATH),
            new FieldMatcherModule()
        );

        injector.getInstance(HooksFileGenerator.class).generate();
    }
}
