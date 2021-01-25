package scripts;

import com.rscvanilla.bot.script.ScriptDependencyContext;
import com.rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import com.rscvanilla.bot.script.template.RunnableScript;

public class SimpleWoodcutter extends RunnableScript {

    public SimpleWoodcutter(ScriptDependencyContext dependencyContext, ScriptAntiBanParams argumentContext) {
        super(dependencyContext, argumentContext);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void loop() {
        waitFor(500);

        if (getFatigue() > 90) {
            useSleepingBag();
            waitFor(1000);
            return;
        }

        atObject(1, 0);
    }
}

