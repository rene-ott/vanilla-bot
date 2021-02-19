package rscvanilla.cjci.model.classes.packetbuilderbase;

import rscvanilla.cjci.model.annotations.YamlClassInfo;
import rscvanilla.cjci.model.classes.BaseClass;
import rscvanilla.cjci.model.contracts.WithClassMemberGroups;
import rscvanilla.cjci.model.contracts.WithClassMembers;
import rscvanilla.cjci.model.contracts.WithFieldGroup;
import rscvanilla.cjci.model.contracts.WithMethodGroup;

@YamlClassInfo("packet_builder_base")
public class PacketBuilderBaseClass extends BaseClass implements WithMethodGroup, WithFieldGroup, WithClassMemberGroups {
    public PacketBuilderBaseClassMethods methods = new PacketBuilderBaseClassMethods();
    public PacketBuilderBaseClassFields fields = new PacketBuilderBaseClassFields();

    @Override
    public WithClassMembers getMethods() { return methods; }

    @Override
    public WithClassMembers getFields() { return fields; }
}
