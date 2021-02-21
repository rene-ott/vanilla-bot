package rscvanilla.instrumentation.transformers.mudclient.transformations.interceptors;

import javassist.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rscvanilla.cjci.model.ClientJarClassInfo;

public abstract class BaseMethodAddInterceptorTransformation {

    private static final Logger logger = LoggerFactory.getLogger(BaseMethodAddInterceptorTransformation.class);
    private static final Logger simpleLogger = LoggerFactory.getLogger("SimpleLogger");

    protected final ClientJarClassInfo clientJarClassInfo;
    protected final String interceptorFieldName;
    protected final String interceptorFieldTypeName;

    protected final String beforeMethodName;
    protected final String afterMethodName;

    protected final String beforeMethodIdentifier;
    protected final String afterMethodIdentifier;

    protected BaseMethodAddInterceptorTransformation(
        String interceptorFieldName,
        String beforeMethodName,
        String afterMethodName,
        Class<?> interceptorFieldType,
        ClientJarClassInfo clientJarClassInfo
    ) {
        this.interceptorFieldName = interceptorFieldName;
        this.interceptorFieldTypeName = interceptorFieldType.getCanonicalName();

        this.beforeMethodName = beforeMethodName;
        this.afterMethodName = afterMethodName;

        this.beforeMethodIdentifier = String.format("%s.%s", interceptorFieldName, beforeMethodName);
        this.afterMethodIdentifier = String.format("%s.%s", interceptorFieldName, afterMethodName);

        this.clientJarClassInfo = clientJarClassInfo;
    }

    protected void addInterceptorFieldToCtClazz(CtClass ctClass) throws CannotCompileException {
        var ctField = CtField.make(String.format("java.util.ArrayList %s = new java.util.ArrayList();", interceptorFieldName), ctClass);
        ctField.setModifiers(9);
        ctClass.addField(ctField);
    }

    public void implement(CtClass ctClass) throws NotFoundException, CannotCompileException {
        logger.debug("Running [{}].", getClass().getSimpleName());
        addInterceptorFieldToCtClazz(ctClass);

        var ctMethod = interceptedMethod(ctClass);

        var beforeCodeSrc = insertBeforeMethod(ctClass);
        if (beforeCodeSrc != null) {
            simpleLogger.trace(" - Before: [{}]", beforeCodeSrc);
            ctMethod.insertBefore(beforeCodeSrc);
        }

        var afterCodeSrc = insertAfterMethod(ctClass);
        if (afterCodeSrc != null) {
            simpleLogger.trace(" - After: [{}]", beforeCodeSrc);
            ctMethod.insertBefore(beforeCodeSrc);
        }
    }

    protected String wrapIntoWhileLoop(String methodCall) {
        var code = new StringBuilder();

        code.append(String.format("java.util.Iterator iter = %s.iterator();", interceptorFieldName));
        code.append("while (iter.hasNext()) {");
        code.append("Object obj = iter.next();");
        code.append(String.format("((%s)obj).%s;", interceptorFieldTypeName, methodCall));
        code.append("}");

        return code.toString();
    }
    protected abstract CtMethod interceptedMethod(CtClass ctClass) throws NotFoundException;
    protected abstract String insertBeforeMethod(CtClass ctClass) throws NotFoundException, CannotCompileException;
    protected abstract String insertAfterMethod(CtClass ctClass);

    protected CtMethod getMethodByParams(CtClass ctClazz, String name, CtClass...paramTypes) throws NotFoundException {
        return ctClazz.getDeclaredMethod(name, paramTypes);
    }

    protected CtMethod getMethodByIndex(CtClass ctClazz, String name, int index) throws NotFoundException {
        return ctClazz.getDeclaredMethods(name)[index];
    }
}
