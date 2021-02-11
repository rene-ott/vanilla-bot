package rscvanilla.bot.api.actions;

import rscvanilla.bot.api.enums.OpCodeOut;
import rscvanilla.bot.mc.MudClientWrapper;

import javax.inject.Inject;
import java.util.Arrays;

public class BankAction extends BaseAction {

    private InventoryItemAction inventoryItemAction;

    @Inject
    public BankAction(MudClientWrapper hooker, InventoryItemAction inventoryItemAction) {
        super(hooker);
        this.inventoryItemAction = inventoryItemAction;
    }

    public void deposit(int id, int amount) {
        hooker.getPacketBuilder()
                .setOpCode(OpCodeOut.BANK_DEPOSIT)
                .putShort(id)
                .putInt(amount)
                .putInt(-2023406815)
                .send();
    }

    public void depositAll(int...ids) {
        Arrays.stream(ids).forEach(this::depositAll);
    }

    public void depositAll(int id) {
        var count = inventoryItemAction.getInventoryItemCount(id);
        if (count == 0) {
            return;
        }

        deposit(id, count);
    }

    public boolean isBankScreenVisible() {
        return hooker.isBankVisible.getValue();
    }
}
