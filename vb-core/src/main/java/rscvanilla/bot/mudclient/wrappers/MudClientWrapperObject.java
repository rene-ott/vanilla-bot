package rscvanilla.bot.mudclient.wrappers;

import rscvanilla.bot.mudclient.wrappers.utils.MethodWrapper;
import rscvanilla.bot.mudclient.wrappers.utils.WrapperTool;
import rscvanilla.cjci.model.ClientJarClassInfo;

public abstract class MudClientWrapperObject<T> {

    protected T internalObject;
    protected MudClientWrapper mudClientWrapper;

    public MudClientWrapperObject(T internalObject, MudClientWrapper mudClientWrapper) {
        this.internalObject = internalObject;
        this.mudClientWrapper = mudClientWrapper;
    }

    @Deprecated
    public T getInternalObject() { return internalObject; }

    protected <TField> TField getFieldValue(String fieldDisplayName, String fieldName, Class<?> fieldReturnType) {
        return WrapperTool.<TField>loadField(internalObject, null, fieldDisplayName, fieldName, fieldReturnType).getValue();
    }

    protected <TField> MethodWrapper<TField> getMethod(String methodDisplayName, String methodName, Class<?>...methodParamTypes) {
        return WrapperTool.loadMethod(internalObject, null, methodDisplayName, methodName, methodParamTypes);
    }

    protected ClientJarClassInfo getClientJarClassInfo() {
        return mudClientWrapper.getClientJarClassInfo();
    }
}
