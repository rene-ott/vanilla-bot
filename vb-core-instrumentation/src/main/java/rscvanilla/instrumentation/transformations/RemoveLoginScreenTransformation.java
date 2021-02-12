package rscvanilla.instrumentation.transformations;

import javassist.CannotCompileException;
import javassist.CtClass;
import javassist.NotFoundException;
import rscvanilla.hook.model.ClientJarClassInfo;
import rscvanilla.hook.model.classes.mudclient.MudClientClass;

import javax.inject.Inject;

public class RemoveLoginScreenTransformation {

    private final MudClientClass mudClientClass;

    @Inject
    public RemoveLoginScreenTransformation(ClientJarClassInfo clientJarClassInfo) {
        this.mudClientClass = clientJarClassInfo.mudClient;
    }

    public void implement(CtClass ctClass) throws NotFoundException, CannotCompileException {
        var ctMethod = ctClass.getDeclaredMethod(mudClientClass.methods.showLoginScreen);
        ctMethod.setBody(String.format("{this.%s = 0; this.%s = false;}", mudClientClass.fields.mouseButtonClick, mudClientClass.fields.showDialogServerMessage));
    }
}
