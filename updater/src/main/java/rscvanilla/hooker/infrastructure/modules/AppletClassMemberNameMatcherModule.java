package rscvanilla.hooker.infrastructure.modules;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;
import rscvanilla.hooker.core.matcher.classes.applet.AppletClassFieldNameMatcher;
import rscvanilla.hooker.core.matcher.classes.applet.fields.MudClientFieldNameMatcher;

public class AppletClassMemberNameMatcherModule extends AbstractModule {

    @Override
    protected void configure() {
        configureFieldNameMatchers();
    }

    private void configureFieldNameMatchers() {
        var binder = Multibinder.newSetBinder(binder(), AppletClassFieldNameMatcher.class);
        binder.addBinding().to(MudClientFieldNameMatcher.class);
    }
}
