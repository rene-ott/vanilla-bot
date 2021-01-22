package rscvanilla.hooker.models.mudclient;

import rscvanilla.hooker.annotations.YamlClassKey;
import rscvanilla.hooker.contracts.WithClassMemberGroups;
import rscvanilla.hooker.contracts.WithClassMembers;
import rscvanilla.hooker.contracts.WithFieldGroup;
import rscvanilla.hooker.contracts.WithMethodGroup;
import rscvanilla.hooker.models.common.BaseClass;

@YamlClassKey("mud_client")
public class MudClientClass extends BaseClass implements WithClassMemberGroups, WithFieldGroup, WithMethodGroup {
    public MudClientClassFields fields = new MudClientClassFields();
    public MudClientClassMethods methods = new MudClientClassMethods();

    @Override
    public WithClassMembers getFields() { return fields; }

    @Override
    public WithClassMembers getMethods() { return methods; }
}
