package rscvanilla.bot.mudclient.wrappers.entities;

import java.util.Arrays;

public enum CharacterDirection {
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

    CharacterDirection(int id) {
        this.id = id;
    }

    public static CharacterDirection of(int id) {
        return Arrays.stream(CharacterDirection.values()).filter(it -> it.id == id).findFirst().orElseThrow();
    }
}
