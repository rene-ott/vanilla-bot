package rscvanilla.instrumentation.transformers.mudclient;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.NotFoundException;
import rscvanilla.cjci.model.ClientJarClassInfo;
import rscvanilla.cjci.model.classes.mudclient.MudClientClass;
import rscvanilla.instrumentation.transformers.mudclient.transformations.*;
import rscvanilla.instrumentation.transformers.mudclient.transformations.interceptors.*;

import javax.inject.Inject;
import java.io.IOException;
import java.lang.instrument.ClassFileTransformer;
import java.security.ProtectionDomain;

public class MudClientTransformer implements ClassFileTransformer {

    private final MudClientClass mudClientClass;

    private final ResetLoginScreenVariablesMethodAddInterceptorTransformation resetLoginScreenVariablesMethodAddInterceptorTransformation;
    private final InitGameScreenVariablesMethodAddInterceptorTransformation initGameScreenVariablesMethodAddInterceptorTransformation;
    private final SendLoginMethodAddInterceptorTransformation sendLoginMethodAddInterceptorTransformation;
    private final ShowGameMessageMethodAddInterceptorTransformer showGameMessageMethodAddInterceptorTransformer;
    private final HandleOpCodeInMethodAddInterceptorTransformer handleOpCodeInMethodAddInterceptorTransformer;

    private final ShowLoginScreenMethodBodyReplaceTransformation loginScreenTransformation;

    @Inject
    public MudClientTransformer(ClientJarClassInfo clientJarClassInfo,
                                ResetLoginScreenVariablesMethodAddInterceptorTransformation resetLoginScreenVariablesMethodAddInterceptorTransformation,
                                InitGameScreenVariablesMethodAddInterceptorTransformation initGameScreenVariablesMethodAddInterceptorTransformation,
                                SendLoginMethodAddInterceptorTransformation sendLoginMethodAddInterceptorTransformation,
                                ShowGameMessageMethodAddInterceptorTransformer showGameMessageMethodAddInterceptorTransformer,
                                HandleOpCodeInMethodAddInterceptorTransformer handleOpCodeInMethodAddInterceptorTransformer,
                                ShowLoginScreenMethodBodyReplaceTransformation loginScreenTransformation
    ) {
        this.mudClientClass = clientJarClassInfo.mudClient;
        this.resetLoginScreenVariablesMethodAddInterceptorTransformation = resetLoginScreenVariablesMethodAddInterceptorTransformation;
        this.initGameScreenVariablesMethodAddInterceptorTransformation = initGameScreenVariablesMethodAddInterceptorTransformation;
        this.sendLoginMethodAddInterceptorTransformation = sendLoginMethodAddInterceptorTransformation;
        this.showGameMessageMethodAddInterceptorTransformer = showGameMessageMethodAddInterceptorTransformer;
        this.handleOpCodeInMethodAddInterceptorTransformer = handleOpCodeInMethodAddInterceptorTransformer;
        this.loginScreenTransformation = loginScreenTransformation;
    }

    // TODO Handle exceptions
    @Override
    public byte[] transform(Module module, ClassLoader loader,
                            String className,
                            Class<?> classBeingRedefined,
                            ProtectionDomain protectionDomain,
                            byte[] classfileBuffer
    ) {

        if (!className.equals(mudClientClass.qualifiedName.replace(".", "/"))) {
            return null;
        }

        var cp = ClassPool.getDefault();
        try {
            var ctClass = cp.get(mudClientClass.qualifiedName);

            resetLoginScreenVariablesMethodAddInterceptorTransformation.implement(ctClass);
            handleOpCodeInMethodAddInterceptorTransformer.implement(ctClass);
            showGameMessageMethodAddInterceptorTransformer.implement(ctClass);
            initGameScreenVariablesMethodAddInterceptorTransformation.implement(ctClass);
            sendLoginMethodAddInterceptorTransformation.implement(ctClass);

            loginScreenTransformation.implement(ctClass);

            var bytes = ctClass.toBytecode();
            ctClass.detach();

            return bytes;
        } catch (NotFoundException | CannotCompileException | IOException e) {
            System.out.println(e.toString());
            throw new RuntimeException(e);
        }
    }
}
