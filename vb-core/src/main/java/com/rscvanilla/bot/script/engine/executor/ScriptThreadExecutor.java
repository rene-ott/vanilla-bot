package com.rscvanilla.bot.script.engine.executor;

import com.rscvanilla.bot.infrastructure.utils.ExecutorUtil;

import javax.inject.Inject;
import java.util.concurrent.*;

public class ScriptThreadExecutor extends ThreadPoolExecutor {

    private ScriptThreadExecutorListener listener;

    @Inject
    public ScriptThreadExecutor() {
        super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(), ExecutorUtil.createNamedFactory("SCRIPT"));
    }

    @Override
    protected void beforeExecute(Thread t, Runnable r) {
        super.beforeExecute(t, r);
    }

    protected void afterExecute(Runnable r, Throwable t) {
        super.afterExecute(r, t);

        Throwable exception = t == null && r instanceof Future<?>
                ? getTaskException((Future<?>) r)
                : null;


        listener.onAfterExecution(exception);
    }

    private Throwable getTaskException(Future<?> scriptExecutionTask) {

        try {
            if (scriptExecutionTask.isDone()) {
                scriptExecutionTask.get();
            }
        } catch (CancellationException e) {
            return null; // Cancellation means that it is done manually
        } catch (Exception ee) {
            return ee;
        }

        return null;
    }

    public void addListener(ScriptThreadExecutorListener listener) {
        this.listener = listener;
    }
}
