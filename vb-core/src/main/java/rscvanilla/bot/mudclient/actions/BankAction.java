package rscvanilla.bot.mudclient.actions;

import rscvanilla.bot.mudclient.enums.OpCodeOut;
import rscvanilla.bot.mudclient.MudClientWrapper;

import javax.inject.Inject;

public class BankAction extends BaseAction {

    private final InventoryItemAction inventoryItemAction;

    @Inject
    public BankAction(MudClientWrapper mudClientWrapper, InventoryItemAction inventoryItemAction) {
        super(mudClientWrapper);
        this.inventoryItemAction = inventoryItemAction;
    }

    public void deposit(int id, int amount) {
        if (!isBankWindowVisible()) {
            return;
        }

        var count = inventoryItemAction.getInventoryItemCount(id);

        if (count < amount) {
            return;
        }

        mudClientWrapper.getPacketBuilder()
            .setOpCode(OpCodeOut.BANK_DEPOSIT)
            .putShort(id)
            .putInt(amount)
            .putInt(-2023406815)
            .send();
    }

    public void depositAll(int...ids) {
        for (var id : ids) {
            var count = inventoryItemAction.getInventoryItemCount(id);
            if (count == 0) {
                continue;
            }

            deposit(id, count);
        }
    }

    public boolean isBankWindowVisible() {
        return mudClientWrapper.isBankVisible.getValue();
    }
}
