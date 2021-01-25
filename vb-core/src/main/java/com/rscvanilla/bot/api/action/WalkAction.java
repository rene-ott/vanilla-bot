package com.rscvanilla.bot.api.action;

import com.rscvanilla.bot.api.BaseAction;
import com.rscvanilla.bot.api.models.Position;
import com.rscvanilla.bot.api.utils.PositionConverter;
import com.rscvanilla.bot.mc.MudClientHooker;

import javax.inject.Inject;

public class WalkAction extends BaseAction {

    @Inject
    public WalkAction(MudClientHooker hooks) {
        super(hooks);
    }

    public void walkToPosition(Position tilePos) {
        var playerLocalPosition = hooker.getUser().getLocalPosition();
        var destLocalPosition = PositionConverter.toLocalPosition(tilePos, hooker.getMidRegionBase());

        var srcX = playerLocalPosition.getX();
        var srcY = playerLocalPosition.getY();

        var destX = destLocalPosition.getX();
        var destY = destLocalPosition.getY();

       hooker.walkToArea(srcX, srcY, destX, destY, destX, destY, false, false);
    }

    public void walkToAction(Position tilePosition) {
        var playerLocalPosition = hooker.getUser().getLocalPosition();
        var destLocalPosition = PositionConverter.toLocalPosition(tilePosition, hooker.getMidRegionBase());

        walkToAction(playerLocalPosition.getX(), playerLocalPosition.getY(), destLocalPosition.getX(), destLocalPosition.getY(), false);
    }

    private void walkToAction(int startX, int startZ, int x1, int y1, boolean walkToEntity) {
        hooker.walkToArea(startX, startZ, x1, y1, x1, y1, false, walkToEntity);
    }

    public void walkToGroundItem(int destX, int destZ, boolean var5) {
        var playerLocalPosition = hooker.getUser().getLocalPosition();
        walkToGroundItem(playerLocalPosition.getX(), playerLocalPosition.getY(), destX, destZ, var5);
    }

    public void walkToObject(int destX, int destZ, int dir, int objectId) {
        hooker.walkToObject(destX, destZ, dir, objectId);
    }

    public void walkToWallObject(int x, int y, int dir) {
        hooker.walkToWall(x, y, dir);
    }

    private void walkToGroundItem(int startX, int startZ, int destX, int destZ, boolean var5) {
        if (!hooker.sendWalkToGroundItem(startX, startZ, destX, destX, destZ, destZ, var5)) {
            hooker.walkToArea(startX, startZ, destX, destZ, destX, destZ, true, var5);
        }
    }
}