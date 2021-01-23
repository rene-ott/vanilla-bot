package rscvanilla.hook.model.classes.mudclient;

import rscvanilla.hook.model.annotations.YamlClassInfo;
import rscvanilla.hook.model.contracts.*;
import rscvanilla.hook.model.classes.BaseClass;

@YamlClassInfo("mud_client")
public class MudClientClass extends BaseClass implements WithClassMemberGroups, WithFieldGroup, WithMethodGroup, WithInterceptorGroup {

    public MudClientClassFields fields = new MudClientClassFields();
    public MudClientClassMethods methods = new MudClientClassMethods();
    public MudClientClassInterceptors interceptors = new MudClientClassInterceptors();

    @Override public WithClassMembers getFields() { return fields; }
    @Override public WithClassMembers getMethods() { return methods; }
    @Override public WithClassMembers getInterceptors() { return interceptors; }
}
