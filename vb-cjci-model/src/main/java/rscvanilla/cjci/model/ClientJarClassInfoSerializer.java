package rscvanilla.cjci.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;
import rscvanilla.cjci.model.utils.Strings;

import java.io.IOException;

public class ClientJarClassInfoSerializer {

    private final ObjectMapper mapper;

    public ClientJarClassInfoSerializer() {
        mapper = createObjectMapper();
    }

    public ClientJarClassInfo deserialize(String value) throws IOException {
        return mapper.readValue(value, ClientJarClassInfo.class);
    }

    public String serialize(ClientJarClassInfo clientJarClassInfo) throws IOException {
        return Strings.separateRootKeyBlocksByNewLine(mapper.writeValueAsString(clientJarClassInfo));
    }

    private ObjectMapper createObjectMapper() {
        return new ObjectMapper(createYamlFactory())
                .setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE)
                .setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE)
                .setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
    }

    private YAMLFactory createYamlFactory() {
        return new YAMLFactory()
            .configure(YAMLGenerator.Feature.MINIMIZE_QUOTES, true)
            .configure(YAMLGenerator.Feature.WRITE_DOC_START_MARKER, false);
    }
}
