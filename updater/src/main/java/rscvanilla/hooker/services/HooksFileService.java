package rscvanilla.hooker.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rscvanilla.hooker.infrastructure.AppException;
import rscvanilla.hooker.infrastructure.annotations.OutputDirPath;
import rscvanilla.hooker.infrastructure.annotations.WorkingDirPath;
import rscvanilla.hooker.serializer.HooksFileSerializer;
import model.HooksFile;

import javax.inject.Inject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class HooksFileService {

    private static final Logger logger = LoggerFactory.getLogger(HooksFileService.class);

    private final static String HOOKS_FILE_NAME = "hooks.yaml";
    private final static String TEMPLATE_FILE_NAME = "template.yaml";

    private final HooksFileSerializer serializer;
    private final String workingDirectoryPath;
    private final String outputDirPath;

    @Inject
    public HooksFileService(HooksFileSerializer serializer,
                            @OutputDirPath String outputDirPath,
                            @WorkingDirPath String workingDirectoryPath
    ) {

        this.outputDirPath = outputDirPath;
        this.serializer = serializer;
        this.workingDirectoryPath = workingDirectoryPath;
    }

    public HooksFile readTemplateFile() {
        try {
            var templateFilePath = Path.of(workingDirectoryPath, TEMPLATE_FILE_NAME);
            var templateString = Files.readString(templateFilePath);
            var serializedTemplateFile = serializer.deserialize(templateString);

            logger.info("Read template file from [{}].", templateFilePath);
            logger.info("Read template file with content:\n{}", templateString);

            return serializedTemplateFile;
        } catch (IOException e) {
            throw new AppException("Failed to read template file.", e);
        }
    }

    //TODO: Exception handling
    public void saveHooksFile(HooksFile hooksFile) {
        var value = serializer.serialize(hooksFile);

        try {
            Files.writeString(Path.of(outputDirPath, HOOKS_FILE_NAME), value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
