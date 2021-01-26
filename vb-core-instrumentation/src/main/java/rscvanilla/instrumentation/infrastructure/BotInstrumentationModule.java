package rscvanilla.instrumentation.infrastructure;

import com.google.inject.AbstractModule;
import rscvanilla.hook.model.Hooks;
import rscvanilla.hook.model.HooksFileReader;
import rscvanilla.instrumentation.BotInstrumentation;
import rscvanilla.instrumentation.transformations.AddGameCaptchaInterceptorTransformation;
import rscvanilla.instrumentation.transformations.AddGameMessageInterceptorTransformation;
import rscvanilla.instrumentation.transformations.AddGameSettingsInterceptorTransformation;
import rscvanilla.instrumentation.transformations.RemoveLoginScreenTransformation;
import rscvanilla.instrumentation.transformers.MudClientTransformer;

import java.io.IOException;
import java.lang.instrument.Instrumentation;

public class BotInstrumentationModule extends AbstractModule {

    private final Instrumentation instrumentation;

    public BotInstrumentationModule(Instrumentation instrumentation) {
        this.instrumentation = instrumentation;
    }

    @Override
    protected void configure() {
        super.configure();

        bind(Instrumentation.class).toInstance(instrumentation);
        bind(BotInstrumentation.class).asEagerSingleton();
        bind(MudClientTransformer.class).asEagerSingleton();

        bind(AddGameCaptchaInterceptorTransformation.class).asEagerSingleton();
        bind(AddGameSettingsInterceptorTransformation.class).asEagerSingleton();
        bind(AddGameMessageInterceptorTransformation.class).asEagerSingleton();
        bind(RemoveLoginScreenTransformation.class).asEagerSingleton();

        bind(Hooks.class).toInstance(getHooksFile());
    }

    //TODO Handle exceptions
    private Hooks getHooksFile() {
        try {
            return HooksFileReader.readHooksFile();
        } catch (IOException e) {
            return null;
        }
    }
}
