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
    protected String readModelDef() { return readResource("com.rsc.a.a.d.java"); }

    protected String readClassMudClient() { return readResource("com.rsc.d.java"); }
    protected String readClassMudClientBase() { { return readResource("com.rsc.b.java"); } }

    protected String readPacketBuilder() { { return readResource("com.rsc.f.e.java"); } }
    protected String readPacketBuilderBase() { { return readResource("com.rsc.f.a.java"); } }
    protected String readPanelClass() { { return readResource("com.rsc.c.e.java"); } }

    protected String readClassApplet() { return readResource("com.rsc.applet.b.java"); }
    protected String readClassRSEntity() { { return readResource("com.rsc.e.d.java"); } }
    protected String readClassRSCharacter() { { return readResource("com.rsc.e.i.java"); } }
    protected String readClassRSPlayerCharacter() { { return readResource("com.rsc.e.k.java"); } }
    protected String readClassRSWallObject() { { return readResource("com.rsc.e.m.java"); } }
    protected String readClassRSNonPlayerCharacter() { { return readResource("com.rsc.e.j.java"); } }
    protected String readClassRSNonPlayerCharacterInfo() { { return readResource("com.rsc.a.a.g.java"); } }
    protected String readClassGameElements() { { return readResource("com.rsc.a.a.java"); } }
    protected String readShopInterface() { return readResource("com.rsc.d.b.c.java"); }

}
