package hooker.infrastructure.modules;

import com.google.inject.AbstractModule;
import hooker.MainServiceClass;
import hooker.serializer.HooksFileSerializer;
import hooker.io.HooksFileIO;
import hooker.io.SourceFileIO;

public class MainModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(MainServiceClass.class);
        bind(HooksFileSerializer.class);
        bind(HooksFileIO.class);
        bind(SourceFileIO.class);
    }
}
