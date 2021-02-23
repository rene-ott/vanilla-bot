package rscvanilla.cjci.updater.services;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rscvanilla.cjci.updater.infrastructure.AppException;
import rscvanilla.cjci.updater.infrastructure.annotations.WorkingDirPath;

import javax.inject.Inject;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class OutputDirectoryService {

    private static final Logger logger = LoggerFactory.getLogger(OutputDirectoryService.class);

    private final static String OUTPUT_DIR_NAME = "output";
    private final static String TEMP_DIR_NAME = "temp";
    private final static String TEMP_OLD_DIR_NAME = "old";
    private final static String TEMP_NEW_DIR_NAME = "new";

    private final String workingDirPath;

    @Inject
    public OutputDirectoryService(@WorkingDirPath  String workingDirPath) {
        this.workingDirPath = workingDirPath;
    }

    public void createTempDir() {
        createDir(Path.of(workingDirPath, OUTPUT_DIR_NAME, TEMP_DIR_NAME));
    }

    public void deleteTempDir() {
        deleteDir(Path.of(workingDirPath, OUTPUT_DIR_NAME, TEMP_DIR_NAME));
    }

    public void createDir(Path path) {
        deleteDirIfExists(path);
        try {
            Files.createDirectory(path);
            logger.info("Generated dir [{}].", path);
        } catch (IOException e) {
            throw new AppException(String.format("Failed to create dir [%s].", path), e);
        }
    }

    public void deleteDir(Path path) {
        try {
            FileUtils.deleteDirectory(new File(path.toUri()));
            logger.info("Deleted dir [{}].", path.toString());
        } catch (IOException e) {
            throw new AppException(String.format("Failed to delete dir [%s].", path), e);
        }
    }

    private void deleteDirIfExists(Path path) {
        if (Files.exists(path)) {
            deleteDir(path);
        }
    }

    public String getRootDirPath() {
        return Path.of(workingDirPath, OUTPUT_DIR_NAME).toString();
    }

    public String getTempOldDirPath() {
        return Path.of(workingDirPath, OUTPUT_DIR_NAME, TEMP_DIR_NAME, TEMP_OLD_DIR_NAME).toString();
    }

    public String getTempNewDirPath() {
        return Path.of(workingDirPath, OUTPUT_DIR_NAME, TEMP_DIR_NAME, TEMP_NEW_DIR_NAME).toString();
    }
}
