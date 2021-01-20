package hooker.io;

import hooker.infrastructure.annotations.OutputDirPath;
import hooker.infrastructure.annotations.WorkingDirPath;
import hooker.serializer.HooksFileSerializer;
import model.HooksFile;

import javax.inject.Inject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class HooksFileIO {

    private final static String HOOKS_FILE_NAME = "hooks.yaml";
    private final static String TEMPLATE_FILE_NAME = "template.yaml";

    private final HooksFileSerializer serializer;
    private final String workingDirectoryPath;
    private final String outputDirPath;

    @Inject
    public HooksFileIO(HooksFileSerializer serializer,
                       @OutputDirPath String outputDirPath,
                       @WorkingDirPath String workingDirectoryPath
    ) {

        this.outputDirPath = outputDirPath;
        this.serializer = serializer;
        this.workingDirectoryPath = workingDirectoryPath;
    }

    //TODO: Exception handling
    public HooksFile readTemplateFile() {
        try {
            var templateString = Files.readString(Path.of(workingDirectoryPath, TEMPLATE_FILE_NAME));
            return serializer.deserialize(templateString);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
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
