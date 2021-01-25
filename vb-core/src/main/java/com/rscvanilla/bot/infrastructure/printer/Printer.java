package com.rscvanilla.bot.infrastructure.printer;

import com.rscvanilla.bot.events.MessageEvent;

public interface Printer {
     void print(MessageEvent.Type type, String message);
}
