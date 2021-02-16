package rscvanilla.bot.config;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;

public class AppSettingsFileReader {

    private static final String GENERIC_FILE_NAME = "appsettings.yaml";
    private static final String LOCAL_FILE_NAME = "appsettings.local.yaml";

    public static AppSettings readFile(String configDirectoryPath) throws IOException {
        var localFile = new File(configDirectoryPath + File.separator + LOCAL_FILE_NAME);
        var genericFile = new File(configDirectoryPath + File.separator + GENERIC_FILE_NAME);
        File file;
        if (localFile.isFile()) {
            file = localFile;
        } else if (genericFile.isFile()) {
            file = genericFile;
        } else {
            throw new FileNotFoundException("Missing appsettings.yaml and appsettings.local.yaml");
        }
        return createObjectMapper().readValue(Files.readString(file.toPath()), AppSettings.class);
    }

    private static ObjectMapper createObjectMapper() {
        return new ObjectMapper(new YAMLFactory())
            .setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE)
            .setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE)
            .setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
    }
}

