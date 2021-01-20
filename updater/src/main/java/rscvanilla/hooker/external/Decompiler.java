package rscvanilla.hooker.external;

import org.jetbrains.java.decompiler.main.decompiler.ConsoleDecompiler;
import org.jetbrains.java.decompiler.main.decompiler.PrintStreamLogger;
import org.jetbrains.java.decompiler.main.extern.IFernflowerLogger;

import java.io.File;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class Decompiler extends ConsoleDecompiler {

    protected Decompiler(File destination, Map<String, Object> options, IFernflowerLogger logger) {
        super(destination, options, logger);
    }

    private static Map<String, Object> createOptions() {
        var map = new HashMap<String, Object>();

        map.put("hdc", 0);
        map.put("dgs", 1);
        map.put("rsy", 1);
        map.put("rbr", 1);
        map.put("lit", 1);
        map.put("nls", 1);
        map.put("mpm", 60);

        return map;
    }

    public static Decompiler newInstance(String src, String dst) {

        var compiler = new Decompiler(new File(dst), createOptions(), new PrintStreamLogger(new PrintStream(OutputStream.nullOutputStream())));
        compiler.addSource(new File(src));

        return compiler;
    }
}
