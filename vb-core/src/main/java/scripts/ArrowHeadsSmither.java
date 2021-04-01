package scripts;

import rscvanilla.bot.script.ScriptDependencyContext;
import rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import rscvanilla.bot.script.template.RunnableScript;

public class ArrowHeadsSmither extends RunnableScript {
    public ArrowHeadsSmither(ScriptDependencyContext dependencyContext, ScriptAntiBanParams antiBanParameters) {
        super(dependencyContext, antiBanParameters);
    }

    @Override
    protected void loop() {
        waitFor(400);

        if (getFatigue() > 90) {
            useSleepingBag();
            waitFor(4000);
            return;
        }

        if (isBankWindowVisible() && getInventoryItemCount(169) != 25) {
            if (getBankItemCount(169) < 1) {
                stopScript();
                return;
            }

            withdrawBankItem(169, 27);
            waitFor(300);
            return;
        }

        if (isOptionsMenuAnswerTextVisible("Make arrow heads")) {
            selectOptionsMenuAnswer(0);
            waitFor(750);
            return;
        }

        if (isOptionsMenuAnswerTextVisible("Make missile heads")) {
            selectOptionsMenuAnswer(2);
            waitFor(750);
            return;
        }

        if (isOptionsMenuAnswerTextVisible("I'd like to access")) {
            selectOptionsMenuAnswer(0);
            waitFor(5000);
            return;
        }

        if (hasBarsInInventory()) {
            useInventoryItemOnGroundObject(169, 50);
            waitFor(300);
            return;
        }


        waitFor(1000);
    }

    private boolean hasBarsInInventory() {
        return getInventoryItemCount(169) > 0;
    }

    @Override
    protected void onChatMessageReceived(String sender, String message) {

    }

    @Override
    protected void onGameMessageReceived(String message) {

    }
}
