
package rscvanilla.cjci.model;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ClientJarClassInfoFileReader {

    private static final String CJCI_FILE_NAME = "cjci.yaml";

    public static ClientJarClassInfo readHooksFile() throws IOException {
        try (var is = getTemplateInputStream()) {
            var fileContent = getStringFromInputStream(is);
            return new ClientJarClassInfoSerializer().deserialize(fileContent);
        }
    }

    private static InputStream getTemplateInputStream() {
        return ClientJarClassInfoFileReader.class.getClassLoader().getResourceAsStream(CJCI_FILE_NAME);
    }

    private static String getStringFromInputStream(InputStream inputStream) {
        try (var s = new Scanner(inputStream).useDelimiter("\\A")) {
            return s.hasNext() ? s.next() : "";
        }
    }
}
