package rscvanilla.hook.model.classes.rsentity;

import rscvanilla.hook.model.annotations.YamlClassInfo;
import rscvanilla.hook.model.classes.BaseClass;
import rscvanilla.hook.model.contracts.WithClassMemberGroups;
import rscvanilla.hook.model.contracts.WithClassMembers;
import rscvanilla.hook.model.contracts.WithFieldGroup;

@YamlClassInfo("rs_entity")
public class RSEntityClass extends BaseClass implements WithFieldGroup, WithClassMemberGroups {
    public RSEntityClassFields fields = new RSEntityClassFields();

    @Override
    public WithClassMembers getFields() { return fields; }
}
