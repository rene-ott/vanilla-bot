package com.rscvanilla.bot.mc.proxies;

import com.rscvanilla.bot.infrastructure.BotException;
import com.rscvanilla.bot.mc.helpers.KnownHookWithNullFieldValue;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.reflect.FieldUtils;

import java.lang.reflect.Field;

public class FieldHook<T> {
    private final Object objectWithField;
    private final Field field;
    private final String hookName;
    private final Class<?> hookValueType;

    private final String fieldName;
    private final String hookValueTypeName;

    public FieldHook(Object objectWithField, Field field, Class<?> hookValueType, String hookName) {
        this.objectWithField = objectWithField;
        this.field = field;
        this.hookName = hookName;
        this.hookValueType = hookValueType;

        fieldName = field.getName();

        /** If hookValueType == null then it's injected listener **/
        hookValueTypeName = hookValueType != null ? hookValueType.getName() : null;

        validateHook();
    }

    @SuppressWarnings("unchecked")
    private void validateHook() {
        try {
            var fieldValue = field.get(objectWithField);

            var knownHooksWithNullFieldValue = new String [] {
                    KnownHookWithNullFieldValue.USER_PASSWORD,
                    KnownHookWithNullFieldValue.USER_NAME
            };

            if (hookValueType != null) {
                if (fieldValue == null) {
                    if (!ArrayUtils.contains(knownHooksWithNullFieldValue, hookName)) {
                        throw new BotException(String.format("Initial field [%s] value for hook [%s] is null", fieldName, hookName));
                    }
                } else if (!hookValueType.isInstance(fieldValue)) {
                    var exceptionMsg = String.format(
                            "Can't cast field [%s] type [%s] to hook [%s] type [%s].",
                            fieldName,
                            fieldValue.getClass().getName(),
                            hookName,
                            hookValueTypeName);
                    throw new BotException(exceptionMsg);
                }
            }
        } catch (IllegalAccessException e) {
            throw createWrappedIllegalStateException(e);
        }
    }

    /** Can't take field value directly because primitive values are copied over **/
    @SuppressWarnings("unchecked")
    public T getValue() {
        try {
            return (T) field.get(objectWithField);
        } catch (IllegalAccessException e) {
            throw createWrappedIllegalStateException(e);
        }
    }

    public void setValue(T value) {
        try {
            FieldUtils.writeField(objectWithField, field.getName(), value, true);
        } catch (IllegalAccessException e) {
            throw createWrappedIllegalStateException(e);
        }
    }

    private BotException createWrappedIllegalStateException(IllegalAccessException exception) {
        return new BotException(String.format("Can't access field [%s] from hook [%s].", fieldName, hookName, exception));
    }
}
