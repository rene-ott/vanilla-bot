package rscvanilla.bot.mudclient.wrappers.utils;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import rscvanilla.bot.infrastructure.BotException;

import java.lang.reflect.Field;

public class FieldWrapper<T> {

    private final Object internalObject;
    private final Field matchedField;
    private final String fieldDisplayName;
    private final Class<?> expectedFieldReturnType;

    private final String matchedFieldName;
    private final String expectedFieldReturnTypeName;

    public FieldWrapper(Object internalObject, Field matchedField, Class<?> expectedFieldReturnType, String fieldDisplayName) {
        this.internalObject = internalObject;

        this.matchedField = matchedField;
        matchedFieldName = matchedField.getName();

        this.fieldDisplayName = fieldDisplayName;
        this.expectedFieldReturnType = expectedFieldReturnType;

        // If expectedFieldReturnTypeName == null then it's injected interceptor
        expectedFieldReturnTypeName = expectedFieldReturnType == null ? null : expectedFieldReturnType.getName();

        validateMatchedField();
    }

    private void validateMatchedField() {
        try {
            var matchedFieldValue = matchedField.get(internalObject);


            if (expectedFieldReturnType == null) {
                return;
            }

            if (matchedFieldValue != null) {
                if (!expectedFieldReturnType.isInstance(matchedFieldValue)) {
                    throw BotException.of(
                        "Can't cast internal object field [%s] type [%s] to wrapper field [%s] type [%s].",
                        matchedFieldName, matchedFieldValue.getClass().getName(), fieldDisplayName, expectedFieldReturnTypeName
                    );
                }
            } else {
                if (!ArrayUtils.contains(NullValuedFieldWrappers.MUD_CLIENT_WRAPPER, fieldDisplayName)) {
                    throw BotException.of("Internal object field [%s] value for wrapper field [%s] is null", matchedFieldName, fieldDisplayName);
                }
            }
        } catch (IllegalAccessException e) {
            throw createWrappedIllegalStateException(e);
        }
    }

    // Can't take field value directly because primitive values are copied over
    @SuppressWarnings("unchecked")
    public T getValue() {
        try {
            return (T) matchedField.get(internalObject);
        } catch (IllegalAccessException e) {
            throw createWrappedIllegalStateException(e);
        }
    }

    public void setValue(T value) {
        try {
            FieldUtils.writeField(internalObject, matchedField.getName(), value, true);
        } catch (IllegalAccessException e) {
            throw createWrappedIllegalStateException(e);
        }
    }

    private BotException createWrappedIllegalStateException(IllegalAccessException exception) {
        return BotException.of("Can't access internal object field [%s] through wrapper field [%s].", matchedFieldName, fieldDisplayName, exception);
    }
}
