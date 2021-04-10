package scripts;

import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.script.ScriptDependencyContext;
import rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import rscvanilla.bot.script.template.RunnableScript;

public class FaladorSnapeGrassPicker extends RunnableScript {

    private final static int SNAPE_GRASS_ID = 469;

    private final static Position BANK_TOP_POS = new Position(286, 564);
    private final static Position BANK_BOTTOM_POS = new Position(280, 573);

    private final static int BANK_DOOR_ID = 64;
    private final static Position BANK_DOOR_POS = new Position(287, 571);

    public FaladorSnapeGrassPicker(ScriptDependencyContext dependencyContext, ScriptAntiBanParams argumentContext) {
        super(dependencyContext, argumentContext);
    }

    @Override
    protected void loop() {
        waitFor(1000);

        if (getFatigue() > 90) {
            useSleepingBag();
            waitFor(4000);
            return;
        }

        var action = getAction();

        switch (action) {
            case PICK -> pickSnapeGrass();
            case WALK_TO_BANK -> walkToBank();
            case BANK -> bankSnapeGrass();
            case WALK_TO_PICK -> walkToPick();
            default -> throw new IllegalStateException();
        }
    }

    private Action getAction() {

        if (isAtSnapeGrassLocation()) {
            if (!isInventoryFull()) {
                return Action.PICK;
            } else {
                return Action.WALK_TO_BANK;
            }
        } else if (isInBank()) {
            if (isInventoryEmpty()) {
                return Action.WALK_TO_PICK;
            } else {
                return Action.BANK;
            }
        } else {
            if (isInventoryEmpty()) {
                return Action.WALK_TO_PICK;
            } else {
                return Action.WALK_TO_BANK;
            }
        }
    }

    private boolean isAtSnapeGrassLocation() {
        return isCurrentPosInRectangle(new Position(357, 619), new Position(367, 601));
    }

    private boolean isInBank() {
        return isCurrentPosInRectangle(BANK_TOP_POS, BANK_BOTTOM_POS);
    }

    private void walkToBank() {
        walkToTile(350, 621);

        walkToTile(334, 616);
        walkToTile(321, 606);
        walkToTile(309, 596);
        walkToTile(296, 586);
        walkToTile(292, 573);

        if (isBankDoorClosed()) {
            print("W2M: Bank door is closed!");
            if (isAtBankDoor()) {
                atGroundObject(BANK_DOOR_ID, BANK_DOOR_POS);
            } else {
                walkToTile(287, 571);
            }
            return;
        }

        walkToTile(284, 570);
    }

    private boolean isBankDoorClosed() {
        return isGroundObjectReachable(BANK_DOOR_ID, BANK_DOOR_POS);
    }

    private boolean isAtBankDoor() {
        return isPosInDistanceOfCurrentPos(new Position(287, 571), 0);
    }

    private void walkToPick() {
        if (isInBank() && isBankDoorClosed()) {
            print("W2B: Bank door is closed!");
            atGroundObject(BANK_DOOR_ID, BANK_DOOR_POS);
            return;
        }

        walkToTile(291, 586);
        walkToTile(300, 601);
        walkToTile(314, 615);
        walkToTile(331, 620);
        walkToTile(347, 620);
        walkToTile(359, 614);
    }

    private void bankSnapeGrass() {
        if (isBankWindowVisible()) {
            waitFor(300);
            depositAllBankItems(SNAPE_GRASS_ID);
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

    private boolean isInventoryEmpty() {
        return !isItemInInventory(SNAPE_GRASS_ID);
    }

    private void pickSnapeGrass() {
        if (isBusy()) {
            return;
        }

        takeGroundItem(SNAPE_GRASS_ID);
    }

    private enum Action {
        PICK,
        WALK_TO_BANK,
        BANK,
        WALK_TO_PICK
    }


    @Override
    protected void onChatMessageReceived(String sender, String message) { }

    @Override
    protected void onGameMessageReceived(String message) { }
}

