package rscvanilla.bot.script.antiban;

import rscvanilla.bot.Main;

public class ScriptAntiBanParams {

    private boolean isEnabled;
    private int inDistance;
    private boolean isSound;
    private boolean isGreet;
    private String action;
    private int pauseMinutes;
    private boolean isLogout;
    private int logoutMinutes;
    private String soundPath;

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

    public boolean isGreet() {
        return isGreet;
    }

    public void setGreet(String isGreet) {
        this.isGreet = Boolean.parseBoolean(isGreet);
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

    public boolean isSoundPlay() {
        return isSound;
    }

    public void setPlaySound(String sound) {
        isSound = Boolean.parseBoolean(sound);
    }

    //TODO FIX
    public String getSoundPath() {
        return Main.getAntiBanSoundPath();
    }

    public void setSoundPath(String soundPath) {
        this.soundPath = soundPath;
    }

    @Override
    public String toString() {
        return "[" +
                "isEnabled=" + isEnabled +
                ", inDistance=" + inDistance +
                ", isSound=" + isSound +
                ", isGreet=" + isGreet +
                ", action='" + action + '\'' +
                ", pauseMinutes=" + pauseMinutes +
                ", isLogout=" + isLogout +
                ", logoutMinutes=" + logoutMinutes +
                ", soundPath='" + soundPath + '\'' +
                ']';
    }
}
