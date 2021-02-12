package rscvanilla.cjci.model.classes.rsplayercharacter;

import rscvanilla.cjci.model.annotations.YamlClassInfo;
import rscvanilla.cjci.model.classes.BaseClass;
import rscvanilla.cjci.model.contracts.WithClassMemberGroups;
import rscvanilla.cjci.model.contracts.WithClassMembers;
import rscvanilla.cjci.model.contracts.WithFieldGroup;

@YamlClassInfo("rs_player_character")
public class RSPlayerCharacterClass extends BaseClass implements WithFieldGroup, WithClassMemberGroups {
    public RSPlayerCharacterClassFields fields = new RSPlayerCharacterClassFields();

    @Override
    public WithClassMembers getFields() { return fields; }
}
