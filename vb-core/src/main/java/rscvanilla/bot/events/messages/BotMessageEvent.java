package rscvanilla.bot.events.messages;

import rscvanilla.bot.infrastructure.utils.DateUtil;

public class BotMessageEvent extends MessageEvent {

    private final BotMessageType type;

    private BotMessageEvent(BotMessageType type, String message) {
        super(message);
        this.type = type;
    }

    public BotMessageType getType() {
        return type;
    }

    public String formatMessage() {
        return "[" + DateUtil.getDateTime() + "] [" + type + "] " + getMessage();
    }

    public static BotMessageEvent createScriptMessage(String message) {
        return new BotMessageEvent(BotMessageType.SCRIPT, message);
    }

    public static BotMessageEvent createBotMessage(String message) {
        return new BotMessageEvent(BotMessageType.BOT, message);
    }
}
