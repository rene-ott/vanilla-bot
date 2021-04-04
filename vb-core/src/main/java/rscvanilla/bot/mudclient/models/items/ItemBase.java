package rscvanilla.bot.mudclient.models.items;

public abstract class ItemBase {

    protected final int id;
    protected final int count;

    public ItemBase(int id, int count) {
        this.id = id;
        this.count = count;
    }

    public int getId() { return id; }

    public int getCount() { return count; }
}
