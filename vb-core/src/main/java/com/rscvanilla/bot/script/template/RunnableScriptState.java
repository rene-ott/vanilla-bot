package com.rscvanilla.bot.script.template;

import org.apache.commons.lang3.time.DurationFormatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RunnableScriptState {

    private volatile long startExecutionTimeMillis = -1;
    private volatile long stopExecutionTimeMillis = -1;

    private volatile RunnableScriptStatus status;
    private final String scriptName;

    private static final Logger logger = LoggerFactory.getLogger(RunnableScript.class);

    private boolean isScriptLoopEnabled;

    public RunnableScriptState(String scriptName) {
        this.scriptName = scriptName;
        isScriptLoopEnabled = true;
    }

    public String getExecutionDuration() {
        if (stopExecutionTimeMillis == -1) {
            throw new IllegalStateException("");
        }

        return DurationFormatUtils.formatDuration(stopExecutionTimeMillis - startExecutionTimeMillis, "HH:mm:ss");
    }

    public RunnableScriptStatus getStatus() {
        return status;
    }

    // TODOO Kui viga, siis
    public synchronized void setStatus(RunnableScriptStatus status) {
        logger.debug(String.format("%s -> %s", this.status.toString(), status.toString()));
        this.status = status;
    }

    public boolean isRunning() {
        return status == RunnableScriptStatus.RUNNING;
    }

    public boolean isPaused() {
        return status == RunnableScriptStatus.PAUSED;
    }

    public boolean isStopping() {
        return status == RunnableScriptStatus.STOPPING;
    }

    public String getName() {
        return scriptName;
    }

    public void stop() {
        stopExecutionTimeMillis = System.currentTimeMillis();
    }

    public void start() {
        startExecutionTimeMillis = System.currentTimeMillis();
        status = RunnableScriptStatus.RUNNING;
    }

    public void enableScriptLoop(boolean isScriptLoopEnabled) {
        this.isScriptLoopEnabled = isScriptLoopEnabled;
    }

    public boolean isScriptLoopEnabled() {
        return isScriptLoopEnabled;
    }
}
