package rscvanilla.bot.api.contracts;

import rscvanilla.bot.api.models.Position;

import java.util.List;

public interface Positionable {
    Position getLocalPosition();
    Position getGlobalPosition();

    default Positionable getNearest(List<? extends Positionable> toObjects) {
        var fromPosition = this.getGlobalPosition();

        var selectedObject = toObjects.get(0);
        var selectedDistance = fromPosition.distanceTo(selectedObject.getGlobalPosition());

        for (var object : toObjects) {
            var distanceFromObject = fromPosition.distanceTo(object.getGlobalPosition());
            if (distanceFromObject < selectedDistance) {
                selectedDistance = distanceFromObject;
                selectedObject = object;
            }
        }

        return selectedObject;
    }

    default boolean isDistanceLessThanEqual(Positionable positionable, int distance) {
        return this.getGlobalPosition().distanceTo(positionable.getGlobalPosition()) <= distance;
    }
}
