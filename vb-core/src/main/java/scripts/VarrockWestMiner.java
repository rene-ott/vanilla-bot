package scripts;

import rscvanilla.bot.api.models.Position;
import rscvanilla.bot.script.ScriptDependencyContext;
import rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import rscvanilla.bot.script.template.RunnableScript;
import org.apache.commons.lang3.ArrayUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VarrockWestMiner extends RunnableScript {

    private final static Position BANK_TOP_POS = new Position(98,515);
    private final static Position BANK_BOTTOM_POS = new Position(106, 510);

    private final static int BANK_DOOR_ID = 64;
    private final static Position BANK_DOOR_POS = new Position(102, 509);

    private static final Position TO_MINE_0 = new Position(103, 509);
    private static final Position TO_MINE_1 = new Position(82, 509);
    private static final Position TO_MINE_2 = new Position(78, 523);
    private static final Position TO_MINE_3 = new Position(74, 537);

    private static final Position MINE = new Position(73, 545);
    private static final Position BANK = new Position(103, 511);

    private static final int[] GEM_IDS = { 157, 158, 159, 160 };

    private State state;

    private final Params COPPER_PARAMS = new Params(new int[]{76, 546}, new int[]{100, 76, 547}, new int[]{101, 75, 546}, 150);
    private final Params TIN_PARAMS = new Params(new int[]{79, 545}, new int[]{105, 78, 545}, new int[]{105, 79, 546}, 202);
    private final Params IRON_PARAMS = new Params(new int[]{75, 544}, new int[]{103, 76, 544}, new int[]{102, 75, 543}, 151);

    private Params scriptParams;

    private boolean isPowerMining;

    public VarrockWestMiner(ScriptDependencyContext dependencyContext, ScriptAntiBanParams argumentContext) {
        super(dependencyContext, argumentContext);
    }

    @Override
    protected void onStart() {
        super.onStart();

        disableScriptLoop();
        new VarrockWestMiner.GUI("Varrock West Miner", Thread.currentThread()).init();
    }

    @Override
    protected void loop() {
        waitFor(1000);

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
        if (isObjectNear(scriptParams.firstRock[0], scriptParams.firstRock[1], scriptParams.firstRock[2])) {
            atObject(scriptParams.firstRock[0], scriptParams.firstRock[1], scriptParams.firstRock[2]);
        } else if (isObjectNear(scriptParams.secondRock[0], scriptParams.secondRock[1], scriptParams.secondRock[2])) {
            atObject(scriptParams.secondRock[0], scriptParams.secondRock[1], scriptParams.secondRock[2]);
        }
        waitFor(500);
    }

    private void walkToBank() {
        walkTo(TO_MINE_3);
        walkTo(TO_MINE_2);
        walkTo(TO_MINE_1);
        walkTo(TO_MINE_0);
        if (!isInBank() && isPositionInDistance(BANK_DOOR_POS, 1) && isBankDoorClosed()) {
            atObject(BANK_DOOR_ID, BANK_DOOR_POS);
        } else {
            walkTo(BANK);
        }
    }

    private boolean isInBank() {
        return isPositionInRectangle(getPosition(), BANK_TOP_POS, BANK_BOTTOM_POS);
    }

    private boolean isBankDoorClosed() {
        return isObjectNear(BANK_DOOR_ID, BANK_DOOR_POS);
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
        depositAll(ArrayUtils.addAll(new int[] { scriptParams.oreId }, GEM_IDS));
    }

    private void walkToMine() {
        if (isInBank() && isBankDoorClosed()) {
            atObject(BANK_DOOR_ID, BANK_DOOR_POS);
            return;
        }

        walkTo(TO_MINE_1);
        walkTo(TO_MINE_2);
        walkTo(TO_MINE_3);
        walkTo(MINE);
        walkTo(scriptParams.standingPosition[0], scriptParams.standingPosition[1]);
    }

    private boolean isInventoryEmpty() {
        return !isItemInInventory(scriptParams.oreId);
    }

    private State getScriptState() {
        if (isPowerMining)
            return State.MINE;

        if (isInBank()) {
            if (!isInventoryEmpty()) {
                return State.BANK;
            } else {
                return State.WALK_TO_MINE;
            }
        } else {
            if (!isInventoryFull()) {
                if (isPositionInDistance(MINE, 13)) {
                    return State.MINE;
                } else {
                    return State.WALK_TO_MINE;
                }
            } else {
                return State.WALK_TO_BANK;
            }
        }
    }

    private enum State {
        BANK,
        WALK_TO_MINE,
        MINE,
        WALK_TO_BANK
    }

    @Override
    protected void onChatMessageReceived(String sender, String message) { }

    @Override
    protected void onGameMessageReceived(String message) { }

    private class Params {

        private final int[] standingPosition;
        private final int[] firstRock;
        private final int[] secondRock;
        private final int oreId;

        private Params(int[] standingPosition, int[] firstRock, int[] secondRock, int oreId) {
            this.standingPosition = standingPosition;
            this.firstRock = firstRock;
            this.secondRock = secondRock;
            this.oreId = oreId;
        }
    }

    private class GUI extends JFrame implements ActionListener {

        private final static String ACTION_COMMAND_IRON = "Iron";
        private final static String ACTION_COMMAND_TIN = "Tin";
        private final static String ACTION_COMMAND_COPPER = "Copper";

        private final JPanel rockSelectionPanel;
        private final ButtonGroup rockSelectionRadioButtonGroup;
        private final JCheckBox isPowerMiningEnabled;
        private final Thread scriptThread;

        public GUI(String name, Thread scriptThread) {
            super(name);
            this.scriptThread = scriptThread;

            rockSelectionPanel = createPanel();
            rockSelectionRadioButtonGroup = createRadioButtons();
            isPowerMiningEnabled = createCheckBox();

            add(rockSelectionPanel, BorderLayout.CENTER);
            add(createApplyButtonPanel(), BorderLayout.SOUTH);
            addWindowListener(stopScriptOnClose());
        }

        public void init() {
            setResizable(false);
            pack();
            setVisible(true);
            setLocationRelativeTo(null);
        }

        private ButtonGroup createRadioButtons() {
            var group = new ButtonGroup();

            var ironButton = createRadioButton(ACTION_COMMAND_IRON, true);
            var tinButton = createRadioButton(ACTION_COMMAND_TIN, false);
            var copperButton = createRadioButton(ACTION_COMMAND_COPPER, false);

            group.add(ironButton);
            group.add(tinButton);
            group.add(copperButton);

            rockSelectionPanel.add(ironButton);
            rockSelectionPanel.add(tinButton);
            rockSelectionPanel.add(copperButton);

            return group;
        }

        private JCheckBox createCheckBox() {
            var checkBox = new JCheckBox("Powermine?");
            checkBox.setSelected(false);

            rockSelectionPanel.add(checkBox);

            return checkBox;
        }

        private JPanel createPanel() {
            var layout = new FlowLayout();
            layout.setAlignment(FlowLayout.CENTER);
            var panel = new JPanel(layout);

            return panel;
        }

        private JPanel createApplyButtonPanel() {
            var panel = createPanel();
            panel.add(createApplyButton());

            return panel;
        }

        private JRadioButton createRadioButton(String label, boolean isSelected) {
            var radioButton = new JRadioButton(label);
            radioButton.setSelected(isSelected);
            radioButton.setActionCommand(label);

            return radioButton;
        }

        private JButton createApplyButton() {
            var button = new JButton("Apply");
            button.addActionListener(this);

            return button;
        }

        private WindowAdapter stopScriptOnClose() {
            return new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    scriptThread.interrupt();
                    super.windowClosing(e);
                }
            };
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            var command = rockSelectionRadioButtonGroup.getSelection().getActionCommand();

            if (command.equals(ACTION_COMMAND_IRON)) {
                scriptParams = IRON_PARAMS;
            } else if (command.equals(ACTION_COMMAND_TIN)) {
                scriptParams = TIN_PARAMS;
            } else if (command.equals(ACTION_COMMAND_COPPER)) {
                scriptParams = COPPER_PARAMS;
            }

            isPowerMining = isPowerMiningEnabled.isSelected();

            enableScriptLoop();
            setVisible(false);
        }
    }
}
