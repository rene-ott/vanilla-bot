package rscvanilla.hook.updater.services;

import rscvanilla.hook.updater.core.HooksService;
import rscvanilla.hook.updater.infrastructure.annotations.NewJarPath;
import rscvanilla.hook.updater.infrastructure.annotations.OldJarPath;

import javax.inject.Inject;

public class HooksFileGenerator {

    private final HooksService hooksService;
    private final HooksFileService hooksFileService;
    private final TempDirService tempDirService;
    private final ClientJarService clientJarService;
    private final String oldJarPath;
    private final String newJarPath;

    @Inject
    public HooksFileGenerator(HooksService hooksService,
                              HooksFileService hooksFileService,
                              TempDirService tempDirService,
                              ClientJarService clientJarService,
                              @OldJarPath String oldJarPath,
                              @NewJarPath String newJarPath
    ) {
        this.hooksService = hooksService;
        this.hooksFileService = hooksFileService;
        this.tempDirService = tempDirService;
        this.clientJarService = clientJarService;
        this.oldJarPath = oldJarPath;
        this.newJarPath = newJarPath;
    }

    public void generateHooksFile() {

        // tempDirService.createDir();

        // clientJarService.decompileSourceFilesToTempDir(oldJarPath, true);
        // clientJarService.decompileSourceFilesToTempDir(newJarPath, false);

        var template = hooksFileService.readTemplateFile();
        hooksService.setClassValuesTo(template);

        //tempDirService.deleteDir();
        //hooksFileService.saveHooksFile(template);
    }
}
