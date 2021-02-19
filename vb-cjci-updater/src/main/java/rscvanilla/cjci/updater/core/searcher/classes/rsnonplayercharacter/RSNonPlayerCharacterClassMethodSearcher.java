package rscvanilla.cjci.updater.core.searcher.classes.rsnonplayercharacter;

import rscvanilla.cjci.updater.core.matcher.classes.rsnonplayercharacter.RSNonPlayerCharacterClassMethodNameMatcher;
import rscvanilla.cjci.updater.core.searcher.ClassMemberBaseSearcher;

import javax.inject.Inject;
import java.util.Set;

public class RSNonPlayerCharacterClassMethodSearcher extends ClassMemberBaseSearcher<RSNonPlayerCharacterClassMethodNameMatcher> {

    @Inject
    public RSNonPlayerCharacterClassMethodSearcher(Set<RSNonPlayerCharacterClassMethodNameMatcher> methodNameMatchers) {
        super(methodNameMatchers);
    }
}
