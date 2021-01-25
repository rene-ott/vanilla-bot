package rscvanilla.hook.updater.core.matcher.classes;

import com.google.common.io.Resources;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class BaseTests {

    protected String lineSeparator = "\r\n";

    protected String readResource(final String fileName) {
        try {
            return Resources.toString(Resources.getResource(fileName), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    protected String readClassMudClient() { return readResource("d.java"); }
    protected String readClassApplet() { return readResource("b.java"); }
}
