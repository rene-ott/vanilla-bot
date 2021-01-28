package rscvanilla.bot.script.antiban;

public interface AntiBannable {
    void print(String message);
    String[] getPlayerNamesInDistance(int distance);
}
