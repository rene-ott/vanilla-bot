package rscvanilla.cjci.model.classes.rswallobject;

import rscvanilla.cjci.model.annotations.YamlClassInfo;
import rscvanilla.cjci.model.classes.BaseClass;
import rscvanilla.cjci.model.contracts.WithClassMemberGroups;
import rscvanilla.cjci.model.contracts.WithClassMembers;
import rscvanilla.cjci.model.contracts.WithFieldGroup;

@YamlClassInfo("rs_wall_object")
public class RSWallObjectClass extends BaseClass implements WithFieldGroup, WithClassMemberGroups {
    public RSWallObjectClassFields fields = new RSWallObjectClassFields();

    @Override
    public WithClassMembers getFields() { return fields; }
}
