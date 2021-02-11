package rscvanilla.bot.script;

import rscvanilla.bot.api.actions.*;
import rscvanilla.bot.api.models.wrappers.RSUser;
import rscvanilla.bot.infrastructure.printer.Printer;
import rscvanilla.bot.mc.MudClientHooker;

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

    private final MudClientHooker hooker;

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
                                   MudClientHooker hooker,
                                   WallObjectAction wallObjectAction
    ) {
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
        this.hooker = hooker;
        this.printer = printer;
    }

    public MudClientHooker getHooker() { return hooker; }

    public RSUser getUser() { return hooker.getUser(); }

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
}
