package rscvanilla.cjci.model.classes.nonplayercharacter;

import rscvanilla.cjci.model.annotations.YamlClassInfo;
import rscvanilla.cjci.model.classes.BaseClass;
import rscvanilla.cjci.model.contracts.WithClassMemberGroups;
import rscvanilla.cjci.model.contracts.WithClassMembers;
import rscvanilla.cjci.model.contracts.WithMethodGroup;

@YamlClassInfo("non_player_character")
public class NonPlayerCharacterClass extends BaseClass implements WithMethodGroup, WithClassMemberGroups {
    public NonPlayerCharacterClassMethods methods = new NonPlayerCharacterClassMethods();

    @Override
    public WithClassMembers getMethods() { return methods; }
}
