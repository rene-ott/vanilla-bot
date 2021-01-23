package rscvanilla.hooker.core.searcher.classes.mudclient;

import rscvanilla.hooker.core.matcher.classes.mudclient.MudClientClassInterceptorNameMatcher;
import rscvanilla.hooker.core.searcher.ClassMemberBaseSearcher;

import javax.inject.Inject;
import java.util.Set;

public class MudClientClassInterceptorSearcher extends ClassMemberBaseSearcher<MudClientClassInterceptorNameMatcher> {

    @Inject
    public MudClientClassInterceptorSearcher(Set<MudClientClassInterceptorNameMatcher> fieldNameMatchers) {
        super(fieldNameMatchers);
    }
}
