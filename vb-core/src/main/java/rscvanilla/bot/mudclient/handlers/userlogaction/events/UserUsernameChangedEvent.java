package rscvanilla.bot.mudclient.handlers.userlogaction.events;

public class UserUsernameChangedEvent {

    private String username;

    public UserUsernameChangedEvent(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
