package com.rscvanilla.bot.script;

import com.rscvanilla.bot.api.action.*;
import com.rscvanilla.bot.api.wrappers.RSUser;
import com.rscvanilla.bot.infrastructure.printer.Printer;
import com.rscvanilla.bot.mc.MudClientHooker;

import javax.inject.Inject;

public class ScriptDependencyContext {

    private final GroundItemAction groundItemAction;
    private final NpcAction npcAction;
    private final PlayerAction playerAction;
    private final WalkAction walkAction;
    private final InventoryItemAction inventoryItemAction;
    private final ObjectAction objectAction;
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
                                   NpcAction npcAction,
                                   PlayerAction playerAction,
                                   WalkAction walkAction,
                                   InventoryItemAction inventoryItemAction,
                                   ObjectAction objectAction,
                                   BankAction bankAction,
                                   OptionsAction optionsAction,
                                   PositionAction positionAction, Printer printer,
                                   LoginAction loginAction,
                                   MessageAction messageAction,
                                   MudClientHooker hooker,
                                   WallObjectAction wallObjectAction
    ) {
        this.groundItemAction = groundItemAction;
        this.npcAction = npcAction;
        this.playerAction = playerAction;
        this.walkAction = walkAction;
        this.inventoryItemAction = inventoryItemAction;
        this.objectAction = objectAction;
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
    public ObjectAction getObjectAction() { return objectAction; }
    public GroundItemAction getGroundItemAction() { return groundItemAction; }
    public NpcAction getNpcAction() { return npcAction; }
    public PlayerAction getPlayerAction() { return playerAction; }
    public WalkAction getWalkAction() { return walkAction; }
    public InventoryItemAction getInventoryItemAction() { return inventoryItemAction; }
    public WallObjectAction getWallAction() { return wallObjectAction; }
}
