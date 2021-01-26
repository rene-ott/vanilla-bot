package rscvanilla.instrumentation.transformations;

import javassist.*;
import rscvanilla.contracts.interceptors.MudClientInGameMessageInterceptor;
import rscvanilla.hook.model.Hooks;
import rscvanilla.hook.model.classes.mudclient.MudClientClassInterceptors;

import javax.inject.Inject;

public class AddGameMessageInterceptorTransformation {

    private final MudClientClassInterceptors interceptors;

    private final String fieldTypeName;
    private final String fieldName;
    private final String methodName;

    @Inject
    public AddGameMessageInterceptorTransformation(Hooks hooks) {
        this.interceptors = hooks.mudClient.interceptors;

        fieldTypeName = MudClientInGameMessageInterceptor.class.getCanonicalName();
        fieldName = MudClientInGameMessageInterceptor.MC_FIELD_NAME;
        methodName = MudClientInGameMessageInterceptor.METHOD_NAME;
    }

    public void implement(CtClass ctClass) throws NotFoundException, CannotCompileException {
        System.out.println("AddGameMessageInterceptorTransformation");

        var ctField = CtField.make(String.format("%s %s = null;", fieldTypeName, fieldName), ctClass);

        ctField.setModifiers(9);
        ctClass.addField(ctField);

        var ctMethod = ctClass.getDeclaredMethods(interceptors.gameMessage)[8];
        ctMethod.insertBefore("{" + fieldName + "."+ methodName + "($1, $2, $3, $4, $5, $6); }");
    }
}
