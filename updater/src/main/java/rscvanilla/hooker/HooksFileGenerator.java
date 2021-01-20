package rscvanilla.hooker;

import rscvanilla.hooker.services.ClassFieldFinderService;
import rscvanilla.hooker.services.HooksFileService;

import javax.inject.Inject;

public class HooksFileGenerator {

    private final ClassFieldFinderService classFieldFinderService;
    private final HooksFileService hooksFileService;

    @Inject
    public HooksFileGenerator(ClassFieldFinderService classFieldFinderService, HooksFileService hooksFileService) {
        this.classFieldFinderService = classFieldFinderService;
        this.hooksFileService = hooksFileService;
    }

    public void generate() {
        var template = hooksFileService.readTemplateFile();

        classFieldFinderService.findAllFieldNamesForHooks(template);

        hooksFileService.saveHooksFile(template);
    }
}
