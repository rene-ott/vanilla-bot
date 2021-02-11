package rscvanilla.bot.mc;

import com.rsc.d;
import com.rsc.e.e;
import com.rsc.e.j;
import com.rsc.e.k;
import com.rsc.e.m;
import com.rsc.f;
import rscvanilla.bot.GameApplet;
import rscvanilla.bot.api.models.Position;
import rscvanilla.bot.api.models.wrappers.*;
import rscvanilla.bot.infrastructure.BotException;
import rscvanilla.bot.infrastructure.annotations.DependsOnExternal;
import rscvanilla.bot.mc.helpers.HookLoader;
import rscvanilla.bot.mc.helpers.MudClientHookerUtil;
import rscvanilla.bot.mc.proxies.FieldWrapper;
import rscvanilla.bot.mc.proxies.MethodWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rscvanilla.contracts.interceptors.MudClientCaptchaInterceptor;
import rscvanilla.contracts.interceptors.MudClientGameSettingsInterceptor;
import rscvanilla.contracts.interceptors.MudClientGameMessageInterceptor;
import rscvanilla.hook.model.Hooks;
import rscvanilla.hook.model.classes.applet.AppletClassFields;
import rscvanilla.hook.model.classes.mudclient.MudClientClassFields;
import rscvanilla.hook.model.classes.mudclient.MudClientClassMethods;

import javax.inject.Inject;
import java.util.List;

public class MudClientWrapper {

    private static final Logger logger = LoggerFactory.getLogger(MudClientWrapper.class);

    private final d mudClient;

    private final MudClientClassFields classFields;
    private final MudClientClassMethods classMethods;
    private final AppletClassFields appletClassFields;

    private FieldWrapper<j[]> npcList;
    private FieldWrapper<Integer> npcListIndex;
    private FieldWrapper<com.rsc.e.f[]> groundItemList;
    private FieldWrapper<Integer> groundItemListIndex;
    private FieldWrapper<Integer> objectListIndex;
    private FieldWrapper<e[]> objectList;
    private FieldWrapper<k[]> playerList;
    private FieldWrapper<Integer> playerListIndex;
    public FieldWrapper<int[]> inventoryItemList;
    public FieldWrapper<Integer> inventoryItemListIndex;

    public FieldWrapper<Integer> combatStyle;
    public FieldWrapper<Integer> userTileX;
    public FieldWrapper<Integer> userTileY;
    public FieldWrapper<Integer> midRegionBaseX;
    public FieldWrapper<Integer> midRegionBaseZ;
    public FieldWrapper<Integer> fatigueSleeping;
    public FieldWrapper<Integer> userFatigueStat;
    public FieldWrapper<Boolean> isSleeping;
    public FieldWrapper<int[]> inventoryItemSlotsCounts;
    public FieldWrapper<String> userName;
    private FieldWrapper<f> gameMode;
    public FieldWrapper<Integer> autoLoginTimeOut;
    public FieldWrapper<Boolean> isOptionsMenuVisible;
    public FieldWrapper<Boolean> isBankVisible;

    private FieldWrapper<Integer> selectedItemInventoryIndex;
    private FieldWrapper<Integer> selectedSpell;
    private FieldWrapper<int[]> inventoryEquippedItemSlots;
    private FieldWrapper<String> userPassword;
    private FieldWrapper<Integer> optionsCount;

    private MethodWrapper<MethodWrapper.None> walkToArea;
    private MethodWrapper<Boolean> sendWalkToGroundItem;
    private MethodWrapper<MethodWrapper.None> sendChatMessage;
    private MethodWrapper<MethodWrapper.None> walkToObject;
    private MethodWrapper<MethodWrapper.None> login;
    private MethodWrapper<MethodWrapper.None> logout;
    private MethodWrapper<MethodWrapper.None> walkToWall;

    public FieldWrapper<MudClientCaptchaInterceptor> captchaInterceptor;
    public FieldWrapper<MudClientGameMessageInterceptor> gameMessageInterceptor;
    public FieldWrapper<MudClientGameSettingsInterceptor> gameSettingsInterceptor;

    private final MudClientPacketBuilder packetBuilder;

    public FieldWrapper<m[]> wallObjectList;
    public FieldWrapper<Integer> wallObjectListIndex;
    public FieldWrapper<k> user;

    @Inject
    public MudClientWrapper(GameApplet gameApplet, Hooks hooks) {
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
            gameMessageInterceptor = loadInjectedListener("gameMessageInterceptor", MudClientGameMessageInterceptor.MC_FIELD_NAME);
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
    public void setGameMessageInterceptor(MudClientGameMessageInterceptor interceptor) {
        gameMessageInterceptor.setValue(interceptor);
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

    public List<RSNonPlayerCharacter> getNpcList() {
        return MudClientHookerUtil.newIndexedList(this.npcList.getValue(), this.npcListIndex.getValue(), RSNonPlayerCharacter.class, this);
    }

    public List<RSGroundItem> getGroundItemList() {
        return MudClientHookerUtil.newIndexedList(this.groundItemList.getValue(), this.groundItemListIndex.getValue(), RSGroundItem.class, this);
    }

    public List<RSGroundObject> getObjectList() {
        return MudClientHookerUtil.newIndexedList(this.objectList.getValue(), this.objectListIndex.getValue(), RSGroundObject.class, this);
    }

    public List<RSPlayerCharacter> getPlayerList() {
        return MudClientHookerUtil.newIndexedList(this.playerList.getValue(), this.playerListIndex.getValue(), RSPlayerCharacter.class, this);
    }

    public List<RSWallObject> getWallObjectList() {
        return MudClientHookerUtil.newIndexedList(this.wallObjectList.getValue(), this.wallObjectListIndex.getValue(), RSWallObject.class, this);
    }

    public RSLocalPlayerCharacter getUser() { return new RSLocalPlayerCharacter(user.getValue(), this); }
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

    public <T> FieldWrapper<T> loadFieldHook(String hookName, String hookValue, Class<?> hookType) {
        return HookLoader.loadFieldHook(mudClient, logger, hookName, hookValue, hookType);
    }

    public <T> MethodWrapper<T> loadMethodHook(String hookName, String hookValue, Class<?>...params) {
        return HookLoader.loadMethodHook(mudClient, logger, hookName, hookValue, params);
    }

    public <T> FieldWrapper<T> loadInjectedListener(String hookName, String hookValue) {
        return HookLoader.loadFieldHook(mudClient, logger, hookName, hookValue, null);
    }
}
