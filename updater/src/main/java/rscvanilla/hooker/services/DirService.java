package rscvanilla.hooker.services;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import rscvanilla.hooker.infrastructure.AppException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public abstract class DirService
{
    protected String dirPath;
    protected Logger logger;

    protected DirService(String dirPath, Logger logger) {
        this.dirPath = dirPath;
        this.logger = logger;
    }

    public void createDir() {
        deleteDirIfExists();
        try {
            Files.createDirectory(Path.of(dirPath));
            logger.info("Generated {} dir at [{}].", getDirName(), getDirName());
        } catch (IOException e) {
            throw new AppException(String.format("Failed to create %s dir.", getDirName()), e);
        }
    }

    public void deleteDir() {
        try {
            FileUtils.deleteDirectory(new File(dirPath));
            logger.info("Deleted {} dir at [{}].", getDirName(), dirPath);
        } catch (IOException e) {
            throw new AppException(String.format("Failed to delete %s dir.", getDirName()), e);
        }
    }

    private void deleteDirIfExists() {
        if (Files.exists(Path.of(dirPath))) {
            deleteDir();
        }
    }

    private String getDirName() {
        return "TEST";
    }

    public String getDirPath() {
        return dirPath;
    }
}
