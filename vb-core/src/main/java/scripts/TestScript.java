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

        if (isShopWindowVisible()) {
            System.out.println("Window visible");

            var shopItemCount = getCurrentShopItemCount(465);
            if (shopItemCount > 0) {
                System.out.println("Buy item");
                buyShopItem(465, shopItemCount);
            }
        }
        waitFor(3000);
    }

    @Override
    public void onChatMessageReceived(String sender, String message) {
    }

    @Override
    public void onGameMessageReceived(String message) {
        print(message);
    }
}

