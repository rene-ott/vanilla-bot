package rscvanilla.hooker.models.mudclient;

import rscvanilla.hooker.contracts.WithClassFields;
import rscvanilla.hooker.models.common.ClassField;

public class MudClientClassFields implements WithClassFields {
    public ClassField npcList = new ClassField();
    public ClassField npcListIndex = new ClassField();
}
