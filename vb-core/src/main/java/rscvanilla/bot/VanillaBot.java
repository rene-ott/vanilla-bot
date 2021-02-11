package rscvanilla.bot;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import rscvanilla.bot.config.ConfigService;
import rscvanilla.bot.events.messages.GameMessageEvent;
import rscvanilla.bot.gui.BotFrame;
import rscvanilla.bot.gui.events.ScriptAntiBanParamsChangedEvent;
import rscvanilla.bot.gui.events.ScriptSelectedEvent;
import rscvanilla.bot.gui.events.ScriptStartButtonClickedEvent;
import rscvanilla.bot.mc.MudClientWrapper;
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
    private final MudClientWrapper hooker;
    private final ScriptEngine scriptEngine;
    private final EventBus eventBus;
    private final ScriptDirectoryContentChangeWatcher scriptsDirectoryWatcher;
    private final ConfigService configService;

    @Inject
    public VanillaBot(BotFrame botFrame,
                      GameApplet gameApplet,
                      MudClientWrapper mudClientWrapper,
                      ScriptEngine scriptEngine,
                      ScriptDirectoryContentChangeWatcher scriptsDirectoryWatcher,
                      EventBus eventBus, ConfigService configService) {
        this.botFrame = botFrame;
        this.gameApplet = gameApplet;
        this.hooker = mudClientWrapper;
        this.scriptEngine = scriptEngine;
        this.scriptsDirectoryWatcher = scriptsDirectoryWatcher;

        this.eventBus = eventBus;
        this.configService = configService;

        this.scriptEngine.addScriptEngineListener(this);
    }

    @Override
    public void load() {
        configService.configure();
        hooker.lateInitClassMembers();
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
    public void onInGameMessageReceived(GameMessageEvent event) {
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
