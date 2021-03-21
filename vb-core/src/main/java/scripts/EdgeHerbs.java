package scripts;

import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.script.ScriptDependencyContext;
import rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import rscvanilla.bot.script.template.RunnableScript;

import javax.swing.*;

public class EdgeHerbs extends RunnableScript {

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

    private final static int[] ITEMS = new int[] {
            42, // Law rune
            33, // Air rune
            35, // Mind rune
            40, // Nature rune
            34, // Earth rune
            469, // Snape grass
            10, // Coins
            165, // Guam,
            437, // Harralander
            438, // Ranarr weed
            439, // Irit leaf
            440, // Avantoe
            441, // Kwuarm
            442, // Cadantine
            443, // Dwarf Weed
            160, // Uncut sapphire
            159, // Uncut emerald
            158, // Uncut ruby
            157, // Uncut diamond
            526, // Half of a key
            527, // Half of a key
            1277 // Half dragon square
    };

    private int combatStyle;

    private State action;


    public EdgeHerbs(ScriptDependencyContext dependencyContext, ScriptAntiBanParams argumentContext) {
        super(dependencyContext, argumentContext);
    }

    @Override
    protected void onStart() {
        super.onStart();
        combatStyle = Integer.parseInt(JOptionPane.showInputDialog(new JFrame("Chicken Killer"), "Enter fight mode (0-3): "));
    }

    @Override
    protected void loop() {
        waitFor(500);

        var newState = getScriptState();
        if (newState != this.action) {
            print("STATE: " + this.action + " -> " + newState);
        }

        if (getFatigue() > 90) {
            useSleepingBag();
            waitFor(4000);
            return;
        }

        action = newState;

        switch (action) {
            case KILL_DRUIDS -> killDruids();
            case WALK_TO_BANK -> walkToBank();
            case BANK -> bankItems();
            case WALK_TO_DRUIDS -> walkToDruids();
            default -> throw new IllegalStateException();
        }
    }

    private void bankItems() {
        print("BANKING ITEMS");
        if (isBankWindowVisible()) {
            depositAllBankItems(ITEMS);
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
        print("WALKING TO BANK");

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

    private void killDruids() {
        if (getCombatStyle() != combatStyle) {
            setCombatStyle(combatStyle);
        }

        if (isInCombat()) {
            return;
        }

        if (isItemOnGround(ITEMS)) {
            takeGroundItem(ITEMS);
            return;
        }

        attackNpc(270);
    }

    private void walkToDruids() {
        if (isInBank()) {
            if (isBankDoorClosed()) {
                print("W2B: Bank door is closed!");
                atGroundObject(BANK_DOOR_ID, BANK_DOOR_POS);
                return;
            }
        }

        walkToTile(218, 463);

        if (isInFrontOfDoorToDruids()) {
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

        if (isInFrontOfGate1ToDruids() && isGate1Closed()) {
            atGroundObject(GATE_1_ID, GATE_1_POS);
            return;
        }

        if (isInFrontOfGate2ToDruids()) {
            atGroundObject(GATE_2_ID, GATE_2_POS);
            return;
        }

        walkToTile(216, 3284);
        walkToTile(213, 3273);
        walkToTile(212, 3253);
        walkToTile(196, 3270);
    }

    private boolean isAtDruids() {
        return isCurrentPosInRectangle(new Position(203, 3257), new Position(219, 3241));
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

    private boolean isInFrontOfGate2ToDruids() {
        return isCurrentPosInRectangle(new Position(199, 3266), new Position(194, 3277));
    }

    private boolean isInFrontOfGate2ToBank() {
        return isCurrentPosInRectangle(new Position(196, 3265), new Position(197, 3264));
    }

    private boolean isInFrontOfGate1ToBank() {
        return isCurrentPosInRectangle(new Position(210, 3273), new Position(209, 3272));
    }

    private boolean isInFrontOfGate1ToDruids() {
        return isCurrentPosInRectangle(new Position(218, 3270), new Position(211, 3276));
    }

    private boolean isInFrontOfDoorToDruids() {
        return isCurrentPosInRectangle(new Position(216, 464), new Position(218, 462));
    }

    private boolean isDoorClosed() {
        return isWallObjectReachable(HOUSE_DOOR_ID, HOUSE_DOOR_POS);
    }

    private boolean isInHouse() {
        return isCurrentPosInRectangle(HOUSE_TOP_POS, HOUSE_BOTTOM_POS);
    }

    private State getScriptState() {
        if (isAtDruids()) {
            if (!isInventoryFull()) {
                return State.KILL_DRUIDS;
            } else {
                return State.WALK_TO_BANK;
            }
        } else if (isInBank()) {
            if (isInventoryEmpty()) {
                return State.WALK_TO_DRUIDS;
            } else {
                return State.BANK;
            }
        } else {
            if (isInventoryEmpty()) {
                return State.WALK_TO_DRUIDS;
            } else {
                return State.WALK_TO_BANK;
            }
        }
    }

    private boolean isInventoryEmpty() {
     return !isItemInInventory(ITEMS);
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
        WALK_TO_DRUIDS,
        KILL_DRUIDS,
        WALK_TO_BANK,
        BANK
    }
}

