package rscvanilla.cjci.model.classes.shopinterface;

import rscvanilla.cjci.model.annotations.YamlClassInfo;
import rscvanilla.cjci.model.classes.BaseClass;
import rscvanilla.cjci.model.contracts.WithClassMemberGroups;
import rscvanilla.cjci.model.contracts.WithClassMembers;
import rscvanilla.cjci.model.contracts.WithFieldGroup;

@YamlClassInfo("shop_interface")
public class ShopInterfaceClass extends BaseClass implements WithFieldGroup, WithClassMemberGroups {
    public ShopInterfaceClassFields fields = new ShopInterfaceClassFields();

    @Override
    public WithClassMembers getFields() { return fields; }
}
