package rscvanilla.contracts.interceptors;

public interface MudClientInitGameScreenVariablesMethodInterceptor {
    String FIELD_NAME = "initGameScreenVariablesMethodInterceptors";
    String METHOD_BEFORE_NAME = "onBeforeInitGameScreenVariables";
    String METHOD_AFTER_NAME = "onAfterInitGameScreenVariables";

    default void onBeforeInitGameScreenVariables() { }
    default void onAfterInitGameScreenVariables() { }
}
