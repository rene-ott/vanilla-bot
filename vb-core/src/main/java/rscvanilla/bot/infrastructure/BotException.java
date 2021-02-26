package rscvanilla.bot.infrastructure;

import java.util.Arrays;

@SuppressWarnings("serial")
public class BotException extends RuntimeException {

    private BotException(String message, Throwable throwable) {
        super(message, throwable);
    }

    private BotException(String message) {
        super(message);
    }

    // Object...args last element might be throwable
    public static BotException of(String message, Object...args) {
        if (args == null || args.length == 0) {
            return new BotException(message);
        } else {
            if (args.length == 1) {
                if (args[0] instanceof Throwable) {
                    return new BotException(message, (Throwable) args[0]);
                } else {
                    return new BotException(String.format(message, args));
                }
            } else {
                var lastArgument = args[args.length - 1];
                if (lastArgument instanceof Throwable) {
                    return new BotException(String.format(message, Arrays.copyOfRange(args, 0, args.length -1)), (Throwable) lastArgument);
                } else {
                    return new BotException(String.format(message, args));
                }
            }
        }
    }
}
