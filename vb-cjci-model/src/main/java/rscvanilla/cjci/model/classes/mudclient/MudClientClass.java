package rscvanilla.cjci.model.classes.mudclient;

import rscvanilla.cjci.model.classes.BaseClass;
import rscvanilla.cjci.model.annotations.YamlClassInfo;
import rscvanilla.cjci.model.contracts.*;

@YamlClassInfo("mud_client")
public class MudClientClass extends BaseClass implements WithClassMemberGroups, WithFieldGroup, WithMethodGroup {

    public MudClientClassFields fields = new MudClientClassFields();
    public MudClientClassMethods methods = new MudClientClassMethods();

    @Override public WithClassMembers getFields() { return fields; }
    @Override public WithClassMembers getMethods() { return methods; }
}
