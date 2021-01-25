package rscvanilla.hook.model.classes.applet;

import rscvanilla.hook.model.annotations.YamlClassInfo;
import rscvanilla.hook.model.contracts.WithClassMemberGroups;
import rscvanilla.hook.model.contracts.WithClassMembers;
import rscvanilla.hook.model.contracts.WithFieldGroup;
import rscvanilla.hook.model.classes.BaseClass;

@YamlClassInfo("applet")
public class AppletClass extends BaseClass implements WithFieldGroup, WithClassMemberGroups {
    public AppletClassFields fields = new AppletClassFields();

    @Override
    public WithClassMembers getFields() { return fields; }
}
