package rscvanilla.bot.script.antiban;

public interface AntiBannable {
    void sendChatMessage(String s);
    void print(String message);
    String[] getPlayerNamesInDistance(int distance);
}
