package rscvanilla.bot.mc.interceptors.gamesettings;

import rscvanilla.bot.infrastructure.annotations.DependsOnExternal;
import rscvanilla.bot.mc.MudClientHooker;
import rscvanilla.contracts.interceptors.MudClientGameSettingsInterceptor;

import javax.inject.Inject;

//TODO Separate settings class & move fields to mudclient
public class GameSettingsHandler implements MudClientGameSettingsInterceptor {

    private MudClientHooker hooker;

    @Inject
    public GameSettingsHandler(MudClientHooker hooker) {
        this.hooker = hooker;
    }

    @Override
    @DependsOnExternal
    public boolean onGameSettingsInterception(Object type, int opCode) {
        if (opCode == 240) {
            var mudClient = this.hooker.getRawMudClient();

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