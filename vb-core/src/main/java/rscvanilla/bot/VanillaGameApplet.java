package rscvanilla.bot;

import com.rsc.applet.b;
import rscvanilla.bot.infrastructure.annotations.AssetsDirectoryPath;

import javax.inject.Inject;
import java.applet.Applet;
import java.awt.*;
import java.io.File;

@SuppressWarnings("serial")
public class VanillaGameApplet extends b implements GameApplet {

    private final String assetsDirectoryPath;

    @Inject
    public VanillaGameApplet(@AssetsDirectoryPath String assetsDirectoryPath) {
        this.assetsDirectoryPath = assetsDirectoryPath;
        setPreferredSize(new Dimension(512, 346));
        init();
    }

    // NB! This method name might change
    public String C() { return assetsDirectoryPath + File.separator; }

    public void execute() {
        super.start();
    }

    @SuppressWarnings("deprecation")
    public Applet getApplet() { return this; }
}
