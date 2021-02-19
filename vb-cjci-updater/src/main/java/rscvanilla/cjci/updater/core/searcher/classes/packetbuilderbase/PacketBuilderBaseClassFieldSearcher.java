package rscvanilla.cjci.updater.core.searcher.classes.packetbuilderbase;

import rscvanilla.cjci.updater.core.matcher.classes.packetbuilderbase.PacketBuilderBaseClassFieldNameMatcher;
import rscvanilla.cjci.updater.core.searcher.ClassMemberBaseSearcher;

import javax.inject.Inject;
import java.util.Set;

public class PacketBuilderBaseClassFieldSearcher extends ClassMemberBaseSearcher<PacketBuilderBaseClassFieldNameMatcher> {

    @Inject
    public PacketBuilderBaseClassFieldSearcher(Set<PacketBuilderBaseClassFieldNameMatcher> fieldNameMatchers) {
        super(fieldNameMatchers);
    }
}
