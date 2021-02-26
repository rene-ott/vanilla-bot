package rscvanilla.bot.gui;

import com.google.common.eventbus.EventBus;
import rscvanilla.bot.GameApplet;
import rscvanilla.bot.config.AppSettings;
import rscvanilla.bot.gui.bottom.BottomPanel;
import rscvanilla.bot.gui.right.RightPanel;
import rscvanilla.bot.infrastructure.BotException;

import javax.imageio.ImageIO;
import javax.inject.Inject;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

@SuppressWarnings("serial")
public class BotFrame extends JFrame {

    public static int WIDTH = GUIConstants.CONTENT_PANE_WIDTH + RightPanel.WIDTH;
    public static int HEIGHT = GUIConstants.CONTENT_PANE_HEIGHT + BottomPanel.HEIGHT;

    private EventBus eventBus;
    private AppSettings appSettings;

    private final BottomPanel bottomPanel;
    private final RightPanel rightPanel;

    @Inject
    public BotFrame(GameApplet gameApplet,
                    EventBus eventBus,
                    AppSettings appSettings) {
        super(getDefaultTitle());

        this.eventBus = eventBus;
        this.appSettings = appSettings;

        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setDefaultCloseOperation(3);
        getContentPane().setLayout(new BorderLayout());
        setResizable(false);
        getContentPane().add(gameApplet.getApplet());

        this.bottomPanel = createBottomPanel();
        this.rightPanel = createRightPanel();

        setIconImage(getIcon().getImage());
    }

    private RightPanel createRightPanel() {
        var rightPanel = new RightPanel(eventBus, appSettings);
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

    private static String getDefaultTitle() {
        return GUIConstants.NAME + " " + GUIConstants.VERSION;
    }

    private static ImageIcon getIcon() {
        var stream = BotFrame.class.getResourceAsStream("/icon.png");
        ImageIcon icon;
        try {
            icon = new ImageIcon(ImageIO.read(stream));
        } catch (IOException e) {
            throw BotException.of("Failed to load bot icon");
        }

        return icon;
    }
}
