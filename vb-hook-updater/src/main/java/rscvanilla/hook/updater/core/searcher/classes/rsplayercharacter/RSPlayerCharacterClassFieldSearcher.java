package rscvanilla.hook.updater.core.searcher.classes.rsplayercharacter;

import rscvanilla.hook.updater.core.matcher.classes.rsplayercharacter.RSPlayerCharacterClassFieldNameMatcher;
import rscvanilla.hook.updater.core.searcher.ClassMemberBaseSearcher;

import javax.inject.Inject;
import java.util.Set;

public class RSPlayerCharacterClassFieldSearcher extends ClassMemberBaseSearcher<RSPlayerCharacterClassFieldNameMatcher> {

    @Inject
    public RSPlayerCharacterClassFieldSearcher(Set<RSPlayerCharacterClassFieldNameMatcher> fieldNameMatchers) {
        super(fieldNameMatchers);
    }
}
