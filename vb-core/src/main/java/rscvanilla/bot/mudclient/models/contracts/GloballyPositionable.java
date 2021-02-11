package rscvanilla.bot.api.models.contracts;

import rscvanilla.bot.api.models.Position;

import java.util.List;

public interface GloballyPositionable {
    Position getGlobalPosition();

    default GloballyPositionable getNearest(List<? extends GloballyPositionable> toObjects) {
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

    default boolean isDistanceLessThanEqual(GloballyPositionable globallyPositionable, int distance) {
        return this.getGlobalPosition().distanceTo(globallyPositionable.getGlobalPosition()) <= distance;
    }
}
