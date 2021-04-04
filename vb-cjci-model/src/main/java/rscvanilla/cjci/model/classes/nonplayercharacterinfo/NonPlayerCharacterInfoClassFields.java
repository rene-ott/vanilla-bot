package rscvanilla.cjci.model.classes.nonplayercharacterinfo;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import rscvanilla.cjci.model.annotations.YamlClassInfo;
import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.model.contracts.WithClassMembers;

@JsonPropertyOrder(alphabetic = true)
@YamlClassInfo("fields")
public class NonPlayerCharacterInfoClassFields implements WithClassMembers {
    @YamlClassMemberKey("is_attackable") public String isAttackable;
}
