package com.rscvanilla.bot;
import com.rsc.applet.b;
import com.rsc.c;

import java.applet.Applet;
import java.awt.*;
import java.io.File;

public class VanillaGameApplet extends b implements GameApplet {

    public VanillaGameApplet() {
        setPreferredSize(new Dimension(512, 346));
        init();
    }

    public String C() { return c.aa + File.separator; }

    public void execute() { super.start(); }

    @SuppressWarnings("deprecation")
    public Applet getApplet() { return this; }
}
