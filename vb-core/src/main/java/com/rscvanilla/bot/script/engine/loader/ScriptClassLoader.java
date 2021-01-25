package com.rscvanilla.bot.script.engine.loader;

import com.rscvanilla.bot.infrastructure.annotations.ScriptsDirectoryPath;
import com.rscvanilla.bot.script.template.RunnableScript;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class ScriptClassLoader extends ClassLoader {

    private final String scriptsDir;

    public ScriptClassLoader(ClassLoader parent, @ScriptsDirectoryPath String scriptsDirectoryPath) {
        super(parent);

        this.scriptsDir = scriptsDirectoryPath;
    }

    public List<Class<? extends RunnableScript>> loadClasses()  {
        var scriptFiles = new File(scriptsDir).listFiles();
        var scriptClassFiles = new ArrayList<Class<? extends RunnableScript>>();

        if (scriptFiles == null)
            return scriptClassFiles;

        for (var scriptFile : scriptFiles) {
            var scriptName = scriptFile.getName();

            if (!scriptName.endsWith(".class")) {
                continue;
            }

            var loadedClass = loadClass(scriptName);
            if (!scriptName.contains("$")) {
                scriptClassFiles.add(loadedClass);
            }
        }

        return scriptClassFiles;
    }

    public Class loadClass(String name) {

        try {
            String url = "file:"+ scriptsDir + File.separator + name;
            URL myUrl = new URL(url);
            URLConnection connection = myUrl.openConnection();
            InputStream input = connection.getInputStream();
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            int data = input.read();

            while(data != -1){
                buffer.write(data);
                data = input.read();
            }

            input.close();

            byte[] classData = buffer.toByteArray();

            return defineClass("scripts." + name.replace(".class", ""),
                    classData, 0, classData.length);

        } catch (IOException ioe) {
            try {
                return super.loadClass(name);
            } catch (ClassNotFoundException ignore) {

            }
            ioe.printStackTrace(System.out);
            return null;
        }
    }

}
