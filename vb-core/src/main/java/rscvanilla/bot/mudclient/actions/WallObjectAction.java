package rscvanilla.bot.mudclient.actions;

import rscvanilla.bot.mudclient.enums.OpCodeOut;
import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.mudclient.models.wrappers.RSWallObject;
import rscvanilla.bot.mudclient.MudClientWrapper;

import javax.inject.Inject;
import java.util.Objects;
import java.util.stream.Collectors;

public class WallObjectAction extends BaseAction {

    private final WalkAction walkAction;

    @Inject
    public WallObjectAction(MudClientWrapper hooker, WalkAction walkAction) {
        super(hooker);
        this.walkAction = walkAction;
    }

    public void atWallObject(int id, Position pos) {
        atWallObject(id, pos.getX(), pos.getY());
    }

    public void atWallObject(int id, int x, int y) {
        var wallObject = getWallObject(id, x, y);
        if (wallObject == null)
            return;

        atWallObjectWalkTo(wallObject);
    }

    private void atWallObjectWalkTo(RSWallObject object) {
        var localPosition = object.getLocalPosition();
        var globalPosition = object.getGlobalPosition();

        // TODO: Figure out what the dir parameter is
        walkAction.walkToWallObject(localPosition.getX(), localPosition.getY(), object.getDirection());

        mudClientWrapper.getPacketBuilder()
                .setOpCode(OpCodeOut.WALL_COMMAND1)
                .putShort(globalPosition.getX())
                .putShort(globalPosition.getY())
                .putByte(object.getDirection())
                .send();
    }

    public boolean isWallObjectNear(int id, Position pos) {
        return isWallObjectNear(id, pos.getX(), pos.getY());
    }
    public boolean isWallObjectNear(int id, int globalX, int globalY) {
        return getWallObject(id, globalX, globalY) != null;
    }

    private RSWallObject getWallObject(int id, int x, int y) {
        var matchedWallObjects = mudClientWrapper.getWallObjectList()
                .stream()
                .filter(Objects::nonNull)
                .filter(it -> id == it.getId() && it.getGlobalPosition().getX() == x && it.getGlobalPosition().getY() == y)
                .collect(Collectors.toList());

        if (matchedWallObjects.isEmpty())
            return null;

        return (RSWallObject) mudClientWrapper.getLocalPlayer().getNearest(matchedWallObjects);
    }
}
