package rscvanilla.bot.script.template;

import rscvanilla.bot.events.messages.GameMessageEvent;
import rscvanilla.bot.infrastructure.utils.ExecutorUtil;
import rscvanilla.bot.mudclient.handlers.gamemessage.GameMessageQueue;
import rscvanilla.bot.script.ScriptDependencyContext;
import rscvanilla.bot.script.antiban.ScriptWithAntiBan;
import rscvanilla.bot.script.antiban.ScriptAntiBan;
import rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public abstract class RunnableScript extends Script implements Runnable, ScriptWithAntiBan {

    private static final Logger logger = LoggerFactory.getLogger(RunnableScript.class);

    // These fields are created by AWT Thread
    private final GameMessageQueue gameMessageQueue;

    private final RunnableScriptState state;
    private final ScriptAntiBan antiBan;
    private final ScheduledExecutorService antiBanScheduler;

    // Script GUI and AB thread might access this
    private volatile Thread scriptThread;

    public RunnableScript(ScriptDependencyContext dependencyContext, ScriptAntiBanParams antiBanParameters) {
        super(dependencyContext);

        state = new RunnableScriptState(getName());
        antiBan = new ScriptAntiBan(antiBanParameters, this, state);

        gameMessageQueue = new GameMessageQueue();
        antiBanScheduler = ExecutorUtil.createNamedAntiBanScheduledExecutor();
    }

    protected void onStart() {
        logger.trace("onStart");

        // This must be created here to have reference to 'script' thread.
        scriptThread = Thread.currentThread();
        state.start();

        if (antiBan.getParams().isEnabled()) {
            logger.trace("AntiBan [ENABLED] with parameters: " + antiBan.getParams());
            antiBanScheduler.scheduleWithFixedDelay(this::checkAntiBan, 1, 2 , TimeUnit.SECONDS);
        }
    }

    @Override
    public void run() {
        Exception exceptionFromAnotherThread;
        try {
            onStart();

            while (!Thread.currentThread().isInterrupted()) {
                var messageEvent = gameMessageQueue.dequeue();

                if (!state.isScriptLoopEnabled()) {
                    continue;
                }

                callGameMessageListener(messageEvent);

                if (state.getStatus() == RunnableScriptStatus.LOGGING_OUT) {
                    if (isInGame()) {
                        logout();
                        waitFor(4000);
                        continue;
                    }

                    state.setStatus(antiBan.getParams().isPause() ? RunnableScriptStatus.PAUSED : RunnableScriptStatus.STOPPED);
                    continue;
                } else if (state.getStatus() == RunnableScriptStatus.PAUSED) {
                    continue;
                } else if (state.getStatus() == RunnableScriptStatus.STOPPING) {
                    continue;
                } else if (state.getStatus() == RunnableScriptStatus.STOPPED) {
                    stopScript();
                } else if (state.getStatus() == RunnableScriptStatus.RUNNING && isOnLoginScreen()) {
                    login();
                    waitFor(4000);
                    continue;
                }

                if (isInGame()) {
                    if (isSleeping()) {
                        continue;
                    }

                    loop();
                }
            }

            // If AntiBan throw exception then we stop later and rethrow exception
            exceptionFromAnotherThread = state.getAntiBanException();
            if (exceptionFromAnotherThread == null) {
                onStop();
            }

        } catch (Exception e) {
            onStop();
            throw e;
        }

        // Rethrow it just to let ScriptThread executor handle it.
        if (exceptionFromAnotherThread != null) {
            onStop();
            throw new RuntimeException(exceptionFromAnotherThread);
        }
    }

    private void checkAntiBan() {
        try {
            if (antiBan.getParams().isEnabled()) {

                // If isn't in game then player detection doesn't work because player list is stale.
                if (isInGame() && state.isRunning() && antiBan.isAnyNewPlayersDetected()) {
                    antiBan.doAntiBan();
                }

                antiBan.doPauseTimeOverCheck();
            }
        } catch (Exception e) {
            // This might not be the best solution, but it works.
            state.setAntiBanException(e);
            scriptThread.interrupt();
        }
    }

    protected abstract void loop();

    protected void onStop() {
        logger.trace("onStop");

        state.stop();
        if (!antiBanScheduler.isShutdown()) {
            antiBanScheduler.shutdownNow();
        }
    }

    protected void disableScriptLoop() { state.enableScriptLoop(false); }
    protected void enableScriptLoop() { state.enableScriptLoop(true); }

    protected void stopScript(String msg) {
        if (msg != null) {
            print(msg);
        }

        Thread.currentThread().interrupt();
    }

    public void stopScript() {
        stopScript(null);
    }

    protected void waitFor(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
             Thread.currentThread().interrupt();
        }
    }

    public void enqueueGameMessageEvent(GameMessageEvent event) {
        gameMessageQueue.enqueue(event);
    }

    public RunnableScriptState getState() {
        return state;
    }

    public String getName() {
        return this.getClass().getSimpleName();
    }

    void callGameMessageListener(GameMessageEvent event) {
        if (event == null || !state.isRunning() || !isInGame() || !state.isScriptLoopEnabled()) {
            return;
        }
        var type = event.getType();
        if (event.getSender() != null && event.getSender().equals(getUserName())) {
            return;
        }

        switch (type) {
            case GAME -> onGameMessageReceived(event.getMessage());
            case CHAT -> onChatMessageReceived(event.getSender(), event.getMessage());
        }
    }

    public void updateAntiBanIgnoredUsernames(List<String> usernames) {
        antiBan.setIgnoredUsernames(usernames);
    }
}
