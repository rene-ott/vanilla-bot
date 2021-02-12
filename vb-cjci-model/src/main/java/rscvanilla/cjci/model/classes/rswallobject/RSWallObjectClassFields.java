package rscvanilla.cjci.model.classes.rswallobject;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import rscvanilla.cjci.model.annotations.YamlClassInfo;
import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.model.contracts.WithClassMembers;

@JsonPropertyOrder(alphabetic = true)
@YamlClassInfo("fields")
public class RSWallObjectClassFields implements WithClassMembers {
    @YamlClassMemberKey("direction") public String direction;
}
