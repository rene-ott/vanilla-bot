package rscvanilla.bot.mudclient.actions;

import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.mudclient.utils.PositionConverter;
import rscvanilla.bot.mudclient.MudClientWrapper;

import javax.inject.Inject;

public class WalkAction extends BaseAction {

    @Inject
    public WalkAction(MudClientWrapper hooks) {
        super(hooks);
    }

    public void walkToPosition(Position tilePos) {
        var playerLocalPosition = mudClientWrapper.getLocalPlayer().getLocalPosition();
        var destLocalPosition = PositionConverter.toLocalPosition(tilePos, mudClientWrapper.getMidRegionBase());

        var srcX = playerLocalPosition.getX();
        var srcY = playerLocalPosition.getY();

        var destX = destLocalPosition.getX();
        var destY = destLocalPosition.getY();

       mudClientWrapper.walkToArea(srcX, srcY, destX, destY, destX, destY, false, false);
    }

    public void walkToAction(Position tilePosition) {
        var playerLocalPosition = mudClientWrapper.getLocalPlayer().getLocalPosition();
        var destLocalPosition = PositionConverter.toLocalPosition(tilePosition, mudClientWrapper.getMidRegionBase());

        walkToAction(playerLocalPosition.getX(), playerLocalPosition.getY(), destLocalPosition.getX(), destLocalPosition.getY(), false);
    }

    private void walkToAction(int startX, int startZ, int x1, int y1, boolean walkToEntity) {
        mudClientWrapper.walkToArea(startX, startZ, x1, y1, x1, y1, false, walkToEntity);
    }

    public void walkToGroundItem(int destX, int destZ, boolean var5) {
        var playerLocalPosition = mudClientWrapper.getLocalPlayer().getLocalPosition();
        walkToGroundItem(playerLocalPosition.getX(), playerLocalPosition.getY(), destX, destZ, var5);
    }

    public void walkToObject(int destX, int destZ, int dir, int objectId) {
        mudClientWrapper.walkToObject(destX, destZ, dir, objectId);
    }

    public void walkToWallObject(int x, int y, int dir) {
        mudClientWrapper.walkToWall(x, y, dir);
    }

    private void walkToGroundItem(int startX, int startZ, int destX, int destZ, boolean var5) {
        if (!mudClientWrapper.sendWalkToGroundItem(startX, startZ, destX, destX, destZ, destZ, var5)) {
            mudClientWrapper.walkToArea(startX, startZ, destX, destZ, destX, destZ, true, var5);
        }
    }
}