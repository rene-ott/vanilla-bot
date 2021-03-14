package scripts;

import rscvanilla.bot.script.ScriptDependencyContext;
import rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import rscvanilla.bot.script.template.RunnableScript;

import javax.swing.*;

public class SimpleWoodcutter extends RunnableScript {

    public SimpleWoodcutter(ScriptDependencyContext dependencyContext, ScriptAntiBanParams argumentContext) {
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

        if (hasAnswerOptionText("Make arrow shafts")) {
            answerOption(0);;
            return;
        }

        if (isItemInInventory(14) && isItemInInventory(13)) {
            useItemOnItem(14, 13);
            waitFor(500);
            return;
        }

        atObject(1, 0);
    }

    @Override
    protected void onChatMessageReceived(String sender, String message) { }

    @Override
    protected void onGameMessageReceived(String message) { }
}

