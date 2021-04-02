package rscvanilla.bot.mudclient.enums;

public enum OpCodeOut {
    COMBAT_STYLE(29),
    NPC_ATTACK1(190),
    NPC_COMMAND1(202),
    TAKE_ITEM_FROM_GROUND(247),
    USE_ITEM(90),
    USE_ITEM_ON_OBJECT(115),
    SEND_SLEEP_ANSWER(45),
    OBJECT_COMMAND1(136),
    OBJECT_COMMAND2(79),
    NPC_TALK_TO(153),
    ANSWER(116),
    BANK_CLOSE(212),
    BANK_WITHDRAW(22),
    NPC_CAST_SPELL(50),
    BANK_DEPOSIT(23),
    WALL_COMMAND1(14),
    WALL_COMMAND2(127),
    DROP_ITEM(246),
    BUY_ITEM(236),
    SELL_ITEM(221),
    USE_ITEM_ON_ITEM(91),
    USE_INVENTORY_ITEM_ON_GROUND_ITEM(53);

    private final int id;

    OpCodeOut(int id) {
        this.id = id;
    }

    public int id() {
        return id;
    }
}
