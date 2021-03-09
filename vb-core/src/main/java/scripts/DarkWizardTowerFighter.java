package scripts;

import rscvanilla.bot.script.ScriptDependencyContext;
import rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import rscvanilla.bot.script.template.RunnableScript;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;

public class DarkWizardTowerFighter extends RunnableScript {

    private static final int BONES = 20;
    private static final int[] PICK_UP_ITEMS = { 10, 31, 32, 33, 34, 35, 36, 38, 40, 41, 42, 46, 619};
    private static final int[] WIZARDS = { 57, 60 };

    private static final int[] FIRST_TO_SECOND_LADDER = { 5, 360, 570 };
    private static final int[] SECOND_TO_THIRD_LADDER = { 5, 363, 1514 };
    private static final int[] THIRD_TO_SECOND_LADDER = { 6, 363, 2458 };
    private static final int[] SECOND_TO_FIRST_LADDER = { 6, 360, 1514 };

    private int currentFloor;
    private int previousFloor;
    private ScriptParams scriptParams;

    public DarkWizardTowerFighter(ScriptDependencyContext dependencyContext, ScriptAntiBanParams argumentContext) {
        super(dependencyContext, argumentContext);
    }

    @Override
    protected void onStart() {
        super.onStart();

        new GUI("Dark Wizard Tower Fighter", Thread.currentThread()).init();

        currentFloor = getCurrentFloor();
        previousFloor = -1;
    }

    @Override
    protected void loop() {
        waitFor(400);

        if (isInCombat()) {
            return;
        }

        /*
        if ((getCurrentHp() / (double) getHp()) < 0.5) {
            useItem(scriptParams.food.id);
            waitFor(2000);
            return;
        }
         */

        if (getFatigue() > 90) {
            useSleepingBag();
            waitFor(4000);
            return;
        }

        var currentFloor = getCurrentFloor();
        if (currentFloor == -1) {
            return;
        }

        if (this.currentFloor != currentFloor) {
            this.previousFloor = this.currentFloor;
            this.currentFloor = currentFloor;

            waitFor(800); // Wait a little bit more to make sure wizards are loaded.
            return;
        }

        if (scriptParams.buryBones) {
            if (isItemInInventory(BONES)) {
                useItem(BONES);
                return;
            }

            if (isItemOnGround(BONES)) {
                takeItemFromGround(BONES);
                return;
            }
        }

        if (isItemOnGround(PICK_UP_ITEMS)) {
            takeItemFromGround(PICK_UP_ITEMS);
            return;
        }

        if (getCombatStyle() != scriptParams.fightMode.getId()) {
            setCombatStyle(scriptParams.fightMode.id);
        }

        if (isNpcNear(WIZARDS)) {
            attackNpc(WIZARDS);
            return;
        }

        if (!scriptParams.switchFloors) {
            return;
        }

        if (currentFloor == this.currentFloor) {
            var nextFloorLadder = getNextFloorLadder(this.currentFloor, this.previousFloor);
            atObject(nextFloorLadder[0], nextFloorLadder[1], nextFloorLadder[2]);
        }
    }

    private int getCurrentFloor() {
        var currentFloor = -1;

        if (isPositionInDistance(FIRST_TO_SECOND_LADDER[1], FIRST_TO_SECOND_LADDER[2] + 1, 10)) {
            currentFloor = 1;
        }

        if (isPositionInDistance(SECOND_TO_THIRD_LADDER[1], SECOND_TO_THIRD_LADDER[2] + 1, 10)) {
            currentFloor = 2;
        }

        if (isPositionInDistance(THIRD_TO_SECOND_LADDER[1], THIRD_TO_SECOND_LADDER[2] + 1, 10)) {
            currentFloor = 3;
        }

        return currentFloor;
    }

    private int[] getNextFloorLadder(int currentFloor, int previousFloor) {
        if (currentFloor == 1) {
            return FIRST_TO_SECOND_LADDER;
        }

        if (currentFloor == 3) {
            return THIRD_TO_SECOND_LADDER;
        }

        if (currentFloor == 2) {
            if (previousFloor == -1 || previousFloor == 1) {
                return SECOND_TO_THIRD_LADDER;
            }
            if (previousFloor == 3) {
                return SECOND_TO_FIRST_LADDER;
            }
        }

        throw new IllegalStateException();
    }

    @Override
    protected void onChatMessageReceived(String sender, String message) { }

    @Override
    protected void onGameMessageReceived(String message) { }

    private enum Food {
        IGNORE("Ignore", -1),
        LOBSTER("Lobster", 373);

        private final String value;
        private final int id;

        private String getValue() { return value; }

        private int getId() { return id; }

        Food(String value, int id) {
            this.value = value;
            this.id = id;
        }

        public static Food getEnumValue(String name) {
            return Arrays.stream(Food.values()).filter(it -> it.getValue().equals(name)).findFirst().orElseThrow();
        }
    }

    private enum FightMode {
        CONTROLLED("Controlled", 0),
        STRENGTH("Strength", 1),
        ATTACK("Attack", 2),
        DEFENSE("Defense", 3);


        private final String value;
        private final int id;

        private String getValue() { return value; }

        private int getId() { return id; }

        FightMode(String value, int id) {
            this.value = value;
            this.id = id;
        }

        public static FightMode getEnumValue(String name) {
            return Arrays.stream(FightMode.values()).filter(it -> it.getValue().equals(name)).findFirst().orElseThrow();
        }
    }

    private enum Floor {
        ALL("All"),
        FIRST("First"),
        THIRD("Third");

        private final String value;

        private String getValue() { return value; }

        Floor(String value) {
            this.value = value;
        }

        public static Floor getEnumValue(String name) {
            return Arrays.stream(Floor.values()).filter(it -> it.getValue().equals(name)).findFirst().orElseThrow();
        }
    }

    private class ScriptParams {

        private final FightMode fightMode;
        private final boolean buryBones;
        private final Food food;
        private final boolean switchFloors;

        private  ScriptParams(FightMode fightMode, boolean buryBones, Food food, boolean switchFloors) {
            this.fightMode = fightMode;
            this.buryBones = buryBones;
            this.food = food;
            this.switchFloors = switchFloors;
        }

        private boolean isEatingEnabled() { return !food.equals(Food.IGNORE); }
    }

    @SuppressWarnings("serial")
    private class GUI extends JFrame implements ActionListener {

        private final JPanel mainPanel;
        private final JComboBox<String> fightModeSelectComboBox;
        private final JCheckBox floorSelectionComboBox;
        private final JCheckBox buryBonesCheckBox;
        private final JComboBox<String> foodActionSelectComboBox;


        private final Thread scriptThread;

        public GUI(String name, Thread scriptThread) {
            super(name);
            this.scriptThread = scriptThread;

            mainPanel = createPanel();
            fightModeSelectComboBox = createFightModeSelectComboBox();
            foodActionSelectComboBox = createFoodActionSelectComboBox();
            floorSelectionComboBox = createFloorSwitchComboBox();
            buryBonesCheckBox = createBuryBonesCheckBox();

            add(mainPanel, BorderLayout.CENTER);
            add(createApplyButtonPanel(), BorderLayout.SOUTH);
            addWindowListener(stopScriptOnClose());
        }

        private JComboBox<String> createFightModeSelectComboBox() {

            var comboBox = new JComboBox<>(new String[]{
                FightMode.CONTROLLED.getValue(),
                FightMode.STRENGTH.getValue(),
                FightMode.ATTACK.getValue(),
                FightMode.DEFENSE.getValue()
            });
            mainPanel.add(new JLabel("Fight mode: "));
            mainPanel.add(comboBox);

            return comboBox;
        }

        private JCheckBox createFloorSwitchComboBox() {

            var comboBox = new JCheckBox();
            mainPanel.add(new JLabel("Switch floors: "));
            mainPanel.add(comboBox);

            return comboBox;
        }

        private JCheckBox createBuryBonesCheckBox() {
            var comboBox = new JCheckBox();
            mainPanel.add(new JLabel("Bury bones: "));
            mainPanel.add(comboBox);

            return comboBox;
        }

        private JComboBox<String> createFoodActionSelectComboBox() {
            var comboBox = new JComboBox<>(new String[]{
                Food.IGNORE.getValue(),
                Food.LOBSTER.getValue()
            });
            mainPanel.add(new JLabel("Eat food: "));
            mainPanel.add(comboBox);

            return comboBox;
        }

        public void init() {
            setResizable(false);
            pack();
            setVisible(true);
            setLocationRelativeTo(null);
        }

        private JPanel createPanel() {
            var layout = new FlowLayout();
            layout.setAlignment(FlowLayout.CENTER);

            return new JPanel(layout);
        }

        private JPanel createApplyButtonPanel() {
            var panel = createPanel();
            panel.add(createApplyButton());

            return panel;
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
            var fightMode = FightMode.getEnumValue((String)fightModeSelectComboBox.getSelectedItem());
            var food = Food.getEnumValue((String) foodActionSelectComboBox.getSelectedItem());
            var buryBones = buryBonesCheckBox.isSelected();
            var switchFloors = floorSelectionComboBox.isSelected();

            scriptParams = new ScriptParams(fightMode, buryBones, food, switchFloors);
            enableScriptLoop();
            setVisible(false);
        }
    }
}
