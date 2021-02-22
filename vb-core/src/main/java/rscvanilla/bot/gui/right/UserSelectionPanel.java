package rscvanilla.bot.gui.right;

import com.google.common.eventbus.EventBus;
import rscvanilla.bot.config.AppSettings;
import rscvanilla.bot.config.AppSettingsProxy;
import rscvanilla.bot.gui.events.AppSettingsProxySelectedEvent;
import rscvanilla.bot.gui.events.AppSettingsUserSelectedEvent;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.stream.Stream;

public class UserSelectionPanel extends JPanel implements ActionListener {

    private int actionEventCount = 0;

    private final String EMPTY_COMBO_BOX_ITEM = " ---Select--- ";
    private final JPanel innerPanel;

    private final JComboBox<String> userComboBox;
    private final JComboBox<String> proxyComboBox;

    private final AppSettings appSettings;

    private final EventBus eventBus;

    public UserSelectionPanel(EventBus eventBus, AppSettings appSettings) {
        this.eventBus = eventBus;
        this.appSettings = appSettings;

        innerPanel = createInnerPanel();

        innerPanel.add(createLabel("User: "));
        innerPanel.add(userComboBox = createUserComboBox());

        innerPanel.add(createLabel("Proxy: "));
        innerPanel.add(proxyComboBox = createProxyComboBox());

        eventBus.register(this);
    }

    private JPanel createInnerPanel() {
        var panel = new JPanel();
        add(panel);
        return panel;
    }

    private JLabel createLabel(String text) {
        return new JLabel(text);
    }

    private JComboBox<String> createUserComboBox() {
        var selectableItems = Stream
            .concat(Stream.of(EMPTY_COMBO_BOX_ITEM), appSettings.getValidUsers().stream().map(it -> it.username))
            .toArray(String[]::new);

        var comboBox = new JComboBox<>(selectableItems);
        comboBox.setPrototypeDisplayValue(EMPTY_COMBO_BOX_ITEM);
        comboBox.setEnabled(selectableItems.length > 1);

        comboBox.addActionListener(this);
        return comboBox;
    }

    private JComboBox<String> createProxyComboBox() {
        var selectableItems = Stream
            .concat(Stream.of(EMPTY_COMBO_BOX_ITEM), appSettings.getValidProxies().stream().map(it -> it.name))
            .toArray(String[]::new);

        var comboBox = new JComboBox<>(selectableItems);
        comboBox.setPrototypeDisplayValue(EMPTY_COMBO_BOX_ITEM);
        comboBox.setEnabled(selectableItems.length > 1);

        comboBox.addActionListener(this);
        return comboBox;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (actionEventCount == 1 || actionEventCount == 2) {
            actionEventCount--;
            return;
        }

        if (e.getSource() == userComboBox) {
            var selectedIndex = userComboBox.getSelectedIndex();
            if (selectedIndex != 0) {
                var appSettingsUser = appSettings.getUserByUsername((String) userComboBox.getSelectedItem());
                eventBus.post(new AppSettingsUserSelectedEvent(appSettingsUser));

                if (appSettingsUser.proxy != null) {
                    proxyComboBox.setSelectedItem(appSettingsUser.proxy.name);
                } else {
                    proxyComboBox.setSelectedIndex(0);
                    setToolTipText(null);
                }
            } else {
                eventBus.post(new AppSettingsUserSelectedEvent(null));
                proxyComboBox.setSelectedIndex(0);
                proxyComboBox.setToolTipText(null);
            }
        }

        if (e.getSource() == proxyComboBox) {
            var selectedIndex = proxyComboBox.getSelectedIndex();
            if (selectedIndex != 0) {
                var proxy = getProxy(selectedIndex - 1);
                proxyComboBox.setToolTipText(proxy.address);
                eventBus.post(new AppSettingsProxySelectedEvent(proxy));
            } else {
                proxyComboBox.setToolTipText(null);
                eventBus.post(new AppSettingsProxySelectedEvent(null));
            }
        }
    }

    private AppSettingsProxy getProxy(int index) {
        return appSettings.getValidProxies().get(index);
    }

    public void setEnabled(boolean isEnabled) {
        if (proxyComboBox.getItemCount() > 1) {
            proxyComboBox.setEnabled(isEnabled);
        }

        if (userComboBox.getItemCount() > 1) {
            userComboBox.setEnabled(isEnabled);
        }
    }

    // TODO: Refaktor this part
    public void setSelectedUsername(String username) {
        actionEventCount = 2;

        var appSettingsUser = appSettings.getUserByUsername(username);
        if (appSettingsUser == null) {
            proxyComboBox.setSelectedIndex(0);
            userComboBox.setSelectedIndex(0);
            return;
        }

        for (var i = 0; i < userComboBox.getItemCount(); i++) {
            var currentItem = userComboBox.getItemAt(i);
            if (currentItem.equalsIgnoreCase(appSettingsUser.username)) {
                userComboBox.setSelectedIndex(i);
                if (appSettingsUser.proxy == null) {
                    proxyComboBox.setSelectedIndex(0);
                } else {
                    selectProxyComboBox(appSettingsUser.proxy.name);
                }
                return;
            }
        }

        proxyComboBox.setSelectedIndex(0);
        userComboBox.setSelectedIndex(0);
    }

    private void selectProxyComboBox(String proxyName) {
        for (var i = 0; i < proxyComboBox.getItemCount(); i++) {
            var currentItem = proxyComboBox.getItemAt(i);
            if (currentItem.equalsIgnoreCase(proxyName)) {
                proxyComboBox.setSelectedIndex(i);
                return;
            }
        }

        proxyComboBox.setSelectedIndex(0);
    }
}
