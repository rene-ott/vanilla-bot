package scripts;

import rscvanilla.bot.script.ScriptDependencyContext;
import rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import rscvanilla.bot.script.template.RunnableScript;

import javax.swing.*;

public class DarkWizardTowerFighter extends RunnableScript {

    private int combatStyle;
    private String pickUpBones;

    private static final int BONES = 20;
    private static final int[] PICK_UP_ITEMS = { 10, 31, 32, 33, 34, 35, 36, 38, 40, 41, 42, 46, 619};
    private static final int[] WIZARDS = { 57, 60 };

    private static final int[] FIRST_TO_SECOND_LADDER = { 5, 360, 570 };
    private static final int[] SECOND_TO_THIRD_LADDER = { 5, 363, 1514 };
    private static final int[] THIRD_TO_SECOND_LADDER = { 6, 363, 2458 };
    private static final int[] SECOND_TO_FIRST_LADDER = { 6, 360, 1514 };

    private int currentFloor;
    private int previousFloor;

    public DarkWizardTowerFighter(ScriptDependencyContext dependencyContext, ScriptAntiBanParams argumentContext) {
        super(dependencyContext, argumentContext);
    }

    @Override
    protected void onStart() {
        super.onStart();

        var frame = new JFrame("Dark Wizard Tower Fighter");
        combatStyle = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter fight mode (0-3): "));
        pickUpBones = JOptionPane.showInputDialog(frame, "Pick bones: (y/n)");

        currentFloor = getCurrentFloor();
        previousFloor = -1;

        setCombatStyle(combatStyle);
    }

    @Override
    protected void loop() {
        waitFor(400);

        if (isInCombat()) {
            return;
        }

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

        if (pickUpBones.equalsIgnoreCase("y")) {
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

        if (getCombatStyle() != combatStyle) {
            setCombatStyle(combatStyle);
        }

        if (isNpcNear(WIZARDS)) {
            attackNpc(WIZARDS);
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
}
