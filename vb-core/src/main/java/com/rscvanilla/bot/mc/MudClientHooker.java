package com.rscvanilla.bot.mc;

import com.rsc.d;
import com.rsc.e.j;
import com.rsc.e.k;
import com.rsc.e.m;
import com.rsc.f;
import com.rscvanilla.bot.GameApplet;
import com.rscvanilla.bot.api.models.Position;
import com.rscvanilla.bot.api.wrappers.*;
import com.rscvanilla.bot.infrastructure.BotException;
import com.rscvanilla.bot.infrastructure.annotations.DependsOnExternal;
import com.rscvanilla.bot.mc.helpers.HookLoader;
import com.rscvanilla.bot.mc.helpers.MudClientHookerUtil;
import com.rscvanilla.bot.mc.proxies.FieldHook;
import com.rscvanilla.bot.mc.proxies.MethodHook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rscvanilla.contracts.interceptors.MudClientCaptchaInterceptor;
import rscvanilla.contracts.interceptors.MudClientGameSettingsInterceptor;
import rscvanilla.contracts.interceptors.MudClientInGameMessageInterceptor;
import rscvanilla.hook.model.Hooks;
import rscvanilla.hook.model.classes.applet.AppletClassFields;
import rscvanilla.hook.model.classes.mudclient.MudClientClassFields;
import rscvanilla.hook.model.classes.mudclient.MudClientClassMethods;

import javax.inject.Inject;
import java.util.List;

public class MudClientHooker {

    private static final Logger logger = LoggerFactory.getLogger(MudClientHooker.class);

    private final d mudClient;
    private final MudClientClassFields classFields;
    private final MudClientClassMethods classMethods;
    private final AppletClassFields appletClassFields;

    private FieldHook<j[]> npcList;
    private FieldHook<Integer> npcListIndex;
    private FieldHook<com.rsc.e.f[]> groundItemList;
    private FieldHook<Integer> groundItemListIndex;
    private FieldHook<Integer> objectListIndex;
    private FieldHook<com.rsc.e.e[]> objectList;
    private FieldHook<k[]> playerList;
    private FieldHook<Integer> playerListIndex;
    public FieldHook<int[]> inventoryItemList;
    public FieldHook<Integer> inventoryItemListIndex;

    public FieldHook<Integer> combatStyle;
    public FieldHook<Integer> userTileX;
    public FieldHook<Integer> userTileY;
    public FieldHook<Integer> midRegionBaseX;
    public FieldHook<Integer> midRegionBaseZ;
    public FieldHook<Integer> fatigueSleeping;
    public FieldHook<Integer> userFatigueStat;
    public FieldHook<Boolean> isSleeping;
    public FieldHook<int[]> inventoryItemSlotsCounts;
    public FieldHook<k> player;
    public FieldHook<String> userName;
    private FieldHook<f> gameMode;
    public FieldHook<Integer> autoLoginTimeOut;
    public FieldHook<Boolean> isOptionsMenuVisible;
    public FieldHook<Boolean> isBankVisible;
    private FieldHook<Integer> selectedItemInventoryIndex;
    private FieldHook<Integer> selectedSpell;
    private FieldHook<int[]> inventoryEquippedItemSlots;
    private FieldHook<String> userPassword;
    private FieldHook<Integer> optionsCount;

    private MethodHook<MethodHook.None> walkToArea;
    private MethodHook<Boolean> sendWalkToGroundItem;
    private MethodHook<MethodHook.None> sendChatMessage;
    private MethodHook<MethodHook.None> walkToObject;
    private MethodHook<MethodHook.None> login;
    private MethodHook<MethodHook.None> logout;
    private MethodHook<MethodHook.None> walkToWall;

    public FieldHook<MudClientCaptchaInterceptor> captchaInterceptor;
    public FieldHook<MudClientInGameMessageInterceptor> inGameMessageInterceptor;
    public FieldHook<MudClientGameSettingsInterceptor> gameSettingsInterceptor;

    private final MudClientPacketBuilder packetBuilder;

    public FieldHook<m[]> wallObjectList;
    public FieldHook<Integer> wallObjectListIndex;
    public FieldHook<k> user;

    @Inject
    public MudClientHooker(GameApplet gameApplet, Hooks hooks) {
        classFields = hooks.mudClient.fields;
        classMethods = hooks.mudClient.methods;
        appletClassFields = hooks.applet.fields;

        mudClient = getReferenceToMudClient(gameApplet);
        packetBuilder = new MudClientPacketBuilder(mudClient);

        loadInjectedInterceptors();
    }

    private d getReferenceToMudClient(GameApplet gameApplet) {
        try {
            logger.debug("Loading mudclient hook:");
            return (d) HookLoader.loadFieldHook(gameApplet, logger, "mudClient", appletClassFields.mudClient, d.class).getValue();
        } catch (BotException e) {
            throw new BotException("FAILED TO HOOK MC!", e);
        }
    }

    private void loadInjectedInterceptors() {
        try {
            logger.debug("Loading interceptor hooks:");
            captchaInterceptor = loadInjectedListener("captchaInterceptor", MudClientCaptchaInterceptor.MC_FIELD_NAME);
            inGameMessageInterceptor = loadInjectedListener("inGameMessageInterceptor", MudClientInGameMessageInterceptor.MC_FIELD_NAME);
            gameSettingsInterceptor = loadInjectedListener("gameSettingsInterceptor", MudClientGameSettingsInterceptor.MC_FIELD_NAME);

        } catch (BotException e) {
            throw new BotException("FAILED TO HOOK MC INTERCEPTOR!", e);
        }
    }

    @Inject
    @SuppressWarnings("unused") // Injected by Guice
    public void setCaptchaInterceptor(MudClientCaptchaInterceptor interceptor) {
        captchaInterceptor.setValue(interceptor);
    }

    @Inject
    @SuppressWarnings("unused") // Injected by Guice
    public void setInGameMessageInterceptor(MudClientInGameMessageInterceptor interceptor) {
        inGameMessageInterceptor.setValue(interceptor);
    }

    @Inject
    @SuppressWarnings("unused") // Injected by Guice
    public void setGameSettingsInterceptor(MudClientGameSettingsInterceptor interceptor) {
        gameSettingsInterceptor.setValue(interceptor);
    }

    public void loadHooks() {
        try {
            logger.debug("Loading field hooks:");
            npcList = loadFieldHook("npcList", classFields.npcList, j[].class);
            groundItemList = loadFieldHook("groundItemList", classFields.groundItemList, com.rsc.e.f[].class);
            combatStyle = loadFieldHook("combatStyle", classFields.combatStyle, Integer.class);
            userTileX = loadFieldHook("userTileX", classFields.playerPositionX, Integer.class);
            userTileY = loadFieldHook("userTileY", classFields.playerPositionY, Integer.class);
            selectedItemInventoryIndex = loadFieldHook("selectedItemInventoryIndex", classFields.selectedInventoryItemIndex, Integer.class);
            selectedSpell = loadFieldHook("selectedSpell", classFields.selectedSpell, Integer.class);
            midRegionBaseX = loadFieldHook("midRegionBaseX", classFields.mid_region_base_x, Integer.class);
            midRegionBaseZ = loadFieldHook("midRegionBaseZ", classFields.mid_region_base_y, Integer.class);
            fatigueSleeping = loadFieldHook("fatigueSleeping", classFields.fatigueSleeping, Integer.class);
            userFatigueStat = loadFieldHook("userFatigueStat", classFields.fatigueStat, Integer.class);
            isSleeping = loadFieldHook("isSleeping", classFields.isSleeping, Boolean.class);
            groundItemListIndex = loadFieldHook("groundItemListIndex", classFields.groundItemListIndex, Integer.class);
            inventoryItemList = loadFieldHook("inventoryItemList", classFields.inventoryItemList, int[].class);
            inventoryItemListIndex = loadFieldHook("inventoryItemListIndex", classFields.inventoryItemListIndex, Integer.class);
            inventoryEquippedItemSlots = loadFieldHook("inventoryEquippedItemSlots", classFields.inventoryEquippedItemSlots, int[].class);
            inventoryItemSlotsCounts = loadFieldHook("inventoryItemSlotsCounts", classFields.inventoryItemSlotsCounts, int[].class);
            npcListIndex = loadFieldHook("npcListIndex", classFields.npcListIndex, Integer.class);
            objectList = loadFieldHook("objectList", classFields.groundObjectList, com.rsc.e.e[].class);
            objectListIndex = loadFieldHook("objectListIndex", classFields.groundObjectListIndex, Integer.class);
            playerList = loadFieldHook("playerList", classFields.playerList, k[].class);
            playerListIndex = loadFieldHook("playerListIndex", classFields.playerListIndex, Integer.class);
            userName = loadFieldHook("userName", classFields.userName, String.class);
            userPassword = loadFieldHook("userPassword", classFields.userPassword, String.class);
            gameMode = loadFieldHook("gameMode", classFields.gameMode, f.class);
            autoLoginTimeOut = loadFieldHook("autoLoginTimeOut", classFields.autoLoginTimeout, Integer.class);
            isOptionsMenuVisible = loadFieldHook("isOptionsMenuVisible", classFields.isOptionsMenuVisible, Boolean.class);
            optionsCount = loadFieldHook("optionsCount", classFields.optionsCount, Integer.class);
            isBankVisible = loadFieldHook("isBankVisible", classFields.isBankVisible, Boolean.class);
            wallObjectList = loadFieldHook("wallObjectList", classFields.wallObjectList, m[].class);
            wallObjectListIndex = loadFieldHook("wallObjectListIndex", classFields.wallObjectListIndex, Integer.class);
            user = loadFieldHook("user", classFields.user, k.class);

            logger.debug("Loading method hooks:");
            walkToArea = loadMethodHook("walkToArea", classMethods.walkToArea, int.class, int.class, int.class, int.class,int.class,int.class, boolean.class, boolean.class);
            sendWalkToGroundItem = loadMethodHook("sendWalkToGroundItem", classMethods.sendWalkToGroundItem, int.class, int.class, int.class, int.class, int.class, int.class, boolean.class);
            sendChatMessage = loadMethodHook("sendChatMessage", classMethods.sendChatMessage, String.class);
            walkToObject = loadMethodHook("walkToObject", classMethods.walkToObject, int.class, int.class, int.class, int.class);
            walkToWall = loadMethodHook("walkToWall", classMethods.walkToWall, int.class, int.class, int.class);
            login = loadMethodHook("login", classMethods.login, boolean.class);
            logout = loadMethodHook("logout", classMethods.logout);

        } catch (BotException e) {
            throw new BotException("FAILED TO HOOK MC MEMBER!", e);
        }
    }

    public MudClientPacketBuilder getPacketBuilder() {
        return packetBuilder;
    }

    @Deprecated()
    public d getRawMudClient() {
        return mudClient;
    }

    public List<RSCharacter> getNpcList() {
        return MudClientHookerUtil.newIndexedList(this.npcList.getValue(), this.npcListIndex.getValue(), RSCharacter.class, this);
    }

    public List<RSGroundItem> getGroundItemList() {
        return MudClientHookerUtil.newIndexedList(this.groundItemList.getValue(), this.groundItemListIndex.getValue(), RSGroundItem.class, this);
    }

    public List<RSObject> getObjectList() {
        return MudClientHookerUtil.newIndexedList(this.objectList.getValue(), this.objectListIndex.getValue(), RSObject.class, this);
    }

    public List<RSPlayer> getPlayerList() {
        return MudClientHookerUtil.newIndexedList(this.playerList.getValue(), this.playerListIndex.getValue(), RSPlayer.class, this);
    }

    public List<RSWallObject> getWallObjectList() {
        return MudClientHookerUtil.newIndexedList(this.wallObjectList.getValue(), this.wallObjectListIndex.getValue(), RSWallObject.class, this);
    }

    public RSUser getUser() { return new RSUser(user.getValue(), this); }
    public Position getMidRegionBase() { return new Position(midRegionBaseX.getValue(), midRegionBaseZ.getValue()); }

    public void walkToArea(int startX, int startY, int x1, int y1, int x2, int y2, boolean reachBorder, boolean walkToEntity) { walkToArea.invokeAction(startX, startY, x1, y1, x2, y2, reachBorder, walkToEntity); }
    public boolean sendWalkToGroundItem(int startX, int startZ, int x1, int x2, int z1, int z2, boolean var4) { return sendWalkToGroundItem.invokeFunction(startX, startZ, x1, x2, z1, z2, var4); }
    public void sendChatMessage(String s) { sendChatMessage.invokeAction(s); }
    public void walkToObject(int startX, int startY, int x1, int y1) { walkToObject.invokeAction(startX, startY, x1, y1); }
    public void walkToWall(int x, int y, int direction) { walkToWall.invokeAction(x, y, direction); }

    public void login() { login.invokeAction(false); }
    public void logout() { logout.invokeAction(); }

    @DependsOnExternal
    public boolean isInGame() { return gameMode.getValue() == f.rR; }

    @DependsOnExternal
    public boolean isOnLoginScreen() { return gameMode.getValue() == f.rQ; }

    public <T> FieldHook<T> loadFieldHook(String hookName, String hookValue, Class<?> hookType) {
        return HookLoader.loadFieldHook(mudClient, logger, hookName, hookValue, hookType);
    }

    public <T> MethodHook<T> loadMethodHook(String hookName, String hookValue, Class<?>...params) {
        return HookLoader.loadMethodHook(mudClient, logger, hookName, hookValue, params);
    }

    public <T> FieldHook<T> loadInjectedListener(String hookName, String hookValue) {
        return HookLoader.loadFieldHook(mudClient, logger, hookName, hookValue, null);
    }
}
