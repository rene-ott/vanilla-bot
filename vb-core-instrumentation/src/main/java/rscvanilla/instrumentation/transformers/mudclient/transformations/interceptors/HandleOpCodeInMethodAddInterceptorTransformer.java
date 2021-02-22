package rscvanilla.instrumentation.transformers.mudclient.transformations.interceptors;

import javassist.CtClass;
import javassist.CtMethod;
import javassist.NotFoundException;
import rscvanilla.cjci.model.ClientJarClassInfo;
import rscvanilla.contracts.interceptors.MudClientHandleOpcodeInMethodInterceptor;

import javax.inject.Inject;

public class HandleOpCodeInMethodAddInterceptorTransformer extends BaseMethodAddInterceptorTransformation {

    @Inject
    public HandleOpCodeInMethodAddInterceptorTransformer(ClientJarClassInfo clientJarClassInfo) {
        super(
            MudClientHandleOpcodeInMethodInterceptor.FIELD_NAME,
            MudClientHandleOpcodeInMethodInterceptor.METHOD_BEFORE_NAME,
            MudClientHandleOpcodeInMethodInterceptor.METHOD_AFTER_NAME,
            MudClientHandleOpcodeInMethodInterceptor.class,
            clientJarClassInfo);
    }

    @Override
    protected CtMethod interceptedMethod(CtClass ctClass) throws NotFoundException {
        return getMethodByIndex(ctClass, clientJarClassInfo.mudClient.methods.handleOpCodeIn, 1);
    }

    @Override
    protected String insertBeforeMethod(CtClass ctClass) {
        var code = new StringBuilder();

        code.append("{");
        code.append(wrapIntoWhileLoop(String.format("%s($1, $2, $3)", beforeMethodName)));
        code.append("}");

        return code.toString();
    }

    @Override
    protected String insertAfterMethod(CtClass ctClass) {
        return null;
    }
}
