package rscvanilla.bot.api.action;

import rscvanilla.bot.api.BaseAction;
import rscvanilla.bot.api.models.Position;
import rscvanilla.bot.mc.MudClientHooker;

import javax.inject.Inject;
import java.util.ArrayList;

public class PositionAction extends BaseAction {

    @Inject
    public PositionAction(MudClientHooker hooks) {
        super(hooks);
    }

    public boolean isPositionInRectangle(Position tilePos, Position topTilePos, Position bottomTilePos) {
        var minX = Math.min(topTilePos.getX(), bottomTilePos.getX());
        var maxX = Math.max(topTilePos.getX(), bottomTilePos.getX());

        var minY = Math.min(topTilePos.getY(), bottomTilePos.getY());
        var maxY = Math.max(topTilePos.getY(), bottomTilePos.getY());

        var allTilePosInRect = new ArrayList<Position>();

        for (int x = minX; x <= maxX; x++) {
            for (int y = minY; y <= maxY; y++) {
                allTilePosInRect.add(new Position(x, y));
            }
        }

        return allTilePosInRect.stream().anyMatch(it ->  it.equals(tilePos));
    }


    public boolean isPositionInDistance(Position tileToPos, int distance) {
        return hooker.getUser().getGlobalPosition().distanceTo(tileToPos) <= distance;
    }

    public boolean isPositionInDistance(int x, int y, int distance) {
        return hooker.getUser().getGlobalPosition().distanceTo(new Position(x, y)) <= distance;
    }
}
