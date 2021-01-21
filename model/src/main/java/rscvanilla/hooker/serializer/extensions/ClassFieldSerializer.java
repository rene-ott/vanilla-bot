package rscvanilla.hooker.serializer.extensions;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import rscvanilla.hooker.models.common.ClassMember;

import java.io.IOException;

public class ClassFieldSerializer extends JsonSerializer<ClassMember>  {

    @Override
    public void serialize(ClassMember classMember, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeObject(classMember.value);
    }
}
