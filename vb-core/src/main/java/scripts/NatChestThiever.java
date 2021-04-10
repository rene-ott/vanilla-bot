package scripts;

import rscvanilla.bot.script.ScriptDependencyContext;
import rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import rscvanilla.bot.script.template.RunnableScript;

public class NatChestThiever extends RunnableScript {

    public NatChestThiever(ScriptDependencyContext dependencyContext, ScriptAntiBanParams argumentContext) {
        super(dependencyContext, argumentContext);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void loop() {
        atGroundObject2(335);
        waitFor(500);
    }

    @Override
    public void onChatMessageReceived(String sender, String message) {
    }

    @Override
    public void onGameMessageReceived(String message) { }
}

