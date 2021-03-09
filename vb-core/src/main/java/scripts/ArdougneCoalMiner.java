package scripts;

import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.script.ScriptDependencyContext;
import rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import rscvanilla.bot.script.template.RunnableScript;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


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
        return isPositionInDistance(MINE, 15);
    }

    private boolean isInBank() {
        return isPositionInRectangle(getPosition(), BANK_TOP_POS, BANK_BOTTOM_POS);
    }

    private void walkToBank() {
        walkTo(524, 584);
        walkTo(534, 597);
        walkTo(546, 603);
        walkTo(550, 612);

        if (isBankDoorClosed()) {
            print("W2M: Bank door is closed!");
            if (isAtBankDoor()) {
                atObject(BANK_DOOR_ID, BANK_DOOR_POS);
            } else {
                walkTo(550, 612);
            }
            return;
        }

        walkTo(551, 613);
    }

    private boolean isBankDoorClosed() {
        return isObjectNear(BANK_DOOR_ID, BANK_DOOR_POS);
    }

    private boolean isAtBankDoor() {
        return isPositionInDistance(new Position(219, 633), 0);
    }

    private void walkToMine() {
        if (isInBank() && isBankDoorClosed()) {
            print("W2B: Bank door is closed!");
            atObject(BANK_DOOR_ID, BANK_DOOR_POS);
            return;
        }

        walkTo(547, 604);
        walkTo(531, 596);
        walkTo(522, 576);
    }

    private void bankOres() {
        if (isBankWindowVisible()) {
            depositOresAndGems();
            waitFor(300);
            return;
        }

        if (isOptionsMenuVisible()) {
            answerOption(0);
            waitFor(5000);
            return;
        }

        talkToNpc(95);
        waitFor(2000);
    }

    private void depositOresAndGems() {
        depositAll(GEM_IDS);
    }

    private boolean isInventoryEmpty() {
        return !isItemInInventory(COAL_ORE_ID);
    }

    private void mineRock() {
        if (isBusy()) {
            return;
        }

        atObject(COAL_ROCK_ID, COAL_ROCK2_ID);
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

