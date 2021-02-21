package rscvanilla.contracts.interceptors;

public interface MudClientSendLoginMethodInterceptor {
    String FIELD_NAME = "sendLoginMethodInterceptors";
    String METHOD_BEFORE_NAME = "onBeforeSendLogin";
    String METHOD_AFTER_NAME = "onAfterSendLogin";

    default void onBeforeSendLogin(boolean isReconnect) {}
    default void onAfterSendLogin(boolean isReconnect) {}
}
