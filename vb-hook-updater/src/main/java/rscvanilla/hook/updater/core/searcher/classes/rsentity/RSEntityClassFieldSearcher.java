package rscvanilla.hook.updater.core.searcher.classes.rsentity;

import rscvanilla.hook.updater.core.matcher.classes.rscharacter.RSCharacterClassFieldNameMatcher;
import rscvanilla.hook.updater.core.searcher.ClassMemberBaseSearcher;

import javax.inject.Inject;
import java.util.Set;

public class RSEntityClassFieldSearcher extends ClassMemberBaseSearcher<RSCharacterClassFieldNameMatcher> {

    @Inject
    public RSEntityClassFieldSearcher(Set<RSCharacterClassFieldNameMatcher> fieldNameMatchers) {
        super(fieldNameMatchers);
    }
}
