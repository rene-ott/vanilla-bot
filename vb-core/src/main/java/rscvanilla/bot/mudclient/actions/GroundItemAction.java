package rscvanilla.bot.mudclient.actions;

import rscvanilla.bot.mudclient.enums.OpCodeOut;
import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.mudclient.models.wrappers.RSGroundItem;
import rscvanilla.bot.mudclient.MudClientWrapper;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class GroundItemAction extends BaseAction {

    private WalkAction walkAction;

    @Inject
    public GroundItemAction(MudClientWrapper hooks,
                            WalkAction walkAction
    ) {
        super(hooks);
        this.walkAction = walkAction;
    }

    public boolean isItemOnGround(int...ids) {
        return getGroundItemById(ids) != null;
    }

    public void takeItemFromGround(int...ids) {
        var groundItem = getGroundItemById(ids);

        if (groundItem == null)
            return;

        var itemLocalPositionX = groundItem.getLocalPosition().getX();
        var itemLocalPositionY = groundItem.getLocalPosition().getY();
        var playerLocalPosition = mudClientWrapper.getUser().getLocalPosition();

        walkAction.walkToGroundItem(itemLocalPositionX, itemLocalPositionY, true);
        if (playerLocalPosition.getX() == itemLocalPositionX && playerLocalPosition.getY() == itemLocalPositionY) {
            takeGroundItem(groundItem);
        }
    }

    private void takeGroundItem(RSGroundItem groundItem) {
        mudClientWrapper.getPacketBuilder()
                .setOpCode(OpCodeOut.TAKE_ITEM_FROM_GROUND)
                .putShort(groundItem.getGlobalPosition().getX())
                .putShort(groundItem.getGlobalPosition().getY())
                .putShort(groundItem.getId())
                .send();
    }

    public int getGroundItemCountOnCurrentPos(int id) {
        return getGroundItemsFromCurrentPos(id).size();
    }

    public void takeGroundItemFromCurrentPos(int id) {
        var groundItems = getGroundItemsFromCurrentPos(id);
        if (groundItems.size() == 0) {
            return;
        }

        takeGroundItem(groundItems.get(0));
    }

    private List<RSGroundItem> getGroundItemsFromCurrentPos(int id) {
        return mudClientWrapper.getGroundItemList()
            .stream()
            .filter(it -> it.getId() == id &&
                          it.getGlobalPosition().equals(mudClientWrapper.getUser().getGlobalPosition()))
            .collect(Collectors.toList());
    }

    private RSGroundItem getGroundItemById(int...ids) {

        var groundItems = mudClientWrapper.getGroundItemList()
                .stream()
                .filter(it -> Arrays.stream(ids).anyMatch(id -> id == it.getId()))
                .collect(Collectors.toList());

        if (groundItems.isEmpty())
            return null;

        return (RSGroundItem) mudClientWrapper.getUser().getNearest(groundItems);
    }
}
