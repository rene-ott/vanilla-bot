package rscvanilla.hooker.models.mudclient;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import rscvanilla.hooker.annotations.YamlClassInfo;
import rscvanilla.hooker.annotations.YamlClassMemberKey;
import rscvanilla.hooker.contracts.WithClassMembers;

@JsonPropertyOrder(alphabetic = true)
@YamlClassInfo("fields")
public class MudClientClassFields implements WithClassMembers {
    @YamlClassMemberKey("npc_list") public String npcList;
    @YamlClassMemberKey("npc_list_index") public String npcListIndex;
}
