package rscvanilla.hook.model.classes.rswallobject;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import rscvanilla.hook.model.annotations.YamlClassInfo;
import rscvanilla.hook.model.annotations.YamlClassMemberKey;
import rscvanilla.hook.model.contracts.WithClassMembers;

@JsonPropertyOrder(alphabetic = true)
@YamlClassInfo("fields")
public class RSWallObjectClassFields implements WithClassMembers {
    @YamlClassMemberKey("direction") public String direction;
}
