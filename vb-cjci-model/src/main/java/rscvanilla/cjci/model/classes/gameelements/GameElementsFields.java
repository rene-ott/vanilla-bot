package rscvanilla.cjci.model.classes.gameelements;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import rscvanilla.cjci.model.annotations.YamlClassInfo;
import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.model.contracts.WithClassMembers;

@JsonPropertyOrder(alphabetic = true)
@YamlClassInfo("fields")
public class GameElementsFields implements WithClassMembers {
    @YamlClassMemberKey("items") public String items;
}
