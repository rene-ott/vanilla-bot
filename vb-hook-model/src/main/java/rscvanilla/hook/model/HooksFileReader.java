
package rscvanilla.hook.model;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class HooksFileReader {

    private static final String HOOKS_FILE_NAME = "hooks.yaml";

    public static Hooks readHooksFile() throws IOException {
        try (var is = getTemplateInputStream()) {
            var fileContent = getStringFromInputStream(is);
            return new HooksFileSerializer().deserialize(fileContent);
        }
    }

    private static InputStream getTemplateInputStream() {
        return HooksFileReader.class.getClassLoader().getResourceAsStream(HOOKS_FILE_NAME);
    }

    private static String getStringFromInputStream(InputStream inputStream) {
        try (var s = new Scanner(inputStream).useDelimiter("\\A")) {
            return s.hasNext() ? s.next() : "";
        }
    }
}
