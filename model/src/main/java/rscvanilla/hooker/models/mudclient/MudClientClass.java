package rscvanilla.hooker.models.mudclient;

import rscvanilla.hooker.annotations.YamlClassInfo;
import rscvanilla.hooker.contracts.*;
import rscvanilla.hooker.models.common.BaseClass;

@YamlClassInfo("mud_client")
public class MudClientClass extends BaseClass implements WithClassMemberGroups, WithFieldGroup, WithMethodGroup, WithInterceptorGroup {

    public MudClientClassFields fields = new MudClientClassFields();
    public MudClientClassMethods methods = new MudClientClassMethods();
    public MudClientClassInterceptors interceptors = new MudClientClassInterceptors();

    @Override public WithClassMembers getFields() { return fields; }
    @Override public WithClassMembers getMethods() { return methods; }
    @Override public WithClassMembers getInterceptors() { return interceptors; }
}
