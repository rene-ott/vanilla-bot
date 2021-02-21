package rscvanilla.contracts.interceptors;

public interface MudClientHandleOpcodeInMethodInterceptor {
    String FIELD_NAME = "handleOpCodeInMethodInterceptors";
    String METHOD_BEFORE_NAME = "onBeforeHandleOpcodeIn";
    String METHOD_AFTER_NAME = "onAfterHandleOpcodeIn";

    default void onBeforeHandleOpcodeIn(Object packetBase, int opCodeIn, int byteBufferLength) {}
    default void onAfterHandleOpcodeIn(Object packetBase, int opCodeIn, int byteBufferLength) {}
}
