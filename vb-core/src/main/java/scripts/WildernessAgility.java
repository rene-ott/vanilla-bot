package scripts;

import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.script.ScriptDependencyContext;
import rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import rscvanilla.bot.script.template.RunnableScript;

public class WildernessAgility extends RunnableScript {

    private final static Position PIPE = new Position(294, 119);
    private final static int PIPE_ID = 705;

    private final static Position SWING = new Position(292, 110);
    private final static int SWING_ID = 706;

    private final static Position STONE = new Position(293, 105);
    private final static int STONE_ID = 707;

    private final static Position LEDGE = new Position(296, 111);
    private final static int LEDGE_ID = 708;

    private final static Position VINE = new Position(305, 118);
    private final static int VINE_ID = 709;

    private final static Position BEGINNING_TOP = new Position(305, 120);
    private final static Position BEGINNING_BOTTOM = new Position(292, 125);

    private final static Position AFTER_PIPE_TOP = new Position(294, 98);
    private final static Position AFTER_PIPE_BOTTOM = new Position(288, 113);

    private final static Position AFTER_SWING_TOP = new Position(293, 107);
    private final static Position AFTER_SWING_BOTTOM = new Position(292, 108);

    private final static Position AFTER_LEDGE_TOP = new Position(314, 110);
    private final static Position AFTER_LEDGE_BOTTOM = new Position(296, 117);

    private final static Position PIT_TOP = new Position(303, 2931);
    private final static Position PIT_BOTTOM = new Position(288, 2947);

    private boolean swingFailed;
    private boolean stonesFailed;


    public WildernessAgility(ScriptDependencyContext dependencyContext, ScriptAntiBanParams antiBanParameters) {
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
            case THROUGH_PIPE -> goThroughPipe();
            case SWING -> swing();
            case JUMP_STONES -> jumpStones();
            case WALK_TO_LEDGE -> walkToLedge();
            case WALK_LEDGE -> walkLedge();
            case CLIMB_VINES -> climbVines();
            case ESCAPE_PIT -> escapePit();
            default -> throw new IllegalStateException();
        }
    }

    private WildernessAgility.Action getAction () {

        if (isCurrentPosInRectangle(BEGINNING_TOP, BEGINNING_BOTTOM)) {
            return Action.THROUGH_PIPE;
        } else if (isCurrentPosInRectangle(AFTER_SWING_TOP, AFTER_SWING_BOTTOM)) {
            return Action.JUMP_STONES;
        } else if (isCurrentPosInRectangle(AFTER_PIPE_TOP, AFTER_PIPE_BOTTOM) && swingFailed) {
            return Action.SWING;
        }  else if (isCurrentPosInRectangle(AFTER_PIPE_TOP, AFTER_PIPE_BOTTOM) && stonesFailed && !swingFailed) {
            return Action.JUMP_STONES;
        } else if (getCurrentPos().equals(new Position(297,105))) {
            stonesFailed = false;
            return Action.WALK_LEDGE;
        } else if (isCurrentPosInRectangle(AFTER_PIPE_TOP, AFTER_PIPE_BOTTOM) && !stonesFailed && !swingFailed) {
            return Action.WALK_TO_LEDGE;
        } else if (getCurrentPos().equals(new Position(295,111))) {
            return Action.WALK_LEDGE;
        } else if (isCurrentPosInRectangle(AFTER_LEDGE_TOP, AFTER_LEDGE_BOTTOM)) {
            return Action.CLIMB_VINES;
        } else if (isCurrentPosInRectangle(PIT_TOP, PIT_BOTTOM)) {
            return Action.ESCAPE_PIT;
        }
        return Action.WALK_TO_LEDGE;
    }

    private void goThroughPipe () {
        swingFailed = true;
        stonesFailed = true;
        atGroundObject(PIPE_ID, PIPE);
    }

    private void swing () {
        atGroundObject(SWING_ID, SWING);
    }

    private void jumpStones () {
        swingFailed = false;
        atGroundObject(STONE_ID, STONE);
    }

    private void walkToLedge () {
        walkToTile(295, 111);
    }

    private void walkLedge () {
        atGroundObject(LEDGE_ID, LEDGE);
    }

    private void climbVines () {
        atGroundObject(VINE_ID, VINE);
    }

    private void escapePit () {
        if (isInCombat()) {
            walkToTile(getCurrentPos());
        }
        atGroundObject(5, 289, 2933);
    }


    private enum Action {
        THROUGH_PIPE,
        SWING,
        JUMP_STONES,
        WALK_LEDGE,
        WALK_TO_LEDGE,
        CLIMB_VINES,
        ESCAPE_PIT
    }


    @Override
    protected void onChatMessageReceived(String sender, String message) {

    }

    @Override
    protected void onGameMessageReceived(String message) {

    }
}
