package rscvanilla.bot.mudclient.wrappers;

import com.google.common.base.Strings;
import rscvanilla.bot.GameApplet;
import rscvanilla.bot.infrastructure.utils.EnumUtil;
import rscvanilla.bot.mudclient.wrappers.utils.FieldWrapper;
import rscvanilla.bot.mudclient.wrappers.utils.MethodWrapper;
import rscvanilla.bot.mudclient.wrappers.utils.WrapperTool;
import rscvanilla.bot.mudclient.handlers.InterceptorHandler;
import rscvanilla.bot.mudclient.handlers.captcha.CaptchaHandler;
import rscvanilla.bot.mudclient.handlers.gamemessage.GameMessageHandler;
import rscvanilla.bot.mudclient.handlers.gamemodel.GameModelHandler;
import rscvanilla.bot.mudclient.handlers.gamesettings.GameSettingsHandler;
import rscvanilla.bot.mudclient.handlers.userlogaction.UserLoginActionHandler;
import rscvanilla.bot.mudclient.models.BankItem;
import rscvanilla.bot.mudclient.models.Position;
import rscvanilla.bot.infrastructure.BotException;
import rscvanilla.bot.infrastructure.logger.AppLoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rscvanilla.bot.mudclient.wrappers.entities.*;
import rscvanilla.bot.mudclient.wrappers.interfaces.ShopInterface;
import rscvanilla.bot.mudclient.wrappers.misc.PacketBuilder;
import rscvanilla.bot.mudclient.wrappers.misc.Panel;
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
    public FieldWrapper<int[]> inventoryItemSlotsCounts;

    private FieldWrapper<int[]> bankItemIdList;
    private FieldWrapper<int[]> bankItemCountList;

    private FieldWrapper<String[]> optionsMenuText;
    private FieldWrapper<Integer> optionsMenuCount;

    public FieldWrapper<Integer> combatStyle;
    public FieldWrapper<Integer> userTileX;
    public FieldWrapper<Integer> userTileY;
    public FieldWrapper<Integer> midRegionBaseX;
    public FieldWrapper<Integer> midRegionBaseZ;
    public FieldWrapper<Integer> fatigueSleeping;
    public FieldWrapper<Integer> userFatigueStat;
    public FieldWrapper<Boolean> isSleeping;
    public FieldWrapper<String> loginUsername;
    private FieldWrapper<com.rsc.f> gameMode;
    public FieldWrapper<Integer> autoLoginTimeOut;
    public FieldWrapper<Boolean> isOptionsMenuVisible;
    public FieldWrapper<Boolean> isBankVisible;

    public FieldWrapper<Object> shopInterface;

    public FieldWrapper<String> loginPassword;
    public FieldWrapper<Boolean> isAdmin;

    private MethodWrapper<MethodWrapper.Unit> walkToArea;
    private MethodWrapper<Boolean> sendWalkToGroundItem;
    private MethodWrapper<MethodWrapper.Unit> sendChatMessage;
    private MethodWrapper<MethodWrapper.Unit> walkToObject;
    private MethodWrapper<MethodWrapper.Unit> login;
    private MethodWrapper<MethodWrapper.Unit> logout;
    private MethodWrapper<MethodWrapper.Unit> walkToWall;

    // ArrayLists are created on bytecode level with javassist, therefore there's no type argument
    @SuppressWarnings("rawtypes") public FieldWrapper<ArrayList> resetLoginScreenVariablesMethodInterceptors;
    @SuppressWarnings("rawtypes") public FieldWrapper<ArrayList> sendLoginMethodInterceptors;
    @SuppressWarnings("rawtypes") public FieldWrapper<ArrayList> initGameScreenVariablesMethodInterceptors;
    @SuppressWarnings("rawtypes") public FieldWrapper<ArrayList> showGameMessageMethodInterceptors;
    @SuppressWarnings("rawtypes") public FieldWrapper<ArrayList> handleOpCodeInMethodInterceptors;
    @SuppressWarnings("rawtypes") public FieldWrapper<ArrayList> startGameMethodInterceptors;

    private final PacketBuilder packetBuilderWrapper;

    public FieldWrapper<com.rsc.e.m[]> wallObjectList;
    public FieldWrapper<Integer> wallObjectListIndex;

    public FieldWrapper<com.rsc.e.k> localPlayer;

    // Type argument is Object because java can't handle when in the package there's same named subpackage and class
    private FieldWrapper<Object> packetBuilder;

    private FieldWrapper<Integer> loginPanelUserPasswordControlId;
    private FieldWrapper<Integer> loginPanelUserUsernameControlId;

    // Type argument is Object because java can't handle when in the package there's same named subpackage and class
    private FieldWrapper<Object> loginPanel;

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

        packetBuilderWrapper = new PacketBuilder(packetBuilder.getValue(), this);
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
            startGameMethodInterceptors = initInterceptor("startGameMethodInterceptors", MudClientStartGameMethodInterceptor.FIELD_NAME);

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
            midRegionBaseX = initField("midRegionBaseX", classFields.mid_region_base_x, Integer.class);
            midRegionBaseZ = initField("midRegionBaseZ", classFields.mid_region_base_y, Integer.class);
            fatigueSleeping = initField("fatigueSleeping", classFields.fatigueSleeping, Integer.class);
            userFatigueStat = initField("userFatigueStat", classFields.fatigueStat, Integer.class);
            isSleeping = initField("isSleeping", classFields.isSleeping, Boolean.class);

            groundItemListIndex = initField("groundItemListIndex", classFields.groundItemListIndex, Integer.class);
            inventoryItemList = initField("inventoryItemList", classFields.inventoryItemList, int[].class);
            inventoryItemListIndex = initField("inventoryItemListIndex", classFields.inventoryItemListIndex, Integer.class);
            inventoryItemSlotsCounts = initField("inventoryItemSlotsCounts", classFields.inventoryItemSlotsCounts, int[].class);
            npcListIndex = initField("npcListIndex", classFields.npcListIndex, Integer.class);
            objectList = initField("objectList", classFields.groundObjectList, com.rsc.e.e[].class);
            objectListIndex = initField("objectListIndex", classFields.groundObjectListIndex, Integer.class);
            playerList = initField("playerList", classFields.playerList, com.rsc.e.k[].class);
            playerListIndex = initField("playerListIndex", classFields.playerListIndex, Integer.class);
            loginUsername = initField("loginUsername", classFields.loginUsername, String.class);
            loginPassword = initField("loginPassword", classFields.loginPassword, String.class);
            gameMode = initField("gameMode", classFields.gameMode, com.rsc.f.class);
            autoLoginTimeOut = initField("autoLoginTimeOut", classFields.autoLoginTimeout, Integer.class);
            isOptionsMenuVisible = initField("isOptionsMenuVisible", classFields.isOptionsMenuVisible, Boolean.class);
            optionsMenuCount = initField("optionsCount", classFields.optionsCount, Integer.class);
            isBankVisible = initField("isBankVisible", classFields.isBankVisible, Boolean.class);
            wallObjectList = initField("wallObjectList", classFields.wallObjectList, com.rsc.e.m[].class);
            wallObjectListIndex = initField("wallObjectListIndex", classFields.wallObjectListIndex, Integer.class);
            localPlayer = initField("localPlayer", classFields.localPlayer, com.rsc.e.k.class);

            bankItemIdList = initField("bankItemIdList", classFields.bankItemIdList, int[].class);
            bankItemCountList = initField("bankItemCountList", classFields.bankItemCountList, int[].class);

            optionsMenuText = initField("optionsMenuText", classFields.optionsMenuText, String[].class);
            isAdmin = initField("isAdmin", classFields.isAdmin, Boolean.class);

            loginPanelUserPasswordControlId = initField("loginPanelUserPasswordControlId", classFields.loginPanelUserPasswordControlId, Integer.class);
            loginPanelUserUsernameControlId = initField("loginPanelUserUsernameControlId", classFields.loginPanelUserUsernameControlId, Integer.class);
            loginPanel = initField("loginPanel", classFields.loginPanel, Object.class);

            shopInterface = initField("shopInterface", "oN", Object.class);

            packetBuilder = initField("packetBuilder", baseClassFields.packetBuilder, Object.class);

            simpleLogger.debug("");
        } catch (BotException e) {
            throw BotException.of("Failed to initialize [MudClientWrapper] fields!", e);
        }
    }

    public void setUserCredentials(String username, String password) {
        getLoginPanelWrapper().setText(loginPanelUserUsernameControlId.getValue(), username);
        getLoginPanelWrapper().setText(loginPanelUserPasswordControlId.getValue(), password);

        loginUsername.setValue(username);
        loginPassword.setValue(password);
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
    @SuppressWarnings("unused") // Injected by DI
    public void setLoginCredentialGUIHandler(UserLoginActionHandler interceptionHandler) { setInterceptorHandler(interceptionHandler); }

    @Inject
    @SuppressWarnings("unused") // Injected by DI
    public void setCaptchaHandler(CaptchaHandler interceptionHandler) { setInterceptorHandler(interceptionHandler); }

    @Inject
    @SuppressWarnings("unused") // Injected by DI
    public void setGameSettingsHandler(GameSettingsHandler interceptionHandler) { setInterceptorHandler(interceptionHandler); }

    @Inject
    @SuppressWarnings("unused") // Injected by DI
    public void setGameMessageHandler(GameMessageHandler interceptionHandler) { setInterceptorHandler(interceptionHandler); }

    @Inject
    @SuppressWarnings("unused") // Injected by DI
    public void setGameModelHandler(GameModelHandler interceptionHandler) { setInterceptorHandler(interceptionHandler); }

    public PacketBuilder getPacketBuilder() { return packetBuilderWrapper; }
    public ClientJarClassInfo getClientJarClassInfo() { return clientJarClassInfo; }
    private Panel getLoginPanelWrapper() { return new Panel(loginPanel.getValue(), this); }

    // Accessing to MudClient members should be done through this wrapper class.
    @Deprecated()
    public com.rsc.d getRawMudClient() { return mudClient.getValue(); }

    public List<NonPlayerCharacter> getNpcList() { return newWrappedEntityList(this.npcList, this.npcListIndex, NonPlayerCharacter.class); }
    public List<GroundItem> getGroundItemList() { return newWrappedEntityList(this.groundItemList, this.groundItemListIndex, GroundItem.class); }
    public List<GroundObject> getObjectList() { return newWrappedEntityList(this.objectList, this.objectListIndex, GroundObject.class); }
    public List<PlayerCharacter> getPlayerList() { return newWrappedEntityList(this.playerList, this.playerListIndex, PlayerCharacter.class); }
    public List<WallObject> getWallObjectList() { return newWrappedEntityList(this.wallObjectList, this.wallObjectListIndex, WallObject.class); }

    public ShopInterface getShopInterface() { return new ShopInterface(shopInterface.getValue(), this); }

    public List<String> getOptionsMenuList() { return isOptionsMenuVisible.getValue()
        ? Arrays.stream(optionsMenuText.getValue(), 0, optionsMenuCount.getValue()).collect(Collectors.toList())
        : List.of(); }

    public List<BankItem> getBankItemList() { return isBankVisible.getValue()
        ? IntStream.range(0, (int) Arrays.stream(bankItemCountList.getValue()).filter(it -> it != 0).count())
                    .mapToObj(it -> new BankItem(bankItemIdList.getValue()[it], bankItemCountList.getValue()[it]))
                    .collect(Collectors.toList())
        : List.of(); }


    public LocalPlayerCharacter getLocalPlayer() { return new LocalPlayerCharacter(localPlayer.getValue(), this); }
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
        return Strings.isNullOrEmpty(loginUsername.getValue()) || Strings.isNullOrEmpty(loginPassword.getValue());
    }

    private <TWrappedEntity extends GameEntity<TInternalObject>, TInternalObject extends com.rsc.e.d> List<TWrappedEntity> newWrappedEntityList(
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

    // ArrayLists are created on bytecode level with javassist, therefore there's no type argument
    public void setInterceptorHandler(InterceptorHandler interceptorHandler) {
        addInterceptorHandler(interceptorHandler, sendLoginMethodInterceptors, MudClientSendLoginMethodInterceptor.class);
        addInterceptorHandler(interceptorHandler, resetLoginScreenVariablesMethodInterceptors, MudClientResetLoginScreenVariablesMethodInterceptor.class);
        addInterceptorHandler(interceptorHandler, initGameScreenVariablesMethodInterceptors, MudClientInitGameScreenVariablesMethodInterceptor.class);
        addInterceptorHandler(interceptorHandler, showGameMessageMethodInterceptors, MudClientShowGameMessageMethodInterceptor.class);
        addInterceptorHandler(interceptorHandler, handleOpCodeInMethodInterceptors, MudClientHandleOpcodeInMethodInterceptor.class);
        addInterceptorHandler(interceptorHandler, startGameMethodInterceptors, MudClientStartGameMethodInterceptor.class);
    }

    @SuppressWarnings("unchecked")
    public void addInterceptorHandler(InterceptorHandler interceptorHandler,
                                      @SuppressWarnings("rawtypes") FieldWrapper<ArrayList> interceptors,
                                      Class<?> clazz) {
        if (clazz.isInstance(interceptorHandler)) {
            interceptors.getValue().add(interceptorHandler);
        }
    }
}
