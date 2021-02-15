package rscvanilla.cjci.updater.core.searcher.classes;

import rscvanilla.cjci.updater.core.matcher.ClassMemberNameMatcher;
import rscvanilla.cjci.updater.core.searcher.ClassMemberBaseSearcher;

import javax.inject.Inject;
import java.util.HashSet;

public class NullClassFieldSearcher extends ClassMemberBaseSearcher<ClassMemberNameMatcher> {

    @Inject
    public NullClassFieldSearcher() {
        super(new HashSet<>());
    }
}
