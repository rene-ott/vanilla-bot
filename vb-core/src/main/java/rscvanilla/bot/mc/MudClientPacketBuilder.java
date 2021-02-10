package rscvanilla.bot.mc;

import rscvanilla.bot.Main;
import rscvanilla.bot.api.enums.OpCodeOut;
import rscvanilla.bot.infrastructure.annotations.DependsOnExternal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Sometimes when script & bot send packets they mess up packet sender array indices
// Current solution is to catch the exception and send wrong packet.
// Another solution would be to reset the state of packet sender array
public class MudClientPacketBuilder {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    private final com.rsc.d mudClient;

    public MudClientPacketBuilder(com.rsc.d mudClient) {
        this.mudClient = mudClient;
    }

    @DependsOnExternal(mightKeep = true, times = 1)
    public MudClientPacketBuilder setOpCode(OpCodeOut opCodeOut) {
        try {
            mudClient.n().aO(opCodeOut.id());
        } catch (Exception e) {
            logger.warn("MudClientPacketBuilder.setOpCode failed", e);
        }

        return this;
    }

    @DependsOnExternal(mightKeep = true, times = 1)
    public MudClientPacketBuilder putString(String param) {
        try {
            mudClient.n().q(param);
        } catch (Exception e) {
            logger.warn("MudClientPacketBuilder.putString failed", e);
        }

        return this;
    }

    @DependsOnExternal(mightKeep = true, times = 1)
    public MudClientPacketBuilder putShort(int param) {
        try {
            mudClient.n().aL(param);
        } catch (Exception e) {
            logger.warn("MudClientPacketBuilder.putShort failed", e);
        }
        return this;
    }

    @DependsOnExternal(mightKeep = true, times = 1)
    public MudClientPacketBuilder putByte(int param) {
        try {
            mudClient.n().aK(param);
        } catch (Exception e) {
            logger.warn("MudClientPacketBuilder.putByte failed", e);
        }

        return this;
    }

    @DependsOnExternal(mightKeep = true, times = 1)
    public MudClientPacketBuilder putInt(int param) {
        try {
            mudClient.n().aN(param);
        } catch (Exception e) {
            logger.warn("MudClientPacketBuilder.putInt failed", e);
        }

        return this;
    }


    @DependsOnExternal
    public void send() {
        try {
            mudClient.n().dX();

        } catch (Exception e) {
            logger.warn("MudClientPacketBuilder.sendFailed failed", e);
        }
    }
}
