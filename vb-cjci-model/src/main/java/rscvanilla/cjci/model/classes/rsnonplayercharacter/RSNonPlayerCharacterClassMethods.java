package rscvanilla.cjci.model.classes.rsnonplayercharacter;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import rscvanilla.cjci.model.annotations.YamlClassInfo;
import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.model.contracts.WithClassMembers;

@JsonPropertyOrder(alphabetic = true)
@YamlClassInfo("methods")
public class RSNonPlayerCharacterClassMethods implements WithClassMembers {
    @YamlClassMemberKey("get_info") public String getInfo;
}
