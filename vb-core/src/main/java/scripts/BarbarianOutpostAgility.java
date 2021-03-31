package scripts;

import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.script.ScriptDependencyContext;
import rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import rscvanilla.bot.script.template.RunnableScript;

public class BarbarianOutpostAgility extends RunnableScript {
    private final static Position ROPESWING = new Position(486, 556);
    private final static int ROPESWING_ID = 675;

    private final static Position FIRST_PIT_LADDER = new Position(490, 3389);
    private final static int LADDER_ID = 5;
    private final static int AFTER_LEDGE_LADDER_ID = 6;

    private final static Position LOG = new Position(487, 563);
    private final static Position LOG_FAIL = new Position(490, 561);
    private final static int LOG_ID = 676;

    private final static Position NET = new Position(495, 563);
    private final static int NET_ID = 677;

    private final static Position LEDGE = new Position(498, 1506);
    private final static int LEDGE_ID = 678;

    private final static Position WALL_ONE = new Position(497, 558);
    private final static int WALL_ONE_ID = 163;

    private final static Position WALL_TWO = new Position(495, 558);
    private final static int WALL_TWO_ID = 164;

    private final static Position BEGINNING_TOP = new Position(494, 553);
    private final static Position BEGINNING_BOTTOM = new Position(486, 559);

    private final static Position FIRST_PIT_TOP = new Position(487, 3388);
    private final static Position FIRST_PIT_BOTTOM = new Position(485, 3391);

    private final static Position AFTER_SWING_TOP = new Position(492, 560);
    private final static Position AFTER_SWING_BOTTOM = new Position(486, 567);

    private final static Position BEFORE_LOG_TOP = new Position(486, 562);
    private final static Position BEFORE_LOG_BOTTOM = new Position(488, 564);

    private final static Position BEFORE_NET_TOP = new Position(494, 562);
    private final static Position BEFORE_NET_BOTTOM = new Position(492, 564);

    private final static Position AFTER_NET_TOP = new Position(497, 1506);
    private final static Position AFTER_NET_BOTTOM = new Position(496, 1508);

    private final static Position AFTER_LEDGE_TOP = new Position(501, 1506);
    private final static Position AFTER_LEDGE_BOTTOM = new Position(500, 1508);

    private final static Position AFTER_LEDGE_LADDER = new Position(501, 1508);

    private final static Position BEFORE_FIRST_WALL_TOP = new Position(502, 556);
    private final static Position BEFORE_FIRST_WALL_BOTTOM = new Position(497, 560);

    private final static Position BEFORE_FIRST_WALL_SECOND_TOP = new Position(502, 560);
    private final static Position BEFORE_FIRST_WALL_SECOND_BOTTOM = new Position(500, 564);


    private boolean logFailed;

    public BarbarianOutpostAgility(ScriptDependencyContext dependencyContext, ScriptAntiBanParams antiBanParameters) {
        super(dependencyContext, antiBanParameters);
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
            case SWING -> swing();
            case ESCAPE_FIRST_PIT -> escapeFirstPit();
            case BALANCE_LOG -> balanceLog();
            case CLIMB_NET -> climbNet();
            case WALK_LEDGE -> walkLedge();
            case ESCAPE_SECOND_PIT -> escapeSecondPit();
            case CLIMB_DOWN -> climbDownLadder();
            case WALK_TO_FIRST_WALL -> walkToFirstWall();
            case JUMP_FIRST_WALL -> jumpFirstWall();
            case JUMP_SECOND_WALL -> jumpSecondWall();
            default -> throw new IllegalStateException();
        }

    }

    private Action getAction () {
        if (isCurrentPosInRectangle(BEGINNING_TOP, BEGINNING_BOTTOM)) {
            return Action.SWING;
        } else if (isCurrentPosInRectangle(FIRST_PIT_TOP, FIRST_PIT_BOTTOM)) {
            return Action.ESCAPE_FIRST_PIT;
        } else if (getCurrentPos().equals(LOG_FAIL)) {
            logFailed = true;
        } else if (isCurrentPosInRectangle(AFTER_SWING_TOP, AFTER_SWING_BOTTOM) && logFailed) {
            return Action.BALANCE_LOG;
        } else if (isCurrentPosInRectangle(BEFORE_NET_TOP, BEFORE_NET_BOTTOM) && !logFailed) {
            return Action.CLIMB_NET;
        } else if (isCurrentPosInRectangle(AFTER_NET_TOP, AFTER_NET_BOTTOM)) {
            return Action.WALK_LEDGE;
        } else if (isCurrentPosInRectangle(AFTER_LEDGE_TOP, AFTER_LEDGE_BOTTOM)) {
            return Action.CLIMB_DOWN;
        } else if (getCurrentPos().equals(WALL_ONE)) {
            return Action.JUMP_FIRST_WALL;
        } else if (getCurrentPos().equals(new Position(496,558))) {
            return Action.JUMP_SECOND_WALL;
        } else if (isCurrentPosInRectangle(BEFORE_FIRST_WALL_TOP,BEFORE_FIRST_WALL_BOTTOM) ||
                isCurrentPosInRectangle(BEFORE_FIRST_WALL_SECOND_TOP, BEFORE_FIRST_WALL_SECOND_BOTTOM)) {
            return Action.WALK_TO_FIRST_WALL;
        }
        return Action.BALANCE_LOG;
    }

    private void swing() {
        atGroundObject(ROPESWING_ID, ROPESWING);
    }

    private void escapeFirstPit() {
        atGroundObject(LADDER_ID, FIRST_PIT_LADDER);
    }

    private void balanceLog() {
        atGroundObject(LOG_ID, LOG);
        if (isCurrentPosInRectangle(BEFORE_LOG_TOP, BEFORE_LOG_BOTTOM)) {
            logFailed = false;
        }
    }

    private void climbNet() {
        atGroundObject(NET_ID, NET);
    }

    private void walkLedge() {
        atGroundObject(LEDGE_ID, LEDGE);
    }

    private void climbDownLadder() {
        atGroundObject(AFTER_LEDGE_LADDER_ID, AFTER_LEDGE_LADDER);
    }

    private void jumpFirstWall() {
        atWallObject(WALL_ONE_ID,WALL_ONE);
    }

    private void jumpSecondWall() {
        walkToTile(WALL_TWO);
        atWallObject(WALL_TWO_ID, WALL_TWO);
    }

    private void walkToFirstWall() {
        walkToTile(501, 558);
        walkToTile(497, 558);
    }

    private void escapeSecondPit() {
        System.out.println("pogeneb ogadest");
        walkToTile(499, 562);
        walkToTile(494, 563);
        climbNet();
    }


    private enum Action {
        SWING,
        ESCAPE_FIRST_PIT,
        BALANCE_LOG,
        CLIMB_NET,
        WALK_LEDGE,
        ESCAPE_SECOND_PIT,
        CLIMB_DOWN,
        WALK_TO_FIRST_WALL,
        JUMP_FIRST_WALL,
        JUMP_SECOND_WALL
    }


    @Override
    protected void onChatMessageReceived(String sender, String message) {

    }

    @Override
    protected void onGameMessageReceived(String message) {

    }
}
