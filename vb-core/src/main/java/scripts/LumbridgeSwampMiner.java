package scripts;

import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.script.ScriptDependencyContext;
import rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import rscvanilla.bot.script.template.RunnableScript;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class LumbridgeSwampMiner extends RunnableScript {

    private static final int[] GEM_IDS = { 157, 158, 159, 160 };

    private final List<Integer> rockIds = new ArrayList<>();
    private final List<Integer> oreIds = new ArrayList<>();

    private final static int COAL_ROCK_ID = 110;
    private final static int COAL_ORE_ID = 155;

    private final static int MITHRIL_ROCK_ID = 106;
    private final static int MITHRIL_ORE_ID = 153;

    private final static int ADAMANTITE_ROCK_ID = 108;
    private final static int ADAMANTITE_ORE_ID = 154;

    private final static Position MINE = new Position(114, 701);

    private final static Position BANK_TOP_POS = new Position(223, 634);
    private final static Position BANK_BOTTOM_POS = new Position(216, 638);

    private final static int BANK_DOOR_ID = 64;
    private final static Position BANK_DOOR_POS = new Position(219, 633);

    public LumbridgeSwampMiner(ScriptDependencyContext dependencyContext, ScriptAntiBanParams argumentContext) {
        super(dependencyContext, argumentContext);
    }

    @Override
    protected void onStart() {
        super.onStart();

        disableScriptLoop();
        new GUI("Lumbridge Swamp Miner", Thread.currentThread()).init();
    }

    @Override
    protected void loop() {
        waitFor(1000);

        if (getFatigue() > 90) {
            useSleepingBag();
            waitFor(4000);
            return;
        }

        var action = getAction();

        switch (action) {
            case MINE -> mineRock();
            case WALK_TO_BANK -> walkToBank();
            case BANK -> bankOres();
            case WALK_TO_MINE -> walkToMine();
            default -> throw new IllegalStateException();
        }
    }

    private Action getAction() {

        if (isAtMine()) {
            if (!isInventoryFull()) {
                return Action.MINE;
            } else {
                return Action.WALK_TO_BANK;
            }
        } else if (isInBank()) {
            if (isInventoryEmpty()) {
                return Action.WALK_TO_MINE;
            } else {
                return Action.BANK;
            }
        } else {
            if (isInventoryEmpty()) {
                return Action.WALK_TO_MINE;
            } else {
                return Action.WALK_TO_BANK;
            }
        }
    }

    private boolean isAtMine() {
        return isPosInDistanceOfCurrentPos(MINE, 15);
    }

    private boolean isInBank() {
        return isCurrentPosInRectangle(BANK_TOP_POS, BANK_BOTTOM_POS);
    }

    private void walkToBank() {
        walkToTile(126, 693);
        walkToTile(140, 692);
        walkToTile(151, 684);
        walkToTile(164, 677);
        walkToTile(175, 668);
        walkToTile(185, 655);
        walkToTile(197, 650);
        walkToTile(211, 640);
        walkToTile(219, 633);

        if (isBankDoorClosed()) {
            print("W2M: Bank door is closed!");
            if (isAtBankDoor()) {
                atGroundObject(BANK_DOOR_ID, BANK_DOOR_POS);
            } else {
                walkToTile(219, 633);
            }
            return;
        }

        walkToTile(220, 634);
    }

    private boolean isBankDoorClosed() {
        return isGroundObjectReachable(BANK_DOOR_ID, BANK_DOOR_POS);
    }

    private boolean isAtBankDoor() {
        return isPosInDistanceOfCurrentPos(new Position(219, 633), 0);
    }

    private void walkToMine() {
        if (isInBank() && isBankDoorClosed()) {
            print("W2B: Bank door is closed!");
            atGroundObject(BANK_DOOR_ID, BANK_DOOR_POS);
            return;
        }

        walkToTile(211, 640);
        walkToTile(197, 650);
        walkToTile(185, 655);
        walkToTile(175, 668);
        walkToTile(164, 677);
        walkToTile(151, 684);
        walkToTile(140, 692);
        walkToTile(126, 693);
        walkToTile(114, 701);
    }

    private void bankOres() {
        if (isBankWindowVisible()) {
            depositOresAndGems();
            waitFor(300);
            return;
        }

        if (isOptionsMenuVisible()) {
            selectOptionsMenuAnswer(0);
            waitFor(5000);
            return;
        }

        talkToNpc(95);
        waitFor(2000);
    }

    private void depositOresAndGems() {
        var oreAndGemIds = Stream.concat(oreIds.stream(), Arrays.stream(GEM_IDS).boxed())
                .mapToInt(x -> x)
                .toArray();

        depositAllBankItems(oreAndGemIds);
    }

    private boolean isInventoryEmpty() {
        var oreIds = this.oreIds.stream().mapToInt(i->i).toArray();

        return !isItemInInventory(oreIds);
    }

    private void mineRock() {
        if (isBusy()) {
            return;
        }

        var rocks = rockIds.stream().mapToInt(i -> i).toArray();
        atGroundObject(rocks);
    }

    private enum Action {
        MINE,
        WALK_TO_BANK,
        BANK,
        WALK_TO_MINE
    }

    @SuppressWarnings("serial")
    private class GUI extends JFrame implements ItemListener, ActionListener {

        private final Thread scriptThread;
        private final JButton button;

        private final static String COAL_SELECTION = "Coal";
        private final static String MITHRIL_SELECTION = "Mithril";
        private final static String ADAMANTITE_SELECTION = "Adamantite";

        public GUI(String name, Thread scriptThread) {
            super(name);

            this.scriptThread = scriptThread;

            var panel = createPanel();
            add(panel);

            panel.add(createCheckBox(COAL_SELECTION));
            panel.add(createCheckBox(MITHRIL_SELECTION));
            panel.add(createCheckBox(ADAMANTITE_SELECTION));
            panel.add(button = createButton());

            addWindowListener(stopScriptOnClose());
            setResizable(false);
        }

        public void init() {
            pack();
            setVisible(true);
            setLocationRelativeTo(null);
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

        private JButton createButton() {
            var button = new JButton("Start");
            button.setEnabled(false);
            button.addActionListener(this);

            return button;
        }

        private JCheckBox createCheckBox(String name) {
            var checkBox = new JCheckBox(name);
            checkBox.addItemListener(this);

            return checkBox;
        }

        private JPanel createPanel() {
            var panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

            return panel;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            enableScriptLoop();
            setVisible(false);
        }

        @Override
        public void itemStateChanged(ItemEvent e) {
            var checkBox = (JCheckBox) e.getSource();
            var isSelected = checkBox.isSelected();

            var rockAndOre = getRockAndOre(checkBox.getText());
            var rock = rockAndOre[0];
            var ore = rockAndOre[1];

            if (isSelected) {
                rockIds.add(rock);
                oreIds.add(ore);
            } else {
                rockIds.remove(Integer.valueOf(rock));
                oreIds.remove(Integer.valueOf(ore));
            }

            button.setEnabled(!rockIds.isEmpty());
        }

        private int [] getRockAndOre(String selectedValue) {
            if (selectedValue.equals(COAL_SELECTION))
                return new int[] { COAL_ROCK_ID, COAL_ORE_ID};

            if (selectedValue.equals(MITHRIL_SELECTION))
                return new int[] { MITHRIL_ROCK_ID, MITHRIL_ORE_ID};

            if (selectedValue.equals(ADAMANTITE_SELECTION))
                return new int[] { ADAMANTITE_ROCK_ID, ADAMANTITE_ORE_ID};

            throw new IllegalArgumentException("Invalid selectedValue: " + selectedValue);
        }
    }

    @Override
    protected void onChatMessageReceived(String sender, String message) { }

    @Override
    protected void onGameMessageReceived(String message) { }
}

