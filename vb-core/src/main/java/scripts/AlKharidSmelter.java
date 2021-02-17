package scripts;

import org.apache.commons.lang3.NotImplementedException;
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


public class AlKharidSmelter extends RunnableScript {

    private final static Position BANK_TOP_POS = new Position(93, 689);
    private final static Position BANK_BOTTOM_POS = new Position(87, 700);

    private final static Position FURNACE_TOP_POS = new Position(86, 678);
    private final static Position FURNACE_BOTTOM_POS = new Position(82, 681);
    private final static Position FURNACE_IN_FRONT = new Position(84, 679);
    private final static int BANK_DOOR_ID = 64;
    private final static Position BANK_DOOR_POS = new Position(86, 695);

    private final static int FURNACE_ID = 118;
    private final static int SLEEPING_BAG_ID = 1263;

    private ScriptParams scriptParams;
    private Action state;
    private int intensiveClickCount;

    public AlKharidSmelter(ScriptDependencyContext dependencyContext, ScriptAntiBanParams argumentContext) {
        super(dependencyContext, argumentContext);
    }

    @Override
    protected void onStart() {
        super.onStart();

        disableScriptLoop();
        new GUI("Al-Kharid Smelter", Thread.currentThread()).init();
    }

    @Override
    protected void loop() {
        waitFor(700);

        if (getFatigue() > 90) {
            useSleepingBag();
            waitFor(4000);
            return;
        }

        var state = getAction();
        if (this.state != state) {
            print("State %s -> %s", this.state, state);
            this.state = state;
        }

        switch (state) {
            case SMELTING -> abusiveSmelt();
            case WALK_TO_BANK -> walkToBank();
            case BANKING -> bank();
            case WALK_TO_FURNACE -> walkToFurnace();
            default -> throw new IllegalStateException();
        }
    }

    private void abusiveSmelt() {
        if (intensiveClickCount == 3) {
            intensiveClickCount = 0;
            waitFor(2500);
        }

        if (hasMoreThanExactOreCountInInventoryForBar()) {
            dropAllOres();
            waitFor(1000);
        } else if (hasExactPrimaryOreCountInInventoryForBar() && (!hasSecondaryOre() || hasExactSecondaryOreCountInInventoryForBar())) {
            useOreOnFurnace();
            intensiveClickCount++;
            waitFor(50);
        } else if (hasEnoughOresForBarOnGroundOrInInventory()) {
            if (!hasExactPrimaryOreCountInInventoryForBar()) {
                takePrimaryOreFromGround();
            } else if (hasSecondaryOre() && !hasExactSecondaryOreCountInInventoryForBar()) {
                takeSecondaryOreFromGround();
            }
            waitFor(300);
        } else {
            print("DONE");
        }
    }

    private void walkToBank() {
        if (isPositionInDistance(85, 696, 2)) {
            if (isBankDoorClosed()) {
                atObject(BANK_DOOR_ID, BANK_DOOR_POS);
            } else {
                walkTo(89, 695);
            }
        } else {
            walkTo(85, 696);
        }

        waitFor(400);
    }

    private boolean isBankDoorClosed() {
        return isObjectNear(BANK_DOOR_ID, BANK_DOOR_POS);
    }

    private void bank() {
        if (isBankWindowVisible()) {
            if (haveBarsInInventory()) {
                depositAll(scriptParams.barId);
            } else if (haveRanOutOfOres()) {
                stopScript("Ran out of bars");
            } else if (!hasExactPrimaryOreCountInInventoryForSmelting()) {
                depositAll(scriptParams.primaryOre.id);
                withdraw(scriptParams.primaryOre.id, scriptParams.primaryOre.count);
            } else if (hasSecondaryOre() && !hasExactSecondaryOreCountInInventoryForSmelting()) {
                depositAll(scriptParams.secondaryOre.id);
                withdraw(scriptParams.secondaryOre.id, scriptParams.secondaryOre.count);
            }
            waitFor(700);
            return;
        }

        if (isOptionsMenuVisible()) {
            answerOption(0);
            waitFor(5000);
            return;
        }

        talkToNpc(268);
        waitFor(2000);
    }

    private void walkToFurnace() {
        if (isInBank() & isBankDoorClosed()) {
            atObject(BANK_DOOR_ID, BANK_DOOR_POS);
            waitFor(400);
            return;
        }
        if (isAtFurnace() && isAnotherPlayerOnPos(FURNACE_IN_FRONT)) {
            useItemOnObject(SLEEPING_BAG_ID, FURNACE_ID);
            waitFor(1000);
        } else {
            walkTo(FURNACE_IN_FRONT);
        }
    }

    private Action getAction() {
        if (isInBank()) {
            if (haveBarsInInventory() ||
                !hasExactPrimaryOreCountInInventoryForSmelting() ||
                (hasSecondaryOre() && !hasExactSecondaryOreCountInInventoryForSmelting())) {

                return Action.BANKING;
            } else {
                return Action.WALK_TO_FURNACE;
            }
        } else if (isInFrontOfFurnace() /*isAtFurnace()*/) {
            if (hasEnoughOresForBarOnGroundOrInInventory()) {
                return Action.SMELTING;
            } else {
                return Action.WALK_TO_BANK;
            }
        } else {
            if (hasExactPrimaryOreCountInInventoryForSmelting() && (!hasSecondaryOre() || hasExactSecondaryOreCountInInventoryForSmelting())) {
                return Action.WALK_TO_FURNACE;
            } else {
                return Action.WALK_TO_BANK;
            }
        }
    }

    private void dropAllOres() {
        dropAll(scriptParams.primaryOre.id);
        waitFor(200);
        if (hasSecondaryOre()) {
            dropAll(scriptParams.secondaryOre.id);
            waitFor(200);
        }
    }
    private boolean hasMoreThanExactOreCountInInventoryForBar() {
        return hasSecondaryOre()
            ? hasMoreThanExactPrimaryOreCountInInventoryForBar() || hasMoreThanExactSecondaryOreCountInInventoryForBar()
            : hasMoreThanExactPrimaryOreCountInInventoryForBar();
    }

    private boolean hasMoreThanExactPrimaryOreCountInInventoryForBar() { return getInventoryPrimaryOreCount() > scriptParams.primaryOre.perBar; }
    private boolean hasMoreThanExactSecondaryOreCountInInventoryForBar() { return getInventorySecondaryOreCount() > scriptParams.secondaryOre.perBar; }

    private void takePrimaryOreFromGround() { takeGroundItemFromCurrentPos(scriptParams.primaryOre.id); }
    private void takeSecondaryOreFromGround() { takeGroundItemFromCurrentPos(scriptParams.secondaryOre.id); }

    private void useOreOnFurnace() { useItemOnObject(scriptParams.primaryOre.id, FURNACE_ID); }

    private boolean hasExactPrimaryOreCountInInventoryForBar() { return getInventoryPrimaryOreCount() == scriptParams.primaryOre.perBar; }
    private boolean hasExactSecondaryOreCountInInventoryForBar() { return getInventorySecondaryOreCount() == scriptParams.secondaryOre.perBar; }

    private boolean hasEnoughOresForBarOnGroundOrInInventory() {
        return hasSecondaryOre()
            ? hasEnoughPrimaryOresForBarOnGroundOrInInventory() && hasEnoughSecondaryOresForBarOnGroundOrInInventory()
            : hasEnoughPrimaryOresForBarOnGroundOrInInventory();
    }

    private boolean hasEnoughPrimaryOresForBarOnGroundOrInInventory() { return getGroundPrimaryOreCount() + getInventoryPrimaryOreCount() >= scriptParams.primaryOre.perBar; }
    private boolean hasEnoughSecondaryOresForBarOnGroundOrInInventory() { return getGroundSecondaryOreCount() + getInventorySecondaryOreCount() >= scriptParams.secondaryOre.perBar; }
    private boolean hasExactPrimaryOreCountInInventoryForSmelting() { return getInventoryPrimaryOreCount() == scriptParams.primaryOre.count; }
    private boolean hasExactSecondaryOreCountInInventoryForSmelting() { return getInventorySecondaryOreCount() == scriptParams.secondaryOre.count; }

    private int getGroundPrimaryOreCount() { return getGroundItemCountOnCurrentPos(scriptParams.primaryOre.id); }
    private int getInventoryPrimaryOreCount() { return getInventoryItemCount(scriptParams.primaryOre.id); }
    private int getGroundSecondaryOreCount() { return getGroundItemCountOnCurrentPos(scriptParams.secondaryOre.id); }
    private int getInventorySecondaryOreCount() { return getInventoryItemCount(scriptParams.secondaryOre.id); }

    private boolean hasSecondaryOre() { return scriptParams.secondaryOre != null; }

    private boolean haveBarsInInventory() { return isItemInInventory(scriptParams.barId); }

    private boolean isInFrontOfFurnace() { return getPosition().equals(FURNACE_IN_FRONT); }
    private boolean isAtFurnace() { return isPositionInRectangle(getPosition(), FURNACE_TOP_POS, FURNACE_BOTTOM_POS); }
    private boolean isInBank() { return isPositionInRectangle(getPosition(), BANK_TOP_POS, BANK_BOTTOM_POS); }

    private boolean haveRanOutOfOres() {
        return getBankItemCount(scriptParams.primaryOre.id) < scriptParams.primaryOre.count ||
               (hasSecondaryOre() && getBankItemCount(scriptParams.secondaryOre.id) < scriptParams.secondaryOre.count);
    }

    @Override
    protected void onChatMessageReceived(String sender, String message) { }

    @Override
    protected void onGameMessageReceived(String message) { }

    private enum Action {
        WALK_TO_FURNACE,
        WALK_TO_BANK,
        SMELTING,
        BANKING
    }

    private class ScriptParams {

        private final Ore primaryOre;
        private final Ore secondaryOre;
        private final Integer barId;

        private ScriptParams(int barId, Ore primaryOre, Ore secondaryOre) {
            this.barId = barId;
            this.primaryOre = primaryOre;
            this.secondaryOre = secondaryOre;
        }
    }

    private class Ore {

        private final int id;
        private final int count;
        private final int perBar;

        private Ore(int id, int count, int perBar) {
            this.id = id;
            this.count = count;
            this.perBar = perBar;
        }
    }

    private class GUI extends JFrame implements ActionListener {

        private final static String BRONZE = "Bronze";
        private final static String IRON = "Iron";
        private final static String SILVER = "Silver";
        private final static String STEEL = "Steel";
        private final static String GOLD = "Gold";
        private final static String MITHRIL = "Mithril";
        private final static String ADAMANTITE = "Adamantite";
        private final static String RUNITE = "Runite";

        private final Thread scriptThread;
        private final JPanel panel;

        public GUI(String name, Thread scriptThread) {
            super(name);
            this.scriptThread = scriptThread;
            add(this.panel = createPanel());
            createButtons();

            addWindowListener(stopScriptOnClose());
        }

        public void init() {
            setResizable(false);
            pack();
            setVisible(true);
            setLocationRelativeTo(null);
        }

        private void createButtons() {
            createButton(BRONZE);
            createButton(IRON);
            createButton(SILVER);
            createButton(STEEL);
            createButton(GOLD);
            createButton(MITHRIL);
            createButton(ADAMANTITE);
            createButton(RUNITE);
        }

        private JPanel createPanel() {
            var layout = new FlowLayout();
            layout.setAlignment(FlowLayout.CENTER);

            return new JPanel(layout);
        }

        private JButton createButton(String text) {
            var button = new JButton(text);
            button.addActionListener(this);
            panel.add(button);

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
            var command = e.getActionCommand();

            if (command.equals(BRONZE)) {
                scriptParams = new ScriptParams(169, new Ore(150, 9, 1), new Ore(202, 9, 1));
            } else if (command.equals(IRON)) {
                throw new NotImplementedException();
            } else if (command.equals(SILVER)) {
                throw new NotImplementedException();
            } else if (command.equals(STEEL)) {
                throw new NotImplementedException();
            } else if (command.equals(GOLD)) {
                throw new NotImplementedException();
            } else if (command.equals(MITHRIL)) {
                throw new NotImplementedException();
            } else if (command.equals(ADAMANTITE)) {
                throw new NotImplementedException();
            } else if (command.equals(RUNITE)) {
                throw new NotImplementedException();
            }

            enableScriptLoop();
            setVisible(false);
        }
    }
}

