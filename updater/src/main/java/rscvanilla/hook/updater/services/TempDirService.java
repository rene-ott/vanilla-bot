package rscvanilla.hook.updater.services;

import org.slf4j.LoggerFactory;
import rscvanilla.hook.updater.infrastructure.annotations.TempDirPath;

import javax.inject.Inject;
import java.io.File;

public class TempDirService extends DirService {

    private static final String DIR_NEW = "new";
    private static final String DIR_OLD = "old";

    @Inject
    public TempDirService(@TempDirPath String tempDirPath) {
        super(tempDirPath, LoggerFactory.getLogger(TempDirService.class));
    }

    public String getNewDirPath() {
        return dirPath + File.separator + DIR_NEW;
    }

    public String getOldDirPath() {
        return dirPath + File.separator + DIR_OLD;
    }
}
