package rscvanilla.cjci.updater.services;

import rscvanilla.cjci.updater.core.ClientJarClassInfoService;
import rscvanilla.cjci.updater.infrastructure.AppParameters;

import javax.inject.Inject;

public class ClientJarClassInfoFileGenerator {

    private final ClientJarClassInfoService clientJarClassInfoService;
    private final ClientJarClassInfoFileService clientJarClassInfoFileService;
    private final OutputDirectoryService outputDirectoryService;
    private final ClientJarService clientJarService;
    private final AppParameters appParameters;

    @Inject
    public ClientJarClassInfoFileGenerator(ClientJarClassInfoService clientJarClassInfoService,
                                           ClientJarClassInfoFileService clientJarClassInfoFileService,
                                           OutputDirectoryService outputDirectoryService,
                                           ClientJarService clientJarService,
                                           AppParameters appParameters) {
        this.clientJarClassInfoService = clientJarClassInfoService;
        this.clientJarClassInfoFileService = clientJarClassInfoFileService;
        this.outputDirectoryService = outputDirectoryService;
        this.clientJarService = clientJarService;
        this.appParameters = appParameters;
    }

    public void generateFile() {

        if (!appParameters.skipDecompilation) {
            outputDirectoryService.createTempDir();

            clientJarService.decompileSourceFilesToTempDir(appParameters.oldJarPath, true);
            clientJarService.decompileSourceFilesToTempDir(appParameters.newJarPath, false);
        }

        var template = clientJarClassInfoFileService.readTemplateFile();
        clientJarClassInfoService.setClassValuesTo(template);

        if (!appParameters.skipTempDirDeletion) {
            outputDirectoryService.deleteTempDir();
        }

        clientJarClassInfoFileService.saveClientJarClassInfo(template);
    }
}
