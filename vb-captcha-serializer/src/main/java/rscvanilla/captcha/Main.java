package rscvanilla.captcha;

import java.nio.file.Path;

public class Main {

    private static final Path USER_DIR = Path.of(System.getProperty("user.dir"));
    private static final Path INPUT_DIR =  Path.of(USER_DIR.toString(), "input");
    private static final Path OUTPUT_DIR = Path.of(USER_DIR.toString(), "output");

    public static void main(String[] args) {
        try {
            OutputDirectory.recreateDirectory(OUTPUT_DIR);
            Serializer.serialize(INPUT_DIR, OUTPUT_DIR);
        } catch (Exception e) {
            System.err.println("SERIALIZATION FAILED:");
            e.printStackTrace();
        }
    }
}
