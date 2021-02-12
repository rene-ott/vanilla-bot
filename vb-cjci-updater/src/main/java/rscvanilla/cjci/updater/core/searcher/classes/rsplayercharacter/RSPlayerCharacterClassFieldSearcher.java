package rscvanilla.cjci.updater.core.searcher.classes.rsplayercharacter;

import rscvanilla.cjci.updater.core.searcher.ClassMemberBaseSearcher;
import rscvanilla.cjci.updater.core.matcher.classes.rsplayercharacter.RSPlayerCharacterClassFieldNameMatcher;

import javax.inject.Inject;
import java.util.Set;

public class RSPlayerCharacterClassFieldSearcher extends ClassMemberBaseSearcher<RSPlayerCharacterClassFieldNameMatcher> {

    @Inject
    public RSPlayerCharacterClassFieldSearcher(Set<RSPlayerCharacterClassFieldNameMatcher> fieldNameMatchers) {
        super(fieldNameMatchers);
    }
}
