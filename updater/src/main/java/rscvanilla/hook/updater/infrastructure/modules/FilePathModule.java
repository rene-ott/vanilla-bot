package rscvanilla.hook.updater.infrastructure.modules;

import com.google.inject.AbstractModule;
import rscvanilla.hook.updater.infrastructure.annotations.*;

public class FilePathModule extends AbstractModule {

    private final String workingDirPath;
    private final String tempDirPath;
    private final String outputDirPath;

    public FilePathModule(String workingDirPath,
                          String tempDirPath,
                          String outputDirPath
    ) {
        this.workingDirPath = workingDirPath;
        this.tempDirPath = tempDirPath;
        this.outputDirPath = outputDirPath;
    }

    @Override
    protected void configure() {
        bindConstant().annotatedWith(WorkingDirPath.class).to(workingDirPath);
        bindConstant().annotatedWith(TempDirPath.class).to(tempDirPath);
        bindConstant().annotatedWith(OutputDirPath.class).to(outputDirPath);
    }
}
