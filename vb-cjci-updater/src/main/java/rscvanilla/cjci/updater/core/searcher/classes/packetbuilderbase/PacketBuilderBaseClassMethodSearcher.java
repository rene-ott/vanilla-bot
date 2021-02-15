package rscvanilla.cjci.updater.core.searcher.classes.packetbuilderbase;

import rscvanilla.cjci.updater.core.matcher.classes.packetbuilderbase.PacketBuilderBaseClassMethodNameMatcher;
import rscvanilla.cjci.updater.core.searcher.ClassMemberBaseSearcher;

import javax.inject.Inject;
import java.util.Set;

public class PacketBuilderBaseClassMethodSearcher extends ClassMemberBaseSearcher<PacketBuilderBaseClassMethodNameMatcher> {

    @Inject
    public PacketBuilderBaseClassMethodSearcher(Set<PacketBuilderBaseClassMethodNameMatcher> fieldNameMatchers) {
        super(fieldNameMatchers);
    }
}
