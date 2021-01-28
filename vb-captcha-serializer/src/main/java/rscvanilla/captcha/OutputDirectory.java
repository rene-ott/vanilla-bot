package rscvanilla.captcha;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Objects;

public class OutputDirectory {
    public static void recreateDirectory(Path outputDirPath) throws IOException {
        deleteFiles(outputDirPath);
        Files.deleteIfExists(outputDirPath);
        Files.createDirectory(outputDirPath);
    }

    private static void deleteFiles(Path outputDirPath) {
        Arrays.stream(Objects.requireNonNull(outputDirPath.toFile().listFiles())).forEach(File::delete);
    }
}
