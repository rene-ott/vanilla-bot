package rscvanilla.hook.updater.infrastructure.modules;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import rscvanilla.hook.updater.core.matcher.classes.applet.AppletClassFieldNameMatcher;
import rscvanilla.hook.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;
import rscvanilla.hook.updater.core.matcher.classes.mudclient.MudClientClassInterceptorNameMatcher;
import rscvanilla.hook.updater.core.matcher.classes.mudclient.MudClientClassMethodNameMatcher;
import rscvanilla.hook.updater.core.matcher.classes.rscharacter.RSCharacterClassFieldNameMatcher;
import rscvanilla.hook.updater.core.matcher.classes.rsentity.RSEntityClassFieldNameMatcher;
import rscvanilla.hook.updater.core.matcher.classes.rsplayercharacter.RSPlayerCharacterClassFieldNameMatcher;
import rscvanilla.hook.updater.core.matcher.classes.rswallobject.RSWallObjectClassFieldNameMatcher;

public class ClassMemberNameMatcherModule extends AbstractModule {

    @Override
    protected void configure() {
        configureSubTypesOf(MudClientClassFieldNameMatcher.class);
        configureSubTypesOf(MudClientClassMethodNameMatcher.class);
        configureSubTypesOf(MudClientClassInterceptorNameMatcher.class);

        configureSubTypesOf(AppletClassFieldNameMatcher.class);

        configureSubTypesOf(RSCharacterClassFieldNameMatcher.class);
        configureSubTypesOf(RSEntityClassFieldNameMatcher.class);
        configureSubTypesOf(RSWallObjectClassFieldNameMatcher.class);
        configureSubTypesOf(RSPlayerCharacterClassFieldNameMatcher.class);
    }

    private <T> void configureSubTypesOf(Class<T> clazz) {
        var binder = Multibinder.newSetBinder(binder(), clazz);
        var reflections = new Reflections("rscvanilla", new SubTypesScanner());
        reflections.getSubTypesOf(clazz).forEach(it -> binder.addBinding().to(it));
    }
}
