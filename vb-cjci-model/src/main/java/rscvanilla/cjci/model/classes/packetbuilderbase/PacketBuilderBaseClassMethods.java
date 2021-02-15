package rscvanilla.cjci.model.classes.packetbuilderbase;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import rscvanilla.cjci.model.annotations.YamlClassInfo;
import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.model.contracts.WithClassMembers;

@JsonPropertyOrder(alphabetic = true)
@YamlClassInfo("methods")
public class PacketBuilderBaseClassMethods implements WithClassMembers {
    @YamlClassMemberKey("put_int") public String putInt;
    @YamlClassMemberKey("put_string") public String putString;
    @YamlClassMemberKey("put_short") public String putShort;
    @YamlClassMemberKey("put_byte") public String putByte;
}


