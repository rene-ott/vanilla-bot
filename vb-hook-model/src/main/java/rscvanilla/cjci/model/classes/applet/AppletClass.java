package rscvanilla.cjci.model.classes.applet;

import rscvanilla.cjci.model.classes.BaseClass;
import rscvanilla.cjci.model.annotations.YamlClassInfo;
import rscvanilla.cjci.model.contracts.WithClassMemberGroups;
import rscvanilla.cjci.model.contracts.WithClassMembers;
import rscvanilla.cjci.model.contracts.WithFieldGroup;

@YamlClassInfo("applet")
public class AppletClass extends BaseClass implements WithFieldGroup, WithClassMemberGroups {
    public AppletClassFields fields = new AppletClassFields();

    @Override
    public WithClassMembers getFields() { return fields; }
}
