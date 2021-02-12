package rscvanilla.cjci.updater.core.searcher.classes.rscharacter;

import rscvanilla.cjci.updater.core.searcher.ClassMemberBaseSearcher;
import rscvanilla.cjci.updater.core.matcher.classes.rscharacter.RSCharacterClassFieldNameMatcher;

import javax.inject.Inject;
import java.util.Set;

public class RSCharacterClassFieldSearcher extends ClassMemberBaseSearcher<RSCharacterClassFieldNameMatcher> {

    @Inject
    public RSCharacterClassFieldSearcher(Set<RSCharacterClassFieldNameMatcher> fieldNameMatchers) {
        super(fieldNameMatchers);
    }
}
