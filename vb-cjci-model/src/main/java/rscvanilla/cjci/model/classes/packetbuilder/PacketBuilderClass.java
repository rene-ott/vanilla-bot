package rscvanilla.cjci.model.classes.packetbuilder;

import rscvanilla.cjci.model.annotations.YamlClassInfo;
import rscvanilla.cjci.model.classes.BaseClass;
import rscvanilla.cjci.model.contracts.WithClassMemberGroups;
import rscvanilla.cjci.model.contracts.WithClassMembers;
import rscvanilla.cjci.model.contracts.WithMethodGroup;

@YamlClassInfo("packet_builder")
public class PacketBuilderClass extends BaseClass implements WithMethodGroup, WithClassMemberGroups {
    public PacketBuilderClassMethods methods = new PacketBuilderClassMethods();

    @Override
    public WithClassMembers getMethods() { return methods; }
}
