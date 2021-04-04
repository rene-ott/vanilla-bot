package rscvanilla.cjci.updater.core.searcher.classes.wallobject;

import rscvanilla.cjci.updater.core.searcher.ClassMemberBaseSearcher;
import rscvanilla.cjci.updater.core.matcher.classes.wallobject.WallObjectClassFieldNameMatcher;

import javax.inject.Inject;
import java.util.Set;

public class WallObjectClassFieldSearcher extends ClassMemberBaseSearcher<WallObjectClassFieldNameMatcher> {

    @Inject
    public WallObjectClassFieldSearcher(Set<WallObjectClassFieldNameMatcher> fieldNameMatchers) {
        super(fieldNameMatchers);
    }
}
