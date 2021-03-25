package rscvanilla.bot.mudclient.actions;

import rscvanilla.bot.mudclient.MudClientWrapper;
import rscvanilla.bot.mudclient.enums.OpCodeOut;

import javax.inject.Inject;
import java.util.stream.Collectors;

public class ShopAction extends BaseAction {

    @Inject
    public ShopAction(MudClientWrapper mudClientWrapper) {
        super(mudClientWrapper);
    }

    public void testShop() {
    }

    public boolean isShopVisible() {
        return mudClientWrapper.getShopInterface() != null && mudClientWrapper.getShopInterface().isShopVisible();
    }

    public void buyShopItem(int id, int count) {
        if (!isShopVisible()) {
            return;
        }

        var currentShopItemCount = getCurrentShopItemCount(id);
        if (currentShopItemCount == 0) {
            return;
        }

        getPacketBuilder()
            .setOpCode(OpCodeOut.BUY_ITEM)
            .putShort(id)
            .putShort(currentShopItemCount)
            .putShort(count)
            .send();
    }

    public int getCurrentShopItemCount(int id) {
        var shopItems = mudClientWrapper.getShopInterface()
                .getShopItems()
                .stream()
                .filter(it -> it.getId() == id)
                .collect(Collectors.toList());

        if (shopItems.size() == 0)
            return 0;

        return shopItems.get(0).getCurrentStackSize();
    }
}
