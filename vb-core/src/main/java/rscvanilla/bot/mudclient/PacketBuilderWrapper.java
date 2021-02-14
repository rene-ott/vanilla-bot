package rscvanilla.bot.mudclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rscvanilla.bot.infrastructure.BotException;
import rscvanilla.bot.infrastructure.logger.AppLoggerFactory;
import rscvanilla.bot.mudclient.enums.OpCodeOut;

// Sometimes when script & bot send packets they mess up packet sender array indices
// Current solution is to catch the exception and send wrong packet.
// This could be alleviated by adding synchronized keyword to packet sender methods
public class PacketBuilderWrapper {

    private static final Logger logger = LoggerFactory.getLogger(MudClientWrapper.class);
    private static final Logger simpleLogger = AppLoggerFactory.getSimpleLogger();

    private final Object internalPacketBuilder;

    private MethodWrapper<MethodWrapper.Unit> setOpCode;
    private MethodWrapper<MethodWrapper.Unit> putString;
    private MethodWrapper<MethodWrapper.Unit> putShort;
    private MethodWrapper<MethodWrapper.Unit> putByte;
    private MethodWrapper<MethodWrapper.Unit> putInt;
    private MethodWrapper<MethodWrapper.Unit> send;

    public PacketBuilderWrapper(Object internalPacketBuilder) {
        this.internalPacketBuilder = internalPacketBuilder;
        initMethods();
    }

    private void initMethods() {
        try {
            logger.debug("Initializing [PacketBuilderWrapper] packetBuilder methods:");

            setOpCode = initMethod("setOpCode", "aO", int.class);
            putString = initMethod("putString", "q", String.class);
            putShort = initMethod("putShort", "aL", int.class);
            putByte = initMethod("putByte", "aK", int.class);
            putInt = initMethod("putInt", "aN", int.class);
            send = initMethod("send", "dX");

            simpleLogger.debug("");
        } catch (BotException e) {
            throw BotException.of("Failed to initialize [PacketBuilderWrapper] packet builder field!", e);
        }
    }

    public PacketBuilderWrapper setOpCode(OpCodeOut opCodeOut) {
        try {
            setOpCode.invokeAction(opCodeOut.id());
        } catch (BotException e) {
            throw e;
        } catch (Exception e) {
            logger.warn("MudClientPacketBuilder.setOpCode failed", e);
        }

        return this;
    }

    public PacketBuilderWrapper putString(String param) {
        try {
            putString.invokeAction(param);
        } catch (BotException e) {
            throw e;
        } catch (Exception e) {
            logger.warn("MudClientPacketBuilder.putString failed", e);
        }

        return this;
    }

    public PacketBuilderWrapper putShort(int param) {
        try {
            putShort.invokeAction(param);
        } catch (BotException e) {
            throw e;
        } catch (Exception e) {
            logger.warn("MudClientPacketBuilder.putShort failed", e);
        }
        return this;
    }

    public PacketBuilderWrapper putByte(int param) {
        try {
            putByte.invokeAction(param);
        } catch (BotException e) {
            throw e;
        } catch (Exception e) {
            logger.warn("MudClientPacketBuilder.putByte failed", e);
        }

        return this;
    }

    public PacketBuilderWrapper putInt(int param) {
        try {
            putInt.invokeAction(param);
        } catch (BotException e) {
            throw e;
        } catch (Exception e) {
            logger.warn("MudClientPacketBuilder.putInt failed", e);
        }

        return this;
    }

    public void send() {
        try {
            send.invokeAction();
        } catch (BotException e) {
            throw e;
        } catch (Exception e) {
            logger.warn("MudClientPacketBuilder.sendFailed failed", e);
        }
    }

    private <T> MethodWrapper<T> initMethod(String displayMethodName, String methodName, Class<?>...methodParamTypes) {
        return WrapperTool.loadMethod(internalPacketBuilder, simpleLogger, displayMethodName, methodName, methodParamTypes);
    }
}
