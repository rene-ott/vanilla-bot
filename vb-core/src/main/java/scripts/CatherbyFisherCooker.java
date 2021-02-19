package scripts;

import rscvanilla.bot.mudclient.models.Position;
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
import java.util.stream.IntStream;

/**
 * The CatherbyFisherCooker is a script which catches fishes and enables to cook them in Catherby.
 * The Script supports three types of fishes.
 *   1) Shrimps/Anchovies
 *   2) Lobsters
 *   3) Sharks\
 * @auth
 *   The fish selection and cooking option can be done on GUI.
 */
public class CatherbyFisherCooker extends RunnableScript {

    private static final Position SHRIMP_FISH_SPOT_POS = new Position(418, 500);
    private static final Position LOBSTER_FISH_SPOT_POS = new Position(409, 504);
    private static final Position SHARK_FISH_SPOT_POS = new Position(406, 505);

    private static final int RANGE_HOUSE_DOOR_ID = 2;
    private static final Position RANGE_HOUSE_DOOR_POS = new Position(435, 486);
    private static final Position RANGE_HOUSE_TOP_POS = new Position(436, 480);
    private static final Position RANGE_HOUSE_BOTTOM_POS = new Position(432, 485);

    private static final int RANGE_ID = 11;

    private static final int BANK_DOOR_ID = 64;
    private static final Position BANK_DOOR_POS = new Position(439, 497);
    private static final Position BANK_TOP_POS = new Position(443, 491);
    private static final Position BANK_BOTTOM_POS = new Position(437, 496);

    // ObjectID, is atObject2, raw fish, cooked fish, burnt
    private final int[][] SHRIMP_PARAMS = { { 193, SHRIMP_FISH_SPOT_POS.getX(), SHRIMP_FISH_SPOT_POS.getY() }, { 0 }, { 349, 351 }, { 350, 352}, { 353} };
    private final int[][] LOBSTER_PARAMS = { { 194, LOBSTER_FISH_SPOT_POS.getX(), LOBSTER_FISH_SPOT_POS.getY() }, { 1 }, { 372 }, { 373 }, { 374 } };
    private final int[][] SHARK_PARAMS = { { 261, SHARK_FISH_SPOT_POS.getX(), SHARK_FISH_SPOT_POS.getY() }, { 1 }, { 545 }, { 546}, { 547 } };

    private int[][] scriptParams;

    private boolean isCookingEnabled = true;

    private int[] fishSpot;
    private int[] rawFish;
    private boolean isAtObject2;
    private int[] cookedFish;
    private int[] burntFish;

    public CatherbyFisherCooker(ScriptDependencyContext dependencyContext, ScriptAntiBanParams argumentContext) {
        super(dependencyContext, argumentContext);
    }

    @Override
    protected void onStart() {
        super.onStart();

        disableScriptLoop();
        new GUI("Catherby Fisher/Cooker", Thread.currentThread()).init();
    }

    private void setScriptParams(boolean isCookingEnabled) {
        this.isCookingEnabled = isCookingEnabled;

        fishSpot = scriptParams[0];
        isAtObject2 = scriptParams[1][0] == 1;
        rawFish = scriptParams[2];
        cookedFish = scriptParams[3];
        burntFish = scriptParams[4];
    }

    @Override
    protected void loop() {
        waitFor(750);

        if (getFatigue() > 90) {
            useSleepingBag();
            waitFor(4000);
            return;
        }

        var action = getAction();

        switch (action) {
            case CATCH_FISH -> catchFish();
            case WALK_TO_RANGE -> walkToRange();
            case COOK_FISH -> cookFish();
            case WALK_TO_BANK -> walkToBank();
            case BANK_FISH -> bankFish();
            case WALK_TO_FISH_SPOT -> walkToFishSpot();
            default -> throw new IllegalStateException();
        }
    }

    private Action getAction() {
        if (isAtFishSpot()) {
            if (isInventoryFull()) {
                if (isCookingEnabled) {
                    return Action.WALK_TO_RANGE;
                } else {
                    return Action.WALK_TO_BANK;
                }
            } else {
                return Action.CATCH_FISH;
            }
        } else if (isInRangeHouse()) {
            if (hasRawFishInInventory() || hasBurntFishInInventory()) {
                return Action.COOK_FISH;
            } else {
                return Action.WALK_TO_BANK;
            }
        } else if (isInBank()) {
            if (hasCookedFishInInventory() || hasRawFishInInventory()) {
                return Action.BANK_FISH;
            } else {
                return Action.WALK_TO_FISH_SPOT;
            }
        } else {
            if (hasCookedFishInInventory())  {
                return Action.WALK_TO_BANK;
            } else if (isInventoryFull()) {
                if (isCookingEnabled) {
                    return Action.WALK_TO_RANGE;
                } else {
                    return Action.WALK_TO_BANK;
                }
            } else {
                return Action.WALK_TO_FISH_SPOT;
            }
        }
    }

    private void catchFish() {
        if (isAtObject2) {
            atObject2(fishSpot);

        } else {
            atObject(fishSpot);
        }
    }

    private void walkToFishSpot() {
        if (isInBank() && isBankDoorClosed()) {
            print("W2F: Bank door is closed!");
            atObject(BANK_DOOR_ID, BANK_DOOR_POS);
        }

        walkTo(424, 495);
        walkTo(fishSpot[1], fishSpot[2] -1);
    }

    private void bankFish() {
        if (isBankWindowVisible()) {
            depositFish();
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

    private void walkToBank() {
        if (isCookingEnabled) {
            if (isInRangeHouse() && isRangeHouseDoorClosed()) {
                print("W2B: Range house door is closed!");
                atWallObject(RANGE_HOUSE_DOOR_ID, RANGE_HOUSE_DOOR_POS);
            }
        } else {
            walkTo(420, 496);
            walkTo(429, 496);
        }

        if (isAtBankDoor()) {
            if (isBankDoorClosed()) {
                print("W2B: Bank door is closed!");
                atObject(BANK_DOOR_ID, BANK_DOOR_POS);
            } else {
                walkTo(440, 495);
            }
        } else {
            walkTo(BANK_DOOR_POS);
        }
    }

    private void cookFish() {
        if (hasRawFishInInventory()) {
            useItemOnObject(RANGE_ID, rawFish);
        } else if (hasBurntFishInInventory()) {
            dropAll(burntFish);
        }
    }

    private void walkToRange() {
        walkTo(420, 495);
        walkTo(430, 492);
        walkTo(435, 486);

        if (isAtRangeHouseDoor()) {
            if (isRangeHouseDoorClosed()) {
                print("W2R: Range house door is closed!");
                atWallObject(RANGE_HOUSE_DOOR_ID, RANGE_HOUSE_DOOR_POS);
            } else {
                walkTo(435, 483);
            }
        }
    }

    private void depositFish() {
        depositAll(IntStream.concat(Arrays.stream(rawFish), Arrays.stream(cookedFish)).toArray());
    }

    private boolean isAtFishSpot() {
        return isPositionInDistance(fishSpot[1], fishSpot[2] -1 , 2);
    }

    private boolean hasCookedFishInInventory() {
        return isItemInInventory(cookedFish);
    }

    private boolean hasRawFishInInventory() {
        return isItemInInventory(rawFish);
    }

    private boolean hasBurntFishInInventory() {
        return isItemInInventory(burntFish);
    }

    private boolean isInRangeHouse() {
        return isPositionInRectangle(getPosition(), RANGE_HOUSE_TOP_POS, RANGE_HOUSE_BOTTOM_POS);
    }

    private boolean isInBank() {
        return isPositionInRectangle(getPosition(), BANK_TOP_POS, BANK_BOTTOM_POS);
    }

    private boolean isBankDoorClosed() {
        return isObjectNear(BANK_DOOR_ID, BANK_DOOR_POS);
    }

    private boolean isRangeHouseDoorClosed() {
        return isWallObjectNear(RANGE_HOUSE_DOOR_ID, RANGE_HOUSE_DOOR_POS);
    }

    private boolean isAtBankDoor() {
        return isPositionInDistance(BANK_DOOR_POS, 0);
    }

    private boolean isAtRangeHouseDoor() {
        return isPositionInDistance(RANGE_HOUSE_DOOR_POS, 0);
    }

    @Override
    protected void onChatMessageReceived(String sender, String message) { }

    @Override
    protected void onGameMessageReceived(String message) { }

    private enum Action {
        CATCH_FISH,
        WALK_TO_RANGE,
        COOK_FISH,
        WALK_TO_BANK,
        BANK_FISH,
        WALK_TO_FISH_SPOT
    }

    private class GUI extends JFrame implements ActionListener {

        private final static String ACTION_COMMAND_SHRIMP = "Shrimp/Anchovies";
        private final static String ACTION_COMMAND_LOBSTER = "Lobsters";
        private final static String ACTION_COMMAND_SHARK = "Sharks";

        private final JPanel fishSelectionPanel;
        private final ButtonGroup fishRadioButtonGroup;
        private final JCheckBox cookingEnabledCheckBox;
        private final Thread scriptThread;

        public GUI(String name, Thread scriptThread) {
            super(name);
            this.scriptThread = scriptThread;

            fishSelectionPanel = createPanel();
            fishRadioButtonGroup = createRadioButtons();
            cookingEnabledCheckBox = createCheckBox();

            add(fishSelectionPanel, BorderLayout.CENTER);
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

            var shrimpButton = createRadioButton(ACTION_COMMAND_SHRIMP, true);
            var lobsterButton = createRadioButton(ACTION_COMMAND_LOBSTER, false);
            var sharkButton = createRadioButton(ACTION_COMMAND_SHARK, false);

            group.add(shrimpButton);
            group.add(lobsterButton);
            group.add(sharkButton);

            fishSelectionPanel.add(shrimpButton);
            fishSelectionPanel.add(lobsterButton);
            fishSelectionPanel.add(sharkButton);

            return group;
        }

        private JCheckBox createCheckBox() {
            var checkBox = new JCheckBox("Is cooking enabled");
            checkBox.setSelected(true);

            fishSelectionPanel.add(checkBox);

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
            var command = fishRadioButtonGroup.getSelection().getActionCommand();

            if (command.equals(ACTION_COMMAND_SHRIMP)) {
                scriptParams = SHRIMP_PARAMS;
            } else if (command.equals(ACTION_COMMAND_LOBSTER)) {
                scriptParams = LOBSTER_PARAMS;
            } else if (command.equals(ACTION_COMMAND_SHARK)) {
                scriptParams = SHARK_PARAMS;
            }

            setScriptParams(cookingEnabledCheckBox.isSelected());

            enableScriptLoop();
            setVisible(false);
        }
    }
}

