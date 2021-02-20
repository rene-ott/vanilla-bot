package rscvanilla.bot.gui.right.ignoredplayers;

import com.google.common.eventbus.EventBus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rscvanilla.bot.gui.events.ScriptAntiBanIgnoredUsernamesChangedEvent;
import rscvanilla.bot.gui.right.ignoredplayers.listeners.IgnoredPlayersSaveButtonClickedListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class IgnoredPlayersDialogOpenButton extends JButton implements ActionListener, IgnoredPlayersSaveButtonClickedListener {

    private Logger logger = LoggerFactory.getLogger(IgnoredPlayersDialogOpenButton.class);

    private final EventBus eventBus;

    private final List<String> ignoredUsers;

    public IgnoredPlayersDialogOpenButton(EventBus eventBus) {
        super("Modify");
        this.eventBus = eventBus;
        ignoredUsers = new ArrayList<>();

        setToolTipText("<html><i>None</i></html>");

        addActionListener(this);
        eventBus.register(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new IgnoredPlayersDialog((JFrame) SwingUtilities.getRoot(this), ignoredUsers, this);
    }

    private void updateToolTip(List<String> ignoredUsers) {
        var sb = new StringBuilder();
        sb.append("<html>");

        for (var i = 0; i < ignoredUsers.size(); i++ ) {
            sb.append(String.format("%s", ignoredUsers.get(i)));
            if (i != ignoredUsers.size() - 1) {
                sb.append("<br>");
            }
        }

        sb.append("</html>");

        setToolTipText(sb.toString());
    }

    @Override
    public void onSave(List<String> ignoredUsers) {
        this.ignoredUsers.clear();
        this.ignoredUsers.addAll(ignoredUsers);
        logger.info("Saved ignored users: {}", ignoredUsers);

        dispatchScriptAntiBanIgnoredUsers();
        updateToolTip(ignoredUsers);
    }

    public void dispatchScriptAntiBanIgnoredUsers() {
        eventBus.post(new ScriptAntiBanIgnoredUsernamesChangedEvent(ignoredUsers));
    }
}
