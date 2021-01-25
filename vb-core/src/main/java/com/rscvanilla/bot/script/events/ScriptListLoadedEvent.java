package com.rscvanilla.bot.script.events;

import com.rscvanilla.bot.script.template.RunnableScript;

import java.util.List;

public class ScriptListLoadedEvent {

    private final List<Class<? extends RunnableScript>> scripts;
    private final Class<? extends RunnableScript> selectedScript;

    public ScriptListLoadedEvent(List<Class<? extends RunnableScript>> scripts, Class<? extends RunnableScript> selectedScript) {
        this.scripts = scripts;
        this.selectedScript = selectedScript;
    }

    public List<Class<? extends RunnableScript>> getScripts() {
        return scripts;
    }

    public Class<? extends RunnableScript> getSelectedScript() {
        return selectedScript;
    }
}
