package rscvanilla.cjci.updater.core.searcher.classes.gameelements;

import rscvanilla.cjci.updater.core.matcher.classes.gameelements.GameElementsClassFieldNameMatcher;
import rscvanilla.cjci.updater.core.searcher.ClassMemberBaseSearcher;

import javax.inject.Inject;
import java.util.Set;

public class GameElementsClassFieldSearcher extends ClassMemberBaseSearcher<GameElementsClassFieldNameMatcher> {

    @Inject
    public GameElementsClassFieldSearcher(Set<GameElementsClassFieldNameMatcher> fieldNameMatchers) {
        super(fieldNameMatchers);
    }
}
