package scripts;

import com.rscvanilla.bot.script.ScriptDependencyContext;
import com.rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import com.rscvanilla.bot.script.template.RunnableScript;

import javax.swing.*;

public class SimpleAutoThiever extends RunnableScript {

    public SimpleAutoThiever(ScriptDependencyContext dependencyContext, ScriptAntiBanParams argumentContext) {
        super(dependencyContext, argumentContext);
    }

    private int npcId;
    private int combatStyle;

    @Override
    protected void onStart() {
        super.onStart();
        var frame = new JFrame("Simple Auto Thiever");
        npcId = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter NPC Id"));
        combatStyle = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter fight mode (0-3):"));;
        setCombatStyle(combatStyle);
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
            pickpocketNpc(npcId);
        } else {
            walkTo(getPosition());
        }
        waitFor(500);
    }
}
