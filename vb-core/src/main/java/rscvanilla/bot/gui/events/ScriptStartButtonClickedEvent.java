package rscvanilla.bot.gui.events;

public class ScriptStartButtonClickedEvent {

    private final boolean isStart;

    public ScriptStartButtonClickedEvent(boolean isStart) {

        this.isStart = isStart;
    }

    public boolean isStart() {
        return isStart;
    }
}
