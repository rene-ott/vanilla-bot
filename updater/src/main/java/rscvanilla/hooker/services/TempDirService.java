package rscvanilla.hooker.services;

import com.google.common.io.MoreFiles;
import org.apache.commons.io.FileUtils;
import rscvanilla.hooker.infrastructure.annotations.TempDirPath;

import javax.inject.Inject;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TempDirService {

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

    // TODO Exception handling
    public void createTempDir() {
        deleteTempDirIfExists();
        try {
            Files.createDirectory(Path.of(tempDirPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // TODO Exception handling
    public void deleteTempDir() {
        try {
            FileUtils.deleteDirectory(new File(tempDirPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteTempDirIfExists() {
        if (Files.exists(Path.of(tempDirPath))) {
            deleteTempDir();
        }
    }
}
