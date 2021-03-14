package rscvanilla.bot.mudclient.actions;

import rscvanilla.bot.mudclient.enums.OpCodeOut;
import rscvanilla.bot.mudclient.MudClientWrapper;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class InventoryItemAction extends BaseAction {

    private final WalkAction walkAction;
    private final GroundObjectAction groundObjectAction;

    @Inject
    public InventoryItemAction(MudClientWrapper hooks, WalkAction walkAction,
                               GroundObjectAction groundObjectAction) {
        super(hooks);
        this.walkAction = walkAction;
        this.groundObjectAction = groundObjectAction;
    }

    public void useSleepingBag() {
        useItem(1263);
    }

    public void useItem(int id) {
        var itemIndex = getFirstInventoryItemIndexById(id);
        if (itemIndex == -1)
            return;

        mudClientWrapper.getPacketBuilder()
                .setOpCode(OpCodeOut.USE_ITEM)
                .putShort(itemIndex)
                .send();
    }

    public void dropItem(int id) {
        var itemIndex = getFirstInventoryItemIndexById(id);

        if (itemIndex == -1) {
            return;
        }

        mudClientWrapper.getPacketBuilder()
                .setOpCode(OpCodeOut.DROP_ITEM)
                .putShort(itemIndex)
                .putInt(1)
                .send();
    }

    public void dropAll(int...itemIds) {

        for (var itemId : itemIds) {
            var itemCount = getInventoryItemCount(itemId);
            for (var i = 0; i < itemCount; i++) {
                try { Thread.sleep(200); } catch (InterruptedException ignored) { }
                dropItem(itemId);
            }
        }
    }

    public void useItemOnItem(int firstItemId, int secondItemId) {
        var firstItemIndex = getFirstInventoryItemIndexById(firstItemId);
        if (firstItemIndex == -1)
            return;

        var secondItemIndex = getFirstInventoryItemIndexById(secondItemId);
        if (secondItemIndex == -1)
            return;

        mudClientWrapper.getPacketBuilder()
                .setOpCode(OpCodeOut.USE_ITEM_ON_ITEM)
                .putShort(firstItemIndex)
                .putShort(secondItemIndex)
                .send();
    }

    public void useItemOnGroundObject(int objectId, int...itemIds) {
        for (var itemId : itemIds) {
            useItemOnGroundObject(itemId, objectId);
        }
    }

    public void useItemOnGroundObject(int itemId, int objectId) {
        var itemIndex = getFirstInventoryItemIndexById(itemId);
        if (itemIndex == -1)
            return;

        var object = groundObjectAction.getNearestObject(new Integer[] { objectId, null, null });
        if (object == null)
            return;

        var localPos = object.getLocalPosition();
        walkAction.walkToObject(localPos.getX(), localPos.getY(), 0, object.getId());

        var globalPos = object.getGlobalPosition();

        mudClientWrapper.getPacketBuilder()
                .setOpCode(OpCodeOut.USE_ITEM_ON_OBJECT)
                .putShort(globalPos.getX())
                .putShort(globalPos.getY())
                .putShort(itemIndex)
                .send();
    }

    public boolean isItemInInventory(int...ids) {
        for (var id : ids) {
            var itemIndex = getFirstInventoryItemIndexById(id);
            if (itemIndex != -1) {
                return true;
            }
        }

        return false;
    }

    public boolean isItemInInventory(int id, int count) {
        return getInventoryItemCount(id) == count;
    }

    public int getInventoryItemCount(int id) {
        var itemCount = 0;
        for (var itemIndex : getInventoryItemIndexesById(id)) {
            itemCount += mudClientWrapper.inventoryItemSlotsCounts.getValue()[itemIndex];
        }

        return itemCount;
    }

    public boolean isInventoryFull() {
        return mudClientWrapper.inventoryItemListIndex.getValue() == 30;
    }

    private List<Integer> getInventoryItemIndexesById(int id) {
        var indices = new ArrayList<Integer>();

        var itemCountInInventory = mudClientWrapper.inventoryItemListIndex.getValue();
        if (itemCountInInventory == 0) {
            return indices;
        }

        var inventoryItems = mudClientWrapper.inventoryItemList.getValue();
        var copyOfInventoryItems = Arrays.copyOf(inventoryItems, itemCountInInventory);

        IntStream.range(0, copyOfInventoryItems.length).forEach(index -> {
            if (copyOfInventoryItems[index] == id) {
                indices.add(index);
            }
        });

        return indices;
    }

    private int getFirstInventoryItemIndexById(int id) {
        var indices = getInventoryItemIndexesById(id);
        if (indices.size() == 0)
            return -1;

        return indices.get(0);
    }
}
