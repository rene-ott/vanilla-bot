package rscvanilla.cjci.model.classes.packetbuilderbase;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import rscvanilla.cjci.model.annotations.YamlClassInfo;
import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.model.contracts.WithClassMembers;

@JsonPropertyOrder(alphabetic = true)
@YamlClassInfo("fields")
public class PacketBuilderBaseClassFields implements WithClassMembers {
    @YamlClassMemberKey("buffered_bytes") public String bufferedBytes;
}
