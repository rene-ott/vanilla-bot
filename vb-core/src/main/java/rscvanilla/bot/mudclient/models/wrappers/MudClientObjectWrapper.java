package rscvanilla.bot.mudclient.models.wrappers;

import rscvanilla.bot.mudclient.MethodWrapper;
import rscvanilla.bot.mudclient.MudClientWrapper;
import rscvanilla.bot.mudclient.WrapperTool;

public abstract class MudClientObjectWrapper<T> {

    protected T internalObject;
    protected MudClientWrapper mudClientWrapper;

    public MudClientObjectWrapper(T internalObject, MudClientWrapper mudClientWrapper) {
        this.internalObject = internalObject;
        this.mudClientWrapper = mudClientWrapper;
    }

    @Deprecated
    public T getInternalObject() {
        return internalObject;
    }

    protected <TField> TField getFieldValue(String fieldDisplayName, String fieldName, Class<?> fieldReturnType) {
        return WrapperTool.<TField>loadField(internalObject, null, fieldDisplayName, fieldName, fieldReturnType).getValue();
    }

    protected <TField> MethodWrapper<TField> getMethod(String methodDisplayName, String methodName, Class<?>...methodParamTypes) {
        return WrapperTool.loadMethod(internalObject, null, methodDisplayName, methodName, methodParamTypes);
    }
}
