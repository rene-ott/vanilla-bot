package com.rscvanilla.bot.gui.bottom;

import com.google.common.eventbus.EventBus;
import com.rscvanilla.bot.gui.GUIConstants;

import javax.swing.*;
import java.awt.*;

public class BottomPanel extends JPanel {

    public static int HEIGHT = 175;
    public static int WIDTH = GUIConstants.CONTENT_PANE_WIDTH;

    private PrinterTabbedPane printerTabbedPane;
    private EventBus eventBus;

    public BottomPanel(EventBus eventBus) {
        this.eventBus = eventBus;
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        printerTabbedPane = createLogViewTabbedPane();
    }

    private PrinterTabbedPane createLogViewTabbedPane() {
        var tabbedPane = new PrinterTabbedPane(eventBus);
        add(tabbedPane);

        return tabbedPane;
    }

    public PrinterTabbedPane getLogViewTabbedPane() {
        return printerTabbedPane;
    }
 }
