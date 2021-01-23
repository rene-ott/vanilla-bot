package rscvanilla.hook.updater.core.searcher.classes.mudclient;

import rscvanilla.hook.updater.core.matcher.classes.mudclient.MudClientClassInterceptorNameMatcher;
import rscvanilla.hook.updater.core.searcher.ClassMemberBaseSearcher;

import javax.inject.Inject;
import java.util.Set;

public class MudClientClassInterceptorSearcher extends ClassMemberBaseSearcher<MudClientClassInterceptorNameMatcher> {

    @Inject
    public MudClientClassInterceptorSearcher(Set<MudClientClassInterceptorNameMatcher> fieldNameMatchers) {
        super(fieldNameMatchers);
    }
}