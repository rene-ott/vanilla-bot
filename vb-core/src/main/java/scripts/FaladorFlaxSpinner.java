package scripts;

import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.script.ScriptDependencyContext;
import rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import rscvanilla.bot.script.template.RunnableScript;

public class FaladorFlaxSpinner extends RunnableScript {

    private final static int FLAX_ID = 675;
    private final static int BOW_STRING = 676;

    private final static int BED = 15;
    private final static int SPINNING_WHEEL = 121;

    private final static Position BED_POS = new Position(298, 579);
    private final static Position SPINNING_WHEEL_POS = new Position(295, 579);

    private final static Position BANK_TOP_POS = new Position(286, 564);
    private final static Position BANK_BOTTOM_POS = new Position(280, 573);
    private final static int BANK_DOOR_CLOSED = 64;

    private final static Position HOUSE_TOP_POS = new Position(299, 577);
    private final static Position HOUSE_BOTTOM_POS = new Position(295, 580);
    private final static int HOUSE_DOOR_CLOSED = 2;

    private State action;

    public FaladorFlaxSpinner(ScriptDependencyContext dependencyContext, ScriptAntiBanParams antiBanParameters) {
        super(dependencyContext, antiBanParameters);
    }

    @Override
    protected void loop() {
        waitFor(500);

        var newState = getAction();
        if (newState != this.action) {
            print("STATE: " + this.action + " -> " + newState);
        }



        this.action = newState;

        switch (action) {
            case WALK_TO_SPIN -> walkToSpin();
            case SPIN -> spin();
            case WALK_TO_BANK -> walkToBank();
            case SLEEP -> sleep();
            case BANK -> bankItems();
            default -> throw new IllegalStateException();
        }

    }

    private State getAction() {
        if (isInHouse()) {
            if (getFatigue() > 90) {
                return State.SLEEP;
            }
            else if (isItemInInventory(FLAX_ID)) {
                return State.SPIN;
            }
            else {
                return State.WALK_TO_BANK;
            }

        }
        else if (isInBank()) {
            if (isInventoryFullOfStrings() || !isInventoryFull()) {
                return State.BANK;
            }
            else {
                return State.WALK_TO_SPIN;
            }
        }
        else {
            if (isInventoryFullOfStrings()) {
                return State.WALK_TO_BANK;
            }
            else if (isInventoryFullOfFlax()) {
                return State.WALK_TO_SPIN;
            }
            else {
                return State.WALK_TO_BANK;
            }
        }

    }

    private void walkToSpin() {
        walkToTile(286, 572);

        if (isBankDoorClosed()) {
            openBankDoor();
            return;
        }

        walkToTile(297, 576);

        if (isInFrontOfSpinningHouse()) {
            if (isDoorClosed()) {
                openDoor();
            } else {
                walkToTile(296,579);
            }
        }

    }

    private void walkToBank() {

        if (isInHouse()) {
            if (isDoorClosed()) {
                openDoor();
                return;
            }
        }

        walkToTile(287, 572);

        if (isInFrontOfBank() && isBankDoorClosed()) {
            openBankDoor();
            return;
        }

        walkToTile(285, 572);
    }

    private void sleep() {
        atGroundObject(BED, BED_POS);
        waitFor(4000);
    }

    private void bankItems() {
        if (isBankWindowVisible()) {
            depositAllBankItems(BOW_STRING);
            withdrawBankItem(FLAX_ID, 30);
            waitFor(200);
            return;
        }

        if (isOptionsMenuVisible()) {
            selectOptionsMenuAnswer(0);
            waitFor(5000);
            return;
        }

        talkToNpc(95);
        waitFor(2000);
    }

    private void spin() {
        if (isItemInInventory(FLAX_ID)) {
            useInventoryItemOnGroundObject(FLAX_ID, SPINNING_WHEEL);
        }
    }

    private boolean isInHouse() {
        return isCurrentPosInRectangle(HOUSE_TOP_POS, HOUSE_BOTTOM_POS);
    }

    private boolean isInBank() {
        return isCurrentPosInRectangle(BANK_TOP_POS, BANK_BOTTOM_POS);
    }

    private void openDoor() {
        atWallObject(2, 297, 577);
    }

    private boolean isDoorClosed() {
        return isWallObjectReachable(2, 297, 577);
    }

    public boolean isInFrontOfSpinningHouse() {
        return isPosInDistanceOfCurrentPos(297, 576, 0);
    }

    public boolean isInventoryFullOfStrings() {
        return isItemInInventory(BOW_STRING, 30);
    }

    public boolean isInventoryFullOfFlax() {
        return isItemInInventory(FLAX_ID, 30);
    }

    private boolean isInFrontOfBank() {
        return getCurrentPos().equals(new Position(287, 572)) || getCurrentPos().equals(new Position(287, 571));
    }

    private boolean isBankDoorClosed() {
        return isGroundObjectReachable(64, new Position(287, 571));
    }

    private void openBankDoor() {
        atGroundObject(64, 287, 571);
    }

    @Override
    protected void onChatMessageReceived(String sender, String message) { }

    @Override
    protected void onGameMessageReceived(String message) { }

    private enum State {
        WALK_TO_SPIN,
        SPIN,
        SLEEP,
        WALK_TO_BANK,
        BANK
    }
}
