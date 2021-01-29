package rscvanilla.bot.events.messages;

import rscvanilla.bot.infrastructure.utils.DateUtil;

public class GameMessageEvent extends MessageEvent {

    private final String sender;
    private final GameMessageType type;

    private GameMessageEvent(GameMessageType type, String sender, String message) {
        super(message);
        this.sender = sender;
        this.type = type;
    }

    public String getSender() {
        return sender;
    }

    public GameMessageType getType() {
        return type;
    }

    public String formatMessage() {
        return "[" + DateUtil.getDateTime() + "] " + sender + ": " + getMessage();
    }

    public static GameMessageEvent createGameMessage(String message) {
        return new GameMessageEvent(GameMessageType.GAME, null, message);
    }

    public static GameMessageEvent createChatMessage(String sender, String message) {
        return new GameMessageEvent(GameMessageType.CHAT, sender, message);
    }

    public static GameMessageEvent createGlobalChatMessage(String sender, String message) {
        return new GameMessageEvent(GameMessageType.GLOBAL_CHAT, sender, message);
    }
}
