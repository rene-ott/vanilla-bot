package com.rscvanilla.bot.infrastructure.printer;

import com.google.common.eventbus.EventBus;
import com.rscvanilla.bot.events.MessageEvent;
import com.rscvanilla.bot.events.MessagePrintingEvent;

import javax.inject.Inject;

public class TabPrinter implements Printer {

    public EventBus eventBus;

    @Inject
    public TabPrinter(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    @Override
    public void print(MessageEvent.Type type, String message)
    {
        eventBus.post(new MessagePrintingEvent(type, message));
    }
}
