package scripts;

import com.rscvanilla.bot.script.ScriptDependencyContext;
import com.rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import com.rscvanilla.bot.script.template.RunnableScript;

public class TestScript extends RunnableScript {

    public TestScript(ScriptDependencyContext dependencyContext, ScriptAntiBanParams argumentContext) {
        super(dependencyContext, argumentContext);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void loop() {
        if (getFatigue() > 90) {
            useSleepingBag();
            waitFor(4000);
            return;
        }

        waitFor(2000);
        print("RUNNING");
    }
}

