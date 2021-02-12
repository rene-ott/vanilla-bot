package rscvanilla.hook.model.classes.rswallobject;

import rscvanilla.hook.model.annotations.YamlClassInfo;
import rscvanilla.hook.model.classes.BaseClass;
import rscvanilla.hook.model.contracts.WithClassMemberGroups;
import rscvanilla.hook.model.contracts.WithClassMembers;
import rscvanilla.hook.model.contracts.WithFieldGroup;

@YamlClassInfo("rs_wall_object")
public class RSWallObjectClass extends BaseClass implements WithFieldGroup, WithClassMemberGroups {
    public RSWallObjectClassFields fields = new RSWallObjectClassFields();

    @Override
    public WithClassMembers getFields() { return fields; }
}
