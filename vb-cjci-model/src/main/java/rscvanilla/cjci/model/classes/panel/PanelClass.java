package rscvanilla.cjci.model.classes.panel;

import rscvanilla.cjci.model.annotations.YamlClassInfo;
import rscvanilla.cjci.model.classes.BaseClass;
import rscvanilla.cjci.model.contracts.WithClassMemberGroups;
import rscvanilla.cjci.model.contracts.WithClassMembers;
import rscvanilla.cjci.model.contracts.WithMethodGroup;

@YamlClassInfo("panel")
public class PanelClass extends BaseClass implements WithMethodGroup, WithClassMemberGroups {
    public PanelClassMethods methods = new PanelClassMethods();

    @Override
    public WithClassMembers getMethods() { return methods; }
}
