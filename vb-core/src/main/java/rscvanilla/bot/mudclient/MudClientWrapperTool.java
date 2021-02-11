package rscvanilla.bot.mudclient;

import org.apache.commons.lang3.reflect.FieldUtils;
import org.apache.commons.lang3.reflect.MethodUtils;
import org.slf4j.Logger;
import rscvanilla.bot.mudclient.models.wrappers.RSEntityWrapper;
import rscvanilla.bot.infrastructure.BotException;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MudClientWrapperTool {

    public static <T, T2> MethodWrapper<T> initMethod(
        T2 objectWithMethod,
        Logger logger,
        String methodDisplayName,
        String internalObjectMethodName,
        Class<?>... internalObjectMethodExpectedParamTypes
    ) {
        var method = MethodUtils.getMatchingMethod(objectWithMethod.getClass(), internalObjectMethodName, internalObjectMethodExpectedParamTypes);
        if (method != null) {
            logger.debug(" - {} => {}", methodDisplayName, getMethodSignature(method));
            return new MethodWrapper<>(objectWithMethod, method, methodDisplayName);
        } else {
            throw BotException.of("Can't init method: %s => %s", methodDisplayName, getExpectedMethodSignature(internalObjectMethodName, internalObjectMethodExpectedParamTypes));
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

    public static <T> FieldWrapper<T> initField(
        Object objectWithField,
        Logger logger,
        String fieldDisplayName,
        String objectClassFieldName,
        Class<?> objectClassFieldReturnType
    ) {
        var field = FieldUtils.getField(objectWithField.getClass(), objectClassFieldName, true);
        if (field != null) {
            logger.debug(" - {} => {} {};", fieldDisplayName, field.getType().getCanonicalName(), objectClassFieldName);
            return new FieldWrapper<>(objectWithField, field, objectClassFieldReturnType, fieldDisplayName);
        } else {
            throw BotException.of("Can't init field: %s => %s", fieldDisplayName, objectClassFieldName);
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
            throw BotException.of("Indexed list creation failed", e);
        }
    }
}


