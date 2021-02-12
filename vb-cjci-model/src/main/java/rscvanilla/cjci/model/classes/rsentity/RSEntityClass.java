package rscvanilla.cjci.model.classes.rsentity;

import rscvanilla.cjci.model.annotations.YamlClassInfo;
import rscvanilla.cjci.model.classes.BaseClass;
import rscvanilla.cjci.model.contracts.WithClassMemberGroups;
import rscvanilla.cjci.model.contracts.WithClassMembers;
import rscvanilla.cjci.model.contracts.WithFieldGroup;

@YamlClassInfo("rs_entity")
public class RSEntityClass extends BaseClass implements WithFieldGroup, WithClassMemberGroups {
    public RSEntityClassFields fields = new RSEntityClassFields();

    @Override
    public WithClassMembers getFields() { return fields; }
}
