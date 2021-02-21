package rscvanilla.contracts.interceptors;

public interface MudClientShowGameMessageMethodInterceptor {
    String FIELD_NAME = "showGameMessageMethodInterceptors";
    String METHOD_BEFORE_NAME = "onBeforeShowGameMessage";
    String METHOD_AFTER_NAME = "onAfterShowGameMessage";

    default void onBeforeShowGameMessage(Object messageType, String sender, String colorPrefix, String message, String unknownParam1, int unknownParam2) {}
    default void onAfterShowGameMessage(Object messageType, String sender, String colorPrefix, String message, String unknownParam1, int unknownParam2) {}
}
