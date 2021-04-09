package scripts;

import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.script.ScriptDependencyContext;
import rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import rscvanilla.bot.script.template.RunnableScript;

import javax.swing.*;

public class EdgeSpiderEggs extends RunnableScript {

    private final static Position BANK_TOP_POS = new Position(212, 453);
    private final static Position BANK_BOTTOM_POS = new Position(220, 448);

    private final static int BANK_DOOR_ID = 64;
    private final static Position BANK_DOOR_POS = new Position(217, 447);

    private final static Position HOUSE_TOP_POS = new Position(218, 465);
    private final static Position HOUSE_BOTTOM_POS = new Position(214, 469);

    private final static int HOUSE_DOOR_ID = 2;
    private final static Position HOUSE_DOOR_POS = new Position(218, 465);

    private final static int LADDER_DOWN_ID = 6;
    private final static Position LADDER_DOWN_POS = new Position(215, 468);

    private final static int LADDER_UP_ID = 5;
    private final static Position LADDER_UP_POS = new Position(215, 3300);

    private final static int GATE_1_ID = 57;
    private final static Position GATE_1_POS = new Position(211, 3272);

    private final static int GATE_2_ID = 305;
    private final static Position GATE_2_POS = new Position(196, 3266);

    private final static Position EGGS_AREA_TOP_POS = new Position(210, 3230);
    private final static Position EGGS_AREA_BOTTOM_POS = new Position(197, 3243);

    private final static int RED_SPIDER_EGGS = 219;

    private int combatStyle;

    public EdgeSpiderEggs(ScriptDependencyContext dependencyContext, ScriptAntiBanParams argumentContext) {
        super(dependencyContext, argumentContext);
    }

    @Override
    protected void onStart() {
        super.onStart();
        combatStyle = Integer.parseInt(JOptionPane.showInputDialog(new JFrame("Edge Spider Eggs"), "Enter fight mode (0-3): "));
    }

    @Override
    protected void loop() {
        waitFor(500);

        var newState = getScriptState();

        if (getFatigue() > 90) {
            useSleepingBag();
            waitFor(4000);
            return;
        }

        switch (newState) {
            case PICK_UP_EGGS -> pickUpEggs();
            case WALK_TO_BANK -> walkToBank();
            case BANK -> bankItems();
            case WALK_TO_EGGS -> walkToEggs();
            default -> throw new IllegalStateException();
        }
    }

    private void bankItems() {
        if (isBankWindowVisible()) {
            depositAllBankItems(RED_SPIDER_EGGS);
            waitFor(300);
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

    private void walkToBank() {
        walkToTile(198, 3248);
        walkToTile(196, 3265);
        if (isInFrontOfGate2ToBank()) {
            atGroundObject(GATE_2_ID, GATE_2_POS);
            return;
        }

        walkToTile(210, 3273);
        if (isInFrontOfGate1ToBank() && isGate1Closed()) {
            atGroundObject(GATE_1_ID, GATE_1_POS);
            return;
        }

        walkToTile(215, 3297);

        if (isInFrontUpLadder()) {
            atGroundObject(LADDER_UP_ID, LADDER_UP_POS);
            return;
        }

        if (isInHouse() && isDoorClosed()) {
            atWallObject(HOUSE_DOOR_ID, HOUSE_DOOR_POS);
            return;
        }

        walkToTile(217, 447);

        if (isInFrontOfBank() && isBankDoorClosed()) {
            atGroundObject(BANK_DOOR_ID, BANK_DOOR_POS);
            return;
        }

        walkToTile(216, 451);
    }

    private void pickUpEggs() {
        if (getCombatStyle() != combatStyle) {
            setCombatStyle(combatStyle);
        }

        if (isItemOnGroundInRectangleArea(EGGS_AREA_TOP_POS, EGGS_AREA_BOTTOM_POS, RED_SPIDER_EGGS)) {
            if (isInCombat()){
                walkToTile(getCurrentPos());
                return;
            }

            takeGroundItemFromRectangleArea(EGGS_AREA_TOP_POS, EGGS_AREA_BOTTOM_POS, RED_SPIDER_EGGS);
        }
    }

    private void walkToEggs() {
        if (isInBank()) {
            if (isBankDoorClosed()) {
                print("W2B: Bank door is closed!");
                atGroundObject(BANK_DOOR_ID, BANK_DOOR_POS);
                return;
            }
        }

        walkToTile(218, 463);

        if (isInFrontOfDoorToEggs()) {
            if (isDoorClosed()) {
                print("W2B: Door is closed!");
                atWallObject(HOUSE_DOOR_ID, HOUSE_DOOR_POS);
                return;
            }
        }

        walkToTile(217, 467);

        if (isInHouse()) {
            atGroundObject(LADDER_DOWN_ID, LADDER_DOWN_POS);
            return;
        }

        if (isInFrontOfGate1ToEggs() && isGate1Closed()) {
            atGroundObject(GATE_1_ID, GATE_1_POS);
            return;
        }

        if (isInFrontOfGate2ToEggs()) {
            atGroundObject(GATE_2_ID, GATE_2_POS);
            return;
        }

        walkToTile(216, 3284);
        walkToTile(213, 3273);
        walkToTile(196, 3271);
        walkToTile(198, 3252);
        walkToTile(204, 3237);
    }

    private boolean isAtEggs() {
        return isCurrentPosInRectangle(EGGS_AREA_TOP_POS, EGGS_AREA_BOTTOM_POS);
    }

    private boolean isInFrontOfBank() {
        return getCurrentPos().equals(new Position(217, 447)) || getCurrentPos().equals(new Position(218, 447));
    }

    private boolean isInFrontUpLadder() {
        return isCurrentPosInRectangle(new Position(214, 3295), new Position(216, 3301));
    }

    private boolean isGate1Closed() {
        return isGroundObjectReachable(GATE_1_ID, GATE_1_POS);
    }

    private boolean isInFrontOfGate2ToEggs() {
        return isCurrentPosInRectangle(new Position(199, 3266), new Position(194, 3277));
    }

    private boolean isInFrontOfGate2ToBank() {
        return isCurrentPosInRectangle(new Position(196, 3265), new Position(197, 3264));
    }

    private boolean isInFrontOfGate1ToBank() {
        return isCurrentPosInRectangle(new Position(210, 3273), new Position(209, 3272));
    }

    private boolean isInFrontOfGate1ToEggs() {
        return isCurrentPosInRectangle(new Position(218, 3270), new Position(211, 3276));
    }

    private boolean isInFrontOfDoorToEggs() {
        return isCurrentPosInRectangle(new Position(216, 464), new Position(218, 462));
    }

    private boolean isDoorClosed() {
        return isWallObjectReachable(HOUSE_DOOR_ID, HOUSE_DOOR_POS);
    }

    private boolean isInHouse() {
        return isCurrentPosInRectangle(HOUSE_TOP_POS, HOUSE_BOTTOM_POS);
    }

    private State getScriptState() {
        if (isAtEggs()) {
            if (!isInventoryFull()) {
                return State.PICK_UP_EGGS;
            } else {
                return State.WALK_TO_BANK;
            }
        } else if (isInBank()) {
            if (isInventoryEmpty()) {
                return State.WALK_TO_EGGS;
            } else {
                return State.BANK;
            }
        } else {
            if (isInventoryEmpty()) {
                return State.WALK_TO_EGGS;
            } else {
                return State.WALK_TO_BANK;
            }
        }
    }

    private boolean isInventoryEmpty() {
     return !isItemInInventory(RED_SPIDER_EGGS);
    }

    private boolean isInBank() {
        return isCurrentPosInRectangle(BANK_TOP_POS, BANK_BOTTOM_POS);
    }

    private boolean isBankDoorClosed() {
        return isGroundObjectReachable(BANK_DOOR_ID, BANK_DOOR_POS);
    }

    @Override
    public void onChatMessageReceived(String sender, String message) { }

    @Override
    public void onGameMessageReceived(String message) { }

    private enum State {
        WALK_TO_EGGS,
        PICK_UP_EGGS,
        WALK_TO_BANK,
        BANK
    }
}

