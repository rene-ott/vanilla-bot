package rscvanilla.hook.updater.infrastructure.modules;

import com.google.inject.AbstractModule;
import rscvanilla.hook.updater.services.HooksFileGenerator;
import rscvanilla.hook.model.serializer.HooksFileSerializer;
import rscvanilla.hook.updater.services.HooksFileService;
import rscvanilla.hook.updater.services.SourceFileService;

public class MainModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(HooksFileGenerator.class);
        bind(HooksFileSerializer.class);
        bind(HooksFileService.class);
        bind(SourceFileService.class);
    }
}
