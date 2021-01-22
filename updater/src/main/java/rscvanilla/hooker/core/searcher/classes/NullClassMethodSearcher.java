package rscvanilla.hooker.core.searcher.classes;

import rscvanilla.hooker.core.matcher.ClassMemberNameMatcher;
import rscvanilla.hooker.core.searcher.ClassMemberBaseSearcher;

import javax.inject.Inject;
import java.util.HashSet;

public class NullClassMethodSearcher extends ClassMemberBaseSearcher<ClassMemberNameMatcher> {

    @Inject
    public NullClassMethodSearcher() {
        super(new HashSet<>());
    }
}
