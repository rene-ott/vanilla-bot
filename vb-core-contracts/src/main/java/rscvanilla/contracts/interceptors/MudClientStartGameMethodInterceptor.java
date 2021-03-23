package rscvanilla.contracts.interceptors;

public interface MudClientStartGameMethodInterceptor {
    String FIELD_NAME = "startGameMethodInterceptors";
    String METHOD_BEFORE_NAME = "onBeforeStartGame";
    String METHOD_AFTER_NAME = "onAfterStartGame";

    default void onBeforeStartGame() {}
    default void onAfterStartGame() {}
}
