package rscvanilla.contracts.interceptors;

public interface MudClientGameSettingsInterceptor {
    String MC_FIELD_NAME = "gameSettingsInterceptor";
    String METHOD_NAME = "onGameSettingsInterception";

    boolean onGameSettingsInterception(Object type, int opCode);
}
