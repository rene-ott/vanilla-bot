package rscvanilla.bot.mudclient.models.wrappers;

import java.util.Arrays;

public enum RSCharacterDirection {
    NORTH(0),
    NORTH_WEST(1),
    WEST(2),
    SOUTH_WEST(3),
    SOUTH(4),
    SOUTH_EAST(5),
    EAST(6),
    NORTH_EAST(7),
    COMBAT_A(8),
    COMBAT_B(9);

    private final int id;

    RSCharacterDirection(int id) {
        this.id = id;
    }

    public static RSCharacterDirection of(int id) {
        return Arrays.stream(RSCharacterDirection.values()).filter(it -> it.id == id).findFirst().orElseThrow();
    }
}
