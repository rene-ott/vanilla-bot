package rscvanilla.bot.infrastructure.printer;

import com.google.common.eventbus.EventBus;
import rscvanilla.bot.events.messages.BotMessageEvent;

import javax.inject.Inject;

public class TabPrinter implements Printer {

    private final EventBus eventBus;

    @Inject
    public TabPrinter(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    @Override
    public void printAsBot(String message, Object... args) {
        eventBus.post(BotMessageEvent.createBotMessage(String.format(message, args)));
    }

    @Override
    public void printAsScript(String message, Object... args) {
        eventBus.post(BotMessageEvent.createScriptMessage(String.format(message, args)));
    }
}
