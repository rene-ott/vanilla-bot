package scripts;

import rscvanilla.bot.script.ScriptDependencyContext;
import rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import rscvanilla.bot.script.template.RunnableScript;

public class PlateBodySmither extends RunnableScript {

    public PlateBodySmither(ScriptDependencyContext dependencyContext, ScriptAntiBanParams argumentContext) {
        super(dependencyContext, argumentContext);
    }

    @Override
    protected void onStart() {
        super.onStart();
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
            if (getBankItemCount(169) < 25) {
                stopScript();
                return;
            }

            depositAllBankItems(117);
            withdrawBankItem(169, 25);
            waitFor(300);
            return;
        }

        if (isOptionsMenuAnswerTextVisible("Plate Mail Body (5 bars)")) {
            selectOptionsMenuAnswer(1);
            waitFor(750);
            return;
        }

        if (isOptionsMenuAnswerTextVisible("Make Armour")) {
            selectOptionsMenuAnswer(1);
            waitFor(750);
            return;
        }

        if (isOptionsMenuAnswerTextVisible("Armour")) {
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

        if (has5PlatesInBody()) {
            talkToNpc(95);
            waitFor(2000);
            return;
        }

        waitFor(1000);
    }

    private boolean hasBarsInInventory() {
        return getInventoryItemCount(169) > 0;
    }

    private boolean has5PlatesInBody() {
        return getInventoryItemCount(117) == 5;
    }

    @Override
    public void onChatMessageReceived(String sender, String message) {
    }

    @Override
    public void onGameMessageReceived(String message) {
    }
}

