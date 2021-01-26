package rscvanilla.bot.script.engine;

import rscvanilla.bot.script.template.RunnableScript;

import java.util.List;

public interface ScriptEngineListener {
    void onScriptStopped();
    void onScriptStarted();
    void onScriptsLoaded(List<Class<? extends RunnableScript>> scripts, Class<? extends RunnableScript> selectedScript);
}
