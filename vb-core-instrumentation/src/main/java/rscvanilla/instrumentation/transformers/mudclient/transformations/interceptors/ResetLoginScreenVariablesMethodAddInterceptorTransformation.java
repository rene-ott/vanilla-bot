package rscvanilla.instrumentation.transformers.mudclient.transformations.interceptors;

import javassist.CtClass;
import javassist.CtMethod;
import javassist.NotFoundException;
import rscvanilla.cjci.model.ClientJarClassInfo;
import rscvanilla.contracts.interceptors.MudClientResetLoginScreenVariablesMethodInterceptor;

import javax.inject.Inject;

public class ResetLoginScreenVariablesMethodAddInterceptorTransformation extends BaseMethodAddInterceptorTransformation {

    @Inject
    public ResetLoginScreenVariablesMethodAddInterceptorTransformation(ClientJarClassInfo clientJarClassInfo) {
        super(
            MudClientResetLoginScreenVariablesMethodInterceptor.FIELD_NAME,
            MudClientResetLoginScreenVariablesMethodInterceptor.METHOD_BEFORE_NAME,
            MudClientResetLoginScreenVariablesMethodInterceptor.METHOD_AFTER_NAME,
            MudClientResetLoginScreenVariablesMethodInterceptor.class,
            clientJarClassInfo);
    }

    @Override
    protected CtMethod interceptedMethod(CtClass ctClass) throws NotFoundException {
        return getMethodByParams(ctClass, clientJarClassInfo.mudClient.methods.resetLoginScreenVariables);
    }

    @Override
    protected String insertBeforeMethod(CtClass ctClass) {
        var code = new StringBuilder();

        code.append("{");
        code.append(wrapIntoWhileLoop(String.format("%s()", beforeMethodName)));
        code.append("}");

        return code.toString();
    }

    @Override
    protected String insertAfterMethod(CtClass ctClass) {
        var code = new StringBuilder();

        code.append("{");
        code.append(wrapIntoWhileLoop(String.format("%s()", afterMethodName)));
        code.append("}");

        return code.toString();
    }
}
