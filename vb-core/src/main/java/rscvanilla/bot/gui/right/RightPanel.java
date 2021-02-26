package rscvanilla.bot.gui.right;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import rscvanilla.bot.config.AppSettings;
import rscvanilla.bot.mudclient.handlers.userlogaction.events.UserLoginActionEvent;
import rscvanilla.bot.gui.BotFrame;
import rscvanilla.bot.gui.GUIConstants;
import rscvanilla.bot.script.events.ScriptListLoadedEvent;
import rscvanilla.bot.script.events.ScriptStartFailedEvent;
import rscvanilla.bot.script.events.ScriptStartedEvent;
import rscvanilla.bot.script.events.ScriptStoppedEvent;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class RightPanel extends JPanel {

    public static int WIDTH = ScriptAntiBanPanel.WIDTH + ScriptSelectionPanel.WIDTH;

    private final ScriptControlPanel scriptControlPanel;
    private final ScriptSelectionPanel scriptSelectionPanel;
    private final ScriptAntiBanPanel scriptAntiBanPanel;
    private final UserSelectionPanel userSelectionPanel;

    private final EventBus eventBus;
    private final AppSettings appSettings;

    public RightPanel(EventBus eventBus, AppSettings appSettings) {
        this.eventBus = eventBus;
        this.appSettings = appSettings;

        scriptControlPanel = createScriptControlPanel();
        scriptSelectionPanel = createScriptSelectionPanel();
        scriptAntiBanPanel = createAntiBanPanel();
        userSelectionPanel = createUserSelectionPanel();

        setPreferredSize(new Dimension(RightPanel.WIDTH, BotFrame.HEIGHT));

        eventBus.register(this);
    }

    @Override
    public void setLayout(LayoutManager mgr) {
        super.setLayout(new BorderLayout());
    }

    private UserSelectionPanel createUserSelectionPanel() {
        var panel = new UserSelectionPanel(eventBus, appSettings);
        add(panel, BorderLayout.NORTH);

        return panel;
    }

    private ScriptControlPanel createScriptControlPanel() {
        var panel = new ScriptControlPanel(eventBus);
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(panel, BorderLayout.SOUTH);

        return panel;
    }

    private ScriptSelectionPanel createScriptSelectionPanel() {
        var panel = new ScriptSelectionPanel(eventBus);
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(panel, BorderLayout.CENTER);

        return panel;
    }

    private ScriptAntiBanPanel createAntiBanPanel() {
        var panel = new ScriptAntiBanPanel(eventBus);
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(panel, BorderLayout.EAST);

        return panel;
    }

    @Subscribe
    @SuppressWarnings("unused")
    public void onScriptStopped(ScriptStoppedEvent event) {
        scriptControlPanel.getStartScriptButton().setText(GUIConstants.BTN_TEXT_START);
        scriptSelectionPanel.getScriptSelectionList().setEnabled(true);
        scriptAntiBanPanel.setElementsEnabled(true);
    }

    @Subscribe
    @SuppressWarnings("unused")
    public void onUserLogged(UserLoginActionEvent event) {
        switch (event.getAction()) {
            case SENT_LOGGING_IN -> SwingUtilities.invokeLater(() -> userSelectionPanel.setSelectedUsername(event.getUsername()));
            case LOGGED_IN -> SwingUtilities.invokeLater(() -> userSelectionPanel.setEnabled(false));
            case LOGGED_OUT -> SwingUtilities.invokeLater(() -> userSelectionPanel.setEnabled(true));
        }
    }

    @Subscribe
    @SuppressWarnings("unused")
    public void onScriptStartFailed(ScriptStartFailedEvent event) {
        scriptControlPanel.getStartScriptButton().setText(GUIConstants.BTN_TEXT_START);
    }

    @Subscribe
    @SuppressWarnings("unused")
    public void onScriptStarted(ScriptStartedEvent event) {
        scriptControlPanel.getStartScriptButton().setText(GUIConstants.BTN_TEXT_STOP);
        scriptSelectionPanel.getScriptSelectionList().setEnabled(false);

        scriptAntiBanPanel.setElementsEnabled(false);
        scriptAntiBanPanel.getIgnoredPlayersDialogOpenButton().dispatchScriptAntiBanIgnoredUsers();
    }

    @Subscribe
    @SuppressWarnings("unused")
    public void onScriptListLoaded(ScriptListLoadedEvent event) {
        scriptSelectionPanel.refreshList(event.getScripts(), event.getSelectedScript());
    }
}
