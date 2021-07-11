package scripts;

import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.script.ScriptDependencyContext;
import rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import rscvanilla.bot.script.template.RunnableScript;

public class TaverlyVialBuyer extends RunnableScript {

    private final static int BANKER_ID = 95;
    private final static int JATIX_ID = 230;

    private final static int EMPTY_VIAL_ID = 465;
    private final static int FILLED_VIAL_ID = 464;
    private final static int EYE_OF_NEW_ID = 270;
    private final static int MONEY_ID = 10;

    private final static int GATE_ID = 137;
    private final static Position GATE_POS = new Position(341, 487);

    private final static int FOUNTAIN_ID = 26;
    private final static Position FOUNTAIN_POS = new Position(327, 545);

    private final static Position BANK_TOP_POS = new Position(334, 549);
    private final static Position BANK_BOTTOM_POS = new Position(328, 557);

    private final static int BANK_DOOR_ID = 64;
    private final static Position BANK_DOOR_POS = new Position(327, 552);

    private final static Position JATIX_SHOP_TOP_POS = new Position(371, 503);
    private final static Position JATIX_SHOP_BOTTOM_POS = new Position(366, 509);

    private final static Position LEFT_TOP_POS = new Position(372, 486);
    private final static Position LEFT_BOTTOM_POS = new Position(342, 520);

    private final static Position FIELD_TOP_POS = new Position(341, 486);
    private final static Position FIELD_BOTTOM_POS = new Position(310, 520);

    private final static Position EAST_FALLY_TOP_POS = new Position(327, 521);
    private final static Position EAST_FALLY_BOTTOM_POS = new Position(317, 551);

    private final static int SHOP_DOOR_ID = 2;
    private final static Position SHOP_DOOR_POS = new Position(371, 506);

    public TaverlyVialBuyer(ScriptDependencyContext dependencyContext, ScriptAntiBanParams antiBanParameters) {
        super(dependencyContext, antiBanParameters);
    }

    @Override
    protected void loop() {
        waitFor(500);

        Action action = getAction();

        switch (action) {
            case SHOP_TO_GATE -> shopToGate();
            case GATE_TO_SHOP -> gateToShop();
            case GATE_TO_FOUNTAIN -> gateToFountain();
            case FOUNTAIN_TO_GATE -> fountainToGate();
            case FOUNTAIN_TO_BANK -> fountainToBank();
            case BANK_TO_FOUNTAIN -> bankToFountain();
            case BUY_GOODS -> doShopping();
            case FILL_VIALS -> fillVials();
            case BANK_GOODS -> bankGoods();
            case OPEN_GATE -> openGate();
            case IGNORE -> ignore();
            default -> throw new IllegalStateException();
        }
    }

    private Action getAction() {
        if (isInBank()) {
            if (isItemInInventory(FILLED_VIAL_ID)) {
                return Action.BANK_GOODS;
            }
            else {
                return Action.BANK_TO_FOUNTAIN;
            }
        }
        else if (isAtFountain()) {
            if (isItemInInventory(EMPTY_VIAL_ID)) {
                return Action.FILL_VIALS;
            }
            else if ((!isItemInInventory(EMPTY_VIAL_ID) && isItemInInventory(FILLED_VIAL_ID)) ||
                    isItemInInventory(EYE_OF_NEW_ID)) {
                return Action.FOUNTAIN_TO_BANK;
            }
            else {
                return Action.FOUNTAIN_TO_GATE;
            }
        }
        else if (isAtGateRightSide()) {
            if (isItemInInventory(EMPTY_VIAL_ID)) {
                return Action.GATE_TO_FOUNTAIN;
            }
            else {
                return Action.OPEN_GATE;
            }
        }
        if (isAtRightSide()) {
            if (isItemInInventory(EMPTY_VIAL_ID)) {

                walkToTile(317,522);
            }
            else {
                walkToTile(341,488);
            }
        }
        else if (isAtFallyEast()) {
            if (isItemInInventory(EMPTY_VIAL_ID)) {
                walkToTile(323,533);
                walkToTile(326,540);
            }
            else if ((!isItemInInventory(EMPTY_VIAL_ID) && isItemInInventory(FILLED_VIAL_ID)) ||
                    isItemInInventory(EYE_OF_NEW_ID)) {
                return Action.FOUNTAIN_TO_BANK;
            }
            else {
                return Action.FOUNTAIN_TO_GATE;
            }
        }
        else if (isAtLeftSide()) {
            if (isAtGateLeftSide()) {
                if (isItemInInventory(EMPTY_VIAL_ID)) {
                    return Action.OPEN_GATE;
                }
                else {
                    return Action.GATE_TO_SHOP;
                }
            }
            else if (isInShop()) {
                if (isItemInInventory(EMPTY_VIAL_ID)) {
                    return Action.SHOP_TO_GATE;
                }
                else {
                    return Action.BUY_GOODS;
                }
            }
        }
        return Action.IGNORE;
    }

    private void fillVials() {
        if (isItemInInventory(EMPTY_VIAL_ID)) {
            useInventoryItemOnGroundObject(EMPTY_VIAL_ID, FOUNTAIN_ID);
        }
    }

    private void bankGoods() {
        if (isBankWindowVisible()) {
            depositAllBankItems(FILLED_VIAL_ID, EYE_OF_NEW_ID);
            waitFor(300);
            return;
        }

        if (isOptionsMenuVisible()) {
            selectOptionsMenuAnswer(0);
            waitFor(5000);
            return;
        }

        talkToNpc(BANKER_ID);
        waitFor(2000);
    }

    private void bankToFountain() {
        if (isBankDoorClosed()) {
            print("W2M: Bank door is closed!");
            atGroundObject(BANK_DOOR_ID, BANK_DOOR_POS);
            return;
        }
        walkToTile(327,552);
        walkToTile(326,540);
    }

    private void fountainToBank() {
        walkToTile(327,552);
        if (isBankDoorClosed()) {
            print("W2M: Bank door is closed!");
            atGroundObject(BANK_DOOR_ID, BANK_DOOR_POS);
            return;
        }
        walkToTile(329,552);
    }


    private void fountainToGate() {
        walkToTile(326,535);
        walkToTile(317,521);
        walkToTile(326,506);
        walkToTile(341,488);
    }

    private void gateToFountain() {
        walkToTile(326,506);
        walkToTile(326,540);
        waitFor(6000);
    }

    private void gateToShop() {
        walkToTile(355, 497);
        walkToTile(371,506);

        if (isShopDoorClosed()) {
            atWallObject(SHOP_DOOR_ID, SHOP_DOOR_POS);
            }
    }

    private void shopToGate() {
        if (isShopDoorClosed()) {
            atWallObject(SHOP_DOOR_ID, SHOP_DOOR_POS);
        }
        walkToTile(371,506);
        walkToTile(355, 497);
        walkToTile(342, 488);
    }

    private void doShopping() {

        if (isShopWindowVisible()) {
            var shopEyeCount = getCurrentShopItemCount(EYE_OF_NEW_ID);
            var shopItemCount = getCurrentShopItemCount(EMPTY_VIAL_ID);
            if (shopItemCount > 0) {
                buyShopItem(EMPTY_VIAL_ID, shopItemCount);
                if (!isItemInInventory(EMPTY_VIAL_ID, 29)) {
                    if (shopEyeCount > 0) {
                        buyShopItem(EYE_OF_NEW_ID, shopEyeCount);
                    }
                }
            }
            waitFor(100);
            return;
        }

        if (isOptionsMenuVisible()) {
            selectOptionsMenuAnswer(0);
            waitFor(3000);
            return;
        }

        talkToNpc(JATIX_ID);
        waitFor(1000);
    }

    private void openGate() {
        atGroundObject(GATE_ID, GATE_POS);
        waitFor(300);
    }

    private void ignore() {
    }

    private boolean isBankDoorClosed() {
        return isGroundObjectReachable(BANK_DOOR_ID, BANK_DOOR_POS);
    }

    private boolean isAtLeftSide() {
        return isCurrentPosInRectangle(LEFT_TOP_POS, LEFT_BOTTOM_POS);
    }

    private boolean isAtRightSide() {
        return isCurrentPosInRectangle(FIELD_TOP_POS, FIELD_BOTTOM_POS);
    }

    private boolean isAtFallyEast() {
        return isCurrentPosInRectangle(EAST_FALLY_TOP_POS, EAST_FALLY_BOTTOM_POS);
    }

    private boolean isShopDoorClosed() {
        return isWallObjectReachable(SHOP_DOOR_ID, SHOP_DOOR_POS);
    }

    private boolean isAtGateLeftSide() {
        return (getCurrentPos().distanceTo(new Position(342,487)) == 0) ||
                (getCurrentPos().distanceTo(new Position(342,488)) == 0);
    }

    private boolean isAtGateRightSide() {
        return (getCurrentPos().distanceTo(new Position(341,487)) == 0) ||
                (getCurrentPos().distanceTo(new Position(341,488)) == 0);
    }

    private boolean isInBank() {
        return isCurrentPosInRectangle(BANK_TOP_POS, BANK_BOTTOM_POS);
    }

    private boolean isInShop() {
        return isCurrentPosInRectangle(JATIX_SHOP_TOP_POS, JATIX_SHOP_BOTTOM_POS);
    }

    private boolean isAtFountain() {
        return isCurrentPosInRectangle(new Position(327,533), new Position(322,553));
    }

    @Override
    protected void onChatMessageReceived(String sender, String message) {

    }

    @Override
    protected void onGameMessageReceived(String message) {

    }

    private enum Action {
        SHOP_TO_GATE,
        GATE_TO_SHOP,
        GATE_TO_FOUNTAIN,
        FOUNTAIN_TO_GATE,
        FOUNTAIN_TO_BANK,
        BANK_TO_FOUNTAIN,
        BUY_GOODS,
        FILL_VIALS,
        BANK_GOODS,
        OPEN_GATE,
        IGNORE
    }
}
