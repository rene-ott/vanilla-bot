package rscvanilla.hook.updater.core.searcher.classes.mudclient;

import rscvanilla.hook.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;
import rscvanilla.hook.updater.core.searcher.ClassMemberBaseSearcher;

import javax.inject.Inject;
import java.util.*;

public class MudClientClassFieldSearcher extends ClassMemberBaseSearcher<MudClientClassFieldNameMatcher> {

    @Inject
    public MudClientClassFieldSearcher(Set<MudClientClassFieldNameMatcher> fieldNameMatchers) {
        super(fieldNameMatchers);
    }
}
