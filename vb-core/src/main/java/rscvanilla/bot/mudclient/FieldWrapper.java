package rscvanilla.bot.mudclient;

import rscvanilla.bot.infrastructure.BotException;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.reflect.FieldUtils;

import java.lang.reflect.Field;

public class FieldWrapper<T> {

    // If field wrapper isn't generic class, not specialised to MudClientWrapper then we shouldn't hardcode values.
    private static final String[] KNOWN_FIELDS_WITH_MISSING_VALUE = new String[] {
        MudClientWrapper.FIELD_USER_NAME,
        MudClientWrapper.FIELD_USER_PASSWORD
    };

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
                if (!ArrayUtils.contains(KNOWN_FIELDS_WITH_MISSING_VALUE, fieldDisplayName)) {
                    //throw BotException.of("Internal object field [%s] value for wrapper field [%s] is null", matchedFieldName, fieldDisplayName);
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
