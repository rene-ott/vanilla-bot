package rscvanilla.instrumentation.transformers.mudclient.transformations.interceptors;

import javassist.CannotCompileException;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.NotFoundException;
import rscvanilla.cjci.model.ClientJarClassInfo;
import rscvanilla.contracts.interceptors.MudClientShowGameMessageMethodInterceptor;

import javax.inject.Inject;

public class ShowGameMessageMethodAddInterceptorTransformer extends BaseMethodAddInterceptorTransformation {

    @Inject
    public ShowGameMessageMethodAddInterceptorTransformer(ClientJarClassInfo clientJarClassInfo) {
        super(
            MudClientShowGameMessageMethodInterceptor.FIELD_NAME,
            MudClientShowGameMessageMethodInterceptor.METHOD_BEFORE_NAME,
            MudClientShowGameMessageMethodInterceptor.METHOD_AFTER_NAME,
            MudClientShowGameMessageMethodInterceptor.class,
            clientJarClassInfo);
    }

    @Override
    protected CtMethod interceptedMethod(CtClass ctClass) throws NotFoundException {
        return getMethodByIndex(ctClass, clientJarClassInfo.mudClient.methods.interceptedShowGameMessage, 8);
    }

    @Override
    protected String insertBeforeMethod(CtClass ctClass) {
        var code = new StringBuilder();

        code.append("{");
        code.append(wrapIntoWhileLoop(String.format("%s($1, $2, $3, $4, $5, $6)", beforeMethodName)));
        code.append("}");

        return code.toString();
    }

    @Override
    protected String insertAfterMethod(CtClass ctClass) {
        return null;
    }
}
