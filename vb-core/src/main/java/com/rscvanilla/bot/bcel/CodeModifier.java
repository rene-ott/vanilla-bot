package com.rscvanilla.bot.bcel;

import javassist.*;
import rscvanilla.contracts.interceptors.MudClientCaptchaInterceptor;
import rscvanilla.contracts.interceptors.MudClientGameSettingsInterceptor;
import rscvanilla.contracts.interceptors.MudClientInGameMessageInterceptor;
import rscvanilla.hook.model.Hooks;
import rscvanilla.hook.model.HooksFileReader;

import java.io.IOException;
import java.util.Arrays;

public class CodeModifier {

    public static void modifyClientJar(String clientJarFilePath) throws NotFoundException, CannotCompileException, IOException {
        var hookProperties = HooksFileReader.readHooksFile();

        var classPool = getClassPool(clientJarFilePath);

        var mcClass = getMudClientClass(classPool, hookProperties);

        removeLoginScreen(mcClass, hookProperties);
        addCaptchaInterceptor(classPool, mcClass, hookProperties);
        addInGameMessageInterceptor(classPool, mcClass, hookProperties);
        addSettingsInterceptor(classPool, mcClass, hookProperties);
        mcClass.toClass();
    }

    private static ClassPool getClassPool(String clientJarFilePath) throws NotFoundException {
        ClassPool classPool = ClassPool.getDefault();
        classPool.insertClassPath(clientJarFilePath);

        addCommonClassesToPool(classPool);

        return classPool;
    }

    private static CtClass getMudClientClass(ClassPool classPool, Hooks hookProperties) throws NotFoundException {
        return classPool.get(hookProperties.mudClient.qualifiedName);
    }

    private static void addCommonClassesToPool(ClassPool classPool) {
        classPool.insertClassPath(new ClassClassPath(Arrays.class));
    }

    private static void addCaptchaInterceptor(ClassPool classPool, CtClass clazz, Hooks hookProperties) throws CannotCompileException, NotFoundException {
        classPool.insertClassPath(new ClassClassPath(MudClientCaptchaInterceptor.class));

        var fieldName = MudClientCaptchaInterceptor.MC_FIELD_NAME;
        var methodName = MudClientCaptchaInterceptor.METHOD_NAME;

        CtMethod method = clazz.getDeclaredMethods(hookProperties.mudClient.interceptors.gameCaptcha)[1];
        addListenerField(clazz, MudClientCaptchaInterceptor.class, fieldName);

        method.insertBefore("{" + fieldName + "." + methodName + "($1.rU, $2, $3); }");
    }

    private static void addInGameMessageInterceptor(ClassPool classPool, CtClass clazz, Hooks hookProperties) throws CannotCompileException, NotFoundException {
        classPool.insertClassPath(new ClassClassPath(MudClientInGameMessageInterceptor.class));

        var fieldName = MudClientInGameMessageInterceptor.MC_FIELD_NAME;
        var methodName = MudClientInGameMessageInterceptor.METHOD_NAME;


        CtMethod method = clazz.getDeclaredMethods(hookProperties.mudClient.interceptors.gameMessage)[8];
        addListenerField(clazz, MudClientInGameMessageInterceptor.class, fieldName);

        method.insertBefore("{" + fieldName + "."+ methodName + "($1, $2, $3, $4, $5, $6); }");
    }

    private static void addSettingsInterceptor(ClassPool classPool, CtClass clazz, Hooks hookProperties) throws CannotCompileException, NotFoundException {
        classPool.insertClassPath(new ClassClassPath(MudClientGameSettingsInterceptor.class));

        var methodName = MudClientGameSettingsInterceptor.METHOD_NAME;
        var fieldName = MudClientGameSettingsInterceptor.MC_FIELD_NAME;

        CtMethod method = clazz.getDeclaredMethods(hookProperties.mudClient.interceptors.gameSettings)[1];
        addListenerField(clazz, MudClientGameSettingsInterceptor.class, fieldName);

        method.insertBefore("{ if(" + fieldName +"." + methodName + "($1, $2)) return; }");
    }

    private static void addListenerField(CtClass classToBeAdded, Class<?> fieldType, String fieldName) throws CannotCompileException {
        CtField f1 = CtField.make(fieldType.getCanonicalName() +" " + fieldName +" = null;", classToBeAdded);
        f1.setModifiers(9);
        classToBeAdded.addField(f1);
    }

    private static void removeLoginScreen(CtClass clazz, Hooks hookProperties) throws NotFoundException, CannotCompileException {
        CtMethod method2 = clazz.getDeclaredMethod(hookProperties.mudClient.methods.showLoginScreen);

        var mouseButtonClick = hookProperties.mudClient.fields.mouseButtonClick;
        var showDialogServerMessage = hookProperties.mudClient.fields.showDialogServerMessage;

        method2.setBody(String.format("{this.%s = 0; this.%s = false;}", mouseButtonClick, showDialogServerMessage));
    }
}
