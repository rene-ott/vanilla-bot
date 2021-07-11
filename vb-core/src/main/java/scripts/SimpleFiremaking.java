package scripts;

import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.script.ScriptDependencyContext;
import rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import rscvanilla.bot.script.template.RunnableScript;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SimpleFiremaking extends RunnableScript {

    private static final int TINDERBOX = 166;
    private static final int LOGS = 14;
    private static final int[] TREE_IDS = {0, 1, 70};

    private static final int[][] MOVING_DIRECTIONS = {{0,1},{1,1},{1,0},{0,-1},{1,-1},{-1,-1},{-1,0},{-1,1}};

    private static final int FIRE = 97;
    private static final int FERN = 34;
    private static final int BULL_BUSHES = 36;
    private static final int FLOWERS_RED = 37;
    private static final int FLOWERS_BLUE = 285;
    private static final int MUSHROOM = 38;
    private static final int FUNGUS = 205;

    private static final int[] GROUND_DECORATIONS = new int[] {
            FIRE,
            FERN,
            BULL_BUSHES,
            FLOWERS_RED,
            FLOWERS_BLUE,
            MUSHROOM,
            FUNGUS
    };

    public SimpleFiremaking(ScriptDependencyContext dependencyContext, ScriptAntiBanParams antiBanParameters) {
        super(dependencyContext, antiBanParameters);
    }

    @Override
    protected void loop() {
        waitFor(500);

        if (getFatigue() > 90) {
            useSleepingBag();
            waitFor(3000);
            return;
        }

        var action = getAction();

        switch (action) {
            case LIGHT_FIRE -> lightFire();
            case DROP_LOGS -> dropLogs();
            case PICK_LOGS -> pickLogs();
            case MOVE_TO_SPOT -> moveToSpot();
            case CHOP_TREE -> chopTree();
            default -> throw new IllegalStateException();
        }

    }

    private Action getAction() {
        if (isItemOnGround(LOGS)) {
            if (isNothingBlockingOnGround()) {
                return Action.LIGHT_FIRE;
            }
            if (isSomethingBlockingOnGround(getCurrentPos())) {
                return Action.PICK_LOGS;
            }
        }
        if (isItemInInventory(LOGS)) {
            if (isItemOnGround(LOGS)) {
                if (isSomethingBlockingOnGround(getCurrentPos())) {
                    return Action.PICK_LOGS;
                }
                else if (isNothingBlockingOnGround()) {
                    return Action.LIGHT_FIRE;
                }
            }
            else if (isSpotGoodToDropLogs()) {
                return Action.DROP_LOGS;
            }
            else if (isSomethingBlockingOnGround(getCurrentPos())) {
                return Action.MOVE_TO_SPOT;
            }
        }
        return Action.CHOP_TREE;
    }

    private boolean isSpotGoodToDropLogs() {
            return isItemInInventory(LOGS) && isNothingBlockingOnGround();
    }

    private boolean isNothingBlockingOnGround() {
        return Arrays.stream(GROUND_DECORATIONS)
                .noneMatch(groundItem -> isGroundObjectReachable(groundItem, getCurrentPos()));
    }

    private boolean isSomethingBlockingOnGround(Position positionToCheck) {
        return Arrays.stream(GROUND_DECORATIONS)
                .anyMatch(groundItem -> isGroundObjectReachable(groundItem, positionToCheck));
    }

    private Position getNextPosition() {
        Position nextPos = getCurrentPos();
        Position curPos = getCurrentPos();
        List<int[]> positions = getDirections();
        while (nextPos.equals(getCurrentPos())) {
            for (int[] direction: positions) {
                Position positionToCheck =
                        new Position(curPos.getX() + direction[0], curPos.getY() + direction[1]);
                if (!isSomethingBlockingOnGround(positionToCheck)) {
                    nextPos = positionToCheck;
                }
            }
        }
        return nextPos;
    }

    private List<int[]> getDirections() {
        List<int[]> positions = new java.util.ArrayList<>(List.of(MOVING_DIRECTIONS));
        Collections.shuffle(positions);
        return positions;
    }

    private void moveToSpot() {
        walkToTile(getNextPosition());
    }

    private void dropLogs() {
        dropInventoryItem(LOGS);
        waitFor(500);
    }

    private void pickLogs() {
        takeGroundItemFromCurrentPos(LOGS);
        waitFor(300);
    }

    private void lightFire() {
        useInventoryItemOnGroundItem(TINDERBOX, LOGS);
    }

    private void chopTree() {
        atGroundObject(TREE_IDS);
        waitFor(200);
    }

    @Override
    protected void onChatMessageReceived(String sender, String message) {

    }

    @Override
    protected void onGameMessageReceived(String message) {

    }

    private enum Action {
        MOVE_TO_SPOT,
        DROP_LOGS,
        PICK_LOGS,
        LIGHT_FIRE,
        CHOP_TREE
    }
}

