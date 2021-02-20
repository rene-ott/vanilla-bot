package rscvanilla.bot.gui.events;

import java.util.List;

public class ScriptAntiBanIgnoredUsernamesChangedEvent {

    private final List<String> usernames;

    public ScriptAntiBanIgnoredUsernamesChangedEvent(List<String> usernames) {
        this.usernames = usernames;
    }

    public List<String> getUsernames() {
        return usernames;
    }
}
