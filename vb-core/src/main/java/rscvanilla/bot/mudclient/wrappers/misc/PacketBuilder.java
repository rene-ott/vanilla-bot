package rscvanilla.bot.mudclient.wrappers.misc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rscvanilla.bot.infrastructure.BotException;
import rscvanilla.bot.infrastructure.logger.AppLoggerFactory;
import rscvanilla.bot.mudclient.enums.OpCodeOut;
import rscvanilla.bot.mudclient.wrappers.MudClientWrapper;
import rscvanilla.bot.mudclient.wrappers.MudClientWrapperObject;
import rscvanilla.bot.mudclient.wrappers.utils.MethodWrapper;
import rscvanilla.cjci.model.classes.packetbuilder.PacketBuilderClassMethods;
import rscvanilla.cjci.model.classes.packetbuilderbase.PacketBuilderBaseClassMethods;

// Sometimes when script & bot send packets they mess up packet sender array indices
// Current solution is to catch the exception and send wrong packet.
// This could be alleviated by adding synchronized keyword to packet sender methods
public class PacketBuilder extends MudClientWrapperObject<Object> {

    private static final Logger logger = LoggerFactory.getLogger(PacketBuilder.class);
    private static final Logger simpleLogger = AppLoggerFactory.getSimpleLogger();

    private MethodWrapper<MethodWrapper.Unit> setOpCode;
    private MethodWrapper<MethodWrapper.Unit> putString;
    private MethodWrapper<MethodWrapper.Unit> putShort;
    private MethodWrapper<MethodWrapper.Unit> putByte;
    private MethodWrapper<MethodWrapper.Unit> putInt;
    private MethodWrapper<MethodWrapper.Unit> send;

    public PacketBuilder(Object internalObject, MudClientWrapper mudClientWrapper) {
        super(internalObject, mudClientWrapper);

        initMethods();
    }

    private void initMethods() {
        try {
            logger.debug("Initializing [PacketBuilderWrapper] packetBuilder methods:");

            var classMethods = getPacketBuilderClassMethods();
            setOpCode = getMethod("setOpCode", classMethods.setOpCode, int.class);
            send = getMethod("send", classMethods.send);

            var baseClassMethods = getPacketBuilderBaseClassMethods();
            putString = getMethod("putString", baseClassMethods.putString, String.class);
            putShort = getMethod("putShort", baseClassMethods.putShort, int.class);
            putByte = getMethod("putByte", baseClassMethods.putByte, int.class);
            putInt = getMethod("putInt", baseClassMethods.putInt, int.class);

            simpleLogger.debug("");
        } catch (BotException e) {
            throw BotException.of("Failed to initialize [PacketBuilderWrapper] packet builder field!", e);
        }
    }

    public PacketBuilder setOpCode(OpCodeOut opCodeOut) {
        try {
            setOpCode.invokeAction(opCodeOut.id());
        } catch (BotException e) {
            throw e;
        } catch (Exception e) {
            logger.warn("MudClientPacketBuilder.setOpCode failed", e);
        }

        return this;
    }

    public PacketBuilder putString(String param) {
        try {
            putString.invokeAction(param);
        } catch (BotException e) {
            throw e;
        } catch (Exception e) {
            logger.warn("MudClientPacketBuilder.putString failed", e);
        }

        return this;
    }

    public PacketBuilder putShort(int param) {
        try {
            putShort.invokeAction(param);
        } catch (BotException e) {
            throw e;
        } catch (Exception e) {
            logger.warn("MudClientPacketBuilder.putShort failed", e);
        }
        return this;
    }

    public PacketBuilder putByte(int param) {
        try {
            putByte.invokeAction(param);
        } catch (BotException e) {
            throw e;
        } catch (Exception e) {
            logger.warn("MudClientPacketBuilder.putByte failed", e);
        }

        return this;
    }

    public PacketBuilder putInt(int param) {
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

    private PacketBuilderBaseClassMethods getPacketBuilderBaseClassMethods() {
        return getClientJarClassInfo().packetBuilderBase.methods;
    }

    private PacketBuilderClassMethods getPacketBuilderClassMethods() {
        return getClientJarClassInfo().packetBuilder.methods;
    }
}
