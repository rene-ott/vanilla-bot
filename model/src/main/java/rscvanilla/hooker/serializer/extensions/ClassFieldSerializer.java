package rscvanilla.hooker.serializer.extensions;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import rscvanilla.hooker.models.common.ClassField;

import java.io.IOException;

public class ClassFieldSerializer extends JsonSerializer<ClassField>  {

    @Override
    public void serialize(ClassField classField, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeObject(classField.value);
    }
}
