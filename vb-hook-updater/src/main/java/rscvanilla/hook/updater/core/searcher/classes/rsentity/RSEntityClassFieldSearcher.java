package rscvanilla.hook.updater.core.searcher.classes.rsentity;

import rscvanilla.hook.updater.core.matcher.classes.rsentity.RSEntityClassFieldNameMatcher;
import rscvanilla.hook.updater.core.searcher.ClassMemberBaseSearcher;

import javax.inject.Inject;
import java.util.Set;

public class RSEntityClassFieldSearcher extends ClassMemberBaseSearcher<RSEntityClassFieldNameMatcher> {

    @Inject
    public RSEntityClassFieldSearcher(Set<RSEntityClassFieldNameMatcher> fieldNameMatchers) {
        super(fieldNameMatchers);
    }
}
