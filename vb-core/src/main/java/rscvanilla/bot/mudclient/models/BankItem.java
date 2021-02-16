package rscvanilla.bot.mudclient.models;

public class BankItem {

    private final int id;
    private final int count;

    public BankItem(int id, int count) {
        this.id = id;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public int getCount() {
        return count;
    }
}
