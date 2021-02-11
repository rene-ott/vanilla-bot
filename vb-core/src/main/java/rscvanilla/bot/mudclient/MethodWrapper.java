package rscvanilla.bot.mc;

import rscvanilla.bot.infrastructure.BotException;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodWrapper<T> {

    public static class Unit { }

    private final Object internalObject;
    private final Method matchedMethod;

    private final String matchedFieldName;
    private final String methodDisplayName;

    public MethodWrapper(Object internalObject, Method matchedMethod, String methodDisplayName) {
        this.internalObject = internalObject;
        this.matchedMethod = matchedMethod;
        this.matchedFieldName = matchedMethod.getClass().getName();
        this.methodDisplayName = methodDisplayName;
        this.matchedMethod.setAccessible(true);
    }

    @SuppressWarnings("unchecked")
    public T invokeFunction(Object... args)  {
        try {
            return (T) matchedMethod.invoke(internalObject, args);
        } catch (IllegalAccessException e) {
            throw createWrappedIllegalStateException(e);
        } catch (InvocationTargetException e) {
            throw createWrappedInvocationTargetException(e);
        }
    }

    public void invokeAction(Object... args) {
        try {
            matchedMethod.invoke(internalObject, args);
        } catch (IllegalAccessException e) {
            throw createWrappedIllegalStateException(e);
        } catch (InvocationTargetException e) {
            throw createWrappedInvocationTargetException(e);
        }
    }

    private BotException createWrappedIllegalStateException(IllegalAccessException exception) {
        return BotException.of("Can't access internal object method [%s] through wrapper method [%s].",
            matchedFieldName, methodDisplayName, exception
        );
    }

    private BotException createWrappedInvocationTargetException(InvocationTargetException exception) {
        return BotException.of("Invocation of internal object method [%s] through wrapper method [%s] failed.",
            matchedFieldName, methodDisplayName, exception.getCause()
        );
    }
}
