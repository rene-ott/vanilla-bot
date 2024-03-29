package scripts;

import rscvanilla.bot.script.ScriptDependencyContext;
import rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import rscvanilla.bot.script.template.RunnableScript;

public class HeadlessArrowMaker extends RunnableScript {

    public HeadlessArrowMaker(ScriptDependencyContext dependencyContext, ScriptAntiBanParams argumentContext) {
        super(dependencyContext, argumentContext);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void loop() {
        waitFor(500);

        if (getFatigue() > 90) {
            useSleepingBag();
            waitFor(1000);
            return;
        }

        if (isOptionsMenuAnswerTextVisible("Make arrow shafts")) {
            selectOptionsMenuAnswer(0);
            return;
        }

        if (isItemInInventory(381) && isItemInInventory(280)) {
            useInventoryItemOnInventoryItem(381, 280);
            waitFor(500);
            return;
        }

        if (isItemInInventory(14) && isItemInInventory(13)) {
            useInventoryItemOnInventoryItem(14, 13);
            waitFor(500);
            return;
        }

        atGroundObject(1, 0);
    }

    @Override
    protected void onChatMessageReceived(String sender, String message) { }

    @Override
    protected void onGameMessageReceived(String message) { }
}

