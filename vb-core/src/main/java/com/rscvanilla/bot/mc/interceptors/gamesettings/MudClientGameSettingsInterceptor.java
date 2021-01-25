package com.rscvanilla.bot.mc.interceptors.gamesettings;

public interface MudClientGameSettingsInterceptor {
    String MC_FIELD_NAME = "gameSettingsInterceptor";
    String METHOD_NAME = "onGameSettingsInterception";

    boolean onGameSettingsInterception(Object type, int opCode);
}
