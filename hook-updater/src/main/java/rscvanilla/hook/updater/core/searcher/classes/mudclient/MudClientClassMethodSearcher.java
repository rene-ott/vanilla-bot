package rscvanilla.hook.updater.core.searcher.classes.mudclient;

import rscvanilla.hook.updater.core.matcher.classes.mudclient.MudClientClassMethodNameMatcher;
import rscvanilla.hook.updater.core.searcher.ClassMemberBaseSearcher;

import javax.inject.Inject;
import java.util.Set;

public class MudClientClassMethodSearcher extends ClassMemberBaseSearcher<MudClientClassMethodNameMatcher> {

    @Inject
    public MudClientClassMethodSearcher(Set<MudClientClassMethodNameMatcher> fieldNameMatchers) {
        super(fieldNameMatchers);
    }
}
