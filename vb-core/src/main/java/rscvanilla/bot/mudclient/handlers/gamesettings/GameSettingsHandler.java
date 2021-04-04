package rscvanilla.bot.mudclient.handlers.gamesettings;

import rscvanilla.bot.mudclient.wrappers.MudClientWrapper;
import rscvanilla.bot.mudclient.enums.OpCodeIn;
import rscvanilla.bot.mudclient.handlers.InterceptorHandler;
import rscvanilla.contracts.interceptors.MudClientHandleOpcodeInMethodInterceptor;

import javax.inject.Inject;

public class GameSettingsHandler implements InterceptorHandler, MudClientHandleOpcodeInMethodInterceptor {

    private final MudClientWrapper mudClientWrapper;

    @Inject
    public GameSettingsHandler(MudClientWrapper mudClientWrapper) {
        this.mudClientWrapper = mudClientWrapper;
    }

    @Override
    public void onBeforeHandleOpcodeIn(Object packetBase, int opCodeIn, int byteBufferLength) {
        // SET_STATS is sent right after SETTINGS_CHANGED
        if (opCodeIn != OpCodeIn.SET_STATS.id()) {
            return;
        }

        this.mudClientWrapper.isAdmin.setValue(true);
    }
}
