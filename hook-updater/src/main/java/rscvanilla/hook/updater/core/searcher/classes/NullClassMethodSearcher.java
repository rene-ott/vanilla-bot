package rscvanilla.hook.updater.core.searcher.classes;

import rscvanilla.hook.updater.core.matcher.ClassMemberNameMatcher;
import rscvanilla.hook.updater.core.searcher.ClassMemberBaseSearcher;

import javax.inject.Inject;
import java.util.HashSet;

public class NullClassMethodSearcher extends ClassMemberBaseSearcher<ClassMemberNameMatcher> {

    @Inject
    public NullClassMethodSearcher() {
        super(new HashSet<>());
    }
}
