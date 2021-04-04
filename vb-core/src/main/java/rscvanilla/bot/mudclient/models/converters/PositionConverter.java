package rscvanilla.bot.mudclient.models.converters;

import rscvanilla.bot.mudclient.models.Position;

public class PositionConverter {
    public static Position toLocalPosition(Position globalPosition, Position midRegionBase) {
        return new Position(globalPosition.getX() - midRegionBase.getX(), globalPosition.getY() - midRegionBase.getY());
    }

    public static Position toGlobalPosition(Position localPosition, Position midRegionBase) {
        return new Position(localPosition.getX() + midRegionBase.getX(), localPosition.getY() + midRegionBase.getY());
    }
}
