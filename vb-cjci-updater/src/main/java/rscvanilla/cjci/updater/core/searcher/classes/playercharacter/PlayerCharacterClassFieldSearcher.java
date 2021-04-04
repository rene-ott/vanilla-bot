package rscvanilla.cjci.updater.core.searcher.classes.playercharacter;

import rscvanilla.cjci.updater.core.searcher.ClassMemberBaseSearcher;
import rscvanilla.cjci.updater.core.matcher.classes.playercharacter.PlayerCharacterClassFieldNameMatcher;

import javax.inject.Inject;
import java.util.Set;

public class PlayerCharacterClassFieldSearcher extends ClassMemberBaseSearcher<PlayerCharacterClassFieldNameMatcher> {

    @Inject
    public PlayerCharacterClassFieldSearcher(Set<PlayerCharacterClassFieldNameMatcher> fieldNameMatchers) {
        super(fieldNameMatchers);
    }
}
