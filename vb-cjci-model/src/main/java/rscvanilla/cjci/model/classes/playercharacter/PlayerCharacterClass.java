package rscvanilla.cjci.model.classes.playercharacter;

import rscvanilla.cjci.model.annotations.YamlClassInfo;
import rscvanilla.cjci.model.classes.BaseClass;
import rscvanilla.cjci.model.contracts.WithClassMemberGroups;
import rscvanilla.cjci.model.contracts.WithClassMembers;
import rscvanilla.cjci.model.contracts.WithFieldGroup;

@YamlClassInfo("player_character")
public class PlayerCharacterClass extends BaseClass implements WithFieldGroup, WithClassMemberGroups {
    public PlayerCharacterClassFields fields = new PlayerCharacterClassFields();

    @Override
    public WithClassMembers getFields() { return fields; }
}
