package scripts;

import rscvanilla.bot.script.ScriptDependencyContext;
import rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import rscvanilla.bot.script.template.RunnableScript;

import javax.swing.*;

public class HighAlcher extends RunnableScript {

    private int itemId;

    public HighAlcher(ScriptDependencyContext dependencyContext, ScriptAntiBanParams argumentContext) {
        super(dependencyContext, argumentContext);
    }

    @Override
    protected void onStart() {
        super.onStart();

        itemId = Integer.parseInt(JOptionPane.showInputDialog(new JFrame("High Alcher"), "Alchable item ID:"));
    }

    @Override
    protected void loop() {
        if (getFatigue() > 90) {
            useSleepingBag();
            waitFor(4000);
            return;
        }

        if (isBankWindowVisible() && getInventoryItemCount(itemId) < 26) {
            if (getBankItemCount(itemId) == 0) {
                print("Ran out of items");
                stopScript();
                return;
            }

            withdrawBankItem(itemId, 26);
            waitFor(300);
            return;
        }

        if (isOptionsMenuAnswerTextVisible("I'd like to access")) {
            selectOptionsMenuAnswer(0);
            waitFor(5000);
            return;
        }

        if (getInventoryItemCount(40) == 0) {
            print("Ran out nature runes");
            stopScript();
            return;
        }

        if (getInventoryItemCount(itemId) == 0) {
            talkToNpc(95);
            waitFor(3000);
            return;
        }

        castSpellOnInventoryItem(28, itemId);
        waitFor(1700);
    }

    @Override
    public void onChatMessageReceived(String sender, String message) { }

    @Override
    public void onGameMessageReceived(String message) { }
}

