package rscvanilla.instrumentation.infrastructure;

import com.google.inject.AbstractModule;
import rscvanilla.cjci.model.ClientJarClassInfo;
import rscvanilla.cjci.model.ClientJarClassInfoFileReader;
import rscvanilla.instrumentation.BotInstrumentation;
import rscvanilla.instrumentation.transformers.mudclient.MudClientTransformer;
import rscvanilla.instrumentation.transformers.mudclient.transformations.*;
import rscvanilla.instrumentation.transformers.mudclient.transformations.interceptors.*;

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

        bind(ShowLoginScreenMethodBodyReplaceTransformation.class).asEagerSingleton();
        bind(HandleOpCodeInMethodAddInterceptorTransformer.class).asEagerSingleton();
        bind(ShowGameMessageMethodAddInterceptorTransformer.class).asEagerSingleton();
        bind(SendLoginMethodAddInterceptorTransformation.class).asEagerSingleton();
        bind(ResetLoginScreenVariablesMethodAddInterceptorTransformation.class).asEagerSingleton();
        bind(InitGameScreenVariablesMethodAddInterceptorTransformation.class).asEagerSingleton();

        bind(ClientJarClassInfo.class).toInstance(getHooksFile());
    }

    //TODO Handle exceptions
    private ClientJarClassInfo getHooksFile() {
        try {
            return ClientJarClassInfoFileReader.readFile();
        } catch (IOException e) {
            return null;
        }
    }
}
