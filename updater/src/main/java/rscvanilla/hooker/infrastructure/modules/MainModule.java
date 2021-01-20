package rscvanilla.hooker.infrastructure.modules;

import com.google.inject.AbstractModule;
import rscvanilla.hooker.HookService;
import rscvanilla.hooker.serializer.HooksFileSerializer;
import rscvanilla.hooker.io.HooksFileIO;
import rscvanilla.hooker.io.SourceFileIO;

public class MainModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(HookService.class);
        bind(HooksFileSerializer.class);
        bind(HooksFileIO.class);
        bind(SourceFileIO.class);
    }
}
