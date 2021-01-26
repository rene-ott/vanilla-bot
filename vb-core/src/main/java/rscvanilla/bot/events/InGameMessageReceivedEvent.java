package rscvanilla.bot.events;

import rscvanilla.bot.infrastructure.utils.DateUtil;

public class InGameMessageReceivedEvent extends MessageEvent {

    private String sender;

    public InGameMessageReceivedEvent(Type type, String sender, String message) {
        super(type, message);
        this.sender = sender;
    }

    public String getSender() {
        return sender;
    }

    public boolean isInGameMessageReceivedType() {
        return type == Type.IN_GAME_CHAT || type == Type.IN_GAME_GLOBAL_CHAT;
    }

    public String getCompleteMessage() {
        return "[" + DateUtil.getDateTime() + "] " + sender + ": " + message;
    }
}
