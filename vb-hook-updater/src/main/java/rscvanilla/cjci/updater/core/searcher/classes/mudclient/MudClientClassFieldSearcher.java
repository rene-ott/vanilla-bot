package rscvanilla.cjci.updater.core.searcher.classes.mudclient;

import rscvanilla.cjci.updater.core.searcher.ClassMemberBaseSearcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;

import javax.inject.Inject;
import java.util.*;

public class MudClientClassFieldSearcher extends ClassMemberBaseSearcher<MudClientClassFieldNameMatcher> {

    @Inject
    public MudClientClassFieldSearcher(Set<MudClientClassFieldNameMatcher> fieldNameMatchers) {
        super(fieldNameMatchers);
    }
}
