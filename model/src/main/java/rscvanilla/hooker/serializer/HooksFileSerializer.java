package rscvanilla.hooker.serializer;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;
import rscvanilla.hooker.models.HooksFile;
import rscvanilla.hooker.models.common.ClassMember;
import rscvanilla.hooker.serializer.extensions.ClassFieldDeserializer;
import rscvanilla.hooker.serializer.extensions.ClassFieldSerializer;

import java.io.IOException;

public class HooksFileSerializer {

    private final ObjectMapper mapper;

    public HooksFileSerializer() {
        mapper = createObjectMapper();
    }

    public HooksFile deserialize(String value) throws IOException {
        return mapper.readValue(value, HooksFile.class);
    }

    public String serialize(HooksFile hooksFile) throws IOException {
        return mapper.writeValueAsString(hooksFile);
    }

    private ObjectMapper createObjectMapper() {
        return new ObjectMapper(createYamlFactory())
                .enable(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY)
                .setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE)
                .setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE)
                .setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY)
                .registerModule(createModule());
    }

    private YAMLFactory createYamlFactory() {
        return new YAMLFactory().configure(YAMLGenerator.Feature.MINIMIZE_QUOTES, true);
    }

    private SimpleModule createModule() {
        return new SimpleModule()
                .addSerializer(ClassMember.class, new ClassFieldSerializer())
                .addDeserializer(ClassMember.class, new ClassFieldDeserializer());
    }
}
