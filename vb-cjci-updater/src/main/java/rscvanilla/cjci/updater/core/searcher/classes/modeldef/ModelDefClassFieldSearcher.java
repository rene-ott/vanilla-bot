package rscvanilla.cjci.updater.core.searcher.classes.modeldef;

import rscvanilla.cjci.updater.core.matcher.classes.modeldef.ModelDefClassFieldNameMatcher;
import rscvanilla.cjci.updater.core.searcher.ClassMemberBaseSearcher;

import javax.inject.Inject;
import java.util.Set;

public class ModelDefClassFieldSearcher extends ClassMemberBaseSearcher<ModelDefClassFieldNameMatcher> {

    @Inject
    public ModelDefClassFieldSearcher(Set<ModelDefClassFieldNameMatcher> fieldNameMatchers) {
        super(fieldNameMatchers);
    }
}
