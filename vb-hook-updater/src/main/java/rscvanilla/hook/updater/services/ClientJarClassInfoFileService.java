package rscvanilla.hook.updater.services;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rscvanilla.hook.updater.infrastructure.AppException;
import rscvanilla.hook.model.ClientJarClassInfoSerializer;
import rscvanilla.hook.model.ClientJarClassInfo;

import javax.inject.Inject;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class ClientJarClassInfoFileService {

    private static final Logger logger = LoggerFactory.getLogger(ClientJarClassInfoFileService.class);

    private final static String CJCI_FILE_NAME = "hooks.yaml";
    private final static String CJCI_TEMPLATE_FILE_NAME = "template.yaml";

    private final ClientJarClassInfoSerializer serializer;
    private final OutputDirectoryService outputDirectoryService;

    @Inject
    public ClientJarClassInfoFileService(ClientJarClassInfoSerializer serializer,
                                         OutputDirectoryService outputDirectoryService
    ) {
        this.outputDirectoryService = outputDirectoryService;
        this.serializer = serializer;
    }

    public ClientJarClassInfo readTemplateFile() {
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
        return getClass().getClassLoader().getResourceAsStream(CJCI_TEMPLATE_FILE_NAME);
    }

    public void saveClientJarClassInfo(ClientJarClassInfo clientJarClassInfo) {

        try {
            var value = serializer.serialize(clientJarClassInfo);

            Files.writeString(Path.of(outputDirectoryService.getRootDirPath(), CJCI_FILE_NAME), value);
            logger.info("Saved hooks file to [{}]", outputDirectoryService.getRootDirPath());
            logger.info("Saved hooks file with content:\n{}", value);
        } catch (IOException e) {
            throw new AppException("Failed to save hooks file.", e);
        }
    }
}
