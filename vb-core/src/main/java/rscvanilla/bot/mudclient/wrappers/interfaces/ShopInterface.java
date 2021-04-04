package rscvanilla.bot.mudclient.wrappers.interfaces;

import rscvanilla.bot.mudclient.wrappers.MudClientWrapper;
import rscvanilla.bot.mudclient.models.items.ShopItem;
import rscvanilla.bot.mudclient.wrappers.MudClientWrapperObject;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ShopInterface extends MudClientWrapperObject<Object> {

    public ShopInterface(Object internalObject, MudClientWrapper mudClientWrapper) {
        super(internalObject, mudClientWrapper);
    }

    public boolean isShopVisible() { return this.<Boolean>getFieldValue("isShopVisible", "lm", Boolean.class); }
    public int getShopItemsCount() { return this.<Byte>getFieldValue("getShopItemCount", "ln", Byte.class); }

    public List<ShopItem> getShopItems() {
        return IntStream.range(0, getShopItemsCount())
                .mapToObj(i -> new ShopItem(getShopItemIdList()[i], getShopItemStackSize()[i], getShopItemCurrentStackSize()[i]))
                .collect(Collectors.toList());
    }

    public int[] getShopItemIdList() { return getFieldValue("getShopItemIdList", "lv", int[].class); }
    public int[] getShopItemCurrentStackSize() { return getFieldValue("getShopItemCurrentStackSize", "lu", int[].class); }
    public int[] getShopItemStackSize() { return getFieldValue("getShopItemStackSize", "lw", int[].class); }
}
