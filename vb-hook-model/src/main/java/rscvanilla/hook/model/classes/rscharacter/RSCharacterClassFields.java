package rscvanilla.hook.model.classes.rscharacter;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import rscvanilla.hook.model.annotations.YamlClassInfo;
import rscvanilla.hook.model.annotations.YamlClassMemberKey;
import rscvanilla.hook.model.contracts.WithClassMembers;

@JsonPropertyOrder(alphabetic = true)
@YamlClassInfo("fields")
public class RSCharacterClassFields implements WithClassMembers {
    @YamlClassMemberKey("bubble_timeout") public String bubbleTimeout;
    @YamlClassMemberKey("current_health_level") public String currentHealthLevel;
    @YamlClassMemberKey("health_level") public String healthLevel;
    @YamlClassMemberKey("direction") public String direction;
    @YamlClassMemberKey("combat_level") public String combatLevel;
}
