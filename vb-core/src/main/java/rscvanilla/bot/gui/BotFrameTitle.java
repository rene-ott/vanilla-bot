package rscvanilla.bot.gui;

public class BotFrameTitle {

    private static final String APP_NAME = "Vanilla Bot";
    private static final String APP_VERSION = "ALPHA";
    public static final String INIT = APP_NAME + " [" + APP_VERSION + "]";

    private String username;
    private String proxy;

    public String getTitle() {
        var sb = new StringBuilder(INIT);
        if (username == null && proxy == null) {
            return sb.toString();
        }

        sb.append(" - ");
        sb.append("[");
        if (username != null) {
            sb.append(username);
        }

        if (proxy != null) {
            sb.append(" ");
            sb.append(proxy);
        }

        sb.append("]");

        return sb.toString();
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setProxy(String proxy) {
        this.proxy = proxy;
    }
}
