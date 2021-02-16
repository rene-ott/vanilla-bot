package rscvanilla.bot.mudclient.actions;

import rscvanilla.bot.mudclient.enums.OpCodeOut;
import rscvanilla.bot.mudclient.MudClientWrapper;
import rscvanilla.bot.mudclient.models.BankItem;

import javax.inject.Inject;
import java.util.stream.Collectors;

public class BankAction extends BaseAction {

    private final InventoryItemAction inventoryItemAction;

    @Inject
    public BankAction(MudClientWrapper mudClientWrapper, InventoryItemAction inventoryItemAction) {
        super(mudClientWrapper);
        this.inventoryItemAction = inventoryItemAction;
    }

    public void withdraw(int id, int amount) {
        if (!isBankWindowVisible()) {
            return;
        }

        var bankItem = getBankItem(id);
        if (bankItem == null || bankItem.getCount() < amount) {
            return;
        }

        mudClientWrapper.getPacketBuilder()
            .setOpCode(OpCodeOut.BANK_WITHDRAW)
            .putShort(id)
            .putInt(amount)
            .putInt(305419896)
            .send();
    }

    public int getBankItemCount(int id) {
        if (!isBankWindowVisible()) {
            return -1;
        }

        var bankItem = getBankItem(id);
        if (bankItem == null)
            return 0;

        return bankItem.getCount();
    }

    private BankItem getBankItem(int id) {
        var bankItems = mudClientWrapper.getBankItemList()
            .stream()
            .filter(it -> it.getId() == id)
            .collect(Collectors.toList());

        if (bankItems.isEmpty()) {
            return null;
        }

        return bankItems.get(0);
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
