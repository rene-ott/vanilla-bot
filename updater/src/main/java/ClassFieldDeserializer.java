import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class ClassFieldDeserializer extends JsonDeserializer<ClassField> {
    @Override
    public ClassField deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {

        var classField = new ClassField();
        classField.value = p.getValueAsString();
        classField.name = p.currentName();

        return classField;
    }
}
