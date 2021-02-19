package rscvanilla.cjci.model.classes.rsnonplayercharacter;

import rscvanilla.cjci.model.annotations.YamlClassInfo;
import rscvanilla.cjci.model.classes.BaseClass;
import rscvanilla.cjci.model.contracts.WithClassMemberGroups;
import rscvanilla.cjci.model.contracts.WithClassMembers;
import rscvanilla.cjci.model.contracts.WithMethodGroup;

@YamlClassInfo("rs_non_player_character")
public class RSNonPlayerCharacterClass extends BaseClass implements WithMethodGroup, WithClassMemberGroups {
    public RSNonPlayerCharacterClassMethods methods = new RSNonPlayerCharacterClassMethods();

    @Override
    public WithClassMembers getMethods() { return methods; }
}
