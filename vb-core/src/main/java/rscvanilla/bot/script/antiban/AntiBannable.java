package rscvanilla.bot.script.antiban;

public interface AntiBannable {
    void print(String message, Object...ags);
    String[] getPlayerNamesInDistance(int distance);
}
