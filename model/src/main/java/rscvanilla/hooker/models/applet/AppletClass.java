package rscvanilla.hooker.models.applet;

import rscvanilla.hooker.contracts.WithClassMemberGroups;
import rscvanilla.hooker.contracts.WithClassMembers;
import rscvanilla.hooker.contracts.WithFieldGroup;
import rscvanilla.hooker.models.common.BaseClass;

public class AppletClass extends BaseClass implements WithFieldGroup, WithClassMemberGroups {
    public AppletClassFields fields = new AppletClassFields();

    @Override
    public WithClassMembers getFields() { return fields; }
}
