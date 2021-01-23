package rscvanilla.hook.model.classes.mudclient;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import rscvanilla.hook.model.annotations.YamlClassInfo;
import rscvanilla.hook.model.annotations.YamlClassMemberKey;
import rscvanilla.hook.model.contracts.WithClassMembers;

@JsonPropertyOrder(alphabetic = true)
@YamlClassInfo("fields")
public class MudClientClassFields implements WithClassMembers {
    @YamlClassMemberKey("ground_item_list") public String groundItemList;
    @YamlClassMemberKey("ground_item_list_index") public String groundItemListIndex;

    @YamlClassMemberKey("ground_object_list") public String groundObjectList;
    @YamlClassMemberKey("ground_object_list_index") public String groundObjectListIndex;

    @YamlClassMemberKey("npc_list") public String npcList;
    @YamlClassMemberKey("npc_list_index") public String npcListIndex;

    @YamlClassMemberKey("wall_object_list") public String wallObjectList;
    @YamlClassMemberKey("wall_object_list_index") public String wallObjectListIndex;
}
