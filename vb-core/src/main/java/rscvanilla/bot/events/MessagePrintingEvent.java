package rscvanilla.bot.events;


import rscvanilla.bot.infrastructure.utils.DateUtil;

public class MessagePrintingEvent extends MessageEvent {

    public MessagePrintingEvent(Type type, String message) {
        super(type, message);
    }

    public boolean isMessagePrintedType() {
        return type == Type.BOT || type == Type.SCR;
    }

    public String getCompleteMessage() {
        return "[" + DateUtil.getDateTime() + "] [" + type + "] " + message;
    }
}
