package rscvanilla.hooker.core.searcher.classes;

import rscvanilla.hooker.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;
import rscvanilla.hooker.core.searcher.ClassMemberBaseSearcher;
import rscvanilla.hooker.core.searcher.ClassMemberSearcher;

import javax.inject.Inject;
import java.util.*;

public class MudClientClassFieldSearcher extends ClassMemberBaseSearcher<MudClientClassFieldNameMatcher> {

    @Inject
    public MudClientClassFieldSearcher(Set<MudClientClassFieldNameMatcher> fieldNameMatchers) {
        super(fieldNameMatchers);
    }
}
