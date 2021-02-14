package rscvanilla.cjci.updater.core.searcher.classes.mudclientbase;

import rscvanilla.cjci.updater.core.matcher.classes.mudclientbase.MudClientBaseClassFieldNameMatcher;
import rscvanilla.cjci.updater.core.searcher.ClassMemberBaseSearcher;

import javax.inject.Inject;
import java.util.Set;

public class MudClientBaseClassFieldSearcher extends ClassMemberBaseSearcher<MudClientBaseClassFieldNameMatcher> {

    @Inject
    public MudClientBaseClassFieldSearcher(Set<MudClientBaseClassFieldNameMatcher> fieldNameMatchers) {
        super(fieldNameMatchers);
    }
}
