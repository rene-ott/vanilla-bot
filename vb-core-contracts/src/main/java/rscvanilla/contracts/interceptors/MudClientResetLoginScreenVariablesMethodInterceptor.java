package rscvanilla.contracts.interceptors;

public interface MudClientResetLoginScreenVariablesMethodInterceptor {
    String FIELD_NAME = "resetLoginScreenVariablesMethodInterceptors";
    String METHOD_BEFORE_NAME = "onBeforeResetLoginScreenVariables";
    String METHOD_AFTER_NAME = "onAfterResetLoginScreenVariables";

    default void onBeforeResetLoginScreenVariables() {};
    default void onAfterResetLoginScreenVariables() { };
}
