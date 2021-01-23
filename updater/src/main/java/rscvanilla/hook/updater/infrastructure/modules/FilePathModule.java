package rscvanilla.hook.updater.infrastructure.modules;

import com.google.inject.AbstractModule;
import rscvanilla.hook.updater.infrastructure.annotations.*;

public class FilePathModule extends AbstractModule {

    private final String workingDirPath;
    private final String tempDirPath;
    private final String outputDirPath;

    private final String newJarPath;
    private final String oldJarPath;

    public FilePathModule(String workingDirPath,
                          String tempDirPath,
                          String outputDirPath,
                          String newJarPath,
                          String oldJarPath
    ) {
        this.workingDirPath = workingDirPath;
        this.tempDirPath = tempDirPath;
        this.outputDirPath = outputDirPath;
        this.newJarPath = newJarPath;
        this.oldJarPath = oldJarPath;
    }

    @Override
    protected void configure() {
        bindConstant().annotatedWith(WorkingDirPath.class).to(workingDirPath);
        bindConstant().annotatedWith(TempDirPath.class).to(tempDirPath);
        bindConstant().annotatedWith(OutputDirPath.class).to(outputDirPath);
        bindConstant().annotatedWith(OldJarPath.class).to(oldJarPath);
        bindConstant().annotatedWith(NewJarPath.class).to(newJarPath);
    }
}
