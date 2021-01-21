package rscvanilla.hooker.serializer.extensions;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import rscvanilla.hooker.models.common.ClassField;

import java.io.IOException;

public class ClassFieldDeserializer extends JsonDeserializer<ClassField> {

    @Override
    public ClassField deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {

        var classField = new ClassField();
        classField.value = p.getValueAsString();
        classField.fieldName = p.currentName();

        return classField;
    }

    @Override
    public ClassField getNullValue(DeserializationContext ctxt) {
        try {
            var classField = new ClassField();
            classField.fieldName = ctxt.getParser().getCurrentName();
            return classField;
        } catch (IOException e) {
            throw new RuntimeException("Failed to read current field name value", e);
        }
    }
}
