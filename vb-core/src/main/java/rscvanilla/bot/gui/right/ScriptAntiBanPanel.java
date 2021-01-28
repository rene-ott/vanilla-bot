package rscvanilla.bot.gui.right;

import com.google.common.eventbus.EventBus;
import rscvanilla.bot.gui.BotFrame;
import rscvanilla.bot.gui.events.ScriptAntiBanParamsChangedEvent;
import rscvanilla.bot.script.antiban.ScriptAntiBanParams;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ScriptAntiBanPanel extends JPanel implements ItemListener, ChangeListener, ActionListener {

    public static int WIDTH = 175;

    private final int gridRows = 6;
    private final int gridColumns = 2;
    private final JPanel[][] panelHolder = new JPanel[gridRows][gridColumns];

    private final JCheckBox enableCheckBox;
    private final JCheckBox logoutCheckBox;
    private final JSpinner logoutMinutes;

    private final JSpinner distanceSpinner;
    private final JSpinner pauseMinutesSpinner;

    private final JComboBox actionComboBox;

    private final String ACTION_NOTHING = "-";
    private final String ACTION_PAUSE = "Pause";
    private final String ACTION_STOP = "Stop";

    private final EventBus eventBus;

    public ScriptAntiBanPanel(EventBus eventBus) {
        this.eventBus = eventBus;

        initPanelHolder();

        panelHolder[0][0].add(new JLabel("Enable:"));
        panelHolder[0][1].add(enableCheckBox = createCheckBox(""));

        panelHolder[1][0].add(new JLabel("Distance:"));
        panelHolder[1][1].add(distanceSpinner = createSpinner(1, 60, 10));

        panelHolder[2][0].add(new JLabel("Action:"));
        panelHolder[2][1].add(actionComboBox = createActionComboBox(ACTION_NOTHING, ACTION_PAUSE, ACTION_STOP));

        panelHolder[3][0].add(new JLabel("Pause min:"));
        panelHolder[3][1].add(pauseMinutesSpinner = createSpinner(1, 60, 10));

        panelHolder[4][0].add(new JLabel("Logout:"));
        panelHolder[4][1].add(logoutCheckBox = createCheckBox(""));

        panelHolder[5][0].add(new JLabel("Logout min:"));
        panelHolder[5][1].add(logoutMinutes = createSpinner(0, 5, 1));

        setElementsEnabled(false, false);
        distanceSpinner.setValue(10);
        logoutMinutes.setValue(1);
        pauseMinutesSpinner.setValue(10);

        setPreferredSize(new Dimension(WIDTH, BotFrame.HEIGHT));
    }

    public void initPanelHolder() {
        for(var m = 0; m < gridRows; m++) {
            for(int n = 0; n < gridColumns; n++) {
                var panel = new JPanel();
                panel.setLayout(new GridLayout(0, 1));
                if (n == 0) {
                    panel.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
                } else {
                    panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 0));
                }
                add(panelHolder[m][n] = panel);
            }
        }
    }

    @Override
    public void setLayout(LayoutManager mgr) {
        super.setLayout(new GridLayout(gridRows, gridColumns));
    }

    @Override
    public void setBorder(Border border) {
        var outsideBorder = BorderFactory.createEmptyBorder(10, 0, 10, 10);
        var insideBorder = BorderFactory.createTitledBorder("If Player Near");
        var compoundBorder = BorderFactory.createCompoundBorder(outsideBorder, insideBorder);

        super.setBorder(compoundBorder);
    }

    private JComboBox<String> createActionComboBox(String...items) {
        var combo = new JComboBox<>(items);
        combo.addActionListener(this);

        return combo;
    }

    private JCheckBox createCheckBox(String name) {
        var checkBox = new JCheckBox(name);
        checkBox.addItemListener(this);
        return checkBox;
    }

    private JSpinner createSpinner(Integer min, Integer max, Integer initValue) {
        var spinner = new JSpinner(new SpinnerNumberModel(initValue.intValue(), min.intValue(), max.intValue(), 1));
        spinner.addChangeListener(this);
        add(spinner);

        return spinner;
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        handleParamsChange();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == enableCheckBox) {
            setElementsEnabled(enableCheckBox.isSelected(), false);
        }

        if (e.getSource() == logoutCheckBox) {
            logoutMinutes.setEnabled(logoutCheckBox.isSelected());
        }

        handleParamsChange();
    }

    private void setElementsEnabled(boolean isEnabled, boolean isEnableCheckBoxEnableable) {
        if (isEnableCheckBoxEnableable) {
            enableCheckBox.setEnabled(isEnabled);
        }
        
        distanceSpinner.setEnabled(isEnabled);
        actionComboBox.setEnabled(isEnabled);
        pauseMinutesSpinner.setEnabled(isEnabled && actionComboBox.getSelectedItem() == ACTION_PAUSE);

        logoutCheckBox.setEnabled(isEnabled);
        logoutMinutes.setEnabled(isEnabled && logoutCheckBox.isSelected());
    }

    public void handleParamsChange() {
        var params = new ScriptAntiBanParams();

        params.setEnabled(String.valueOf(enableCheckBox.isSelected()));
        params.setInDistance(distanceSpinner.getValue().toString());
        params.setAction(actionComboBox.getSelectedItem().toString());
        params.setPauseMinutes(pauseMinutesSpinner.getValue().toString());
        params.setLogout(String.valueOf(logoutCheckBox.isSelected()));
        params.setLogoutMinutes(logoutMinutes.getValue().toString());

        eventBus.post(new ScriptAntiBanParamsChangedEvent(params));
    }

    public void setElementsEnabled(boolean isEnabled) {
        setElementsEnabled(isEnabled, true);

        if (!isEnabled && enableCheckBox.isSelected()) {
            setColorOfEnableLabels(new Color(199,246,182));
        } else {
            setColorOfEnableLabels(null);
        }
    }

    public void setColorOfEnableLabels(Color color) {
        panelHolder[0][0].setBackground(color);
        panelHolder[0][1].setBackground(color);
        enableCheckBox.setBackground(color);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        var src = e.getSource();

        if (src == actionComboBox) {
            var isPause = actionComboBox.getSelectedItem().toString().equals(ACTION_PAUSE);
            pauseMinutesSpinner.setEnabled(isPause);
            handleParamsChange();
        }
    }
}
