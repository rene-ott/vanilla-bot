package scripts;

import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.script.ScriptDependencyContext;
import rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import rscvanilla.bot.script.template.RunnableScript;


public class ArdougneCoalMiner extends RunnableScript {

    private final static int COAL_ORE_ID = 155;

    private static final int[] GEM_IDS = { 157, 158, 159, 160, COAL_ORE_ID };

    private final static int COAL_ROCK_ID = 110;
    private final static int COAL_ROCK2_ID = 111;

    private final static Position MINE = new Position(520, 572);

    private final static Position BANK_TOP_POS = new Position(554, 616);
    private final static Position BANK_BOTTOM_POS = new Position(551, 609);

    private final static int BANK_DOOR_ID = 64;
    private final static Position BANK_DOOR_POS = new Position(550, 612);

    public ArdougneCoalMiner(ScriptDependencyContext dependencyContext, ScriptAntiBanParams argumentContext) {
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
            case MINE -> mineRock();
            case WALK_TO_BANK -> walkToBank();
            case BANK -> bankOres();
            case WALK_TO_MINE -> walkToMine();
            default -> throw new IllegalStateException();
        }
    }

    private Action getAction() {

        if (isAtMine()) {
            if (!isInventoryFull()) {
                return Action.MINE;
            } else {
                return Action.WALK_TO_BANK;
            }
        } else if (isInBank()) {
            if (isInventoryEmpty()) {
                return Action.WALK_TO_MINE;
            } else {
                return Action.BANK;
            }
        } else {
            if (isInventoryEmpty()) {
                return Action.WALK_TO_MINE;
            } else {
                return Action.WALK_TO_BANK;
            }
        }
    }

    private boolean isAtMine() {
        return isPosInDistanceOfCurrentPos(MINE, 15);
    }

    private boolean isInBank() {
        return isCurrentPosInRectangle(BANK_TOP_POS, BANK_BOTTOM_POS);
    }

    private void walkToBank() {
        walkToTile(524, 584);
        walkToTile(534, 597);
        walkToTile(546, 603);
        walkToTile(550, 612);

        if (isBankDoorClosed()) {
            print("W2M: Bank door is closed!");
            if (isAtBankDoor()) {
                atGroundObject(BANK_DOOR_ID, BANK_DOOR_POS);
            } else {
                walkToTile(550, 612);
            }
            return;
        }

        walkToTile(551, 613);
    }

    private boolean isBankDoorClosed() {
        return isGroundObjectReachable(BANK_DOOR_ID, BANK_DOOR_POS);
    }

    private boolean isAtBankDoor() {
        return isPosInDistanceOfCurrentPos(new Position(219, 633), 0);
    }

    private void walkToMine() {
        if (isInBank() && isBankDoorClosed()) {
            print("W2B: Bank door is closed!");
            atGroundObject(BANK_DOOR_ID, BANK_DOOR_POS);
            return;
        }

        walkToTile(547, 604);
        walkToTile(531, 596);
        walkToTile(522, 576);
    }

    private void bankOres() {
        if (isBankWindowVisible()) {
            depositOresAndGems();
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

    private void depositOresAndGems() {
        depositAllBankItems(GEM_IDS);
    }

    private boolean isInventoryEmpty() {
        return !isItemInInventory(COAL_ORE_ID);
    }

    private void mineRock() {
        if (isBusy()) {
            return;
        }

        atGroundObject(COAL_ROCK_ID, COAL_ROCK2_ID);
    }

    private enum Action {
        MINE,
        WALK_TO_BANK,
        BANK,
        WALK_TO_MINE
    }


    @Override
    protected void onChatMessageReceived(String sender, String message) { }

    @Override
    protected void onGameMessageReceived(String message) { }
}

