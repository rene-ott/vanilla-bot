package scripts;

import rscvanilla.bot.script.ScriptDependencyContext;
import rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import rscvanilla.bot.script.template.RunnableScript;

public class SimpleFiremaking extends RunnableScript {

    private static final int TINDERBOX = 166;
    private static final int LOGS = 14;

    private static final int FIRE = 97;
    private static final int FERN = 34;
    private static final int BULL_BUSHES = 36;
    private static final int FLOWERS_RED = 37;
    private static final int FLOWERS_BLUE = 285;
    private static final int FUNGUS = 205;

    public SimpleFiremaking(ScriptDependencyContext dependencyContext, ScriptAntiBanParams antiBanParameters) {
        super(dependencyContext, antiBanParameters);
    }

    @Override
    protected void loop() {

        if (getFatigue() > 90) {
            useSleepingBag();
            waitFor(3000);
            return;
        }

        if (isItemOnGround(LOGS) && (isGroundObjectReachable(FERN, getCurrentPos()) ||
                isGroundObjectReachable(FIRE, getCurrentPos()) ||
                isGroundObjectReachable(FUNGUS, getCurrentPos()) ||
                isGroundObjectReachable(FLOWERS_RED, getCurrentPos()) ||
                isGroundObjectReachable(FLOWERS_BLUE, getCurrentPos()))) {

            takeGroundItemFromCurrentPos(LOGS);
            walkToTile(getCurrentPos().getX() + 1, getCurrentPos().getY() + 1);
            waitFor(300);
            return;
        }

        if (isItemOnGround(LOGS) && (!isGroundObjectReachable(FERN, getCurrentPos()) ||
                !isGroundObjectReachable(FIRE, getCurrentPos()) ||
                !isGroundObjectReachable(FUNGUS, getCurrentPos()) ||
                !isGroundObjectReachable(FLOWERS_RED, getCurrentPos()) ||
                !isGroundObjectReachable(FLOWERS_BLUE, getCurrentPos()))) {

            useInventoryItemOnGroundItem(TINDERBOX, LOGS);
            waitFor(300);
            return;
        }

        if ((isItemInInventory(LOGS)) && (!isGroundObjectReachable(FERN, getCurrentPos()) ||
                !isGroundObjectReachable(BULL_BUSHES, getCurrentPos()) ||
                !isGroundObjectReachable(FLOWERS_RED, getCurrentPos()) ||
                !isGroundObjectReachable(FLOWERS_BLUE, getCurrentPos()) ||
                !isGroundObjectReachable(FUNGUS, getCurrentPos()) ||
                !isGroundObjectReachable(FIRE, getCurrentPos()))) {

            dropAllInventoryItems(LOGS);
            waitFor(200);
            return;
        }

        if (isBusy()) {
            return;
        }

        waitFor(400);
        atGroundObject(0, 1);
    }

    @Override
    protected void onChatMessageReceived(String sender, String message) {

    }

    @Override
    protected void onGameMessageReceived(String message) {

    }
}
