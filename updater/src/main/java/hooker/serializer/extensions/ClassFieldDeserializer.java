package hooker.serializer.extensions;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import model.common.ClassField;

import java.io.IOException;

public class ClassFieldDeserializer extends JsonDeserializer<ClassField> {

    @Override
    public ClassField deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {

        var classField = new ClassField();
        classField.value = p.getValueAsString();
        classField.key = p.currentName();

        return classField;
    }

    //TODO Handle Exception
    @Override
    public ClassField getNullValue(DeserializationContext ctxt) {
        try {
            var classField = new ClassField();
            classField.key = ctxt.getParser().getCurrentName();
            return classField;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
