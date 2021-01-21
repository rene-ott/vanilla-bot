package rscvanilla.hooker.services;

import org.slf4j.LoggerFactory;
import rscvanilla.hooker.infrastructure.annotations.OutputDirPath;

import javax.inject.Inject;

public class OutputDirService extends DirService {

    @Inject
    protected OutputDirService(@OutputDirPath  String dirPath) {
        super(dirPath, LoggerFactory.getLogger(OutputDirService.class));
    }
}
