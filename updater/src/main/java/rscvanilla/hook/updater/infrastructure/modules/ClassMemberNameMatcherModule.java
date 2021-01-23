package rscvanilla.hook.updater.infrastructure.modules;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import rscvanilla.hook.updater.core.matcher.classes.applet.AppletClassFieldNameMatcher;
import rscvanilla.hook.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;
import rscvanilla.hook.updater.core.matcher.classes.mudclient.MudClientClassInterceptorNameMatcher;
import rscvanilla.hook.updater.core.matcher.classes.mudclient.MudClientClassMethodNameMatcher;

public class ClassMemberNameMatcherModule extends AbstractModule {

    @Override
    protected void configure() {
        configureSubTypesOf(MudClientClassFieldNameMatcher.class);
        configureSubTypesOf(MudClientClassMethodNameMatcher.class);
        configureSubTypesOf(MudClientClassInterceptorNameMatcher.class);

        configureSubTypesOf(AppletClassFieldNameMatcher.class);
    }

    private <T> void configureSubTypesOf(Class<T> clazz) {
        var binder = Multibinder.newSetBinder(binder(), clazz);
        var reflections = new Reflections("", new SubTypesScanner());
        reflections.getSubTypesOf(clazz).forEach(it -> binder.addBinding().to(it));
    }
}
