package rscvanilla.hooker.serializer;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;
import model.HooksFile;
import model.common.ClassField;
import rscvanilla.hooker.serializer.extensions.ClassFieldDeserializer;
import rscvanilla.hooker.serializer.extensions.ClassFieldSerializer;

import java.io.IOException;

public class HooksFileSerializer {

    private final ObjectMapper mapper;

    public HooksFileSerializer() {
        mapper = createObjectMapper();
    }

    // TODO: Throw exception
    public HooksFile deserialize(String value) {
        try {
            return mapper.readValue(value, HooksFile.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    // TODO throw exception
    public String serialize(HooksFile hooksFile) {
        try {
            return mapper.writeValueAsString(hooksFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
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
                .addSerializer(ClassField.class, new ClassFieldSerializer())
                .addDeserializer(ClassField.class, new ClassFieldDeserializer());
    }
}
