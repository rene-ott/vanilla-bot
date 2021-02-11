package rscvanilla.bot.mudclient;

import rscvanilla.bot.Main;
import rscvanilla.bot.mudclient.enums.OpCodeOut;
import rscvanilla.bot.infrastructure.annotations.DependsOnExternal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Sometimes when script & bot send packets they mess up packet sender array indices
// Current solution is to catch the exception and send wrong packet.
// Another solution would be to reset the state of packet sender array
public class MudClientPacketBuilder {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    private final MudClientWrapper mudClientWrapper;

    public MudClientPacketBuilder(MudClientWrapper mudClientWrapper) {
        this.mudClientWrapper = mudClientWrapper;
    }

    @DependsOnExternal(mightKeep = true, times = 1)
    public MudClientPacketBuilder setOpCode(OpCodeOut opCodeOut) {
        try {
            mudClientWrapper.getRawMudClient().n().aO(opCodeOut.id());
        } catch (Exception e) {
            logger.warn("MudClientPacketBuilder.setOpCode failed", e);
        }

        return this;
    }

    @DependsOnExternal(mightKeep = true, times = 1)
    public MudClientPacketBuilder putString(String param) {
        try {
            mudClientWrapper.getRawMudClient().n().q(param);
        } catch (Exception e) {
            logger.warn("MudClientPacketBuilder.putString failed", e);
        }

        return this;
    }

    @DependsOnExternal(mightKeep = true, times = 1)
    public MudClientPacketBuilder putShort(int param) {
        try {
            mudClientWrapper.getRawMudClient().n().aL(param);
        } catch (Exception e) {
            logger.warn("MudClientPacketBuilder.putShort failed", e);
        }
        return this;
    }

    @DependsOnExternal(mightKeep = true, times = 1)
    public MudClientPacketBuilder putByte(int param) {
        try {
            mudClientWrapper.getRawMudClient().n().aK(param);
        } catch (Exception e) {
            logger.warn("MudClientPacketBuilder.putByte failed", e);
        }

        return this;
    }

    @DependsOnExternal(mightKeep = true, times = 1)
    public MudClientPacketBuilder putInt(int param) {
        try {
            mudClientWrapper.getRawMudClient().n().aN(param);
        } catch (Exception e) {
            logger.warn("MudClientPacketBuilder.putInt failed", e);
        }

        return this;
    }


    @DependsOnExternal
    public void send() {
        try {
            mudClientWrapper.getRawMudClient().n().dX();

        } catch (Exception e) {
            logger.warn("MudClientPacketBuilder.sendFailed failed", e);
        }
    }
}
