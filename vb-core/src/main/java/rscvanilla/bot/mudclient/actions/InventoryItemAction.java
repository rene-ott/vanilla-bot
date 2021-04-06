package rscvanilla.bot.mudclient.actions;

import rscvanilla.bot.mudclient.enums.OpCodeOut;
import rscvanilla.bot.mudclient.wrappers.MudClientWrapper;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InventoryItemAction extends BaseAction {

    private final WalkAction walkAction;
    private final GroundObjectAction groundObjectAction;
    private final GroundItemAction groundItemAction;

    @Inject
    public InventoryItemAction(MudClientWrapper hooks, WalkAction walkAction,
                               GroundObjectAction groundObjectAction,
                               GroundItemAction groundItemAction) {
        super(hooks);
        this.walkAction = walkAction;
        this.groundObjectAction = groundObjectAction;
        this.groundItemAction = groundItemAction;
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

    public void castSpellOnInventoryItem(int spellId, int inventoryItemId) {
        var inventoryItemIndex = getFirstInventoryItemIndexById(inventoryItemId);
        if (inventoryItemIndex == -1)
            return;

        mudClientWrapper.getPacketBuilder()
            .setOpCode(OpCodeOut.CAST_SPELL_ON_INVENTORY_ITEM)
            .putShort(spellId)
            .putShort(inventoryItemIndex)
            .send();
    }

    public void useInventoryItemOnGroundItem(int inventoryItemId, int groundItemId) {
        var inventoryItemIndex = getFirstInventoryItemIndexById(inventoryItemId);
        if (inventoryItemIndex == -1)
            return;

        var groundItem = groundItemAction.getGroundItemById(groundItemId);
        if (groundItem == null)
            return;

        var groundItemLocalPos = groundItem.getLocalPosition();
        var groundItemGlobalPos = groundItem.getGlobalPosition();

        walkAction.walkToGroundItem(groundItemLocalPos.getX(), groundItemLocalPos.getY(), true);
        mudClientWrapper.getPacketBuilder()
            .setOpCode(OpCodeOut.USE_INVENTORY_ITEM_ON_GROUND_ITEM)
            .putShort(groundItemGlobalPos.getX())
            .putShort(groundItemGlobalPos.getY())
            .putShort(groundItemId)
            .putShort(inventoryItemIndex)
            .send();
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
        return Arrays.stream(ids).map(this::getFirstInventoryItemIndexById).anyMatch(itemIndex -> itemIndex != -1);
    }

    public boolean isItemInInventory(int id, int count) {
        return getInventoryItemCount(id) == count;
    }

    public int getInventoryItemCount(int id) {
        return (int) mudClientWrapper.getInventoryItems().stream().filter(it -> it.getId() == id).count();
    }

    public boolean isInventoryFull() {
        return mudClientWrapper.inventoryItemsCount.getValue() == 30;
    }

    private int getFirstInventoryItemIndexById(int id) {
        var indices = IntStream
            .range(0, mudClientWrapper.getInventoryItems().size())
            .boxed()
            .filter(it -> mudClientWrapper.getInventoryItems().get(it).getId() == id)
            .collect(Collectors.toList());

        return indices.size() == 0 ? -1 : indices.get(0);
    }
}
