package rscvanilla.hooker.infrastructure.modules;

import com.google.inject.AbstractModule;
import rscvanilla.hooker.HooksFileGenerator;
import rscvanilla.hooker.serializer.HooksFileSerializer;
import rscvanilla.hooker.services.ClassFieldFinderService;
import rscvanilla.hooker.services.HooksFileService;
import rscvanilla.hooker.services.SourceFileService;

public class MainModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(HooksFileGenerator.class);
        bind(HooksFileSerializer.class);
        bind(HooksFileService.class);
        bind(SourceFileService.class);
        bind(ClassFieldFinderService.class);
    }
}
