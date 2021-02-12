package rscvanilla.cjci.updater.core.searcher.classes.mudclient;

import rscvanilla.cjci.updater.core.searcher.ClassMemberBaseSearcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassInterceptorNameMatcher;

import javax.inject.Inject;
import java.util.Set;

public class MudClientClassInterceptorSearcher extends ClassMemberBaseSearcher<MudClientClassInterceptorNameMatcher> {

    @Inject
    public MudClientClassInterceptorSearcher(Set<MudClientClassInterceptorNameMatcher> fieldNameMatchers) {
        super(fieldNameMatchers);
    }
}
