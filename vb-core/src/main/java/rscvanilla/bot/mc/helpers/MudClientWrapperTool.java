package rscvanilla.bot.mc.helpers;

import org.apache.commons.lang3.reflect.FieldUtils;
import org.apache.commons.lang3.reflect.MethodUtils;
import org.slf4j.Logger;
import rscvanilla.bot.api.models.wrappers.RSEntityWrapper;
import rscvanilla.bot.infrastructure.BotException;
import rscvanilla.bot.mc.MudClientWrapper;
import rscvanilla.bot.mc.proxies.FieldWrapper;
import rscvanilla.bot.mc.proxies.MethodWrapper;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MudClientWrapperTool {

    public static <T, T2> MethodWrapper<T> initMethod(T2 objectWithMethods, Logger logger, String hookName, String hookValue, Class<?>... methodParamTypes) {
        var method = MethodUtils.getMatchingMethod(objectWithMethods.getClass(), hookValue, methodParamTypes);
        if (method != null) {
            logger.debug(hookName + " => " + getMethodSignature(method));
            return new MethodWrapper<>(objectWithMethods, method);
        } else {
            throw new BotException("Can't init method hook: " + hookName + "=>" + getExpectedMethodSignature(hookValue, methodParamTypes));
        }
    }

    private static String getMethodSignature(Method method) {
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

    public static <T> FieldWrapper<T> initField(Object objectWithField, Logger logger, String hookName, String hookValue, Class<?> hookValueType) {
        var field = FieldUtils.getField(objectWithField.getClass(), hookValue, true);
        if (field != null) {
            logger.debug(hookName + " => " + field.getType().getCanonicalName() + " " + hookValue);
            return new FieldWrapper<>(objectWithField, field, hookValueType, hookName);
        } else {
            throw new BotException("Can't init field hook: " + hookName + " => " + hookValue);
        }
    }

    public static <TObject extends RSEntityWrapper<TInternalObject>, TInternalObject extends com.rsc.e.d> List<TObject> newWrappedEntityList(
        TInternalObject[] internalArray,
        int internalArrayLength,
        Class<TObject> clazz,
        MudClientWrapper mudClientWrapper
    ) {
        return IntStream.range(0, internalArrayLength)
            .mapToObj(i -> newWrappedEntityInstance(internalArray[i], clazz, mudClientWrapper))
            .collect(Collectors.toList());
    }

    private static <TEntity extends RSEntityWrapper<TInternalObject>, TInternalObject extends com.rsc.e.d> TEntity newWrappedEntityInstance(
        TInternalObject internalObject,
        Class<TEntity> clazz,
        MudClientWrapper mudClientWrapper
    ) {
        if (internalObject == null) {
            return null;
        }

        try {
            var constructor = clazz.getDeclaredConstructor(internalObject.getClass(), mudClientWrapper.getClass());

            return constructor.newInstance(internalObject, mudClientWrapper);
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new BotException("Indexed list creation failed", e);
        }
    }
}


