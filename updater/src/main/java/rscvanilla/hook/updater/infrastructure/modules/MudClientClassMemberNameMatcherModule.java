package rscvanilla.hook.updater.infrastructure.modules;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;
import rscvanilla.hook.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;
import rscvanilla.hook.updater.core.matcher.classes.mudclient.MudClientClassInterceptorNameMatcher;
import rscvanilla.hook.updater.core.matcher.classes.mudclient.MudClientClassMethodNameMatcher;
import rscvanilla.hook.updater.core.matcher.classes.mudclient.fields.NpcListFieldNameMatcher;
import rscvanilla.hook.updater.core.matcher.classes.mudclient.fields.NpcListIndexFieldNameMatcher;
import rscvanilla.hook.updater.core.matcher.classes.mudclient.interceptors.GameSettingsInterceptorNameMatcher;
import rscvanilla.hook.updater.core.matcher.classes.mudclient.methods.WalkToAreaMethodNameMatcher;

public class MudClientClassMemberNameMatcherModule extends AbstractModule {

    @Override
    protected void configure() {
        configureFieldNameMatchers();
        configureMethodNameMatchers();
        configureInterceptorNameMatchers();
    }

    private void configureFieldNameMatchers() {
        var binder = Multibinder.newSetBinder(binder(), MudClientClassFieldNameMatcher.class);
        binder.addBinding().to(NpcListFieldNameMatcher.class);
        binder.addBinding().to(NpcListIndexFieldNameMatcher.class);
    }

    private void configureMethodNameMatchers() {
        var binder = Multibinder.newSetBinder(binder(), MudClientClassMethodNameMatcher.class);
        binder.addBinding().to(WalkToAreaMethodNameMatcher.class);
    }

    private void configureInterceptorNameMatchers() {
        var binder = Multibinder.newSetBinder(binder(), MudClientClassInterceptorNameMatcher.class);
        binder.addBinding().to(GameSettingsInterceptorNameMatcher.class);
    }
}
