package rscvanilla.hooker.serializer.extensions;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import rscvanilla.hooker.models.common.ClassMember;

import java.io.IOException;

public class ClassFieldDeserializer extends JsonDeserializer<ClassMember> {

    @Override
    public ClassMember deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {

        var classField = new ClassMember();
        classField.value = p.getValueAsString();
        classField.fieldName = p.currentName();

        return classField;
    }

    @Override
    public ClassMember getNullValue(DeserializationContext ctxt) {
        try {
            var classField = new ClassMember();
            classField.fieldName = ctxt.getParser().getCurrentName();
            return classField;
        } catch (IOException e) {
            throw new RuntimeException("Failed to read current field name value", e);
        }
    }
}
