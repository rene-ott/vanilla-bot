package rscvanilla.cjci.updater.core.matcher.classes;

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

    protected String readClassMudClient() { return readResource("com.rsc.d.java"); }
    protected String readClassApplet() { return readResource("com.rsc.applet.b.java"); }
    protected String readClassRSEntity() { { return readResource("com.rsc.e.d.java"); } }
    protected String readClassRSCharacter() { { return readResource("com.rsc.e.i.java"); } }
    protected String readClassRSPlayerCharacter() { { return readResource("com.rsc.e.k.java"); } }
    protected String readClassRSWallObject() { { return readResource("com.rsc.e.m.java"); } }

}
