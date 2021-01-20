package rscvanilla.hooker.infrastructure.modules;

import com.google.inject.AbstractModule;
import rscvanilla.hooker.infrastructure.annotations.OutputDirPath;
import rscvanilla.hooker.infrastructure.annotations.TempDirPath;
import rscvanilla.hooker.infrastructure.annotations.WorkingDirPath;

public class FilePathModule extends AbstractModule {

    private final String workingDirPath;
    private final String tempDirPath;
    private final String outputDirPath;

    public FilePathModule(String workingDirPath, String tempDirPath, String outputDirPath) {
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
