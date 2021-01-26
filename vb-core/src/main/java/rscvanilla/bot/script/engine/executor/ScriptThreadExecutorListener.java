package rscvanilla.bot.script.engine.executor;

public interface ScriptThreadExecutorListener {
    void onAfterExecution(Throwable exception);
}
