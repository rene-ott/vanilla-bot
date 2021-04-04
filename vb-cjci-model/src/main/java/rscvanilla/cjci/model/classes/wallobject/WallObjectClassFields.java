package rscvanilla.cjci.model.classes.wallobject;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import rscvanilla.cjci.model.annotations.YamlClassInfo;
import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.model.contracts.WithClassMembers;

@JsonPropertyOrder(alphabetic = true)
@YamlClassInfo("fields")
public class WallObjectClassFields implements WithClassMembers {
    @YamlClassMemberKey("direction") public String direction;
}
