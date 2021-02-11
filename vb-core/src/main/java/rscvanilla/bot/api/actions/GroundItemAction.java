package rscvanilla.bot.api.actions;

import rscvanilla.bot.api.enums.OpCodeOut;
import rscvanilla.bot.api.models.wrappers.RSGroundItem;
import rscvanilla.bot.mc.MudClientWrapper;

import javax.inject.Inject;
import java.util.Arrays;
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
        var playerLocalPosition = hooker.getUser().getLocalPosition();

        walkAction.walkToGroundItem(itemLocalPositionX, itemLocalPositionY, true);
        if (playerLocalPosition.getX() == itemLocalPositionX && playerLocalPosition.getY() == itemLocalPositionY) {

            hooker.getPacketBuilder()
                    .setOpCode(OpCodeOut.TAKE_ITEM_FROM_GROUND)
                    .putShort(groundItem.getGlobalPosition().getX())
                    .putShort(groundItem.getGlobalPosition().getY())
                    .putShort(groundItem.getId())
                    .send();
        }
    }

    private RSGroundItem getGroundItemById(int...ids) {

        var groundItems = hooker.getGroundItemList()
                .stream()
                .filter(Objects::nonNull)
                .filter(it -> Arrays.stream(ids).anyMatch(id -> id == it.getId()))
                .collect(Collectors.toList());

        if (groundItems.isEmpty())
            return null;

        return (RSGroundItem) hooker.getUser().getNearest(groundItems);
    }
}
