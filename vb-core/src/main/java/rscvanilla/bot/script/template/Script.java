package rscvanilla.bot.script.template;

import rscvanilla.bot.mudclient.actions.*;
import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.mudclient.models.wrappers.RSLocalPlayerCharacter;
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

    private final RSLocalPlayerCharacter user;

    private final MudClientWrapper hooker;

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
        user = dependencyContext.getUser();

        hooker = dependencyContext.getHooker();
    }

    /** FOR DEV **/
    protected MudClientWrapper getHooker() { return hooker; }

    /** USER **/
    protected Position getPosition() { return user.getGlobalPosition(); }
    protected boolean isInCombat() { return user.isInCombat(); }
    protected int getCombatStyle() { return user.getCombatStyle(); }
    protected void setCombatStyle(int style) { user.setCombatStyle(style); }
    protected int getFatigue() { return user.getFatigue(); }
    protected boolean isSleeping() { return user.isSleeping(); }
    protected boolean isBusy() { return user.isBusy(); }
    protected String getUserName()  { return user.getName(); }

    /** LOG **/
    public void print(String message, Object...args) { printer.printAsScript(String.format(message, args));}

    /** PLAYER ACTION **/
    public String[] getPlayerNamesInDistance(int distance) { return playerCharacterAction.getPlayerNamesInDistance(distance); }

    /** MESSAGE ACTION **/
    public void sendChatMessage(String s) { messageAction.sendChatMessage(s); }

    /** WALL OBJECT ACTION **/
    public void atWallObject(int id, Position pos) { wallObjectAction.atWallObject(id, pos); }
    public void atWallObject(int id, int x, int y) { wallObjectAction.atWallObject(id, x, y); }
    protected boolean isWallObjectNear(int id, Position pos) { return wallObjectAction.isWallObjectNear(id, pos); }
    protected boolean isWallObjectNear(int id, int x, int y) { return wallObjectAction.isWallObjectNear(id, x, y); }

    /** LOGIN ACTION **/
    public boolean isInGame() { return loginAction.isInGame(); }
    public boolean isOnLoginScreen() { return loginAction.isOnLoginScreen(); }
    public void login() { loginAction.login(); }
    public void logout() { loginAction.logout(); }

    /** INVENTORY ITEM ACTION **/
    protected void useSleepingBag() { inventoryItemAction.useSleepingBag(); }
    protected void useItem(int id) { inventoryItemAction.useItem(id); }
    protected boolean isItemInInventory(int...ids) { return inventoryItemAction.isItemInInventory(ids); }
    protected boolean isItemInInventory(int id, int count) { return inventoryItemAction.isItemInInventory(id, count); }
    protected boolean isInventoryFull() { return inventoryItemAction.isInventoryFull(); }
    protected void useItemOnObject(int itemId, int objectId) { inventoryItemAction.useItemOnObject(itemId, objectId);}
    protected void useItemOnObject(int objectId, int...itemIds) { inventoryItemAction.useItemOnObject(objectId, itemIds);}

    protected void dropAll(int...itemIds) { inventoryItemAction.dropAll(itemIds); }
    protected void useItemOnItem(int firstItemId, int secondItemId) { inventoryItemAction.useItemOnItem(firstItemId, secondItemId); }

    /** NPC ACTION **/
    protected void pickpocketNpc(int...ids) { nonPlayerCharacterAction.pickpocketNpcById(ids); }
    protected void attackNpc(int...ids) { nonPlayerCharacterAction.attackNpcById(ids); }
    protected boolean isNpcNear(int...ids) { return nonPlayerCharacterAction.isNpcNear(ids); }
    protected void talkToNpc(int...ids) { nonPlayerCharacterAction.talkToNpc(ids); }
    protected void castOnNpc(int spellId, int...ids) { nonPlayerCharacterAction.castOnNpc(spellId, ids); }
    public boolean isNpcInDistance(int id, int distance) { return nonPlayerCharacterAction.isNpcInDistance(id, distance); }

    /** GROUND ITEM ACTION **/
    protected void takeItemFromGround(int...ids) { groundItemAction.takeItemFromGround(ids); }
    protected boolean isItemOnGround(int...ids) { return groundItemAction.isItemOnGround(ids); }

    /** OBJECT ACTION **/
    protected void atObject(int...ids) { groundObjectAction.atObject(ids); }
    protected void atObject2(int...ids) { groundObjectAction.atObject2(ids); }
    protected void atObject(int id, int x, int y) { groundObjectAction.atObject(id, x, y); }
    protected void atObject(int id, Position pos) { groundObjectAction.atObject(id, pos); }

    protected boolean isObjectNear(int x, int y) { return groundObjectAction.isObjectNear(x, y); }
    protected boolean isObjectNear(int id, int x, int y) { return groundObjectAction.isObjectNear(id, x, y); }
    protected boolean isObjectNear(int id, Position position) { return groundObjectAction.isObjectNear(id, position.getX(), position.getY()); }

    /** OPTIONS ACTION */
    public void answerOption(int pos) { optionsAction.answerOption(pos); }
    public boolean isOptionsMenuVisible() { return optionsAction.isOptionsMenuVisible(); }

    /**  POSITION ACTION **/
    protected boolean isPositionInDistance(Position tileToPos, int distance) { return positionAction.isPositionInDistance(tileToPos, distance); }
    protected boolean isPositionInDistance(int tilePosX, int tilePosY, int distance) { return positionAction.isPositionInDistance(tilePosX, tilePosY, distance); }
    protected boolean isPositionInRectangle(Position tilePos, Position topTilePos, Position bottomTilePos) { return positionAction.isPositionInRectangle(tilePos, topTilePos, bottomTilePos); }

    /** WALK ACTION **/
    protected void walkTo(int x, int y) { walkAction.walkToPosition(new Position(x, y));}
    protected void walkTo(Position position) { walkAction.walkToPosition(position);}

    /** MESSAGE LISTENERS **/
    protected abstract void onChatMessageReceived(String sender, String message);
    protected abstract void onGameMessageReceived(String message);

    /**
     * Deposits exact amount of inventory items.
     * If inventory item count is less than amount or bank window is not visible then returns
     *
     * @param id the id of inventory item
     * @param amount the exact amount of inventory items to bank
     * @since 1.0
     */
    public void deposit(int id, int amount) { bankAction.deposit(id, amount); }

    /**
     * Deposits all specified inventory items to bank.
     * If there's no item with id in inventory or bank window is not visible then returns
     *
     * @param ids the list of inventory items to bank
     * @since 1.0
     */
    public void depositAll(int...ids) { bankAction.depositAll(ids); }

    /**
     * Detects if bank window is opened.
     *
     * @return returns true if bank window is opened otherwise false
     * @since 1.0
     */
    public boolean isBankWindowVisible() { return bankAction.isBankWindowVisible(); }
}

