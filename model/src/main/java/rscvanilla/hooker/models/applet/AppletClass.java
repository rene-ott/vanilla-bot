package rscvanilla.hooker.models.applet;

import rscvanilla.hooker.contracts.WithClassMembers;
import rscvanilla.hooker.contracts.WithFields;
import rscvanilla.hooker.models.common.BaseClass;

public class AppletClass extends BaseClass implements WithFields {
    public AppletClassFields fields = new AppletClassFields();

    @Override
    public WithClassMembers getFields() { return fields; }
}
