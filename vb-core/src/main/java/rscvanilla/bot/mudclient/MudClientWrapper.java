package rscvanilla.bot.mudclient;

import rscvanilla.bot.GameApplet;
import rscvanilla.bot.infrastructure.utils.EnumUtil;
import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.mudclient.models.wrappers.*;
import rscvanilla.bot.infrastructure.BotException;
import rscvanilla.bot.infrastructure.annotations.DependsOnExternal;
import rscvanilla.bot.infrastructure.logger.AppLoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rscvanilla.contracts.interceptors.MudClientCaptchaInterceptor;
import rscvanilla.contracts.interceptors.MudClientGameSettingsInterceptor;
import rscvanilla.contracts.interceptors.MudClientGameMessageInterceptor;
import rscvanilla.cjci.model.ClientJarClassInfo;
import rscvanilla.cjci.model.classes.applet.AppletClassFields;
import rscvanilla.cjci.model.classes.mudclient.MudClientClassFields;
import rscvanilla.cjci.model.classes.mudclient.MudClientClassMethods;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;

public class MudClientWrapper {

    public static final String FIELD_USER_NAME = "userName";
    public static final String FIELD_USER_PASSWORD = "userPassword";

    private static final Logger logger = LoggerFactory.getLogger(MudClientWrapper.class);
    private static final Logger simpleLogger = AppLoggerFactory.getSimpleLogger();

    private FieldWrapper<com.rsc.d> mudClient;

    private final ClientJarClassInfo clientJarClassInfo;

    private final MudClientClassFields classFields;
    private final MudClientClassMethods classMethods;
    private final AppletClassFields appletClassFields;

    private FieldWrapper<com.rsc.e.j[]> npcList;
    private FieldWrapper<Integer> npcListIndex;
    private FieldWrapper<com.rsc.e.f[]> groundItemList;
    private FieldWrapper<Integer> groundItemListIndex;
    private FieldWrapper<Integer> objectListIndex;
    private FieldWrapper<com.rsc.e.e[]> objectList;
    private FieldWrapper<com.rsc.e.k[]> playerList;
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
    private FieldWrapper<com.rsc.f> gameMode;
    public FieldWrapper<Integer> autoLoginTimeOut;
    public FieldWrapper<Boolean> isOptionsMenuVisible;
    public FieldWrapper<Boolean> isBankVisible;

    @SuppressWarnings("unused") private FieldWrapper<Integer> selectedItemInventoryIndex;
    @SuppressWarnings("unused") private FieldWrapper<Integer> selectedSpell;
    @SuppressWarnings("unused") private FieldWrapper<int[]> inventoryEquippedItemSlots;
    @SuppressWarnings("unused") private FieldWrapper<String> userPassword;
    @SuppressWarnings("unused") private FieldWrapper<Integer> optionsCount;

    private MethodWrapper<MethodWrapper.Unit> walkToArea;
    private MethodWrapper<Boolean> sendWalkToGroundItem;
    private MethodWrapper<MethodWrapper.Unit> sendChatMessage;
    private MethodWrapper<MethodWrapper.Unit> walkToObject;
    private MethodWrapper<MethodWrapper.Unit> login;
    private MethodWrapper<MethodWrapper.Unit> logout;
    private MethodWrapper<MethodWrapper.Unit> walkToWall;

    public FieldWrapper<MudClientCaptchaInterceptor> captchaInterceptor;
    public FieldWrapper<MudClientGameMessageInterceptor> gameMessageInterceptor;
    public FieldWrapper<MudClientGameSettingsInterceptor> gameSettingsInterceptor;

    private final MudClientPacketBuilder packetBuilder;

    public FieldWrapper<com.rsc.e.m[]> wallObjectList;
    public FieldWrapper<Integer> wallObjectListIndex;
    public FieldWrapper<com.rsc.e.k> user;

    @Inject
    public MudClientWrapper(GameApplet gameApplet, ClientJarClassInfo clientJarClassInfo) {
        this.clientJarClassInfo = clientJarClassInfo;
        classFields = clientJarClassInfo.mudClient.fields;
        classMethods = clientJarClassInfo.mudClient.methods;
        appletClassFields = clientJarClassInfo.applet.fields;

        initMudClientField(gameApplet);
        packetBuilder = new MudClientPacketBuilder(this);

        initializeInjectedInterceptors();
    }

    private void initMudClientField(GameApplet gameApplet) {
        try {
            logger.debug("Initializing [MudClientWrapper] mudclient field:");

            mudClient = WrapperTool.loadField(gameApplet, simpleLogger, "mudClient", appletClassFields.mudClient, com.rsc.d.class);

            simpleLogger.debug("");
        } catch (BotException e) {
            throw BotException.of("Failed to initialize [MudClientWrapper] mudclient field!", e);
        }
    }

    private void initializeInjectedInterceptors() {
        try {
            logger.debug("Initializing [MudClientWrapper] interceptor fields:");

            captchaInterceptor = initInterceptor("captchaInterceptor", MudClientCaptchaInterceptor.MC_FIELD_NAME);
            gameMessageInterceptor = initInterceptor("gameMessageInterceptor", MudClientGameMessageInterceptor.MC_FIELD_NAME);
            gameSettingsInterceptor = initInterceptor("gameSettingsInterceptor", MudClientGameSettingsInterceptor.MC_FIELD_NAME);

            simpleLogger.debug("");
        } catch (BotException e) {
            throw BotException.of("Failed to initialize [MudClientWrapper] interceptor fields!", e);
        }
    }

    // Interceptors are injected after interceptor fields are initialized and before lateInitClassMembers are initialized
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

    public void lateInitClassMembers() {
        initFields();
        initMethods();
    }

    private void initFields() {
        try {
            logger.debug("Initializing [MudClientWrapper] fields:");

            npcList = initField("npcList", classFields.npcList, com.rsc.e.j[].class);
            groundItemList = initField("groundItemList", classFields.groundItemList, com.rsc.e.f[].class);
            combatStyle = initField("combatStyle", classFields.combatStyle, Integer.class);
            userTileX = initField("userTileX", classFields.playerPositionX, Integer.class);
            userTileY = initField("userTileY", classFields.playerPositionY, Integer.class);
            selectedItemInventoryIndex = initField("selectedItemInventoryIndex", classFields.selectedInventoryItemIndex, Integer.class);
            selectedSpell = initField("selectedSpell", classFields.selectedSpell, Integer.class);
            midRegionBaseX = initField("midRegionBaseX", classFields.mid_region_base_x, Integer.class);
            midRegionBaseZ = initField("midRegionBaseZ", classFields.mid_region_base_y, Integer.class);
            fatigueSleeping = initField("fatigueSleeping", classFields.fatigueSleeping, Integer.class);
            userFatigueStat = initField("userFatigueStat", classFields.fatigueStat, Integer.class);
            isSleeping = initField("isSleeping", classFields.isSleeping, Boolean.class);
            groundItemListIndex = initField("groundItemListIndex", classFields.groundItemListIndex, Integer.class);
            inventoryItemList = initField("inventoryItemList", classFields.inventoryItemList, int[].class);
            inventoryItemListIndex = initField("inventoryItemListIndex", classFields.inventoryItemListIndex, Integer.class);
            inventoryEquippedItemSlots = initField("inventoryEquippedItemSlots", classFields.inventoryEquippedItemSlots, int[].class);
            inventoryItemSlotsCounts = initField("inventoryItemSlotsCounts", classFields.inventoryItemSlotsCounts, int[].class);
            npcListIndex = initField("npcListIndex", classFields.npcListIndex, Integer.class);
            objectList = initField("objectList", classFields.groundObjectList, com.rsc.e.e[].class);
            objectListIndex = initField("objectListIndex", classFields.groundObjectListIndex, Integer.class);
            playerList = initField("playerList", classFields.playerList, com.rsc.e.k[].class);
            playerListIndex = initField("playerListIndex", classFields.playerListIndex, Integer.class);
            userName = initField("userName", classFields.userName, String.class);
            userPassword = initField("userPassword", classFields.userPassword, String.class);
            gameMode = initField("gameMode", classFields.gameMode, com.rsc.f.class);
            autoLoginTimeOut = initField("autoLoginTimeOut", classFields.autoLoginTimeout, Integer.class);
            isOptionsMenuVisible = initField("isOptionsMenuVisible", classFields.isOptionsMenuVisible, Boolean.class);
            optionsCount = initField("optionsCount", classFields.optionsCount, Integer.class);
            isBankVisible = initField("isBankVisible", classFields.isBankVisible, Boolean.class);
            wallObjectList = initField("wallObjectList", classFields.wallObjectList, com.rsc.e.m[].class);
            wallObjectListIndex = initField("wallObjectListIndex", classFields.wallObjectListIndex, Integer.class);
            user = initField("user", classFields.user, com.rsc.e.k.class);

            simpleLogger.debug("");
        } catch (BotException e) {
            throw BotException.of("Failed to initialize [MudClientWrapper] fields!", e);
        }
    }

    private void initMethods() {
        try {
            logger.debug("Initializing [MudClientWrapper] methods:");

            walkToArea = initMethod("walkToArea", classMethods.walkToArea, int.class, int.class, int.class, int.class,int.class,int.class, boolean.class, boolean.class);
            sendWalkToGroundItem = initMethod("sendWalkToGroundItem", classMethods.sendWalkToGroundItem, int.class, int.class, int.class, int.class, int.class, int.class, boolean.class);
            sendChatMessage = initMethod("sendChatMessage", classMethods.sendChatMessage, String.class);
            walkToObject = initMethod("walkToObject", classMethods.walkToObject, int.class, int.class, int.class, int.class);
            walkToWall = initMethod("walkToWall", classMethods.walkToWall, int.class, int.class, int.class);
            login = initMethod("login", classMethods.login, boolean.class);
            logout = initMethod("logout", classMethods.logout);

            simpleLogger.debug("");
        } catch (BotException e) {
            throw BotException.of("Failed to initialize [MudClientWrapper] methods!", e);
        }
    }

    public MudClientPacketBuilder getPacketBuilder() { return packetBuilder; }
    public ClientJarClassInfo getClientJarClassInfo() { return clientJarClassInfo; }

    // Accessing to MudClient should be done through this wrapper class.
    @Deprecated()
    public com.rsc.d getRawMudClient() { return mudClient.getValue(); }

    public List<RSNonPlayerCharacter> getNpcList() { return newWrappedEntityList(this.npcList, this.npcListIndex, RSNonPlayerCharacter.class); }
    public List<RSGroundItem> getGroundItemList() { return newWrappedEntityList(this.groundItemList, this.groundItemListIndex, RSGroundItem.class); }
    public List<RSGroundObject> getObjectList() { return newWrappedEntityList(this.objectList, this.objectListIndex, RSGroundObject.class); }
    public List<RSPlayerCharacter> getPlayerList() { return newWrappedEntityList(this.playerList, this.playerListIndex, RSPlayerCharacter.class); }
    public List<RSWallObject> getWallObjectList() { return newWrappedEntityList(this.wallObjectList, this.wallObjectListIndex, RSWallObject.class); }

    public RSLocalPlayerCharacter getUser() { return new RSLocalPlayerCharacter(user.getValue(), this); }
    public Position getMidRegionBase() { return new Position(midRegionBaseX.getValue(), midRegionBaseZ.getValue()); }

    public void walkToArea(int startX, int startY, int x1, int y1, int x2, int y2, boolean reachBorder, boolean walkToEntity) { walkToArea.invokeAction(startX, startY, x1, y1, x2, y2, reachBorder, walkToEntity); }
    public boolean sendWalkToGroundItem(int startX, int startZ, int x1, int x2, int z1, int z2, boolean var4) { return sendWalkToGroundItem.invokeFunction(startX, startZ, x1, x2, z1, z2, var4); }
    public void sendChatMessage(String s) { sendChatMessage.invokeAction(s); }
    public void walkToObject(int startX, int startY, int x1, int y1) { walkToObject.invokeAction(startX, startY, x1, y1); }
    public void walkToWall(int x, int y, int direction) { walkToWall.invokeAction(x, y, direction); }

    public void login() { login.invokeAction(false); }
    public void logout() { logout.invokeAction(); }

    public boolean isInGame() { return gameMode.getValue() == EnumUtil.getEnumFromString(gameMode.getValue().getClass(), "GAME"); }
    public boolean isOnLoginScreen() { return gameMode.getValue() == EnumUtil.getEnumFromString(gameMode.getValue().getClass(), "LOGIN"); }

    private <TWrappedEntity extends RSEntityWrapper<TInternalObject>, TInternalObject extends com.rsc.e.d> List<TWrappedEntity> newWrappedEntityList(
        FieldWrapper<TInternalObject[]> internalArray, FieldWrapper<Integer> internalArrayLength, Class<TWrappedEntity> clazz) {
        return WrapperTool.newWrappedEntityList(internalArray.getValue(), internalArrayLength.getValue(), clazz, this);
    }

    private <T> FieldWrapper<T> initField(String wrapperFieldName, String mcFieldName, Class<?> mcFieldExpectedReturnType) {
        return WrapperTool.loadField(mudClient.getValue(), simpleLogger, wrapperFieldName, mcFieldName, mcFieldExpectedReturnType);
    }

    private <T> MethodWrapper<T> initMethod(String wrapperMethodName, String mcMethodName, Class<?>...mcMethodExpectedParamTypes) {
        return WrapperTool.loadMethod(mudClient.getValue(), simpleLogger, wrapperMethodName, mcMethodName, mcMethodExpectedParamTypes);
    }

    private <T> FieldWrapper<T> initInterceptor(String wrapperFieldName, String mcFieldName) {
        return WrapperTool.loadField(mudClient.getValue(), simpleLogger, wrapperFieldName, mcFieldName, null);
    }
}
