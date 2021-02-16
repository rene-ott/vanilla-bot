package rscvanilla.bot.gui.right;

import com.google.common.eventbus.EventBus;
import rscvanilla.bot.config.AppSettings;
import rscvanilla.bot.config.AppSettingsUser;
import rscvanilla.bot.gui.events.AppSettingsUserSelectedEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserSelectionPanel extends JPanel implements ActionListener {

    private final JPanel innerPanel;

    private final JComboBox<String> userComboBox;
    private final JLabel userLabel;

    private final AppSettings appSettings;

    private final EventBus eventBus;

    public UserSelectionPanel(EventBus eventBus, AppSettings appSettings) {
        this.eventBus = eventBus;
        this.appSettings = appSettings;

        innerPanel = createInnerPanel();

        userLabel = createLabel();
        userComboBox = createUserComboBox();

        eventBus.register(this);
    }

    private AppSettingsUser getSelectedAppSettingsUser(int index) {
        return appSettings.users.get(index);
    }

    private JPanel createInnerPanel() {
        var panel = new JPanel();
        add(panel);
        add(new JPanel());

        return panel;
    }

    private JLabel createLabel() {
        var label = new JLabel("User: ");

        if (hasUsers()) {
            innerPanel.add(label);
        }

        return label;
    }

    private boolean hasUsers() {
        return appSettings.getValidUsers().size() > 0;
    }

    private JComboBox<String> createUserComboBox() {
        var comboBox = new JComboBox<>(appSettings.getValidUsers().stream().map(it -> it.username).toArray(String[]::new));

        comboBox.addActionListener(this);

        if (hasUsers()) {
            innerPanel.add(comboBox);
        }

        return comboBox;
    }

    @Override
    public void setLayout(LayoutManager mgr) {
        super.setLayout(new GridLayout(1, 2));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        var selectedUser = getSelectedAppSettingsUser(userComboBox.getSelectedIndex());
        eventBus.post(new AppSettingsUserSelectedEvent(selectedUser));
    }

    public JComboBox<String> getUserComboBox() {
        return userComboBox;
    }
}
