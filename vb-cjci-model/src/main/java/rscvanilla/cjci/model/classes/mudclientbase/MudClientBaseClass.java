package rscvanilla.cjci.model.classes.mudclientbase;

import rscvanilla.cjci.model.annotations.YamlClassInfo;
import rscvanilla.cjci.model.classes.BaseClass;
import rscvanilla.cjci.model.contracts.WithClassMemberGroups;
import rscvanilla.cjci.model.contracts.WithClassMembers;
import rscvanilla.cjci.model.contracts.WithFieldGroup;

@YamlClassInfo("mud_client_base")
public class MudClientBaseClass extends BaseClass implements WithFieldGroup, WithClassMemberGroups {
    public MudClientBaseClassFields fields = new MudClientBaseClassFields();

    @Override
    public WithClassMembers getFields() { return fields; }
}
