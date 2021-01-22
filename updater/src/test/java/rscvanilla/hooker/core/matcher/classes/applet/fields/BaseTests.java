package rscvanilla.hooker.core.matcher.classes.applet.fields;

import com.google.common.io.Resources;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class BaseTests {

    protected String lineSeparator = "\n";

    protected String readResource(final String fileName) {
        try {
            return Resources.toString(Resources.getResource(fileName), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    protected String readClassMudClient() {
        return readResource("d.java");
    }
}
