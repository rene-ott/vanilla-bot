package rscvanilla.cjci.updater.core.searcher.classes;

import rscvanilla.cjci.updater.core.searcher.ClassMemberBaseSearcher;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameMatcher;

import javax.inject.Inject;
import java.util.HashSet;

public class NullClassInterceptorSearcher extends ClassMemberBaseSearcher<ClassMemberNameMatcher> {

    @Inject
    public NullClassInterceptorSearcher() {
        super(new HashSet<>());
    }
}
