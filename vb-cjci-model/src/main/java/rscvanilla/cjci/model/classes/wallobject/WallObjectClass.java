package rscvanilla.cjci.model.classes.wallobject;

import rscvanilla.cjci.model.annotations.YamlClassInfo;
import rscvanilla.cjci.model.classes.BaseClass;
import rscvanilla.cjci.model.contracts.WithClassMemberGroups;
import rscvanilla.cjci.model.contracts.WithClassMembers;
import rscvanilla.cjci.model.contracts.WithFieldGroup;

@YamlClassInfo("wall_object")
public class WallObjectClass extends BaseClass implements WithFieldGroup, WithClassMemberGroups {
    public WallObjectClassFields fields = new WallObjectClassFields();

    @Override
    public WithClassMembers getFields() { return fields; }
}
