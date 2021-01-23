package rscvanilla.hook.updater.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rscvanilla.hook.updater.infrastructure.AppException;
import rscvanilla.hook.model.serializer.HooksFileSerializer;
import rscvanilla.hook.model.Hooks;

import javax.inject.Inject;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;

public class HooksFileService {

    private static final Logger logger = LoggerFactory.getLogger(HooksFileService.class);

    private final static String HOOKS_FILE_NAME = "hooks.yaml";
    private final static String TEMPLATE_FILE_NAME = "template.yaml";

    private final HooksFileSerializer serializer;
    private final OutputDirService outputDirService;

    @Inject
    public HooksFileService(HooksFileSerializer serializer,
                            OutputDirService outputDirService
    ) {

        this.outputDirService = outputDirService;
        this.serializer = serializer;
    }

    public Hooks readTemplateFile() {
        try {
            var templateFilePath = Path.of(getTemplateFileURI());
            var templateString = Files.readString(templateFilePath);
            var serializedTemplateFile = serializer.deserialize(templateString);

            logger.info("Read template file with content:\n{}", templateString);

            return serializedTemplateFile;
        } catch (IOException e) {
            throw new AppException("Failed to read template file.", e);
        }
    }

    private URI getTemplateFileURI() {
        try {
            return getClass().getClassLoader().getResource(TEMPLATE_FILE_NAME).toURI();
        } catch (URISyntaxException e) {
            throw  new AppException("Missing resource file.");
        }
    }

    public void saveHooksFile(Hooks hooks) {

        try {
            var value = serializer.serialize(hooks);
            outputDirService.createDir();

            Files.writeString(Path.of(outputDirService.getDirPath(), HOOKS_FILE_NAME), value);
            logger.info("Saved hooks file to [{}]", outputDirService.getDirPath());
            logger.info("Saved hooks file with content:\n{}", value);
        } catch (IOException e) {
            throw new AppException("Failed to save hooks file.", e);
        }
    }
}
