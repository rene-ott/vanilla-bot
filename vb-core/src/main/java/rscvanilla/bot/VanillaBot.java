package rscvanilla.bot;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import rscvanilla.bot.events.InGameMessageReceivedEvent;
import rscvanilla.bot.gui.BotFrame;
import rscvanilla.bot.gui.events.ScriptAntiBanParamsChangedEvent;
import rscvanilla.bot.gui.events.ScriptSelectedEvent;
import rscvanilla.bot.gui.events.ScriptStartButtonClickedEvent;
import rscvanilla.bot.mc.MudClientHooker;
import rscvanilla.bot.script.engine.ScriptEngine;
import rscvanilla.bot.script.engine.ScriptEngineListener;
import rscvanilla.bot.script.events.ScriptListLoadedEvent;
import rscvanilla.bot.script.events.ScriptStartedEvent;
import rscvanilla.bot.script.events.ScriptStoppedEvent;
import rscvanilla.bot.script.template.RunnableScript;
import rscvanilla.bot.watcher.ScriptDirectoryContentChangeWatcher;
import rscvanilla.bot.watcher.ScriptDirectoryContentChangedEvent;

import javax.inject.Inject;
import java.util.List;

public class VanillaBot implements Bot, ScriptEngineListener {

    private final BotFrame botFrame;
    private final GameApplet gameApplet;
    private final MudClientHooker hooker;
    private final ScriptEngine scriptEngine;
    private final EventBus eventBus;
    private final ScriptDirectoryContentChangeWatcher scriptsDirectoryWatcher;

    @Inject
    public VanillaBot(BotFrame botFrame,
                      GameApplet gameApplet,
                      MudClientHooker hooker,
                      ScriptEngine scriptEngine,
                      ScriptDirectoryContentChangeWatcher scriptsDirectoryWatcher,
                      EventBus eventBus) {
        this.botFrame = botFrame;
        this.gameApplet = gameApplet;
        this.hooker = hooker;
        this.scriptEngine = scriptEngine;
        this.scriptsDirectoryWatcher = scriptsDirectoryWatcher;

        this.eventBus = eventBus;

        this.scriptEngine.addScriptEngineListener(this);
    }

    @Override
    public void load() {
        hooker.loadHooks();
        gameApplet.execute();
        botFrame.open();
        scriptsDirectoryWatcher.start();
        scriptEngine.loadScripts();
    }

    @Subscribe
    @SuppressWarnings("unused")
    public void onScriptStartButtonClicked(ScriptStartButtonClickedEvent event) {
        if (event.isStart()) {
            scriptEngine.startScript();
        } else {
            scriptEngine.stopScript();
        }
    }

    @Subscribe
    @SuppressWarnings("unused")
    public void onScriptSelected(ScriptSelectedEvent event) {
        scriptEngine.setSelectedScript(event.getScript());
    }

    @Subscribe
    @SuppressWarnings("unused")
    public void onScriptDirectoryContentChanged(ScriptDirectoryContentChangedEvent event) {
        scriptEngine.reloadScripts();
    }

    @Subscribe
    @SuppressWarnings("unused")
    public void onInGameMessageReceived(InGameMessageReceivedEvent event) {
        scriptEngine.dispatchInGameMessage(event);
    }

    @Subscribe
    @SuppressWarnings("unused")
    public void onScriptAntiBanParamsChanged(ScriptAntiBanParamsChangedEvent event) {
        scriptEngine.updateAntiBanParams(event.getParams());
    }

    @Override
    public void onScriptStopped() {
        eventBus.post(new ScriptStoppedEvent());
    }

    @Override
    public void onScriptStarted() {
        eventBus.post(new ScriptStartedEvent());
    }

    @Override
    public void onScriptsLoaded(List<Class<? extends RunnableScript>> scripts, Class<? extends RunnableScript> selectedScript) {
        eventBus.post(new ScriptListLoadedEvent(scripts, selectedScript));
    }
}
