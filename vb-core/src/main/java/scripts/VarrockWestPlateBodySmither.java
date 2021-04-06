package scripts;

import rscvanilla.bot.script.ScriptDependencyContext;
import rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import rscvanilla.bot.script.template.RunnableScript;

import javax.swing.*;

public class VarrockWestPlateBodySmither extends RunnableScript {

    private final int[][] barAndPlateTuples = new int[][] {
        new int[] { 169, 117},
        new int[] { 170, 8 },
        new int[] { 171, 118 },
        new int[] { 173, 119, },
        new int[] { 174, 120 },
        new int[] { 408, 401 }
    };

    private int bar;
    private int plateBody;

    public VarrockWestPlateBodySmither(ScriptDependencyContext dependencyContext, ScriptAntiBanParams argumentContext) {
        super(dependencyContext, argumentContext);
    }

    @Override
    protected void onStart() {
        super.onStart();

        var inputDialogText = "Bronze = 0\nIron = 1\nSteel = 2\nMith=3\nAddy=4\nRune=5";
        var frameTitle = "Varrock West Platemail Body Smither";
        var selectedParAndTupleIndex = Integer.parseInt(JOptionPane.showInputDialog(new JFrame(frameTitle), inputDialogText));
        int[] selectedBarAndTuple = barAndPlateTuples[selectedParAndTupleIndex];

        plateBody = selectedBarAndTuple[1];
        bar = selectedBarAndTuple[0];
    }

    @Override
    protected void loop() {
        waitFor(400);

        if (getFatigue() > 90) {
            useSleepingBag();
            waitFor(4000);
            return;
        }

        if (isBankWindowVisible() && getInventoryItemCount(bar) != 25) {
            if (getBankItemCount(bar) < 25) {
                stopScript();
                return;
            }

            depositAllBankItems(plateBody);
            withdrawBankItem(bar, 25);
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
            useInventoryItemOnGroundObject(bar, 50);
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
        return getInventoryItemCount(bar) > 0;
    }

    private boolean has5PlatesInBody() {
        return getInventoryItemCount(plateBody) == 5;
    }

    @Override
    public void onChatMessageReceived(String sender, String message) {
    }

    @Override
    public void onGameMessageReceived(String message) {
    }
}

