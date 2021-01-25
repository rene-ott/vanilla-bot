package com.rscvanilla.bot.mc.interceptors.ingamemessage;

import com.rscvanilla.bot.events.InGameMessageReceivedEvent;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class InGameMessageQueue {

    private InGameMessageReceivedEvent lastItem = new InGameMessageReceivedEvent(null, "X", "X");

    private BlockingQueue<InGameMessageReceivedEvent> queue = new LinkedBlockingQueue<>();

    public InGameMessageQueue() {
        queue.add(lastItem);
    }

    public boolean hasMessages() {
        return queue.peek() != lastItem;
    }

    public InGameMessageReceivedEvent take() {
        try {
            if (hasMessages()) {
                return queue.take();
            }
        } catch (InterruptedException e) {
            return null;
        }

        return null;
    }

    public void enqueue(InGameMessageReceivedEvent event) {
        queue.add(event);
    }
}
