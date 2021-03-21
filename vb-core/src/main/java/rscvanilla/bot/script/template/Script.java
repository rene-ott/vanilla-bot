package rscvanilla.bot.script.template;

import rscvanilla.bot.mudclient.actions.*;
import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.infrastructure.printer.Printer;
import rscvanilla.bot.mudclient.MudClientWrapper;
import rscvanilla.bot.script.ScriptDependencyContext;

public abstract class Script {

    private final Printer printer;

    private final PlayerCharacterAction playerCharacterAction;
    private final NonPlayerCharacterAction nonPlayerCharacterAction;
    private final WalkAction walkAction;
    private final GroundItemAction groundItemAction;
    private final InventoryItemAction inventoryItemAction;
    private final GroundObjectAction groundObjectAction;
    private final BankAction bankAction;
    private final OptionsAction optionsAction;
    private final PositionAction positionAction;
    private final LoginAction loginAction;
    private final MessageAction messageAction;
    private final WallObjectAction wallObjectAction;

    private final MudClientWrapper mudClientWrapper;

    public Script(ScriptDependencyContext dependencyContext) {

        printer = dependencyContext.getPrinter();

        playerCharacterAction = dependencyContext.getPlayerAction();
        nonPlayerCharacterAction = dependencyContext.getNpcAction();
        walkAction = dependencyContext.getWalkAction();
        groundItemAction = dependencyContext.getGroundItemAction();
        inventoryItemAction = dependencyContext.getInventoryItemAction();
        groundObjectAction = dependencyContext.getObjectAction();
        bankAction = dependencyContext.getOptionsAction();
        optionsAction = dependencyContext.getOptionsMenuAction();
        positionAction = dependencyContext.getPositionAction();
        loginAction = dependencyContext.getLoginAction();
        messageAction = dependencyContext.getMessageAction();
        wallObjectAction = dependencyContext.getWallAction();

        mudClientWrapper = dependencyContext.getMudClientWrapper();
    }

    /** FOR DEV **/
    protected MudClientWrapper getMudClientWrapper() { return mudClientWrapper; }

    /** USER **/
    protected Position getCurrentPos() { return mudClientWrapper.getLocalPlayer().getGlobalPosition(); }
    protected boolean isInCombat() { return mudClientWrapper.getLocalPlayer().isInCombat(); }
    protected int getCombatStyle() { return mudClientWrapper.getLocalPlayer().getCombatStyle(); }
    protected void setCombatStyle(int style) { mudClientWrapper.getLocalPlayer().setCombatStyle(style); }
    protected int getFatigue() { return mudClientWrapper.getLocalPlayer().getFatigue(); }
    protected boolean isSleeping() { return mudClientWrapper.getLocalPlayer().isSleeping(); }
    protected boolean isBusy() { return mudClientWrapper.getLocalPlayer().isBusy(); }
    protected String getUsername()  { return mudClientWrapper.getLocalPlayer().getName(); }

    /** LOG **/
    public void print(String message, Object...args) { printer.printAsScript(String.format(message, args));}

    /** PLAYER ACTION **/
    public String[] getPlayerNamesInDistance(int distance) { return playerCharacterAction.getPlayerNamesInDistance(distance); }

    public boolean isAnotherPlayerOnPos(Position pos) { return playerCharacterAction.isAnotherPlayerOnPos(pos); }

    /** MESSAGE ACTION **/
    public void sendChatMessage(String s) { messageAction.sendChatMessage(s); }

    /** LOGIN ACTION **/
    public boolean isInGame() { return loginAction.isInGame(); }
    public boolean isOnLoginScreen() { return loginAction.isOnLoginScreen(); }
    public void login() { loginAction.login(); }
    public void logout() { loginAction.logout(); }

    /** INVENTORY ITEM ACTION **/
    protected void useSleepingBag() { inventoryItemAction.useSleepingBag(); }

    protected void useInventoryItem(int id) { inventoryItemAction.useItem(id); }
    protected boolean isItemInInventory(int...ids) { return inventoryItemAction.isItemInInventory(ids); }
    protected boolean isItemInInventory(int id, int count) { return inventoryItemAction.isItemInInventory(id, count); }
    protected boolean isInventoryFull() { return inventoryItemAction.isInventoryFull(); }
    protected int getInventoryItemCount(int id) { return inventoryItemAction.getInventoryItemCount(id); }
    protected void useInventoryItemOnGroundObject(int itemId, int objectId) { inventoryItemAction.useItemOnGroundObject(itemId, objectId); }
    protected void useInventoryItemOnGroundObject(int objectId, int...itemIds) { inventoryItemAction.useItemOnGroundObject(objectId, itemIds); }

    protected void dropAllInventoryItems(int...ids) { inventoryItemAction.dropAll(ids); }
    protected void useInventoryItemOnInventoryItem(int firstItemId, int secondItemId) { inventoryItemAction.useItemOnItem(firstItemId, secondItemId); }

    /** NPC ACTION **/
    protected void pickpocketNpc(int...ids) { nonPlayerCharacterAction.pickpocketNpcById(ids); }
    protected void attackNpc(int...ids) { nonPlayerCharacterAction.attackNpcById(ids); }
    protected void talkToNpc(int...ids) { nonPlayerCharacterAction.talkToNpc(ids); }
    protected void castOnNpc(int spellId, int...ids) { nonPlayerCharacterAction.castOnNpc(spellId, ids); }
    protected boolean isNpcReachable(int...ids) { return nonPlayerCharacterAction.isNpcNear(ids); }

    /** GROUND ITEM ACTION **/
    protected void takeGroundItem(int...ids) { groundItemAction.takeItemFromGround(ids); }
    protected boolean isItemOnGround(int...ids) { return groundItemAction.isItemOnGround(ids); }
    protected boolean isItemOnGroundRectangle(Position topPos, Position bottomPos, int...ids) { return groundItemAction.isItemOnGround(ids); }

    protected int getGroundItemCountOnCurrentPos(int id) { return groundItemAction.getGroundItemCountOnCurrentPos(id); }
    protected void takeGroundItemFromCurrentPos(int id) { groundItemAction.takeGroundItemFromCurrentPos(id); }

    /** GROUND OBJECT ACTION **/
    protected void atGroundObject(int...ids) { groundObjectAction.atObject(ids); }
    protected void atGroundObject2(int...ids) { groundObjectAction.atObject2(ids); }

    protected void atGroundObject(int id, int x, int y) { groundObjectAction.atObject(id, x, y); }
    protected void atGroundObject(int id, Position pos) { groundObjectAction.atObject(id, pos); }
    
    protected boolean isGroundObjectReachable(int id, int x, int y) { return groundObjectAction.isObjectNear(id, x, y); }
    protected boolean isGroundObjectReachable(int id, Position position) { return groundObjectAction.isObjectNear(id, position.getX(), position.getY()); }

    /** WALL OBJECT ACTION **/
    public void atWallObject(int id, Position pos) { wallObjectAction.atWallObject(id, pos); }
    public void atWallObject(int id, int x, int y) { wallObjectAction.atWallObject(id, x, y); }
    
    protected boolean isWallObjectReachable(int id, Position pos) { return wallObjectAction.isWallObjectNear(id, pos); }
    protected boolean isWallObjectReachable(int id, int x, int y) { return wallObjectAction.isWallObjectNear(id, x, y); }
    
    /** OPTIONS ACTION */
    public void selectOptionsMenuAnswer(int pos) { optionsAction.answerOption(pos); }
    public boolean isOptionsMenuAnswerTextVisible(String answerText) { return optionsAction.hasAnswerOptionText(answerText); }
    public boolean isOptionsMenuVisible() { return optionsAction.isOptionsMenuVisible(); }

    /**  POSITION ACTION **/
    protected boolean isCurrentPosInRectangle(Position topPos, Position bottomPos) { return positionAction.isPositionInRectangle(getCurrentPos(), topPos, bottomPos); }
    protected boolean isPosInDistanceOfCurrentPos(Position pos, int distance) { return positionAction.isPositionInDistance(pos, distance); }
    protected boolean isPosInDistanceOfCurrentPos(int x, int y, int distance) { return positionAction.isPositionInDistance(x, y, distance); }

    /** WALK ACTION **/
    protected void walkToTile(int x, int y) { walkAction.walkToPosition(new Position(x, y));}
    protected void walkToTile(Position pos) { walkAction.walkToPosition(pos);}

    /** MESSAGE LISTENERS **/
    protected abstract void onChatMessageReceived(String sender, String message);
    protected abstract void onGameMessageReceived(String message);

    /**
     * Gets the amount of items with id in bank.
     * Bank screen must be visible. Always do check with method isBankWindowVisible.
     *
     * @param id the id of bank item
     * @return returns -1 if bank screen is not visible; 0 if there are no items.
     * @since 1.0
     */
    protected int getBankItemCount(int id) { return bankAction.getBankItemCount(id); }

    /**
     * Withdraws exact amount of bank items from bank.
     * If inventory item count is less than amount or bank window is not visible then returns
     *
     * @param id the id of bank item
     * @param amount the exact amount of bank items to withdraw
     * @since 1.0
     */
     protected void withdrawBankItem(int id, int amount) { bankAction.withdraw(id, amount); }

    /**
     * Deposits exact amount of inventory items.
     * If inventory item count is less than amount or bank window is not visible then returns
     *
     * @param id the id of inventory item
     * @param amount the exact amount of inventory items to bank
     * @since 1.0
     */
    protected void depositBankItem(int id, int amount) { bankAction.deposit(id, amount); }

    /**
     * Deposits all specified inventory items to bank.
     * If there's no item with id in inventory or bank window is not visible then returns
     *
     * @param ids the list of inventory items to bank
     * @since 1.0
     */
    protected void depositAllBankItems(int...ids) { bankAction.depositAll(ids); }

    /**
     * Detects if bank window is opened.
     *
     * @return returns true if bank window is opened otherwise false
     * @since 1.0
     */
    protected boolean isBankWindowVisible() { return bankAction.isBankWindowVisible(); }
}

