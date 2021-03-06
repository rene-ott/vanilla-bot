package scripts;

import rscvanilla.bot.script.ScriptDependencyContext;
import rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import rscvanilla.bot.script.template.RunnableScript;

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
        waitFor(3000);
    }

    @Override
    public void onChatMessageReceived(String sender, String message) {
        print(String.format("%s:%s", sender, message));
    }

    @Override
    public void onGameMessageReceived(String message) {
        print(message);
    }
}

