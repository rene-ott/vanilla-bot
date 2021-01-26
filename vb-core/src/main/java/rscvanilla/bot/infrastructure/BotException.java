package rscvanilla.bot.infrastructure;

public class BotException extends RuntimeException {

    public BotException(Throwable e) {
        super(e);
    }

    public BotException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public BotException(String message) {
        super(message);
    }
}
