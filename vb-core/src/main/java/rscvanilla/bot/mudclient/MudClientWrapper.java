package rscvanilla.bot.mudclient;

import com.google.common.base.Strings;
import rscvanilla.bot.GameApplet;
import rscvanilla.bot.infrastructure.utils.EnumUtil;
import rscvanilla.bot.mudclient.handlers.InterceptionHandler;
import rscvanilla.bot.mudclient.handlers.captcha.CaptchaHandler;
import rscvanilla.bot.mudclient.handlers.gamemessage.GameMessageHandler;
import rscvanilla.bot.mudclient.handlers.gamesettings.GameSettingsHandler;
import rscvanilla.bot.mudclient.handlers.userlogaction.UserLoginActionHandler;
import rscvanilla.bot.mudclient.models.BankItem;
import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.mudclient.models.wrappers.*;
import rscvanilla.bot.infrastructure.BotException;
import rscvanilla.bot.infrastructure.logger.AppLoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rscvanilla.cjci.model.classes.mudclientbase.MudClientBaseClassFields;
import rscvanilla.contracts.interceptors.*;
import rscvanilla.cjci.model.ClientJarClassInfo;
import rscvanilla.cjci.model.classes.applet.AppletClassFields;
import rscvanilla.cjci.model.classes.mudclient.MudClientClassFields;
import rscvanilla.cjci.model.classes.mudclient.MudClientClassMethods;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
    private final MudClientBaseClassFields baseClassFields;

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

    private FieldWrapper<int[]> bankItemIdList;
    private FieldWrapper<int[]> bankItemCountList;

    private FieldWrapper<String[]> optionsMenuText;
    private FieldWrapper<Integer> optionsMenuCount;

    private FieldWrapper<String[]> ignoreList;

    @SuppressWarnings("unused") private FieldWrapper<Integer> selectedItemInventoryIndex;
    @SuppressWarnings("unused") private FieldWrapper<Integer> selectedSpell;
    @SuppressWarnings("unused") private FieldWrapper<int[]> inventoryEquippedItemSlots;
    @SuppressWarnings("unused") private FieldWrapper<Integer> selectedBankItemIndex;

    public FieldWrapper<String> userPassword;
    public FieldWrapper<Boolean> isAdmin;

    private MethodWrapper<MethodWrapper.Unit> walkToArea;
    private MethodWrapper<Boolean> sendWalkToGroundItem;
    private MethodWrapper<MethodWrapper.Unit> sendChatMessage;
    private MethodWrapper<MethodWrapper.Unit> walkToObject;
    private MethodWrapper<MethodWrapper.Unit> login;
    private MethodWrapper<MethodWrapper.Unit> logout;
    private MethodWrapper<MethodWrapper.Unit> walkToWall;

    public FieldWrapper<ArrayList> resetLoginScreenVariablesMethodInterceptors;
    public FieldWrapper<ArrayList> sendLoginMethodInterceptors;
    public FieldWrapper<ArrayList> initGameScreenVariablesMethodInterceptors;
    public FieldWrapper<ArrayList> showGameMessageMethodInterceptors;
    public FieldWrapper<ArrayList> handleOpCodeInMethodInterceptors;

    private final PacketBuilderWrapper packetBuilderWrapper;

    public FieldWrapper<com.rsc.e.m[]> wallObjectList;
    public FieldWrapper<Integer> wallObjectListIndex;
    public FieldWrapper<com.rsc.e.k> user;

    private FieldWrapper<Object> packetBuilder;

    @Inject
    public MudClientWrapper(GameApplet gameApplet, ClientJarClassInfo clientJarClassInfo) {
        this.clientJarClassInfo = clientJarClassInfo;
        classFields = clientJarClassInfo.mudClient.fields;
        classMethods = clientJarClassInfo.mudClient.methods;
        appletClassFields = clientJarClassInfo.applet.fields;
        baseClassFields = clientJarClassInfo.mudClientBase.fields;

        initMudClientField(gameApplet);
        initFields();
        initMethods();
        initializeInjectedInterceptors();

        packetBuilderWrapper = new PacketBuilderWrapper(packetBuilder.getValue(), clientJarClassInfo);
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

            resetLoginScreenVariablesMethodInterceptors = initInterceptor("resetLoginScreenVariablesMethodInterceptors", MudClientResetLoginScreenVariablesMethodInterceptor.FIELD_NAME);
            initGameScreenVariablesMethodInterceptors = initInterceptor("initGameScreenVariablesMethodInterceptors", MudClientInitGameScreenVariablesMethodInterceptor.FIELD_NAME);
            sendLoginMethodInterceptors = initInterceptor("sendLoginMethodInterceptors", MudClientSendLoginMethodInterceptor.FIELD_NAME);
            handleOpCodeInMethodInterceptors = initInterceptor("handleOpCodeInMethodInterceptors", MudClientHandleOpcodeInMethodInterceptor.FIELD_NAME);
            showGameMessageMethodInterceptors = initInterceptor("showGameMessageMethodInterceptors", MudClientShowGameMessageMethodInterceptor.FIELD_NAME);

            simpleLogger.debug("");
        } catch (BotException e) {
            throw BotException.of("Failed to initialize [MudClientWrapper] interceptor fields!", e);
        }
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
            optionsMenuCount = initField("optionsCount", classFields.optionsCount, Integer.class);
            isBankVisible = initField("isBankVisible", classFields.isBankVisible, Boolean.class);
            wallObjectList = initField("wallObjectList", classFields.wallObjectList, com.rsc.e.m[].class);
            wallObjectListIndex = initField("wallObjectListIndex", classFields.wallObjectListIndex, Integer.class);
            user = initField("user", classFields.user, com.rsc.e.k.class);
            bankItemIdList = initField("bankItemIdList", classFields.bankItemIdList, int[].class);
            bankItemCountList = initField("bankItemCountList", classFields.bankItemCountList, int[].class);
            selectedBankItemIndex = initField("selectedBankItemIndex", classFields.selectedBankItemIndex, Integer.class);
            optionsMenuText = initField("optionsMenuText", classFields.optionsMenuText, String[].class);
            ignoreList = initField("ignoreList", classFields.ignoreList, String[].class);
            isAdmin = initField("isAdmin", classFields.isAdmin, Boolean.class);

            packetBuilder = initField("packetBuilder", baseClassFields.packetBuilder, Object.class);

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

    // Handlers are injected after fields are initialized
    @Inject
    @SuppressWarnings("unused") // Injected by Guice
    public void setLoginCredentialGUIHandler(UserLoginActionHandler interceptionHandler) { subscribeToInterception(interceptionHandler); }

    @Inject
    @SuppressWarnings("unused") // Injected by Guice
    public void setCaptchaHandler(CaptchaHandler interceptionHandler) { subscribeToInterception(interceptionHandler); }

    @Inject
    @SuppressWarnings("unused") // Injected by Guice
    public void setGameSettingsHandler(GameSettingsHandler interceptionHandler) { subscribeToInterception(interceptionHandler); }

    @Inject
    @SuppressWarnings("unused") // Injected by Guice
    public void setGameMessageHandler(GameMessageHandler interceptionHandler) { subscribeToInterception(interceptionHandler); }

    public PacketBuilderWrapper getPacketBuilder() { return packetBuilderWrapper; }
    public ClientJarClassInfo getClientJarClassInfo() { return clientJarClassInfo; }

    // Accessing to MudClient should be done through this wrapper class.
    @Deprecated()
    public com.rsc.d getRawMudClient() { return mudClient.getValue(); }

    public List<RSNonPlayerCharacter> getNpcList() { return newWrappedEntityList(this.npcList, this.npcListIndex, RSNonPlayerCharacter.class); }
    public List<RSGroundItem> getGroundItemList() { return newWrappedEntityList(this.groundItemList, this.groundItemListIndex, RSGroundItem.class); }
    public List<RSGroundObject> getObjectList() { return newWrappedEntityList(this.objectList, this.objectListIndex, RSGroundObject.class); }
    public List<RSPlayerCharacter> getPlayerList() { return newWrappedEntityList(this.playerList, this.playerListIndex, RSPlayerCharacter.class); }
    public List<RSWallObject> getWallObjectList() { return newWrappedEntityList(this.wallObjectList, this.wallObjectListIndex, RSWallObject.class); }

    public List<String> getOptionsMenuList() { return isOptionsMenuVisible.getValue()
        ? Arrays.stream(optionsMenuText.getValue(), 0, optionsMenuCount.getValue()).collect(Collectors.toList())
        : List.of(); }

    public List<String> getIgnoreList() { return Arrays.stream(ignoreList.getValue()).filter(Objects::nonNull).collect(Collectors.toList());}

    public List<BankItem> getBankItemList() { return isBankVisible.getValue()
        ? IntStream.range(0, (int) Arrays.stream(bankItemCountList.getValue()).filter(it -> it != 0).count())
                    .mapToObj(it -> new BankItem(bankItemIdList.getValue()[it], bankItemCountList.getValue()[it]))
                    .collect(Collectors.toList())
        : List.of(); }


    public RSLocalPlayerCharacter getUser() { return new RSLocalPlayerCharacter(user.getValue(), this); }
    public Position getMidRegionBase() { return new Position(midRegionBaseX.getValue(), midRegionBaseZ.getValue()); }

    public void walkToArea(int startX, int startY, int x1, int y1, int x2, int y2, boolean reachBorder, boolean walkToEntity) {
        try {
            walkToArea.invokeAction(startX, startY, x1, y1, x2, y2, reachBorder, walkToEntity);
        } catch (BotException e) {
            if (e.getCause() instanceof ArrayIndexOutOfBoundsException) {
                logger.warn("MudClient method walkToArea failed because of map change.");
            } else {
                throw e;
            }
        }
    }
    public boolean sendWalkToGroundItem(int startX, int startZ, int x1, int x2, int z1, int z2, boolean var4) { return sendWalkToGroundItem.invokeFunction(startX, startZ, x1, x2, z1, z2, var4); }
    public void sendChatMessage(String s) { sendChatMessage.invokeAction(s); }
    public void walkToObject(int startX, int startY, int x1, int y1) { walkToObject.invokeAction(startX, startY, x1, y1); }
    public void walkToWall(int x, int y, int direction) { walkToWall.invokeAction(x, y, direction); }

    public void login() { login.invokeAction(false); }
    public void logout() { logout.invokeAction(); }

    public boolean isInGame() { return gameMode.getValue() == EnumUtil.getEnumFromString(gameMode.getValue().getClass(), "GAME"); }
    public boolean isOnLoginScreen() { return gameMode.getValue() == EnumUtil.getEnumFromString(gameMode.getValue().getClass(), "LOGIN"); }

    public boolean isLoginUserOrPasswordMissing() {
        return Strings.isNullOrEmpty(userName.getValue()) || Strings.isNullOrEmpty(userPassword.getValue());
    }
    private <TWrappedEntity extends RSEntityWrapper<TInternalObject>, TInternalObject extends com.rsc.e.d> List<TWrappedEntity> newWrappedEntityList(
        FieldWrapper<TInternalObject[]> internalArray, FieldWrapper<Integer> internalArrayLength, Class<TWrappedEntity> clazz) {
        return WrapperTool.newWrappedEntityList(internalArray.getValue(), internalArrayLength.getValue(), clazz, this);
    }

    private <T> FieldWrapper<T> initField(String fieldDisplayName, String fieldName, Class<?> fieldType) {
        return WrapperTool.loadField(mudClient.getValue(), simpleLogger, fieldDisplayName, fieldName, fieldType);
    }

    private <T> MethodWrapper<T> initMethod(String methodDisplayName, String methodName, Class<?>...mcMethodExpectedParamTypes) {
        return WrapperTool.loadMethod(mudClient.getValue(), simpleLogger, methodDisplayName, methodName, mcMethodExpectedParamTypes);
    }

    private <T> FieldWrapper<T> initInterceptor(String interceptorDisplayName, String fieldName) {
        return WrapperTool.loadField(mudClient.getValue(), simpleLogger, interceptorDisplayName, fieldName, null);
    }

    @SuppressWarnings("unchecked") // ArrayList is injected with javassist, therefore there's no generic type
    public void subscribeToInterception(InterceptionHandler interceptionHandler) {
        if (interceptionHandler instanceof MudClientSendLoginMethodInterceptor) {
            sendLoginMethodInterceptors.getValue().add(interceptionHandler);
        }

        if (interceptionHandler instanceof MudClientResetLoginScreenVariablesMethodInterceptor) {
            resetLoginScreenVariablesMethodInterceptors.getValue().add(interceptionHandler);
        }

        if (interceptionHandler instanceof MudClientInitGameScreenVariablesMethodInterceptor) {
            initGameScreenVariablesMethodInterceptors.getValue().add(interceptionHandler);
        }

        if (interceptionHandler instanceof MudClientShowGameMessageMethodInterceptor) {
            showGameMessageMethodInterceptors.getValue().add(interceptionHandler);
        }

        if (interceptionHandler instanceof MudClientHandleOpcodeInMethodInterceptor) {
            handleOpCodeInMethodInterceptors.getValue().add(interceptionHandler);
        }
    }
}
