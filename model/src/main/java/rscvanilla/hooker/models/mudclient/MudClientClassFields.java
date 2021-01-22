package rscvanilla.hooker.models.mudclient;

import rscvanilla.hooker.annotations.FieldIdentifier;
import rscvanilla.hooker.contracts.WithClassMembers;

public class MudClientClassFields implements WithClassMembers {
    @FieldIdentifier("npc_list") public String npcList;
    @FieldIdentifier("npc_list_index") public String npcListIndex;
}
