package rscvanilla.cjci.model.classes.packetbuilder;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import rscvanilla.cjci.model.annotations.YamlClassInfo;
import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.model.contracts.WithClassMembers;

@JsonPropertyOrder(alphabetic = true)
@YamlClassInfo("methods")
public class PacketBuilderClassMethods implements WithClassMembers {
    @YamlClassMemberKey("set_op_code") public String setOpCode;
    @YamlClassMemberKey("send") public String send;
}


