package com.rscvanilla.bot.gui.bottom;


import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import com.rscvanilla.bot.events.InGameMessageReceivedEvent;
import com.rscvanilla.bot.events.MessageEvent;
import com.rscvanilla.bot.events.MessagePrintingEvent;

import javax.swing.*;

public class PrinterTabbedPane extends JTabbedPane {

    private PrinterTabPanel botViewTab;
    private PrinterTabPanel chatViewTab;
    private PrinterTabPanel globalChatViewTab;

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
    public void onMessagePrintedReceived(MessagePrintingEvent event) {
        if (!event.isMessagePrintedType()) {
            return;
        }

        Runnable  runnable = () -> botViewTab.appendText(event.getCompleteMessage());
        SwingUtilities.invokeLater(runnable);
    }

    @Subscribe
    public void onInGameMessageReceived(InGameMessageReceivedEvent event) {
        if (!event.isInGameMessageReceivedType()) {
            return;
        }

        var type = event.getType();

        Runnable runnable = () -> {
            if (type == MessageEvent.Type.IN_GAME_CHAT) {
                chatViewTab.appendText(event.getCompleteMessage());
            }
            if (type == MessageEvent.Type.IN_GAME_GLOBAL_CHAT) {
                globalChatViewTab.appendText(event.getCompleteMessage());
            }
        };
        SwingUtilities.invokeLater(runnable);
    }
}
