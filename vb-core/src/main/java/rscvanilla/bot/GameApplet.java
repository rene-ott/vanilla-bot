package rscvanilla.bot;

import java.applet.Applet;

public interface GameApplet {
    void execute();

    @SuppressWarnings("deprecation")
    Applet getApplet();
}
