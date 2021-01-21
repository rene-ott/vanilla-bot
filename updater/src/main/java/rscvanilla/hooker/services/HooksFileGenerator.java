package rscvanilla.hooker.services;

import rscvanilla.hooker.infrastructure.annotations.NewJarPath;
import rscvanilla.hooker.infrastructure.annotations.OldJarPath;

import javax.inject.Inject;

public class HooksFileGenerator {

    private final ClassFieldFinderService classFieldFinderService;
    private final HooksFileService hooksFileService;
    private final TempDirService tempDirService;
    private final ClientJarService clientJarService;
    private final String oldJarPath;
    private final String newJarPath;

    @Inject
    public HooksFileGenerator(ClassFieldFinderService classFieldFinderService,
                              HooksFileService hooksFileService,
                              TempDirService tempDirService,
                              ClientJarService clientJarService,
                              @OldJarPath String oldJarPath,
                              @NewJarPath String newJarPath
    ) {
        this.classFieldFinderService = classFieldFinderService;
        this.hooksFileService = hooksFileService;
        this.tempDirService = tempDirService;
        this.clientJarService = clientJarService;
        this.oldJarPath = oldJarPath;
        this.newJarPath = newJarPath;
    }

    public void generateHooksFile() {

        tempDirService.createTempDir();

        clientJarService.decompileSourceFilesToTempDir(oldJarPath, true);
        clientJarService.decompileSourceFilesToTempDir(newJarPath, false);

        var template = hooksFileService.readTemplateFile();
        classFieldFinderService.findAllFieldNamesForHooks(template);

        /*
        tempDirService.deleteTempDir();

        hooksFileService.saveHooksFile(template);
         */
    }
}
