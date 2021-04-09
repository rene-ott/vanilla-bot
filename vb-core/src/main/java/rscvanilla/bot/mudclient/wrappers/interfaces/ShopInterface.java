package rscvanilla.bot.mudclient.wrappers.interfaces;

import rscvanilla.bot.mudclient.models.items.ShopItem;
import rscvanilla.bot.mudclient.wrappers.MudClientWrapper;
import rscvanilla.bot.mudclient.wrappers.MudClientWrapperObject;
import rscvanilla.cjci.model.classes.shopinterface.ShopInterfaceClassFields;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ShopInterface extends MudClientWrapperObject<Object> {

    public ShopInterface(Object internalObject, MudClientWrapper mudClientWrapper) {
        super(internalObject, mudClientWrapper);
    }

    public boolean isShopVisible() { return this.<Boolean>getFieldValue("isShopVisible", getClassFields().isShopVisible, Boolean.class); }
    public int getShopItemsCount() { return this.<Integer>getFieldValue("getShopItemsCount", getClassFields().shopItemsCount, Integer.class); }

    public List<ShopItem> getShopItems() {
        return IntStream.range(0, getShopItemsCount())
                .mapToObj(i -> new ShopItem(getShopItemIds()[i], getShopItemsCounts()[i], getShopItemsDefaultCounts()[i]))
                .collect(Collectors.toList());
    }

    public int[] getShopItemIds() { return getFieldValue("getShopItemIds", getClassFields().shopItemsIds, int[].class); }
    public int[] getShopItemsCounts() { return getFieldValue("getShopItemsCounts", getClassFields().shopItemsCounts, int[].class); }
    public int[] getShopItemsDefaultCounts() { return getFieldValue("getShopItemsDefaultCounts", getClassFields().shopItemsDefaultCounts, int[].class); }

    private ShopInterfaceClassFields getClassFields() {
        return mudClientWrapper.getClientJarClassInfo().shopInterface.fields;
    }
}
