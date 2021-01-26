package rscvanilla.bot.gui;

import com.google.common.eventbus.EventBus;
import rscvanilla.bot.GameApplet;
import rscvanilla.bot.gui.bottom.BottomPanel;
import rscvanilla.bot.gui.right.RightPanel;

import javax.inject.Inject;
import javax.swing.*;
import java.awt.*;

public class BotFrame extends JFrame {

    public static int WIDTH = GUIConstants.CONTENT_PANE_WIDTH + RightPanel.WIDTH;
    public static int HEIGHT = GUIConstants.CONTENT_PANE_HEIGHT + BottomPanel.HEIGHT;

    private EventBus eventBus;

    private BottomPanel bottomPanel;
    private RightPanel rightPanel;

    @Inject
    public BotFrame(GameApplet gameApplet,
                    EventBus eventBus) {
        super(GUIConstants.NAME + " " + GUIConstants.VERSION);

        this.eventBus = eventBus;

        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setDefaultCloseOperation(3);
        getContentPane().setLayout(new BorderLayout());
        setResizable(false);
        getContentPane().add(gameApplet.getApplet());

        this.bottomPanel = createBottomPanel();
        this.rightPanel = createRightPanel();
    }

    private RightPanel createRightPanel() {
        var rightPanel = new RightPanel(eventBus);
        add(rightPanel, BorderLayout.EAST);
        return rightPanel;
    }

    private BottomPanel createBottomPanel() {
        var bottomPanel = new BottomPanel(eventBus);
        add(bottomPanel, BorderLayout.SOUTH);
        return bottomPanel;
    }

    public void open() {
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
