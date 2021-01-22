package rscvanilla.hooker.models.mudclient;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import rscvanilla.hooker.annotations.YamlClassMemberKey;
import rscvanilla.hooker.contracts.WithClassMembers;

@JsonPropertyOrder(alphabetic = true)
public class MudClientClassMethods implements WithClassMembers {
    @YamlClassMemberKey("walk_to_area") public String walkToArea;
}
