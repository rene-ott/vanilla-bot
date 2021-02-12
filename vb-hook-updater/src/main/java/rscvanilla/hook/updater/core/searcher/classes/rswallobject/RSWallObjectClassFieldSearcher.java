package rscvanilla.hook.updater.core.searcher.classes.rswallobject;

import rscvanilla.hook.updater.core.matcher.classes.rswallobject.RSWallObjectClassFieldNameMatcher;
import rscvanilla.hook.updater.core.searcher.ClassMemberBaseSearcher;

import javax.inject.Inject;
import java.util.Set;

public class RSWallObjectClassFieldSearcher extends ClassMemberBaseSearcher<RSWallObjectClassFieldNameMatcher> {

    @Inject
    public RSWallObjectClassFieldSearcher(Set<RSWallObjectClassFieldNameMatcher> fieldNameMatchers) {
        super(fieldNameMatchers);
    }
}
