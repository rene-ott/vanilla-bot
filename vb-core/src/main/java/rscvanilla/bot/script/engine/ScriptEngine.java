package rscvanilla.bot.script.engine;

import rscvanilla.bot.events.messages.GameMessageEvent;
import rscvanilla.bot.infrastructure.BotException;
import rscvanilla.bot.infrastructure.printer.Printer;
import rscvanilla.bot.mudclient.MudClientWrapper;
import rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import rscvanilla.bot.script.engine.executor.ScriptThreadExecutor;
import rscvanilla.bot.script.engine.executor.ScriptThreadExecutorListener;
import rscvanilla.bot.script.engine.loader.ScriptLoader;
import rscvanilla.bot.script.template.RunnableScript;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.concurrent.Future;

public class ScriptEngine implements ScriptThreadExecutorListener {

    private static final Logger logger = LoggerFactory.getLogger(ScriptEngine.class);

    private final ScriptThreadExecutor scriptThreadExecutor;
    private final ScriptList scriptList;
    private final ScriptLoader scriptLoader;
    private final ScriptFactory scriptFactory;
    private final Printer printer;
    private final MudClientWrapper mudClientWrapper;

    private volatile Future<?> scriptTask;
    private RunnableScript script;

    private ScriptAntiBanParams antiBanParams;

    private ScriptEngineListener listener;

    @Inject
    public ScriptEngine(ScriptLoader scriptLoader,
                        ScriptList scriptList,
                        ScriptThreadExecutor scriptExecutor,
                        ScriptFactory scriptFactory,
                        Printer printer,
                        MudClientWrapper mudClientWrapper) {

        this.antiBanParams = new ScriptAntiBanParams();

        this.mudClientWrapper = mudClientWrapper;
        this.scriptLoader = scriptLoader;
        this.scriptList = scriptList;
        this.scriptThreadExecutor = scriptExecutor;
        this.scriptFactory = scriptFactory;
        this.printer = printer;

        scriptThreadExecutor.addListener(this);
    }

    public void startScript() {
        try {
            if (mudClientWrapper.isLoginUserOrPasswordMissing()) {
                printer.printAsBot(
                    "Script couldn't be started - login user or password is not set. " +
                    "Set login information through game client (login first) or select pre-defined user with password from drop down menu."
                );
                listener.onScriptStartFailed();
                return;
            }

            script = scriptFactory.createScript(scriptList.getSelection(), antiBanParams);
            scriptTask = scriptThreadExecutor.submit(script);

            var msg = String.format("Started script [%s].", script.getName());
            logger.info(msg);
            printer.printAsBot(msg);

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
            throw BotException.of("SCRIPT START FAILED!");
        }

        listener.onScriptStarted();
    }

    public void stopScript() {
        scriptTask.cancel(true);
    }

    public void cleanUp() {
        scriptTask = null;
        script = null;
    }

    public void loadScripts() {
        scriptList.addScripts(scriptLoader.getScripts());
        listener.onScriptsLoaded(scriptList.getAll(), scriptList.getSelection());

        var message = "Loaded " + "[" + scriptList.count() +"] scripts.";
        printer.printAsBot(message);
        logger.info(message);
    }

    public void reloadScripts() {
        if (scriptTask != null && !scriptTask.isCancelled()) {
            logger.info("Reloading script engine list while script is running isn't possible.");
            return;
        }

        scriptList.clearElements();
        scriptList.addScripts(scriptLoader.getScripts());
        scriptList.replaceOldSelectedScriptWithNew();
        listener.onScriptsLoaded(scriptList.getAll(), scriptList.getSelection());

        var message = "Reloaded " + "[" + scriptList.count() +"] scripts.";
        printer.printAsBot(message);
        logger.info(message);
    }

    public void setSelectedScript(Class<? extends RunnableScript> script) {
        scriptList.setSelection(script);
    }

    public void dispatchInGameMessage(GameMessageEvent event) {
        logger.trace("dispatchInGameMessage");

        if (script != null && script.getState().isRunning()) {
            logger.trace("dispatchInGameMessage");
            script.enqueueGameMessageEvent(event);
        }
    }

    @Override
    public void onAfterExecution(Throwable exception) {
        stopScript();

        var completeScriptStopMessage = getScriptStopMessage(exception, true);
        var scriptStopMessage = getScriptStopMessage(exception, false);

        if (exception == null) {
            logger.info(scriptStopMessage);
        } else {
            logger.warn(completeScriptStopMessage);
        }

        printer.printAsBot(scriptStopMessage);
        listener.onScriptStopped();

        cleanUp();
    }

    public String getScriptStopMessage(Throwable exception, boolean completeTrace) {

        var prefix = exception == null
                ? "Stopped"
                : "Failed";

        var stackTrace = exception == null
                ? ""
                : String.format("\n%s", ExceptionUtils.getStackTrace(completeTrace ? exception : exception.getCause()));

        var state = script.getState();

        return String.format("%s script [%s] executed for [%s].%s", prefix, state.getName(), state.getExecutionDuration(), stackTrace);
    }

    public void addScriptEngineListener(ScriptEngineListener listener) {
        this.listener = listener;
    }

    public void updateAntiBanParams(ScriptAntiBanParams antiBanParams) {
        this.antiBanParams = antiBanParams;
    }

    public void updateAntiBanIgnoredUsernames(List<String> ignoredUsernames) {
        if (this.script != null) {
            this.script.updateAntiBanIgnoredUsernames(ignoredUsernames);
        }
    }
}
