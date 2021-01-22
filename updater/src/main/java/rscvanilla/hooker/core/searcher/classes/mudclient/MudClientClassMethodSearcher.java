package rscvanilla.hooker.core.searcher.classes.mudclient;

import rscvanilla.hooker.core.matcher.classes.mudclient.MudClientClassMethodNameMatcher;
import rscvanilla.hooker.core.searcher.ClassMemberBaseSearcher;

import javax.inject.Inject;
import java.util.Set;

public class MudClientClassMethodSearcher extends ClassMemberBaseSearcher<MudClientClassMethodNameMatcher> {

    @Inject
    public MudClientClassMethodSearcher(Set<MudClientClassMethodNameMatcher> fieldNameMatchers) {
        super(fieldNameMatchers);
    }
}
