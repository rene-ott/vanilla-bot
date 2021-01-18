import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        var mapper = new ObjectMapper(new YAMLFactory().configure(YAMLGenerator.Feature.MINIMIZE_QUOTES, true))
        .setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE)
        .setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE)
                .setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        var simpleModule = new SimpleModule();
        simpleModule.addSerializer(ClassField.class, new ClassFieldSerializer());
        simpleModule.addDeserializer(ClassField.class, new ClassFieldDeserializer());
        mapper.registerModule(simpleModule);

        try {
            var readValue = mapper.readValue(new File("C:\\Users\\Rene\\Desktop\\Repositories\\vanilla-bot\\vanilla-bot-hooker\\hooks.yaml"), HookFileClasses.class);
            var d = readValue;

            d.applet.fields.mudClient.value = "ab";
            var serialized = mapper.writeValueAsString(d);
            System.out.println(serialized);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
