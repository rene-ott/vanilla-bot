package rscvanilla.cjci.updater.core.searcher.classes.gameentity;

import rscvanilla.cjci.updater.core.matcher.classes.gameentity.GameEntityClassFieldNameMatcher;
import rscvanilla.cjci.updater.core.searcher.ClassMemberBaseSearcher;

import javax.inject.Inject;
import java.util.Set;

public class GameEntityClassFieldSearcher extends ClassMemberBaseSearcher<GameEntityClassFieldNameMatcher> {

    @Inject
    public GameEntityClassFieldSearcher(Set<GameEntityClassFieldNameMatcher> fieldNameMatchers) {
        super(fieldNameMatchers);
    }
}
