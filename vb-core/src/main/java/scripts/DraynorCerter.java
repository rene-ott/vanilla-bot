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


public class DraynorCerter extends RunnableScript {

    private static final int FISH_CERTER_ID = 227;
    private static final int ORE_CERTER_ID = 225;
    private static final int BAR_CERTER_ID = 226;

    private final static Position BANK_TOP_POS = new Position(223, 634);
    private final static Position BANK_BOTTOM_POS = new Position(216, 638);

    private final static int BANK_DOOR_ID = 64;
    private final static Position BANK_DOOR_POS = new Position(219, 633);

    private ScriptParams scriptParams;

    public DraynorCerter(ScriptDependencyContext dependencyContext, ScriptAntiBanParams argumentContext) {
        super(dependencyContext, argumentContext);
    }

    @Override
    protected void onStart() {
        super.onStart();

        disableScriptLoop();
        new GUI("Draynor Certer/Uncerter", Thread.currentThread()).init();
    }

    @Override
    protected void loop() {
        waitFor(500);

        switch (getAction()) {
            case CERT -> cert();
            case WALK_TO_BANK -> walkToBank();
            case BANK -> bank();
            case WALK_TO_CERTER -> walkToCerter();
            default -> throw new IllegalStateException();
        }
    }


    private Action getAction() {
        if (isInBank()) {
            if (isCerting()) {
                if (isInventoryEmptyFromResources()) {
                    return Action.BANK;
                } else {
                    return Action.WALK_TO_CERTER;
                }
            } else {
                if (isInventoryEmptyFromResources()) {
                    return Action.WALK_TO_CERTER;
                } else {
                    return Action.BANK;
                }
            }
        } else {
            if (isCerting()) {
                if (isInventoryEmptyFromResources()) {
                    return Action.WALK_TO_BANK;
                } else {
                    return Action.CERT;
                }
            } else {
                if (isInventoryEmptyFromResources()) {
                    return Action.CERT;
                } else {
                    return Action.WALK_TO_BANK;
                }
            }
        }
    }

    private boolean isInventoryEmptyFromResources() {
        return getInventoryItemCount(scriptParams.resourceId) == 0;
    }

    private boolean isCerting() {
        return scriptParams.isCerting;
    }

    private void walkToCerter() {
        if (isInBank()) {
            if (isBankDoorClosed()) {
                print("W2B: Bank door is closed!");
                atObject(BANK_DOOR_ID, BANK_DOOR_POS);
            } else {
                walkTo(227, 631);
            }
        }
    }

    private void bank() {
        if (isBankWindowVisible()) {
            if (isCerting()) {
                if (getBankItemCount(scriptParams.resourceId) <= 25) {
                    stopScript();
                    return;
                }
                depositAll(scriptParams.resourceId);
                waitFor(200);
                withdraw(scriptParams.resourceId, 25);
            } else {
                // TODO: If cert count in inv < 5 then stop
                depositAll(scriptParams.resourceId);
            }
            return;
        }

        if (isOptionsMenuVisible()) {
            answerOption(0);
            waitFor(1500);
            return;
        }

        talkToNpc(95);
        waitFor(2000);
    }

    private void walkToBank() {
        if (isBankDoorClosed()) {
            print("W2B: Bank door is closed!");
            if (isAtBankDoor()) {
                atObject(BANK_DOOR_ID, BANK_DOOR_POS);
            } else {
                walkTo(219, 633);
            }
            return;
        }

        walkTo(220, 635);
    }

    private void cert() {
        if (isOptionsMenuVisible()) {
            if (isFirstMenuVisible()) {
                answerOption(scriptParams.firstMenu.answerPosition);
            } else if (isSecondMenuVisible()) {
                answerOption(scriptParams.secondMenu.answerPosition);
            } else if (isThirdMenuVisible()) {
                answerOption(scriptParams.thirdMenu.answerPosition);
            }
            waitFor(600);
            return;
        }

        talkToNpc(scriptParams.npcId);
        waitFor(2000);
    }

    private boolean isAtBankDoor() {
        return isPositionInDistance(new Position(219, 633), 0);
    }

    private boolean isFirstMenuVisible() {
        return getAnswerOptionPosition(scriptParams.firstMenu.menuText) != -1;
    }

    private boolean isSecondMenuVisible() {
        return getAnswerOptionPosition(scriptParams.secondMenu.menuText) != -1;
    }
    private boolean isThirdMenuVisible() {
        return getAnswerOptionPosition(scriptParams.thirdMenu.menuText) != -1;
    }

    private boolean isInBank() {
        return isPositionInRectangle(getPosition(), BANK_TOP_POS, BANK_BOTTOM_POS);
    }

    private boolean isBankDoorClosed() {
        return isObjectNear(BANK_DOOR_ID, BANK_DOOR_POS);
    }

    private enum Action {
        WALK_TO_CERTER,
        WALK_TO_BANK,
        CERT,
        BANK
    }

    @Override
    protected void onChatMessageReceived(String sender, String message) { }

    @Override
    protected void onGameMessageReceived(String message) { }

    private class ScriptParams {

        private boolean isCerting;
        private final OptionsMenu firstMenu;
        private final OptionsMenu secondMenu;
        private final OptionsMenu thirdMenu;
        private final int resourceId;
        private final int npcId;

        private ScriptParams(int resourceId, int npcId, boolean isCerting, OptionsMenu firstMenu, OptionsMenu secondMenu, OptionsMenu thirdMenu) {
            this.resourceId = resourceId;
            this.npcId = npcId;
            this.isCerting = isCerting;
            this.firstMenu = firstMenu;
            this.secondMenu = secondMenu;
            this.thirdMenu = thirdMenu;
            this.isCerting = isCerting;
        }
    }

    private class OptionsMenu {

        private final String menuText;
        private final int answerPosition;

        private OptionsMenu(String menuText, int answerPosition) {
            this.menuText = menuText;
            this.answerPosition = answerPosition;
        }
    }

    @SuppressWarnings("serial")
    private class GUI extends JFrame implements ActionListener {

        private final static String BAR_IRON = "Iron bar";
        private final static String BAR_SILVER = "Silver bar";
        private final static String BAR_STEEL = "Steel bar";
        private final static String BAR_GOLD = "Gold bar";
        private final static String BAR_MITHRIL = "Mithril bar";

        private final static String ORE_IRON = "Iron ore";
        private final static String ORE_SILVER = "Silver ore";
        private final static String ORE_COAL = "Coal ore";
        private final static String ORE_GOLD = "Gold ore";
        private final static String ORE_MITHRIL = "Mithril ore";

        private final static String FISH_RAW_LOBSTER = "Lobster raw";
        private final static String FISH_LOBSTER = "Lobster";
        private final static String FISH_RAW_SWORDFISH = "Swordfish raw";
        private final static String FISH_SWORDFISH = "Swordfish";

        private final static String ACTION_COMMAND_CERT = "Cert";
        private final static String ACTION_COMMAND_UNCERT = "Uncert";

        private final Thread scriptThread;
        private ButtonGroup buttonGroup;

        public GUI(String name, Thread scriptThread) {
            super(name);
            this.scriptThread = scriptThread;

            setLayout(new GridLayout(4, 1, 5, 5));
            add(createCertingModePanel());
            add(createOreButtonPanel());
            add(createBarButtonPanel());
            add(createFishButtonPanel());

            addWindowListener(stopScriptOnClose());
        }

        public void init() {
            setResizable(false);
            pack();
            setVisible(true);
            setLocationRelativeTo(null);
        }

        private JPanel createCertingModePanel() {
            var panel = createPanel();

            buttonGroup = new ButtonGroup();

            var certButton = createRadioButton(ACTION_COMMAND_CERT, true);
            var uncertButton = createRadioButton(ACTION_COMMAND_UNCERT, false);

            buttonGroup.add(certButton);
            buttonGroup.add(uncertButton);

            panel.add(certButton);
            panel.add(uncertButton);

            return panel;
        }

        private JRadioButton createRadioButton(String label, boolean isSelected) {
            var radioButton = new JRadioButton(label);
            radioButton.setSelected(isSelected);
            radioButton.setActionCommand(label);

            return radioButton;
        }

        private JPanel createFishButtonPanel() {
            var panel = createPanel();

            createButton(FISH_RAW_LOBSTER, panel, true);
            createButton(FISH_LOBSTER, panel, true);
            createButton(FISH_RAW_SWORDFISH, panel, false);
            createButton(FISH_SWORDFISH, panel, false);

            return panel;

        }
        private JPanel createOreButtonPanel() {
            var panel = createPanel();

            createButton(ORE_IRON, panel, true);
            createButton(ORE_SILVER, panel, false);
            createButton(ORE_COAL, panel, true);
            createButton(ORE_GOLD, panel, false);
            createButton(ORE_MITHRIL, panel, true);

            return panel;
        }

        private JPanel createBarButtonPanel() {
            var panel = createPanel();

            createButton(BAR_IRON, panel, false);
            createButton(BAR_SILVER, panel, false);
            createButton(BAR_STEEL, panel, false);
            createButton(BAR_GOLD, panel, false);
            createButton(BAR_MITHRIL, panel, false);

            return panel;

        }

        private JPanel createPanel() {
            var layout = new FlowLayout();
            layout.setAlignment(FlowLayout.CENTER);

            return new JPanel(layout);
        }

        private void createButton(String text, JPanel panel, boolean isEnabled) {
            var button = new JButton(text);
            button.setEnabled(isEnabled);
            button.addActionListener(this);
            panel.add(button);
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
            var isCerting = buttonGroup.getSelection().getActionCommand().equals("Cert");

            scriptParams = createScriptParams(e.getActionCommand(), isCerting);

            enableScriptLoop();
            setVisible(false);
        }

        private ScriptParams createScriptParams(String actionCommand, boolean isCerting) {

            var npcId = getCerterNpcId(actionCommand);
            var firstOption = getFirstOptionsMenu(isCerting);
            var secondOptionsMenu = getSecondOptionsMenu(npcId, actionCommand);
            var thirdMenu = getThirdOptionsMenu();

            return new ScriptParams(
                getResourceId(actionCommand),
                npcId,
                isCerting,
                firstOption,
                secondOptionsMenu,
                thirdMenu
            );
        }

        private int getResourceId(String actionCommand) {
            return switch (actionCommand) {
                case ORE_IRON -> 151;
                case ORE_COAL -> 155;
                case ORE_MITHRIL -> 153;
                case FISH_LOBSTER -> 373;
                case FISH_RAW_LOBSTER -> 372;
                default -> throw new NotImplementedException(actionCommand);
            };
        }

        private OptionsMenu getThirdOptionsMenu() {
            return new OptionsMenu("five", 4);
        }

        private OptionsMenu getSecondOptionsMenu(int certerNpcId, String actionCommand) {
            return new OptionsMenu(getSecondOptionsMenuText(certerNpcId), getSecondOptionsAnswerPosition(actionCommand));
        }

        private String getSecondOptionsMenuText(int certerNpcId) {
            return switch (certerNpcId) {
                case ORE_CERTER_ID, BAR_CERTER_ID -> "iron";
                case FISH_CERTER_ID -> "Lobster";
                default -> throw new IllegalArgumentException();
            };
        }

        private int getSecondOptionsAnswerPosition(String actionCommand) {
            return switch (actionCommand) {
                case ORE_IRON, BAR_IRON, FISH_LOBSTER -> 0;
                case ORE_COAL, BAR_STEEL, FISH_RAW_LOBSTER -> 1;
                case ORE_MITHRIL, BAR_MITHRIL, FISH_SWORDFISH -> 2;
                case ORE_GOLD, BAR_GOLD, FISH_RAW_SWORDFISH -> 3;
                case ORE_SILVER, BAR_SILVER -> 4;

                default -> throw new IllegalArgumentException();
            };
        }

        private OptionsMenu getFirstOptionsMenu(boolean isCerting) {
            return new OptionsMenu("What is a", isCerting ? 1 : 0);
        }

        private int getCerterNpcId(String actionCommand) {

            return switch (actionCommand) {
                case ORE_IRON, ORE_COAL, ORE_GOLD, ORE_SILVER, ORE_MITHRIL -> ORE_CERTER_ID;
                case BAR_IRON, BAR_SILVER, BAR_STEEL, BAR_GOLD, BAR_MITHRIL -> BAR_CERTER_ID;
                case FISH_LOBSTER, FISH_RAW_LOBSTER, FISH_SWORDFISH, FISH_RAW_SWORDFISH -> FISH_CERTER_ID;
                default -> throw new IllegalArgumentException();
            };
        }
    }
}

