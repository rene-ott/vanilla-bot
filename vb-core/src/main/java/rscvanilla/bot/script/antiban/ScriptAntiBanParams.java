package rscvanilla.bot.script.antiban;


public class ScriptAntiBanParams {

    private boolean isEnabled;
    private int inDistance;
    private String action;
    private int pauseMinutes;
    private boolean isLogout;
    private int logoutMinutes;

    public ScriptAntiBanParams() {
        inDistance = 10;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(String enabled) {
        isEnabled = Boolean.parseBoolean(enabled);
    }

    public int getInDistance() {
        return inDistance;
    }

    public void setInDistance(String inDistance) {
        this.inDistance = Integer.parseInt(inDistance);
    }

    public void setPauseMinutes(String minutes) {
        this.pauseMinutes = Integer.parseInt(minutes);
    }

    public int getPauseMinutes() {
        return pauseMinutes;
    }

    public boolean isStop() {
        return action.equals("Stop");
    }

    public boolean isPause() {
        return action.equals("Pause");
    }

    public boolean isMissing() {
        return action.equals("-");
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public boolean isLogout() {
        return isLogout;
    }

    public void setLogout(String logout) {
        isLogout = Boolean.parseBoolean(logout);
    }

    public int getLogoutMinutes() {
        return logoutMinutes;
    }

    public void setLogoutMinutes(String logoutMinutes) {
        this.logoutMinutes = Integer.parseInt(logoutMinutes);
    }

    @Override
    public String toString() {
        return "[" +
                "isEnabled=" + isEnabled +
                ", inDistance=" + inDistance +
                ", action='" + action + '\'' +
                ", pauseMinutes=" + pauseMinutes +
                ", isLogout=" + isLogout +
                ", logoutMinutes=" + logoutMinutes +
                ']';
    }
}
