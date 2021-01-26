package rscvanilla.bot.infrastructure.printer;

import rscvanilla.bot.events.MessageEvent;

public interface Printer {
     void print(MessageEvent.Type type, String message);
}
