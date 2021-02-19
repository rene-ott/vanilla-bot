package rscvanilla.instrumentation.transformations;

import javassist.CannotCompileException;
import javassist.CtClass;
import javassist.CtField;
import javassist.NotFoundException;
import rscvanilla.cjci.model.classes.mudclient.MudClientClassMethods;
import rscvanilla.contracts.interceptors.MudClientGameSettingsInterceptor;
import rscvanilla.cjci.model.ClientJarClassInfo;

import javax.inject.Inject;

public class AddGameSettingsInterceptorTransformation {

    private final MudClientClassMethods classMethods;

    private final String fieldTypeName;
    private final String fieldName;
    private final String methodName;

    @Inject
    public AddGameSettingsInterceptorTransformation(ClientJarClassInfo clientJarClassInfo) {
        classMethods = clientJarClassInfo.mudClient.methods;

        fieldTypeName = MudClientGameSettingsInterceptor.class.getCanonicalName();
        fieldName = MudClientGameSettingsInterceptor.MC_FIELD_NAME;
        methodName = MudClientGameSettingsInterceptor.METHOD_NAME;
    }

    public void implement(CtClass ctClass) throws NotFoundException, CannotCompileException {
        var ctField = CtField.make(String.format("%s %s = null;", fieldTypeName, fieldName), ctClass);
        ctField.setModifiers(9);
        ctClass.addField(ctField);

        var ctMethod = ctClass.getDeclaredMethods(classMethods.interceptedOpCodeInHandler)[1];
        ctMethod.insertBefore("{ if(" + fieldName +"." + methodName + "($1, $2)) return; }");
    }
}
