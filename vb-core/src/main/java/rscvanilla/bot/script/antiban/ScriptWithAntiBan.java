package rscvanilla.bot.script.antiban;

public interface ScriptWithAntiBan {
    void print(String message, Object...ags);
    String[] getPlayerNamesInDistance(int distance);
}
