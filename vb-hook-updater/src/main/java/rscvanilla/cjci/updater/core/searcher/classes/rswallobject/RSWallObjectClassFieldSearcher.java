package rscvanilla.cjci.updater.core.searcher.classes.rswallobject;

import rscvanilla.cjci.updater.core.searcher.ClassMemberBaseSearcher;
import rscvanilla.cjci.updater.core.matcher.classes.rswallobject.RSWallObjectClassFieldNameMatcher;

import javax.inject.Inject;
import java.util.Set;

public class RSWallObjectClassFieldSearcher extends ClassMemberBaseSearcher<RSWallObjectClassFieldNameMatcher> {

    @Inject
    public RSWallObjectClassFieldSearcher(Set<RSWallObjectClassFieldNameMatcher> fieldNameMatchers) {
        super(fieldNameMatchers);
    }
}
