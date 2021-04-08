package rscvanilla.cjci.model.classes.shopinterface;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import rscvanilla.cjci.model.annotations.YamlClassInfo;
import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.model.contracts.WithClassMembers;

@JsonPropertyOrder(alphabetic = true)
@YamlClassInfo("fields")
public class ShopInterfaceClassFields implements WithClassMembers {
    @YamlClassMemberKey("is_shop_visible") public String isShopVisible;
    @YamlClassMemberKey("shop_items_ids") public String shopItemsIds;
    @YamlClassMemberKey("shop_items_counts") public String shopItemsCounts;

}
