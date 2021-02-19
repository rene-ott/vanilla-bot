package rscvanilla.cjci.updater.core.searcher.classes.rsnonplayercharacterinfo;

import rscvanilla.cjci.updater.core.matcher.classes.rsnonplayercharacterinfo.fields.RSNonPlayerCharacterInfoClassFieldNameMatcher;
import rscvanilla.cjci.updater.core.searcher.ClassMemberBaseSearcher;

import javax.inject.Inject;
import java.util.Set;

public class RSNonPlayerCharacterInfoClassFieldSearcher extends ClassMemberBaseSearcher<RSNonPlayerCharacterInfoClassFieldNameMatcher> {

    @Inject
    public RSNonPlayerCharacterInfoClassFieldSearcher(Set<RSNonPlayerCharacterInfoClassFieldNameMatcher> fieldNameMatchers) {
        super(fieldNameMatchers);
    }
}
