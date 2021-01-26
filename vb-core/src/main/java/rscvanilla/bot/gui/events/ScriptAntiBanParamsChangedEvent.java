package rscvanilla.bot.gui.events;

import rscvanilla.bot.script.antiban.ScriptAntiBanParams;

public class ScriptAntiBanParamsChangedEvent {

    private ScriptAntiBanParams params;

    public ScriptAntiBanParamsChangedEvent(ScriptAntiBanParams params) {
        this.params = params;
    }

    public ScriptAntiBanParams getParams() {
        return params;
    }
}
