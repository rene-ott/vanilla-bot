package com.rscvanilla.bot.mc.helpers;

import com.rscvanilla.bot.infrastructure.BotException;
import com.rscvanilla.bot.mc.proxies.FieldHook;
import com.rscvanilla.bot.mc.proxies.MethodHook;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.apache.commons.lang3.reflect.MethodUtils;
import org.slf4j.Logger;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class HookLoader {

    public static <T, T2> MethodHook<T> loadMethodHook(T2 objectWithMethods, Logger logger, String hookName, String hookValue, Class<?>... methodParamTypes) {
        var method = MethodUtils.getMatchingMethod(objectWithMethods.getClass(), hookValue, methodParamTypes);
        if (method != null) {
            logger.debug(hookName + " => " + getMethodSignature(method));
            return new MethodHook<>(objectWithMethods, method);
        } else {
            throw new BotException("Can't init method hook: " + hookName + "=>" + getExpectedMethodSignature(hookValue, methodParamTypes));
        }
    }

    public static String getMethodSignature(Method method) {
        List<String> parameters = new ArrayList<>();

        IntStream.range(0, method.getParameters().length).forEach(i -> {
            Parameter parameter = method.getParameters()[i];
            Class<?> parameterType = method.getParameterTypes()[i];

            parameters.add(parameterType.getSimpleName() + " " + parameter.getName());
        });

        String methodName = method.getName();
        String joinedParameters = String.join(",", parameters);
        String returnType = method.getReturnType().getSimpleName();

        return returnType + " " + methodName + "(" + joinedParameters + ");";
    }

    private static String getExpectedMethodSignature(String methodName, Class<?>... params) {
        var paramList = new ArrayList<String>();

        IntStream.range(1, params.length + 1).forEach(i -> {
            var paramName = "param" + i;
            var typeName = params[i-1].getSimpleName();
            paramList.add(typeName + " " + paramName);
        });

        return methodName + "(" + String.join(",", paramList) + ")";
    }

    public static <T> FieldHook<T> loadFieldHook(Object objectWithField, Logger logger, String hookName, String hookValue, Class<?> hookValueType) {
        var field = FieldUtils.getField(objectWithField.getClass(), hookValue, true);
        if (field != null) {
            logger.debug(hookName + " => " + field.getType().getCanonicalName() + " " + hookValue);
            return new FieldHook<>(objectWithField, field, hookValueType, hookName);
        } else {
            throw new BotException("Can't init field hook: " + hookName + " => " + hookValue);
        }
    }
}
