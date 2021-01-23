package rscvanilla.hooker.core.searcher.classes;

import rscvanilla.hooker.core.matcher.ClassMemberNameMatcher;
import rscvanilla.hooker.core.searcher.ClassMemberBaseSearcher;

import javax.inject.Inject;
import java.util.HashSet;

public class NullClassInterceptorSearcher extends ClassMemberBaseSearcher<ClassMemberNameMatcher> {

    @Inject
    public NullClassInterceptorSearcher() {
        super(new HashSet<>());
    }
}
