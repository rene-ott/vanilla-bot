package hooker.infrastructure.modules;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;
import hooker.matchers.mudclient.MudClientClassFieldMatcher;
import hooker.matchers.mudclient.NpcListFieldMatcher;
import hooker.matchers.mudclient.NpcListIndexFieldMatcher;

public class FieldMatcherModule extends AbstractModule {

    @Override
    protected void configure() {
        configureMudClientFieldMatchers();
    }

    private Multibinder<MudClientClassFieldMatcher> configureMudClientFieldMatchers() {
        var binder = Multibinder.newSetBinder(binder(), MudClientClassFieldMatcher.class);

        binder.addBinding().to(NpcListFieldMatcher.class);
        binder.addBinding().to(NpcListIndexFieldMatcher.class);

        return binder;
    }
}
