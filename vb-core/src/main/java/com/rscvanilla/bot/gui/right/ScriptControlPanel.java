package com.rscvanilla.bot.gui.right;

import com.google.common.eventbus.EventBus;
import com.rscvanilla.bot.gui.events.ScriptStartButtonClickedEvent;
import com.rscvanilla.bot.gui.GUIConstants;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScriptControlPanel extends JPanel implements ActionListener {

    private final JButton startScriptButton;
    private final EventBus eventBus;

    public ScriptControlPanel(EventBus eventBus) {
        this.eventBus = eventBus;

        startScriptButton = createButton(GUIConstants.BTN_TEXT_START);
        eventBus.register(this);
    }

    @Override
    public void setLayout(LayoutManager mgr) {
        super.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
    }

    @Override
    public void setBorder(Border border) {
        var margin = BorderFactory.createEmptyBorder(10, 10, 10, 10);

        super.setBorder(margin);
    }

    private JButton createButton(String buttonText) {
        var startScriptButton = new JButton(buttonText);

        startScriptButton.setAlignmentX(CENTER_ALIGNMENT);
        startScriptButton.addActionListener(this);

        add(startScriptButton);

        return startScriptButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        var command = e.getActionCommand();
        handleStartButtonClick(command);
    }

    public JButton getStartScriptButton() {
        return startScriptButton;
    }

    public void handleStartButtonClick(String buttonText) {
        var isStart = buttonText.equals(GUIConstants.BTN_TEXT_START);

        eventBus.post(new ScriptStartButtonClickedEvent(isStart));
        startScriptButton.setText(isStart ? GUIConstants.BTN_TEXT_STOP : GUIConstants.BTN_TEXT_START);
    }
}
