package rscvanilla.bot.mudclient.interceptors.gamesettings;

import rscvanilla.bot.mudclient.MudClientWrapper;
import rscvanilla.bot.mudclient.enums.OpCodeIn;
import rscvanilla.contracts.interceptors.MudClientGameSettingsInterceptor;

import javax.inject.Inject;

//TODO Separate settings class & move fields to mudclient
public class GameSettingsHandler implements MudClientGameSettingsInterceptor {

    private final MudClientWrapper mudClientWrapper;

    @Inject
    public GameSettingsHandler(MudClientWrapper mudClientWrapper) {
        this.mudClientWrapper = mudClientWrapper;
    }

    @Override
    public boolean onGameSettingsInterception(Object type, int opCode) {
        if (opCode == OpCodeIn.SETTINGS_CHANGED.id()) {
            var mudClient = this.mudClientWrapper.getRawMudClient();

            mudClient.rI = false; //Camera Aut

            mudClient.oq = true; // Admin
            mudClient.oO = true; // Mod

            com.rsc.c.ac = true; // Show username above head
            com.rsc.c.ag = false; // Fog of war

            com.rsc.c.ah = false; // show roof on building;
            com.rsc.c.ai = true; // show sidebar menu;
            return true;
        }
        return false;
    }
}