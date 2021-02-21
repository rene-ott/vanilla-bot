package rscvanilla.instrumentation.transformers.mudclient.transformations.interceptors;

import javassist.CtClass;
import javassist.CtMethod;
import javassist.NotFoundException;
import rscvanilla.cjci.model.ClientJarClassInfo;
import rscvanilla.contracts.interceptors.MudClientInitGameScreenVariablesMethodInterceptor;

import javax.inject.Inject;

public class InitGameScreenVariablesMethodAddInterceptorTransformation extends BaseMethodAddInterceptorTransformation {

    @Inject
    public InitGameScreenVariablesMethodAddInterceptorTransformation(ClientJarClassInfo clientJarClassInfo) {
        super(
            MudClientInitGameScreenVariablesMethodInterceptor.FIELD_NAME,
            MudClientInitGameScreenVariablesMethodInterceptor.METHOD_BEFORE_NAME,
            MudClientInitGameScreenVariablesMethodInterceptor.METHOD_AFTER_NAME,
            MudClientInitGameScreenVariablesMethodInterceptor.class,
            clientJarClassInfo);
    }

    @Override
    protected CtMethod interceptedMethod(CtClass ctClass) throws NotFoundException {
        return getMethodByParams(ctClass, "dx");
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
    protected String insertAfterMethod(CtClass ctClass) { return null; }
}
