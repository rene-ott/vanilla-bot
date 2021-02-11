package rscvanilla.bot.mc.proxies;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodWrapper<T> {

    public static class None { }

    private Object object;
    private Method method;

    public MethodWrapper(Object object, Method method) {
        this.object = object;
        this.method = method;
        this.method.setAccessible(true);
    }

    public T invokeFunction(Object... args)  {
        try {
            return (T) method.invoke(object, args);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;
    }

    public None invokeAction(Object... args) {
        try {
            method.invoke(object, args);
            return new None();
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;
    }
}
