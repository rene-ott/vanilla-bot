package rscvanilla.hook.updater.services;

import org.slf4j.LoggerFactory;
import rscvanilla.hook.updater.infrastructure.annotations.OutputDirPath;

import javax.inject.Inject;

public class OutputDirService extends DirService {

    @Inject
    protected OutputDirService(@OutputDirPath  String dirPath) {
        super(dirPath, LoggerFactory.getLogger(OutputDirService.class));
    }
}
