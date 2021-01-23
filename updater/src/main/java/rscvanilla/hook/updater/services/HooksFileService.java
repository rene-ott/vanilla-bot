package rscvanilla.hook.updater.services;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rscvanilla.hook.updater.infrastructure.AppException;
import rscvanilla.hook.model.serializer.HooksFileSerializer;
import rscvanilla.hook.model.Hooks;

import javax.inject.Inject;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class HooksFileService {

    private static final Logger logger = LoggerFactory.getLogger(HooksFileService.class);

    private final static String HOOKS_FILE_NAME = "hooks.yaml";
    private final static String TEMPLATE_FILE_NAME = "template.yaml";

    private final HooksFileSerializer serializer;
    private final OutputDirectoryService outputDirectoryService;

    @Inject
    public HooksFileService(HooksFileSerializer serializer,
                            OutputDirectoryService outputDirectoryService
    ) {
        this.outputDirectoryService = outputDirectoryService;
        this.serializer = serializer;
    }

    public Hooks readTemplateFile() {
        try {
            var templateString = IOUtils.toString(getTemplateInputStream(), StandardCharsets.UTF_8.name());
            var serializedTemplateFile = serializer.deserialize(templateString);

            logger.info("Read template file with content:\n{}", templateString);

            return serializedTemplateFile;
        } catch (IOException e) {
            throw new AppException("Failed to read template file.", e);
        }
    }

    private InputStream getTemplateInputStream() {
        return getClass().getClassLoader().getResourceAsStream(TEMPLATE_FILE_NAME);
    }

    public void saveHooksFile(Hooks hooks) {

        try {
            var value = serializer.serialize(hooks);

            Files.writeString(Path.of(outputDirectoryService.getRootDirPath(), HOOKS_FILE_NAME), value);
            logger.info("Saved hooks file to [{}]", outputDirectoryService.getRootDirPath());
            logger.info("Saved hooks file with content:\n{}", value);
        } catch (IOException e) {
            throw new AppException("Failed to save hooks file.", e);
        }
    }
}
