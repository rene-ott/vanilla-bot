package rscvanilla.instrumentation.transformations;

import javassist.CannotCompileException;
import javassist.CtClass;
import javassist.CtField;
import javassist.NotFoundException;
import rscvanilla.cjci.model.classes.mudclient.MudClientClassMethods;
import rscvanilla.cjci.model.classes.packetbuilderbase.PacketBuilderBaseClassFields;
import rscvanilla.contracts.interceptors.MudClientCaptchaInterceptor;
import rscvanilla.cjci.model.ClientJarClassInfo;

import javax.inject.Inject;

public class AddGameCaptchaInterceptorTransformation {

    private final MudClientClassMethods classMethods;
    private final PacketBuilderBaseClassFields classPacketBuilderBaseFields;

    private final String fieldTypeName;
    private final String fieldName;
    private final String methodName;

    @Inject
    public AddGameCaptchaInterceptorTransformation(ClientJarClassInfo clientJarClassInfo) {
        this.classMethods = clientJarClassInfo.mudClient.methods;
        this.classPacketBuilderBaseFields = clientJarClassInfo.packetBuilderBase.fields;

        fieldTypeName = MudClientCaptchaInterceptor.class.getCanonicalName();
        fieldName = MudClientCaptchaInterceptor.MC_FIELD_NAME;
        methodName = MudClientCaptchaInterceptor.METHOD_NAME;
    }

    public void implement(CtClass ctClass) throws NotFoundException, CannotCompileException {
        var ctField = CtField.make(String.format("%s %s = null;", fieldTypeName, fieldName), ctClass);
        ctField.setModifiers(9);
        ctClass.addField(ctField);

        var ctMethod = ctClass.getDeclaredMethods(classMethods.interceptedOpCodeInHandler)[1];

        ctMethod.insertBefore(String.format("{ %s.%s($1.%s, $2, $3); }", fieldName, methodName, classPacketBuilderBaseFields.bufferedBytes));
    }
}
