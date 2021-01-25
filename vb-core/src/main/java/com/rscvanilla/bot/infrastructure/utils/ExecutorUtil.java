package com.rscvanilla.bot.infrastructure.utils;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

public class ExecutorUtil {
    public static ExecutorService newSingleThreadExecutor(String name) {
        return Executors.newSingleThreadScheduledExecutor(createNamedFactory(name));
    }

    public static ScheduledExecutorService newSingleThreadScheduledExecutor(String name) {
        return Executors.newSingleThreadScheduledExecutor(createNamedFactory(name));
    }

    public static ThreadFactory createNamedFactory(String name) {
        return new ThreadFactoryBuilder().setNameFormat("THREAD-" + name).build();
    }
}
