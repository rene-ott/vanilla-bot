package rscvanilla.bot.api.enums;

public enum OpCodeIn {
    FALL_ASLEEP(117),
    INCORRECT_SLEEP_WORD(194);

    private final int id;

    OpCodeIn(int id) {
        this.id = id;
    }

    public int id() {
        return id;
    }
}
