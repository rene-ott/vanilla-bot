package rscvanilla.instrumentation.transformers.mudclient.transformations.interceptors;

import javassist.CtClass;
import javassist.CtMethod;
import javassist.NotFoundException;
import rscvanilla.cjci.model.ClientJarClassInfo;
import rscvanilla.contracts.interceptors.MudClientSendLoginMethodInterceptor;

import javax.inject.Inject;

public class SendLoginMethodAddInterceptorTransformation extends BaseMethodAddInterceptorTransformation {

    @Inject
    public SendLoginMethodAddInterceptorTransformation(ClientJarClassInfo clientJarClassInfo) {
        super(
            MudClientSendLoginMethodInterceptor.FIELD_NAME,
            MudClientSendLoginMethodInterceptor.METHOD_BEFORE_NAME,
            MudClientSendLoginMethodInterceptor.METHOD_AFTER_NAME,
            MudClientSendLoginMethodInterceptor.class,
            clientJarClassInfo);
    }

    @Override
    protected CtMethod interceptedMethod(CtClass ctClass) throws NotFoundException {
        return getMethodByParams(ctClass, "f", CtClass.booleanType);
    }

    @Override
    protected String insertBeforeMethod(CtClass ctClass) {
        var code = new StringBuilder();

        code.append("{");
        code.append(wrapIntoWhileLoop(String.format("%s($1)", beforeMethodName)));
        code.append("}");

        return code.toString();
    }

    @Override
    protected String insertAfterMethod(CtClass ctClass) { return null;}
}
