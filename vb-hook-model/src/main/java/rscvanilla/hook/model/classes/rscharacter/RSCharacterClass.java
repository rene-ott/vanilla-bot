package rscvanilla.hook.model.classes.rscharacter;

import rscvanilla.hook.model.annotations.YamlClassInfo;
import rscvanilla.hook.model.classes.BaseClass;
import rscvanilla.hook.model.contracts.WithClassMemberGroups;
import rscvanilla.hook.model.contracts.WithClassMembers;
import rscvanilla.hook.model.contracts.WithFieldGroup;

@YamlClassInfo("rs_character")
public class RSCharacterClass extends BaseClass implements WithFieldGroup, WithClassMemberGroups {
    public RSCharacterClassFields fields = new RSCharacterClassFields();

    @Override
    public WithClassMembers getFields() { return fields; }
}
