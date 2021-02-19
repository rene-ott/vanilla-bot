package rscvanilla.cjci.model.classes.rsnonplayercharacterinfo;

import rscvanilla.cjci.model.annotations.YamlClassInfo;
import rscvanilla.cjci.model.classes.BaseClass;
import rscvanilla.cjci.model.contracts.WithClassMemberGroups;
import rscvanilla.cjci.model.contracts.WithClassMembers;
import rscvanilla.cjci.model.contracts.WithFieldGroup;

@YamlClassInfo("rs_non_player_character_info")
public class RSNonPlayerCharacterInfoClass extends BaseClass implements WithFieldGroup, WithClassMemberGroups {
    public RSNonPlayerCharacterInfoClassFields fields = new RSNonPlayerCharacterInfoClassFields();

    @Override
    public WithClassMembers getFields() { return fields; }
}
