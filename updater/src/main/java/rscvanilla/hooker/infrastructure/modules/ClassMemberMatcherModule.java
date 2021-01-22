package rscvanilla.hooker.infrastructure.modules;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;
import rscvanilla.hooker.core.matcher.classes.applet.AppletClassFieldNameMatcher;
import rscvanilla.hooker.core.matcher.classes.applet.fields.MudClientFieldNameMatcher;
import rscvanilla.hooker.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;
import rscvanilla.hooker.core.matcher.classes.mudclient.MudClientClassMethodNameMatcher;
import rscvanilla.hooker.core.matcher.classes.mudclient.fields.NpcListFieldNameMatcher;
import rscvanilla.hooker.core.matcher.classes.mudclient.fields.NpcListIndexFieldNameMatcher;
import rscvanilla.hooker.core.matcher.classes.mudclient.methods.WalkToAreaMethodNameMatcher;

public class ClassMemberMatcherModule extends AbstractModule {

    @Override
    protected void configure() {
        configureMudClientClassFieldNameMatchers();
        configureMudClientMethodNameMatchers();

        configureAppletClassFieldMatchers();
    }

    private Multibinder<MudClientClassFieldNameMatcher> configureMudClientClassFieldNameMatchers() {
        var binder = Multibinder.newSetBinder(binder(), MudClientClassFieldNameMatcher.class);

        binder.addBinding().to(NpcListFieldNameMatcher.class);
        binder.addBinding().to(NpcListIndexFieldNameMatcher.class);

        return binder;
    }

    private Multibinder<MudClientClassMethodNameMatcher> configureMudClientMethodNameMatchers() {
        var binder = Multibinder.newSetBinder(binder(), MudClientClassMethodNameMatcher.class);

        binder.addBinding().to(WalkToAreaMethodNameMatcher.class);

        return binder;
    }

    private Multibinder<AppletClassFieldNameMatcher> configureAppletClassFieldMatchers() {
        var binder = Multibinder.newSetBinder(binder(), AppletClassFieldNameMatcher.class);

        binder.addBinding().to(MudClientFieldNameMatcher.class);

        return binder;
    }
}
