package scripts;

import com.rscvanilla.bot.api.models.Position;
import com.rscvanilla.bot.script.ScriptDependencyContext;
import com.rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import com.rscvanilla.bot.script.template.RunnableScript;
import org.apache.commons.lang3.ArrayUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VarrockWestMiner extends RunnableScript {

    private static Position BANK_DOOR_OUTSIDE = new Position(102, 509);
    private static Position TO_MINE_1 = new Position(82, 509);
    private static Position TO_MINE_2 = new Position(78, 523);
    private static Position TO_MINE_3 = new Position(74, 537);
    private static Position MINE = new Position(73, 545);

    private static int[] GEM_IDS = { 157, 158, 159, 160 };
    private int rockId;
    private int oreId;
    private State state;

    public VarrockWestMiner(ScriptDependencyContext dependencyContext, ScriptAntiBanParams argumentContext) {
        super(dependencyContext, argumentContext);
    }

    @Override
    protected void onStart() {
        super.onStart();

        var frame = new JFrame("Varrock West Miner");

        var rockParams = getRockParams(JOptionPane.showInputDialog(frame, "Enter rock name (Iron, Copper, Tin): "));
        if (rockParams == null) {
            stopScript("Invalid rock name");
        }

        rockId = rockParams[0];
        oreId = rockParams[1];
    }

    @Override
    protected void loop() {
        waitFor(1000);

        var playersNear = getPlayerNamesInDistance(7);
        if (playersNear.length != 0) {
            print("Player(s) near: " + String.join(",", playersNear));
        }

        if (getFatigue() > 90) {
            useSleepingBag();
            waitFor(4000);
            return;
        }

        var newState = getScriptState();
        if (newState != this.state) {
            print("STATE: " + this.state + " -> " + newState);
        }

        this.state = newState;

        switch (state) {
            case MINE -> mineRock();
            case WALK_TO_BANK -> walkToBank();
            case BANK -> bankOres();
            case WALK_TO_MINE -> walkToMine();
            default -> throw new IllegalStateException();
        }
    }

    private void mineRock() {
        if (isBusy()) {
            return;
        }

        atObject(rockId);
    }

    private void walkToBank() {
        walkTo(TO_MINE_3);
        walkTo(TO_MINE_2);
        walkTo(TO_MINE_1);
        walkTo(BANK_DOOR_OUTSIDE);
    }

    private void bankOres() {
        if (isBankScreenVisible()) {
            depositOresAndGems();
            waitFor(300);
            return;
        }

        if (isOptionsMenuVisible()) {
            answerOption(0);
            waitFor(5000);
            return;
        }

        talkToNpc(95);
        waitFor(2000);
    }

    private void depositOresAndGems() {
        depositAll(ArrayUtils.addAll(new int[] {oreId }, GEM_IDS));
    }

    private void walkToMine() {
        walkTo(TO_MINE_1);
        walkTo(TO_MINE_2);
        walkTo(TO_MINE_3);
    }

    private boolean isInventoryEmpty() {
        return !isItemInInventory(151);
    }

    private State getScriptState() {
        if (isNpcInDistance(95, 10)) {
            if (!isInventoryEmpty()) {
                return State.BANK;
            }
        } else if (isPositionInDistance(MINE, 13)) {
            if (isInventoryFull()) {
                return State.WALK_TO_BANK;
            } else {
                return State.MINE;
            }
        }
        if (isInventoryFull()) {
            return State.WALK_TO_BANK;
        } else {
            return State.WALK_TO_MINE;
        }
    }

    private int[] getRockParams(String oreName) {
        if (oreName.equalsIgnoreCase("Tin")) {
            return new int[] { 105, 202 };
        }

        if (oreName.equalsIgnoreCase("Copper")) {
            return new int[] { 101, 150 };
        }

        if (oreName.equalsIgnoreCase("Iron")) {
            return new int [] { 102, 151 };
        }

        return null;
    }


    private enum State {
        BANK,
        WALK_TO_MINE,
        MINE,
        WALK_TO_BANK
    }

    private class InputParameterGUI extends JFrame implements ActionListener {

        private FlowLayout layout;

        public InputParameterGUI(String name) {
            super(name);
            layout = new FlowLayout();
        }

        private JButton createButton(String name) {
            var btn = new JButton(name);
            btn.addActionListener(this);

            return btn;
        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
