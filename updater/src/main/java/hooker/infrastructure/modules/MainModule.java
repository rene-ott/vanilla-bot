package hooker.infrastructure.modules;

import com.google.inject.AbstractModule;
import hooker.MainServiceClass;
import hooker.serializer.HooksFileSerializer;
import hooker.services.HooksFileService;
import hooker.services.SourceFileService;

public class MainModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(MainServiceClass.class);
        bind(HooksFileSerializer.class);
        bind(HooksFileService.class);
        bind(SourceFileService.class);
    }
}
