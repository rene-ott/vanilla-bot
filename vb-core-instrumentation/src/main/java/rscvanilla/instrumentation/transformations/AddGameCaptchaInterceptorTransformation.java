package rscvanilla.instrumentation.transformations;

import javassist.CannotCompileException;
import javassist.CtClass;
import javassist.CtField;
import javassist.NotFoundException;
import rscvanilla.contracts.interceptors.MudClientCaptchaInterceptor;
import rscvanilla.cjci.model.ClientJarClassInfo;
import rscvanilla.cjci.model.classes.mudclient.MudClientClassInterceptors;

import javax.inject.Inject;

public class AddGameCaptchaInterceptorTransformation {

    private final MudClientClassInterceptors interceptors;

    private final String fieldTypeName;
    private final String fieldName;
    private final String methodName;

    @Inject
    public AddGameCaptchaInterceptorTransformation(ClientJarClassInfo clientJarClassInfo) {
        this.interceptors = clientJarClassInfo.mudClient.interceptors;

        fieldTypeName = MudClientCaptchaInterceptor.class.getCanonicalName();
        fieldName = MudClientCaptchaInterceptor.MC_FIELD_NAME;
        methodName = MudClientCaptchaInterceptor.METHOD_NAME;
    }

    public void implement(CtClass ctClass) throws NotFoundException, CannotCompileException {
        System.out.println("AddGameCaptchaInterceptorTransformation");

        var ctField = CtField.make(String.format("%s %s = null;", fieldTypeName, fieldName), ctClass);
        ctField.setModifiers(9);
        ctClass.addField(ctField);

        var ctMethod = ctClass.getDeclaredMethods(interceptors.gameCaptcha)[1];

        // TODO: replace constant rU with value from hooks file
        ctMethod.insertBefore(String.format("{ %s.%s($1.rU, $2, $3); }", fieldName, methodName));
    }
}
