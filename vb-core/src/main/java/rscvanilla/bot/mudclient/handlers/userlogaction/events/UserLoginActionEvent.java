package rscvanilla.bot.mudclient.handlers.userlogaction.events;

public class UserLoginActionEvent {

    private final String username;
    private final UserLoginAction action;

    private UserLoginActionEvent(UserLoginAction action, String username) {
        this.action = action;
        this.username = username;
    }

    public UserLoginAction getAction() {
        return action;
    }

    public String getUsername() {
        return username;
    }

    public static UserLoginActionEvent sentLoggingIn(String username) {
        return new UserLoginActionEvent(UserLoginAction.SENT_LOGGING_IN, username);
    }

    public static UserLoginActionEvent loggedIn() {
        return new UserLoginActionEvent(UserLoginAction.LOGGED_IN, null);
    }

    public static UserLoginActionEvent loggedOut() {
        return new UserLoginActionEvent(UserLoginAction.LOGGED_OUT, null);
    }
}
