package rscvanilla.hook.updater.services;

import rscvanilla.hook.updater.core.HooksService;
import rscvanilla.hook.updater.infrastructure.AppParameters;

import javax.inject.Inject;

public class HooksFileGenerator {

    private final HooksService hooksService;
    private final HooksFileService hooksFileService;
    private final OutputDirectoryService outputDirectoryService;
    private final ClientJarService clientJarService;
    private final AppParameters appParameters;

    @Inject
    public HooksFileGenerator(HooksService hooksService,
                              HooksFileService hooksFileService,
                              OutputDirectoryService outputDirectoryService,
                              ClientJarService clientJarService,
                              AppParameters appParameters) {
        this.hooksService = hooksService;
        this.hooksFileService = hooksFileService;
        this.outputDirectoryService = outputDirectoryService;
        this.clientJarService = clientJarService;
        this.appParameters = appParameters;
    }

    public void generateHooksFile() {

        if (!appParameters.skipDecompilation) {
            outputDirectoryService.createTempDir();

            clientJarService.decompileSourceFilesToTempDir(appParameters.oldJarPath, true);
            clientJarService.decompileSourceFilesToTempDir(appParameters.newJarPath, false);
        }

        var template = hooksFileService.readTemplateFile();
        hooksService.setClassValuesTo(template);

        if (!appParameters.skipTempDirDeletion) {
            outputDirectoryService.deleteTempDir();
        }

        hooksFileService.saveHooksFile(template);
    }
}
