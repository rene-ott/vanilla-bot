package rscvanilla.bot.mudclient.models;

public class ShopItem {

    private final int id;
    private final int stackSize;
    private final int currentStackSize;

    public ShopItem(int id, int stackSize, int currentStackSize) {
        this.id = id;
        this.stackSize = stackSize;
        this.currentStackSize = currentStackSize;
    }

    public int getId() {
        return id;
    }

    public int getStackSize() {
        return stackSize;
    }

    public int getCurrentStackSize() {
        return currentStackSize;
    }
}
