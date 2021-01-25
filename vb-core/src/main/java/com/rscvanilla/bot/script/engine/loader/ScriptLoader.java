package com.rscvanilla.bot.script.engine.loader;

import com.rscvanilla.bot.infrastructure.annotations.ScriptsDirectoryPath;
import com.rscvanilla.bot.script.template.RunnableScript;

import javax.inject.Inject;
import java.util.List;

public class ScriptLoader {

    private String scriptsDirectoryPath;

    @Inject
    public ScriptLoader(@ScriptsDirectoryPath String scriptsDirectoryPath) {

        this.scriptsDirectoryPath = scriptsDirectoryPath;
    }

    public List<Class<? extends RunnableScript>> getScripts() {

        var scriptClassLoader = new ScriptClassLoader(ClassLoader.getSystemClassLoader(), scriptsDirectoryPath);
        var scriptClasses = scriptClassLoader.loadClasses();

        return scriptClasses;
    }
}
