package rscvanilla.cjci.updater.core.searcher.classes.nonplayercharacterinfo;

import rscvanilla.cjci.updater.core.matcher.classes.nonplayercharacterinfo.fields.NonPlayerCharacterInfoClassFieldNameMatcher;
import rscvanilla.cjci.updater.core.searcher.ClassMemberBaseSearcher;

import javax.inject.Inject;
import java.util.Set;

public class NonPlayerCharacterInfoClassFieldSearcher extends ClassMemberBaseSearcher<NonPlayerCharacterInfoClassFieldNameMatcher> {

    @Inject
    public NonPlayerCharacterInfoClassFieldSearcher(Set<NonPlayerCharacterInfoClassFieldNameMatcher> fieldNameMatchers) {
        super(fieldNameMatchers);
    }
}
