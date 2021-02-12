package rscvanilla.cjci.updater.infrastructure.modules;

import com.google.inject.AbstractModule;
import rscvanilla.cjci.updater.infrastructure.AppParameters;
import rscvanilla.cjci.updater.infrastructure.annotations.WorkingDirPath;

public class MainModule extends AbstractModule {

    private final AppParameters parameters;

    public MainModule(AppParameters parameters) {
        this.parameters = parameters;
    }

    @Override
    protected void configure() {
        bind(AppParameters.class).toInstance(parameters);
        bindConstant().annotatedWith(WorkingDirPath.class).to(System.getProperty("user.dir"));
    }
}
