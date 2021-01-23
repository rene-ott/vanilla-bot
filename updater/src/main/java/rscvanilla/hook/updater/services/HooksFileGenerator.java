package rscvanilla.hook.updater.services;

import rscvanilla.hook.updater.core.HooksService;
import rscvanilla.hook.updater.infrastructure.AppParameters;

import javax.inject.Inject;

public class HooksFileGenerator {

    private final HooksService hooksService;
    private final HooksFileService hooksFileService;
    private final TempDirService tempDirService;
    private final ClientJarService clientJarService;
    private final AppParameters appParameters;

    @Inject
    public HooksFileGenerator(HooksService hooksService,
                              HooksFileService hooksFileService,
                              TempDirService tempDirService,
                              ClientJarService clientJarService,
                              AppParameters appParameters) {
        this.hooksService = hooksService;
        this.hooksFileService = hooksFileService;
        this.tempDirService = tempDirService;
        this.clientJarService = clientJarService;
        this.appParameters = appParameters;
    }

    public void generateHooksFile() {

        if (!appParameters.skipDecompilation) {
            tempDirService.createDir();

            clientJarService.decompileSourceFilesToTempDir(appParameters.oldJarPath, true);
            clientJarService.decompileSourceFilesToTempDir(appParameters.newJarPath, false);
        }

        var template = hooksFileService.readTemplateFile();
        hooksService.setClassValuesTo(template);

        if (!appParameters.skipTempDirDeletion) {
            tempDirService.deleteDir();
        }

        hooksFileService.saveHooksFile(template);
    }
}
