package scripts;

import rscvanilla.bot.script.ScriptDependencyContext;
import rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import rscvanilla.bot.script.template.RunnableScript;

import javax.swing.*;
import java.awt.*;

public class SimpleAutoCaster extends RunnableScript {

    public SimpleAutoCaster(ScriptDependencyContext dependencyContext, ScriptAntiBanParams argumentContext) {
        super(dependencyContext, argumentContext);
    }

    private int npcId;
    private int combatStyle;
    private volatile int spellId = -1;

    public String [][] spells = {
        {"Wind strike", "0"},
        {"Water strike", "2"},
        {"Earth strike", "4"},
        {"Fire strike", "6"},
        {"Wind bolt", "8"},
        {"Water bolt", "11"},
        {"Earth bolt", "14"},
        {"Fire bolt", "17"},
        {"Crumble undead", "19"},
        {"Wind blast", "20"},
        {"Water blast", "23"},
        {"Iban blast", "25"},
        {"Earth blast", "27"},
        {"Fire blast", "32"},
        {"Claws of Guthix", "33"},
        {"Saradomin strike", "34"},
        {"Flames of Zamorak", "35"},
        {"Wind wave", "37"},
        {"Water wave", "39"},
        {"Earth wave", "43"},
        {"Fire wave", "45"}
    };

    @Override
    protected void onStart() {
        super.onStart();
        var frame = new JFrame("Simple Auto Caster");

        npcId = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter NPC Id"));
        combatStyle = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter fight mode (0-3):"));;
        setCombatStyle(combatStyle);

        addButtonsToGui(frame);
        frame.setLayout(new GridLayout(7, 3));
        frame.setResizable(false);
        frame.setSize(new Dimension(200, 100));
        frame.setVisible(true);
        frame.pack();
        frame.setLocationRelativeTo(null);

        while (spellId == -1) {

        }
    }

    @Override
    protected void loop() {
        if (getCombatStyle() != combatStyle) {
            setCombatStyle(combatStyle);
        }

        if (!isInCombat()) {
            if (getFatigue() > 90) {
                useSleepingBag();
                waitFor(3000);
                return;
            }
        }
        castOnNpc(spellId, npcId);
        waitFor(1000);
    }

    private void addButtonsToGui(JFrame frame) {
        for (var i = 0; i < spells.length; i++) {
            frame.add(createButton(i, frame));
        }
    }

    private JButton createButton(int index, JFrame frame) {
        var button = new JButton(spells[index][0]);
        button.addActionListener(it -> {
            this.spellId = Integer.parseInt(spells[index][1]);
            frame.setVisible(false);
        });

        return button;
    }

    @Override
    protected void onChatMessageReceived(String sender, String message) { }

    @Override
    protected void onGameMessageReceived(String message) { }
}

