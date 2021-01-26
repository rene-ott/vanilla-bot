package rscvanilla.bot.events;

public class MessageEvent {

    protected Type type;
    protected String message;

    public MessageEvent(Type type, String message) {
        this.type = type;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public Type getType() {
        return type;
    }

    public enum Type {
        BOT,
        SCR,
        IN_GAME_CHAT,
        IN_GAME_GLOBAL_CHAT
    }
}
