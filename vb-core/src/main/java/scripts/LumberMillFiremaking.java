package scripts;

import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.script.ScriptDependencyContext;
import rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import rscvanilla.bot.script.template.RunnableScript;

public class LumberMillFiremaking extends RunnableScript {

    private static final int TINDERBOX = 166;
    private static final int LOGS = 14;

    private static final int FIRE = 97;
    private static final int FERN = 34;
    private static final int BULL_BUSHES = 36;
    private static final int FLOWERS_RED = 285;
    private static final int FLOWERS_BLUE = 37;
    private static final int FUNGUS = 205;

    public LumberMillFiremaking(ScriptDependencyContext dependencyContext, ScriptAntiBanParams antiBanParameters) {
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

        if (!isGroundObjectReachable(FERN, getCurrentPos()) ||
                !isGroundObjectReachable(BULL_BUSHES, getCurrentPos()) ||
                !isGroundObjectReachable(FLOWERS_RED, getCurrentPos()) ||
                !isGroundObjectReachable(FLOWERS_BLUE, getCurrentPos()) ||
                !isGroundObjectReachable(FUNGUS, getCurrentPos()) ||
                !isGroundObjectReachable(FIRE, getCurrentPos())
                && isItemInInventory(LOGS)) {

            dropAllInventoryItems(LOGS);
            useInventoryItemOnGroundItem(TINDERBOX, LOGS);
            waitFor(100);
        }
        atGroundObject(0,1);

    }

    @Override
    protected void onChatMessageReceived(String sender, String message) {

    }

    @Override
    protected void onGameMessageReceived(String message) {

    }
}
