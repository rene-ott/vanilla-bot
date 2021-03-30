package scripts;

import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.script.ScriptDependencyContext;
import rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import rscvanilla.bot.script.template.RunnableScript;

public class GnomeStrongholdAgility extends RunnableScript {

    private final static Position LOG_BEGINNING = new Position(692, 495);
    private final static int LOG_ID = 655;

    private final static Position FIRST_NET = new Position(692, 503);
    private final static int FIRST_NET_ID = 647;

    private final static Position WATCH_TOWER_FIRST = new Position(693, 1452);
    private final static int WATCH_TOWER_FIRST_ID = 648;

    private final static Position ROPE_SWING = new Position(689, 2395);
    private final static int ROPE_SWING_ID = 650;

    private final static Position WATCH_TOWER_SECOND = new Position(683, 2396);
    private final static int WATCH_TOWER_SECOND_ID = 649;

    private final static Position SECOND_NET = new Position(683, 502);
    private final static int SECOND_NET_ID = 653;

    private final static Position PIPE = new Position(683, 497);
    private final static int PIPE_ID = 654;

    private final static Position BEGINNING_TOP = new Position(696, 491);
    private final static Position BEGINNING_BOTTOM = new Position(682, 495);

    private final static Position AFTER_LOG_TOP = new Position(695, 499);
    private final static Position AFTER_LOG_BOTTOM = new Position(690, 502);

    private final static Position AFTER_FIRST_NET_TOP = new Position(695, 1448);
    private final static Position AFTER_FIRST_NET_BOTTOM = new Position(690, 1451);

    private final static Position AFTER_FIRST_TOWER_TOP = new Position(693, 2394);
    private final static Position AFTER_FIRST_TOWER_BOTTOM = new Position(689, 2396);

    private final static Position AFTER_ROPE_TOP = new Position(685, 2396);
    private final static Position AFTER_ROPE_BOTTOM = new Position(685, 2396);

    private final static Position AFTER_TREE_TOP = new Position(687, 503);
    private final static Position AFTER_TREE_BOTTOM = new Position(681, 507);

    private final static Position AFTER_LAST_NET_TOP = new Position(687, 497);
    private final static Position AFTER_LAST_NET_BOTTOM = new Position(681, 501);


    public GnomeStrongholdAgility(ScriptDependencyContext dependencyContext, ScriptAntiBanParams antiBanParameters) {
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
            case CROSS_LOG -> crossLog();
            case CLIMB_FIRST_NET -> climbNet();
            case CLIMB_FIRST_TOWER -> climbTower();
            case SWING -> swing();
            case DROP_TOWER -> dropDown();
            case CLIMB_SECOND_NET -> climbSecondNet();
            case THROUGH_PIPE -> goThroughPipe();
            default -> throw new IllegalStateException();
        }

    }

    private Action getAction () {

        if (isCurrentPosInRectangle(BEGINNING_TOP, BEGINNING_BOTTOM)) {
            return Action.CROSS_LOG;
        } else if (isCurrentPosInRectangle(AFTER_LOG_TOP, AFTER_LOG_BOTTOM)) {
            return Action.CLIMB_FIRST_NET;
        } else if (isCurrentPosInRectangle(AFTER_FIRST_NET_TOP, AFTER_FIRST_NET_BOTTOM)) {
            return Action.CLIMB_FIRST_TOWER;
        } else if (isCurrentPosInRectangle(AFTER_FIRST_TOWER_TOP, AFTER_FIRST_TOWER_BOTTOM)) {
            return Action.SWING;
        } else if (isCurrentPosInRectangle(AFTER_ROPE_TOP, AFTER_ROPE_BOTTOM)) {
            return Action.DROP_TOWER;
        } else if (isCurrentPosInRectangle(AFTER_TREE_TOP, AFTER_TREE_BOTTOM)) {
            return Action.CLIMB_SECOND_NET;
        } else if (isCurrentPosInRectangle(AFTER_LAST_NET_TOP, AFTER_LAST_NET_BOTTOM)) {
            return Action.THROUGH_PIPE;
        }
        return Action.CROSS_LOG;
    }

    private void crossLog () {
        atGroundObject(LOG_ID, LOG_BEGINNING);
    }

    private void climbNet () {
        walkToTile(FIRST_NET);
        atGroundObject(FIRST_NET_ID, FIRST_NET);
    }

    private void climbTower () {
        atGroundObject(WATCH_TOWER_FIRST_ID, WATCH_TOWER_FIRST);
    }

    private void swing () {
        atGroundObject(ROPE_SWING_ID, ROPE_SWING);
    }

    private void dropDown () {
        atGroundObject(WATCH_TOWER_SECOND_ID, WATCH_TOWER_SECOND);
    }

    private void climbSecondNet () {
        atGroundObject(SECOND_NET_ID, SECOND_NET);
    }

    private void goThroughPipe () {
        atGroundObject(PIPE_ID, PIPE);
    }

    private enum Action {
        CROSS_LOG,
        CLIMB_FIRST_NET,
        CLIMB_FIRST_TOWER,
        SWING,
        DROP_TOWER,
        CLIMB_SECOND_NET,
        THROUGH_PIPE
    }


    @Override
    protected void onChatMessageReceived(String sender, String message) {

    }

    @Override
    protected void onGameMessageReceived(String message) {

    }
}
