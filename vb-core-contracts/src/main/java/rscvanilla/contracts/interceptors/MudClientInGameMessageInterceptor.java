package rscvanilla.contracts.interceptors;

public interface MudClientInGameMessageInterceptor {
    String MC_FIELD_NAME = "inGameMessageInterceptor";
    String METHOD_NAME = "onInGameMessageInterception";

    void onInGameMessageInterception(Object messageType, String sender, String colorPrefix, String message, String unknownParam1, int unknownParam2);
}
