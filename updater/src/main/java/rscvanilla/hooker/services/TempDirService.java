package rscvanilla.hooker.services;

import com.google.common.io.MoreFiles;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rscvanilla.hooker.infrastructure.AppException;
import rscvanilla.hooker.infrastructure.annotations.TempDirPath;

import javax.inject.Inject;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TempDirService {

    private static final Logger logger = LoggerFactory.getLogger(TempDirService.class);

    private final String tempDirPath;

    private static final String DIR_NEW = "new";
    private static final String DIR_OLD = "old";

    @Inject
    public TempDirService(@TempDirPath String tempDirPath) {

        this.tempDirPath = tempDirPath;
    }

    public String getNewDirPath() {
        return tempDirPath + File.separator + DIR_NEW;
    }

    public String getOldDirPath() {
        return tempDirPath + File.separator + DIR_OLD;
    }

    public void createTempDir() {
        deleteTempDirIfExists();
        try {
            Files.createDirectory(Path.of(tempDirPath));
            logger.info("Generated temp dir at [{}].", tempDirPath);
        } catch (IOException e) {
            throw new AppException("Failed to create temp dir.", e);
        }
    }

    public void deleteTempDir() {
        try {
            FileUtils.deleteDirectory(new File(tempDirPath));
        } catch (IOException e) {
            throw new AppException("Failed to delete temp dir.", e);
        }
    }

    private void deleteTempDirIfExists() {
        if (Files.exists(Path.of(tempDirPath))) {
            deleteTempDir();
        }
    }
}
