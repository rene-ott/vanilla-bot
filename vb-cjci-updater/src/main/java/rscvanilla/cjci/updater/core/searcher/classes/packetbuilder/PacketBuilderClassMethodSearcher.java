package rscvanilla.cjci.updater.core.searcher.classes.packetbuilder;

import rscvanilla.cjci.updater.core.matcher.classes.packetbuilder.PacketBuilderClassMethodNameMatcher;
import rscvanilla.cjci.updater.core.searcher.ClassMemberBaseSearcher;

import javax.inject.Inject;
import java.util.Set;

public class PacketBuilderClassMethodSearcher extends ClassMemberBaseSearcher<PacketBuilderClassMethodNameMatcher> {

    @Inject
    public PacketBuilderClassMethodSearcher(Set<PacketBuilderClassMethodNameMatcher> fieldNameMatchers) {
        super(fieldNameMatchers);
    }
}
