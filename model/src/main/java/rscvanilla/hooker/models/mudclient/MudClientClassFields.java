package rscvanilla.hooker.models.mudclient;

import rscvanilla.hooker.contracts.WithClassFields;
import rscvanilla.hooker.models.common.ClassMember;

public class MudClientClassFields implements WithClassFields {
    public ClassMember npcList = new ClassMember();
    public ClassMember npcListIndex = new ClassMember();
}
