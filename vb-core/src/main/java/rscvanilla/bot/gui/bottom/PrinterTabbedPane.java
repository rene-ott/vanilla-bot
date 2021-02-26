package rscvanilla.bot.gui.bottom;


import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import rscvanilla.bot.events.messages.BotMessageEvent;
import rscvanilla.bot.events.messages.GameMessageEvent;
import rscvanilla.bot.events.messages.GameMessageType;

import javax.swing.*;

@SuppressWarnings("serial")
public class PrinterTabbedPane extends JTabbedPane {

    private final PrinterTabPanel botViewTab;
    private final PrinterTabPanel chatViewTab;
    private final PrinterTabPanel globalChatViewTab;

    public PrinterTabbedPane(EventBus eventBus) {
        setTabPlacement(JTabbedPane.BOTTOM);

        botViewTab = createViewTab("Bot");
        chatViewTab = createViewTab("Chat");
        globalChatViewTab = createViewTab("Global Chat");

        eventBus.register(this);
    }

    private PrinterTabPanel createViewTab(String text) {
        var tab = new PrinterTabPanel();
        addTab(text, tab);

        return tab;
    }

    @Subscribe
    public void onBotMessageEventReceived(BotMessageEvent event) {

        Runnable  runnable = () -> botViewTab.appendText(event.formatMessage());
        SwingUtilities.invokeLater(runnable);
    }

    @Subscribe
    public void onGameMessageReceived(GameMessageEvent event) {
        var type = event.getType();

        Runnable runnable = () -> {
            if (type == GameMessageType.CHAT) {
                chatViewTab.appendText(event.formatMessage());
            }
            if (type == GameMessageType.GLOBAL_CHAT) {
                globalChatViewTab.appendText(event.formatMessage());
            }
        };

        SwingUtilities.invokeLater(runnable);
    }
}
