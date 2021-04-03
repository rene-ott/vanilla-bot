package rscvanilla.cjci.updater.core.searcher.classes.nonplayercharacter;

import rscvanilla.cjci.updater.core.matcher.classes.nonplayercharacter.NonPlayerCharacterClassMethodNameMatcher;
import rscvanilla.cjci.updater.core.searcher.ClassMemberBaseSearcher;

import javax.inject.Inject;
import java.util.Set;

public class NonPlayerCharacterClassMethodSearcher extends ClassMemberBaseSearcher<NonPlayerCharacterClassMethodNameMatcher> {

    @Inject
    public NonPlayerCharacterClassMethodSearcher(Set<NonPlayerCharacterClassMethodNameMatcher> methodNameMatchers) {
        super(methodNameMatchers);
    }
}
