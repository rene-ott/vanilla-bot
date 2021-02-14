package rscvanilla.cjci.model.classes.mudclientbase;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import rscvanilla.cjci.model.annotations.YamlClassInfo;
import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.model.contracts.WithClassMembers;

@JsonPropertyOrder(alphabetic = true)
@YamlClassInfo("fields")
public class MudClientBaseClassFields implements WithClassMembers {
    @YamlClassMemberKey("packet_builder") public String packetBuilder;
}
