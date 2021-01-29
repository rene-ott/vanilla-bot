package rscvanilla.contracts.interceptors;

public interface MudClientGameMessageInterceptor {
    String MC_FIELD_NAME = "gameMessageInterceptor";
    String METHOD_NAME = "onGameMessageInterception";

    void onGameMessageInterception(Object messageType, String sender, String colorPrefix, String message, String unknownParam1, int unknownParam2);
}
