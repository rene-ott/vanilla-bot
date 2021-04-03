package rscvanilla.cjci.model.classes.nonplayercharacterinfo;

import rscvanilla.cjci.model.annotations.YamlClassInfo;
import rscvanilla.cjci.model.classes.BaseClass;
import rscvanilla.cjci.model.contracts.WithClassMemberGroups;
import rscvanilla.cjci.model.contracts.WithClassMembers;
import rscvanilla.cjci.model.contracts.WithFieldGroup;

@YamlClassInfo("non_player_character_info")
public class NonPlayerCharacterInfoClass extends BaseClass implements WithFieldGroup, WithClassMemberGroups {
    public NonPlayerCharacterInfoClassFields fields = new NonPlayerCharacterInfoClassFields();

    @Override
    public WithClassMembers getFields() { return fields; }
}
