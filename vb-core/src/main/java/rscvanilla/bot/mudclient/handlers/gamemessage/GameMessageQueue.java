package rscvanilla.bot.mudclient.handlers.gamemessage;

import rscvanilla.bot.events.messages.GameMessageEvent;

import java.util.concurrent.ConcurrentLinkedQueue;

public class GameMessageQueue {

    private final ConcurrentLinkedQueue<GameMessageEvent> queue = new ConcurrentLinkedQueue<>();

    public GameMessageEvent dequeue() {
        return queue.poll();
    }

    // TODO: There might be memory out of exception
    public void enqueue(GameMessageEvent event) {
        queue.add(event);
    }
}
