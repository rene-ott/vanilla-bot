package scripts;

import rscvanilla.bot.script.ScriptDependencyContext;
import rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import rscvanilla.bot.script.template.RunnableScript;

public class WildernessBigBones extends RunnableScript {
    private String pickBones;

    private static final int BIG_BONES = 413;

    public WildernessBigBones(ScriptDependencyContext dependencyContext, ScriptAntiBanParams antiBanParameters) {
        super(dependencyContext, antiBanParameters);
    }

    @Override
    protected void loop() {

        if (isInCombat()) {
            walkToTile(getCurrentPos());
        }

        if (getFatigue() > 90) {
            useSleepingBag();
            waitFor(1000);
            return;
        }

        if (isItemInInventory(BIG_BONES)) {
            useInventoryItem(BIG_BONES);
            waitFor(300);
            return;
        }
        if (isItemOnGround(BIG_BONES)) {
            takeGroundItem(BIG_BONES);
            waitFor(300);
        }

    }

    @Override
    protected void onChatMessageReceived(String sender, String message) {

    }

    @Override
    protected void onGameMessageReceived(String message) {

    }
}
