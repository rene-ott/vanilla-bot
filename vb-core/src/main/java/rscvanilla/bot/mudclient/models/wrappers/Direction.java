package rscvanilla.bot.mudclient.models.wrappers;

import java.util.Arrays;

public enum Direction {
    NORTH(0),
    NORTH_WEST(1),
    WEST(2),
    SOUTH_WEST(3),
    SOUTH(4),
    SOUTH_EAST(5),
    EAST(6),
    NORTH_EAST(7),
    COMBAT1(8),
    COMBAT2(9);

    private final int id;

    Direction(int id) {
        this.id = id;
    }

    public static Direction of(int id) {
        return Arrays.stream(Direction.values()).filter(it -> it.id == id).findFirst().orElseThrow();
    }
}
