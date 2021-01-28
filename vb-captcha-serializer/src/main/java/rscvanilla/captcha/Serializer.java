package rscvanilla.captcha;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Objects;

public class Serializer {

    public static void serialize(Path inputDirPath, Path outputDirPath) throws Exception {

        var hashMap = new HashMap<String, byte[]>();
        var images = inputDirPath.toFile().listFiles();

        System.out.println("Adding image objects to [ocr.data]:");
        for (var file : Objects.requireNonNull(images)) {
            var name = file.getName().replace(".png", "");
            System.out.println(name);
            hashMap.put(file.getName().replace(".png", ""), Files.readAllBytes(file.toPath()));
        }

        try(var fos = new FileOutputStream(Path.of(outputDirPath.toString(), "ocr.data").toString()); var oos = new ObjectOutputStream(fos)) {
            oos.writeObject(hashMap);
        }

        System.out.printf("Added [%s] image objects to [ocr.data].\n", images.length);
    }
}
