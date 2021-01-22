package rscvanilla.hooker.infrastructure.modules;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;
import rscvanilla.hooker.core.matcher.classes.applet.AppletClassFieldNameMatcher;
import rscvanilla.hooker.core.matcher.classes.applet.fields.MudClientFieldNameMatcher;
import rscvanilla.hooker.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;
import rscvanilla.hooker.core.matcher.classes.mudclient.fields.NpcListFieldNameMatcher;
import rscvanilla.hooker.core.matcher.classes.mudclient.fields.NpcListIndexFieldNameMatcher;

public class FieldMatcherModule extends AbstractModule {

    @Override
    protected void configure() {
        configureMudClientClassFieldMatchers();
        configureAppletClassFieldMatchers();
    }

    private Multibinder<MudClientClassFieldNameMatcher> configureMudClientClassFieldMatchers() {
        var binder = Multibinder.newSetBinder(binder(), MudClientClassFieldNameMatcher.class);

        binder.addBinding().to(NpcListFieldNameMatcher.class);
        binder.addBinding().to(NpcListIndexFieldNameMatcher.class);

        return binder;
    }

    private Multibinder<AppletClassFieldNameMatcher> configureAppletClassFieldMatchers() {
        var binder = Multibinder.newSetBinder(binder(), AppletClassFieldNameMatcher.class);

        binder.addBinding().to(MudClientFieldNameMatcher.class);

        return binder;
    }
}
