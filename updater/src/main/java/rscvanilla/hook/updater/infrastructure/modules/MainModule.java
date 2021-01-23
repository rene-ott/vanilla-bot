package rscvanilla.hook.updater.infrastructure.modules;

import com.google.inject.AbstractModule;
import rscvanilla.hook.updater.infrastructure.AppParameters;

public class MainModule extends AbstractModule {

    private final AppParameters parameters;

    public MainModule(AppParameters parameters) {
        this.parameters = parameters;
    }

    @Override
    protected void configure() {
        bind(AppParameters.class).toInstance(parameters);
    }
}
