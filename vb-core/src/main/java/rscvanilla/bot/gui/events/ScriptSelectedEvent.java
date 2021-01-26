package rscvanilla.bot.gui.events;

import rscvanilla.bot.script.template.RunnableScript;

public class ScriptSelectedEvent {

    private final Class<? extends RunnableScript> selectedScript;

    public ScriptSelectedEvent(Class<? extends RunnableScript> selectedScrip) {
        this.selectedScript = selectedScrip;
    }

    public Class<? extends RunnableScript> getScript() {
        return selectedScript;
    }
}
