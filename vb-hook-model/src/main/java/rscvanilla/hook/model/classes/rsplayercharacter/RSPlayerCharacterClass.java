package rscvanilla.hook.model.classes.rsplayercharacter;

import rscvanilla.hook.model.annotations.YamlClassInfo;
import rscvanilla.hook.model.classes.BaseClass;
import rscvanilla.hook.model.contracts.WithClassMemberGroups;
import rscvanilla.hook.model.contracts.WithClassMembers;
import rscvanilla.hook.model.contracts.WithFieldGroup;

@YamlClassInfo("rs_player_character")
public class RSPlayerCharacterClass extends BaseClass implements WithFieldGroup, WithClassMemberGroups {
    public RSPlayerCharacterClassFields fields = new RSPlayerCharacterClassFields();

    @Override
    public WithClassMembers getFields() { return fields; }
}
