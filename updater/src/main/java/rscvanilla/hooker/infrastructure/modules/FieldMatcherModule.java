package rscvanilla.hooker.infrastructure.modules;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;
import rscvanilla.hooker.matchers.applet.AppletClassFieldMatcher;
import rscvanilla.hooker.matchers.applet.MudClientFieldMatcher;
import rscvanilla.hooker.matchers.mudclient.MudClientClassFieldMatcher;
import rscvanilla.hooker.matchers.mudclient.NpcListFieldMatcher;
import rscvanilla.hooker.matchers.mudclient.NpcListIndexFieldMatcher;

public class FieldMatcherModule extends AbstractModule {

    @Override
    protected void configure() {
        configureMudClientClassFieldMatchers();
        configureAppletClassFieldMatchers();
    }

    private Multibinder<MudClientClassFieldMatcher> configureMudClientClassFieldMatchers() {
        var binder = Multibinder.newSetBinder(binder(), MudClientClassFieldMatcher.class);

        binder.addBinding().to(NpcListFieldMatcher.class);
        binder.addBinding().to(NpcListIndexFieldMatcher.class);

        return binder;
    }

    private Multibinder<AppletClassFieldMatcher> configureAppletClassFieldMatchers() {
        var binder = Multibinder.newSetBinder(binder(), AppletClassFieldMatcher.class);

        binder.addBinding().to(MudClientFieldMatcher.class);

        return binder;
    }
}
