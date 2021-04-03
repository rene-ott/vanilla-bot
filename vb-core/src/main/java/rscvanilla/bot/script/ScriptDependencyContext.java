package rscvanilla.bot.script;

import rscvanilla.bot.mudclient.actions.*;
import rscvanilla.bot.mudclient.wrappers.entities.LocalPlayerCharacter;
import rscvanilla.bot.infrastructure.printer.Printer;
import rscvanilla.bot.mudclient.wrappers.MudClientWrapper;

import javax.inject.Inject;

public class ScriptDependencyContext {

    private final GroundItemAction groundItemAction;
    private final NonPlayerCharacterAction nonPlayerCharacterAction;
    private final PlayerCharacterAction playerCharacterAction;
    private final WalkAction walkAction;
    private final InventoryItemAction inventoryItemAction;
    private final GroundObjectAction groundObjectAction;
    private final BankAction bankAction;
    private final OptionsAction optionsAction;
    private final PositionAction positionAction;
    private final LoginAction loginAction;
    private final MessageAction messageAction;
    private final WallObjectAction wallObjectAction;
    private final ShopAction shopAction;

    private final MudClientWrapper mudClientWrapper;

    private final Printer printer;

    @Inject
    public ScriptDependencyContext(GroundItemAction groundItemAction,
                                   NonPlayerCharacterAction nonPlayerCharacterAction,
                                   PlayerCharacterAction playerCharacterAction,
                                   WalkAction walkAction,
                                   InventoryItemAction inventoryItemAction,
                                   GroundObjectAction groundObjectAction,
                                   BankAction bankAction,
                                   OptionsAction optionsAction,
                                   PositionAction positionAction, Printer printer,
                                   LoginAction loginAction,
                                   MessageAction messageAction,
                                   MudClientWrapper mudClientWrapper,
                                   WallObjectAction wallObjectAction,
                                   ShopAction shopAction) {
        this.groundItemAction = groundItemAction;
        this.nonPlayerCharacterAction = nonPlayerCharacterAction;
        this.playerCharacterAction = playerCharacterAction;
        this.walkAction = walkAction;
        this.inventoryItemAction = inventoryItemAction;
        this.groundObjectAction = groundObjectAction;
        this.bankAction = bankAction;
        this.optionsAction = optionsAction;
        this.positionAction = positionAction;
        this.loginAction = loginAction;
        this.messageAction = messageAction;
        this.wallObjectAction = wallObjectAction;
        this.mudClientWrapper = mudClientWrapper;
        this.printer = printer;
        this.shopAction = shopAction;
    }

    public MudClientWrapper getMudClientWrapper() { return mudClientWrapper; }

    public LocalPlayerCharacter getUser() { return mudClientWrapper.getLocalPlayer(); }

    public Printer getPrinter() { return printer; }
    public MessageAction getMessageAction() { return messageAction; }
    public LoginAction getLoginAction() { return loginAction; }
    public OptionsAction getOptionsMenuAction() { return optionsAction; }
    public PositionAction getPositionAction() { return positionAction; }
    public BankAction getOptionsAction() { return bankAction; }
    public GroundObjectAction getObjectAction() { return groundObjectAction; }
    public GroundItemAction getGroundItemAction() { return groundItemAction; }
    public NonPlayerCharacterAction getNpcAction() { return nonPlayerCharacterAction; }
    public PlayerCharacterAction getPlayerAction() { return playerCharacterAction; }
    public WalkAction getWalkAction() { return walkAction; }
    public InventoryItemAction getInventoryItemAction() { return inventoryItemAction; }
    public WallObjectAction getWallAction() { return wallObjectAction; }
    public ShopAction getShopAction() { return shopAction; }
}
