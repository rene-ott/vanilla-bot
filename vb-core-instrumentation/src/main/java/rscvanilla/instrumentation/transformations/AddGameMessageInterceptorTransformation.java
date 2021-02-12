package rscvanilla.instrumentation.transformations;

import javassist.*;
import rscvanilla.contracts.interceptors.MudClientGameMessageInterceptor;
import rscvanilla.cjci.model.ClientJarClassInfo;
import rscvanilla.cjci.model.classes.mudclient.MudClientClassInterceptors;

import javax.inject.Inject;

public class AddGameMessageInterceptorTransformation {

    private final MudClientClassInterceptors interceptors;

    private final String fieldTypeName;
    private final String fieldName;
    private final String methodName;

    @Inject
    public AddGameMessageInterceptorTransformation(ClientJarClassInfo clientJarClassInfo) {
        this.interceptors = clientJarClassInfo.mudClient.interceptors;

        fieldTypeName = MudClientGameMessageInterceptor.class.getCanonicalName();
        fieldName = MudClientGameMessageInterceptor.MC_FIELD_NAME;
        methodName = MudClientGameMessageInterceptor.METHOD_NAME;
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
