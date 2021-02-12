package rscvanilla.hook.updater.core.searcher.classes.rscharacter;

import rscvanilla.hook.updater.core.matcher.classes.rscharacter.RSCharacterClassFieldNameMatcher;
import rscvanilla.hook.updater.core.searcher.ClassMemberBaseSearcher;

import javax.inject.Inject;
import java.util.Set;

public class RSCharacterClassFieldSearcher extends ClassMemberBaseSearcher<RSCharacterClassFieldNameMatcher> {

    @Inject
    public RSCharacterClassFieldSearcher(Set<RSCharacterClassFieldNameMatcher> fieldNameMatchers) {
        super(fieldNameMatchers);
    }
}
