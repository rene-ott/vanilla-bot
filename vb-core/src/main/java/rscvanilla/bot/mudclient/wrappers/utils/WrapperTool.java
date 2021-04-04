package rscvanilla.bot.mudclient.wrappers.utils;

import org.apache.commons.lang3.reflect.FieldUtils;
import org.apache.commons.lang3.reflect.MethodUtils;
import org.slf4j.Logger;
import rscvanilla.bot.mudclient.wrappers.MudClientWrapper;
import rscvanilla.bot.mudclient.wrappers.entities.GameEntity;
import rscvanilla.bot.infrastructure.BotException;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WrapperTool {

    public static <T, T2> MethodWrapper<T> loadMethod(
        T2 internalObject,
        Logger logger,
        String methodDisplayName,
        String methodName,
        Class<?>... methodParamTypes
    ) {
        var method = MethodUtils.getMatchingMethod(internalObject.getClass(), methodName, methodParamTypes);
        if (method != null) {
            if (logger != null) {
                logger.debug(" - {} => {}", methodDisplayName, getMethodSignature(method));
            }

            return new MethodWrapper<>(internalObject, method, methodDisplayName);
        } else {
            throw BotException.of("Can't init method: %s => %s", methodDisplayName, getExpectedMethodSignature(methodName, methodParamTypes));
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

    private static String getExpectedMethodSignature(String methodName, Class<?>... methodArgumentTypes) {
        var argumentList = new ArrayList<String>();

        IntStream.range(1, methodArgumentTypes.length + 1).forEach(i -> {
            var argumentVariableName = "arg" + i;
            var returnType = methodArgumentTypes[i - 1].getSimpleName();
            argumentList.add(String.format("%s %s", returnType, argumentVariableName));
        });

        return String.format("%s(%s)",methodName, String.join(",", argumentList));
    }

    public static <T> FieldWrapper<T> loadField(
        Object internalObject,
        Logger logger,
        String fieldDisplayName,
        String fieldName,
        Class<?> fieldReturnType
    ) {
        var field = FieldUtils.getField(internalObject.getClass(), fieldName, true);
        if (field != null) {
            if (logger != null) {
                logger.debug(" - {} => {} {};", fieldDisplayName, field.getType().getCanonicalName(), fieldName);
            }
            return new FieldWrapper<T>(internalObject, field, fieldReturnType, fieldDisplayName);
        } else {
            throw BotException.of("Can't init field: %s => %s", fieldDisplayName, fieldName);
        }
    }

    public static <TObject extends GameEntity<TInternalObject>, TInternalObject extends com.rsc.e.d> List<TObject> newWrapperGameEntityList(
        TInternalObject[] internalArray,
        int internalArrayLength,
        Class<TObject> clazz,
        MudClientWrapper mudClientWrapper
    ) {
        return IntStream.range(0, internalArrayLength)
            .mapToObj(i -> newWrapperGameEntityList(internalArray[i], clazz, mudClientWrapper))
            .collect(Collectors.toList());
    }

    private static <TEntity extends GameEntity<TInternalObject>, TInternalObject extends com.rsc.e.d> TEntity newWrapperGameEntityList(
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
            throw BotException.of("Indexed list creation failed", e);
        }
    }
}


