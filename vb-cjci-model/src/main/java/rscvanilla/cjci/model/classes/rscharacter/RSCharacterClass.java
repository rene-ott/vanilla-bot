package rscvanilla.cjci.model.classes.rscharacter;

import rscvanilla.cjci.model.annotations.YamlClassInfo;
import rscvanilla.cjci.model.classes.BaseClass;
import rscvanilla.cjci.model.contracts.WithClassMemberGroups;
import rscvanilla.cjci.model.contracts.WithClassMembers;
import rscvanilla.cjci.model.contracts.WithFieldGroup;

@YamlClassInfo("rs_character")
public class RSCharacterClass extends BaseClass implements WithFieldGroup, WithClassMemberGroups {
    public RSCharacterClassFields fields = new RSCharacterClassFields();

    @Override
    public WithClassMembers getFields() { return fields; }
}
