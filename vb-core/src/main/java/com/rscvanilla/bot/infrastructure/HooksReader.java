
package com.rscvanilla.bot.infrastructure;

import rscvanilla.hook.model.Hooks;
import rscvanilla.hook.model.serializer.HooksFileSerializer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class HooksReader {
    public static Hooks readHooksFile() {
        try {
            var fileContent = Files.readString(Path.of("conf/hooks.yaml"));
            return new HooksFileSerializer().deserialize(fileContent);
        } catch (IOException e) {
            throw new BotException("Failed to read hooks file", e);
        }
    }
}
