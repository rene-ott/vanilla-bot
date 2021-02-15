package rscvanilla.bot.gui.right;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import rscvanilla.bot.gui.BotFrame;
import rscvanilla.bot.gui.GUIConstants;
import rscvanilla.bot.script.events.ScriptListLoadedEvent;
import rscvanilla.bot.script.events.ScriptStartFailedEvent;
import rscvanilla.bot.script.events.ScriptStartedEvent;
import rscvanilla.bot.script.events.ScriptStoppedEvent;

import javax.swing.*;
import java.awt.*;

public class RightPanel extends JPanel {

    public static int WIDTH = ScriptAntiBanPanel.WIDTH + ScriptSelectionPanel.WIDTH;

    private final ScriptControlPanel scriptControlPanel;
    private final ScriptSelectionPanel scriptSelectionPanel;
    private final ScriptAntiBanPanel scriptAntiBanPanel;

    private final EventBus eventBus;

    public RightPanel(EventBus eventBus) {
        this.eventBus = eventBus;

        this.scriptControlPanel = createScriptControlPanel();
        this.scriptSelectionPanel = createScriptSelectionPanel();
        this.scriptAntiBanPanel = createAntiBanPanel();

        setPreferredSize(new Dimension(RightPanel.WIDTH, BotFrame.HEIGHT));

        eventBus.register(this);
    }

    @Override
    public void setLayout(LayoutManager mgr) {
        super.setLayout(new BorderLayout());
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
    public void onScriptStartFailed(ScriptStartFailedEvent event) {
        scriptControlPanel.getStartScriptButton().setText(GUIConstants.BTN_TEXT_START);
    }

    @Subscribe
    @SuppressWarnings("unused")
    public void onScriptStarted(ScriptStartedEvent event) {
        scriptControlPanel.getStartScriptButton().setText(GUIConstants.BTN_TEXT_STOP);
        scriptSelectionPanel.getScriptSelectionList().setEnabled(false);
        scriptAntiBanPanel.setElementsEnabled(false);
    }

    @Subscribe
    @SuppressWarnings("unused")
    public void onScriptListLoaded(ScriptListLoadedEvent event) {
        scriptSelectionPanel.refreshList(event.getScripts(), event.getSelectedScript());
    }
}
