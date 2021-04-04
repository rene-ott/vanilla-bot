package rscvanilla.cjci.model.classes.playercharacter;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import rscvanilla.cjci.model.annotations.YamlClassInfo;
import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.model.contracts.WithClassMembers;

@JsonPropertyOrder(alphabetic = true)
@YamlClassInfo("fields")
public class PlayerCharacterClassFields implements WithClassMembers {
    @YamlClassMemberKey("name") public String name;
}
