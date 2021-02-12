package rscvanilla.instrumentation.transformers;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.NotFoundException;
import rscvanilla.hook.model.ClientJarClassInfo;
import rscvanilla.hook.model.classes.mudclient.MudClientClass;
import rscvanilla.instrumentation.transformations.AddGameCaptchaInterceptorTransformation;
import rscvanilla.instrumentation.transformations.AddGameMessageInterceptorTransformation;
import rscvanilla.instrumentation.transformations.AddGameSettingsInterceptorTransformation;
import rscvanilla.instrumentation.transformations.RemoveLoginScreenTransformation;

import javax.inject.Inject;
import java.io.IOException;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;

public class MudClientTransformer implements ClassFileTransformer {

    private final MudClientClass mudClientClass;

    private final AddGameMessageInterceptorTransformation gameMessageInterceptorTransformation;
    private final AddGameCaptchaInterceptorTransformation gameCaptchaInterceptorTransformation;
    private final AddGameSettingsInterceptorTransformation gameSettingsInterceptorTransformation;

    private final RemoveLoginScreenTransformation loginScreenTransformation;

    @Inject
    public MudClientTransformer(ClientJarClassInfo clientJarClassInfo,
                                AddGameMessageInterceptorTransformation gameMessageInterceptorTransformation,
                                AddGameCaptchaInterceptorTransformation gameCaptchaInterceptorTransformation,
                                AddGameSettingsInterceptorTransformation gameSettingsInterceptorTransformation,
                                RemoveLoginScreenTransformation loginScreenTransformation) {
        this.mudClientClass = clientJarClassInfo.mudClient;
        this.gameMessageInterceptorTransformation = gameMessageInterceptorTransformation;
        this.gameCaptchaInterceptorTransformation = gameCaptchaInterceptorTransformation;
        this.gameSettingsInterceptorTransformation = gameSettingsInterceptorTransformation;
        this.loginScreenTransformation = loginScreenTransformation;
    }

    // TODO Handle exceptions
    @Override
    public byte[] transform(Module module, ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {

        if (!className.equals(mudClientClass.qualifiedName.replace(".", "/"))) {
            return null;
        }
        System.out.println(className);

        var cp = ClassPool.getDefault();
        try {
            var ctClass = cp.get(mudClientClass.qualifiedName);

            gameCaptchaInterceptorTransformation.implement(ctClass);
            gameMessageInterceptorTransformation.implement(ctClass);
            gameSettingsInterceptorTransformation.implement(ctClass);
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
