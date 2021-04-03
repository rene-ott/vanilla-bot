package rscvanilla.cjci.updater.core.searcher.classes.character;

import rscvanilla.cjci.updater.core.searcher.ClassMemberBaseSearcher;
import rscvanilla.cjci.updater.core.matcher.classes.character.CharacterClassFieldNameMatcher;

import javax.inject.Inject;
import java.util.Set;

public class CharacterClassFieldSearcher extends ClassMemberBaseSearcher<CharacterClassFieldNameMatcher> {

    @Inject
    public CharacterClassFieldSearcher(Set<CharacterClassFieldNameMatcher> fieldNameMatchers) {
        super(fieldNameMatchers);
    }
}
