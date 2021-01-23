package rscvanilla.hook.model.serializer;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;
import rscvanilla.hook.model.Hooks;

import java.io.IOException;

public class HooksFileSerializer {

    private final ObjectMapper mapper;

    public HooksFileSerializer() {
        mapper = createObjectMapper();
    }

    public Hooks deserialize(String value) throws IOException {
        return mapper.readValue(value, Hooks.class);
    }

    public String serialize(Hooks hooks) throws IOException {
        return mapper.writeValueAsString(hooks);
    }

    private ObjectMapper createObjectMapper() {
        return new ObjectMapper(createYamlFactory())
                .setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE)
                .setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE)
                .setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
    }

    private YAMLFactory createYamlFactory() {
        return new YAMLFactory().configure(YAMLGenerator.Feature.MINIMIZE_QUOTES, true);
    }
}
