package rscvanilla.bot.infrastructure.utils;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

public class ExecutorUtil {

    private static ScheduledExecutorService newSingleThreadScheduledExecutor(String name) {
        return Executors.newSingleThreadScheduledExecutor(newThreadFactory(name));
    }

    public static ScheduledExecutorService createNamedAntiBanScheduledExecutor() {
        return newSingleThreadScheduledExecutor("antiban");
    }

    public static ScheduledExecutorService createNamedDirWatcherScheduledExecutor() {
        return newSingleThreadScheduledExecutor("dirwatch");
    }

    private static ThreadFactory newThreadFactory(String name) {
        return new ThreadFactoryBuilder().setNameFormat(name).build();
    }

    public static ThreadFactory createNamedScriptThreadFactory() {
        return newThreadFactory("script");
    }
}
