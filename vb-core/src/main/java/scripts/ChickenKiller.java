package scripts;

import com.rscvanilla.bot.script.ScriptDependencyContext;
import com.rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import com.rscvanilla.bot.script.template.RunnableScript;

import javax.swing.*;

public class ChickenKiller extends RunnableScript {

    public ChickenKiller(ScriptDependencyContext dependencyContext, ScriptAntiBanParams argumentContext) {
        super(dependencyContext, argumentContext);
    }

    private int combatStyle;
    private String pickBones;

    private static final int NPC_CHICKEN_ID = 3;
    private static final int ITEM_FEATHERS_ID = 381;
    private static final int BONES = 20;

    @Override
    protected void onStart() {
        super.onStart();

        combatStyle = Integer.parseInt(JOptionPane.showInputDialog(new JFrame("Chicken Killer"), "Enter fight mode (0-3): "));
        pickBones = JOptionPane.showInputDialog(new JFrame("Chicken Killer"), "Pick bones: (y/n)");

        setCombatStyle(combatStyle);
    }

    @Override
    protected void loop() {
        if (isInCombat()) {
            return;
        }

        if (getFatigue() > 90) {
            useSleepingBag();
            waitFor(1000);
            return;
        }

        if (isItemOnGround(ITEM_FEATHERS_ID)) {
            takeItemFromGround(ITEM_FEATHERS_ID);
            waitFor(300);
            return;
        }

        if (pickBones.equals("y")) {
            if (isItemOnGround(BONES)) {
                takeItemFromGround(BONES);
                waitFor(300);
                return;
            }

            if (isItemInInventory(BONES)) {
                useItem(BONES);
                waitFor(300);
                return;
            }
        }

        if (getCombatStyle() != combatStyle) {
            setCombatStyle(combatStyle);
        }

        if (!isInCombat()) {
            attackNpc(NPC_CHICKEN_ID);
        }

        waitFor(1000);
    }
}
