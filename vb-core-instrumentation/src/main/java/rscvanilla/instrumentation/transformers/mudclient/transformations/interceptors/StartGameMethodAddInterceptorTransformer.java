package rscvanilla.instrumentation.transformers.mudclient.transformations.interceptors;

import javassist.CtClass;
import javassist.CtMethod;
import javassist.NotFoundException;
import rscvanilla.cjci.model.ClientJarClassInfo;
import rscvanilla.contracts.interceptors.MudClientStartGameMethodInterceptor;

import javax.inject.Inject;

public class StartGameMethodAddInterceptorTransformer extends BaseMethodAddInterceptorTransformation {

    @Inject
    public StartGameMethodAddInterceptorTransformer(ClientJarClassInfo clientJarClassInfo
    ) {
        super(MudClientStartGameMethodInterceptor.FIELD_NAME,
              MudClientStartGameMethodInterceptor.METHOD_BEFORE_NAME,
              MudClientStartGameMethodInterceptor.METHOD_AFTER_NAME,
              MudClientStartGameMethodInterceptor.class,
                clientJarClassInfo);
    }

    @Override
    protected CtMethod interceptedMethod(CtClass ctClass) throws NotFoundException {
        return getMethodByParams(ctClass, clientJarClassInfo.mudClient.methods.startGame);
    }

    @Override
    protected String insertBeforeMethod(CtClass ctClass) {
        return null;
    }

    @Override
    protected String insertAfterMethod(CtClass ctClass) {
        var code = new StringBuilder();

        code.append("{");
        code.append(wrapIntoWhileLoop(String.format("%s()", afterMethodName)));
        code.append("}");

        return code.toString();    }
}
