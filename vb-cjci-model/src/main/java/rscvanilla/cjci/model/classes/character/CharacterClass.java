package rscvanilla.cjci.model.classes.character;

import rscvanilla.cjci.model.annotations.YamlClassInfo;
import rscvanilla.cjci.model.classes.BaseClass;
import rscvanilla.cjci.model.contracts.WithClassMemberGroups;
import rscvanilla.cjci.model.contracts.WithClassMembers;
import rscvanilla.cjci.model.contracts.WithFieldGroup;

@YamlClassInfo("character")
public class CharacterClass extends BaseClass implements WithFieldGroup, WithClassMemberGroups {
    public CharacterClassFields fields = new CharacterClassFields();

    @Override
    public WithClassMembers getFields() { return fields; }
}
