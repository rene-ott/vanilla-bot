package rscvanilla.cjci.updater.core.searcher.classes.mudclient;

import rscvanilla.cjci.updater.core.searcher.ClassMemberBaseSearcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassMethodNameMatcher;

import javax.inject.Inject;
import java.util.Set;

public class MudClientClassMethodSearcher extends ClassMemberBaseSearcher<MudClientClassMethodNameMatcher> {

    @Inject
    public MudClientClassMethodSearcher(Set<MudClientClassMethodNameMatcher> fieldNameMatchers) {
        super(fieldNameMatchers);
    }
}
