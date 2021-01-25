package com.rscvanilla.bot.script.template;

import com.rscvanilla.bot.events.InGameMessageReceivedEvent;
import com.rscvanilla.bot.infrastructure.utils.ExecutorUtil;
import com.rscvanilla.bot.mc.interceptors.ingamemessage.InGameMessageQueue;
import com.rscvanilla.bot.script.ScriptDependencyContext;
import com.rscvanilla.bot.script.antiban.AntiBannable;
import com.rscvanilla.bot.script.antiban.ScriptAntiBan;
import com.rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public abstract class RunnableScript extends Script implements Runnable, AntiBannable {

    private static final Logger logger = LoggerFactory.getLogger(RunnableScript.class);

    private final InGameMessageQueue inGameMessageQueue;
    private final RunnableScriptState state;
    private ScriptAntiBan antiBan;
    private ScheduledExecutorService antiBanScheduler;

    /** Script GUI and AB thread might access this **/
    private volatile Thread scriptThread;

    public RunnableScript(ScriptDependencyContext dependencyContext, ScriptAntiBanParams antiBanParameters) {
        super(dependencyContext);

        scriptThread = Thread.currentThread();

        state = new RunnableScriptState(this.getClass().getSimpleName());
        antiBan = new ScriptAntiBan(antiBanParameters, this, state);

        inGameMessageQueue = new InGameMessageQueue();
        antiBanScheduler = ExecutorUtil.newSingleThreadScheduledExecutor("ANTIBAN");
    }

    @Override
    public void run() {
        onStart();

        while (!Thread.currentThread().isInterrupted()) {

            if (!state.isScriptLoopEnabled()) {
                continue;
            }

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
                logger.debug("STOPPED");
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

        onStop();
    }

    private void checkAntiBan() {
        try {
            if (antiBan.getParams().isEnabled()) {
                antiBan.cleanUpTransientState();
                if (antiBan.isAnyPlayerDetected() && state.isRunning()) {
                    antiBan.doAntiBan();
                }

                antiBan.doPauseTimeOverCheck();
            }
        } catch (Exception e) {
            logger.error("ANTIBAN FAILED", e);
            scriptThread.interrupt();
        }
    }

    protected abstract void loop();

    protected void onStart() {
        state.start();

        if (antiBan.getParams().isEnabled()) {
            logger.debug("AntiBan enabled: " + antiBan.getParams());
            antiBanScheduler.scheduleWithFixedDelay(this::checkAntiBan, 1, 2 , TimeUnit.SECONDS);
        }
    }

    protected void onStop() {
        logger.debug("onStop");
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

    public void enqueueInGameMessageEvent(InGameMessageReceivedEvent event) {
        inGameMessageQueue.enqueue(event);
    }

    public RunnableScriptState getState() {
        return state;
    }
}
