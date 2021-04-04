package rscvanilla.bot.mudclient.models.items;

public class ShopItem extends ItemBase {

    private final int defaultCount;

    public ShopItem(int id, int count, int defaultCount) {
        super(id, count);
        this.defaultCount = defaultCount;
    }

    public int getDefaultCount() {
        return defaultCount;
    }
}
