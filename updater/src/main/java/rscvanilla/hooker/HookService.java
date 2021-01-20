package rscvanilla.hooker;

import contracts.WithClassFields;
import rscvanilla.hooker.console.Console;
import rscvanilla.hooker.matchers.FieldMatcher;
import rscvanilla.hooker.resolvers.AppletClassFieldsResolver;
import rscvanilla.hooker.resolvers.ClassFieldsBaseResolver;
import rscvanilla.hooker.resolvers.MudClientClassFieldsResolver;
import rscvanilla.hooker.io.HooksFileIO;
import rscvanilla.hooker.io.SourceFileIO;

import javax.inject.Inject;

public class HookService {

    private final MudClientClassFieldsResolver mudClientClassFieldsResolver;
    private final AppletClassFieldsResolver appletClassFieldsResolver;
    private final HooksFileIO hooksFileIO;
    private final SourceFileIO sourceFileIO;
    private final Console console;

    @Inject
    public HookService(MudClientClassFieldsResolver mudClientClassFieldsResolver,
                       AppletClassFieldsResolver appletClassFieldsResolver,
                       HooksFileIO hooksFileIO, SourceFileIO sourceFileIO,
                       Console console) {
        this.mudClientClassFieldsResolver = mudClientClassFieldsResolver;
        this.appletClassFieldsResolver = appletClassFieldsResolver;
        this.hooksFileIO = hooksFileIO;
        this.sourceFileIO = sourceFileIO;
        this.console = console;
    }

    public void findFieldHooks() {

        var template = hooksFileIO.readTemplateFile();

        setFieldNames(appletClassFieldsResolver, template.applet.fields, template.applet.qualifiedName);
        setFieldNames(mudClientClassFieldsResolver, template.mudClient.fields, template.mudClient.qualifiedName);

        hooksFileIO.saveHooksFile(template);
    }

    public <T extends FieldMatcher> void setFieldNames(ClassFieldsBaseResolver<T> classFieldsResolver,
                                                       WithClassFields classFields,
                                                       String qualifiedName) {

        var newFile = sourceFileIO.readNewFile(qualifiedName);
        var oldFile = sourceFileIO.readOldFile(qualifiedName);
        classFieldsResolver.setFileContent(newFile, oldFile);

        classFieldsResolver.setClassFields(classFields);

        // TODO Convert to same name as in yaml.
        console.printClassInfo(classFieldsResolver.getClass().getSimpleName(), qualifiedName);

        while(classFieldsResolver.hasNextField()) {
            var resolvedField = classFieldsResolver.resolveField();

            console.printClassFieldsInfo(resolvedField);

            if (resolvedField.isFieldNameAccepted()) {
                resolvedField.getClassField().value = resolvedField.getAcceptedFieldName();
            }
        }
    }
}
