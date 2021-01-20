package hooker;

import contracts.WithClassFields;
import hooker.console.Console;
import hooker.matchers.FieldMatcher;
import hooker.resolvers.AppletClassFieldsResolver;
import hooker.resolvers.ClassFieldsBaseResolver;
import hooker.resolvers.MudClientClassFieldsResolver;
import hooker.io.HooksFileIO;
import hooker.io.SourceFileIO;

import javax.inject.Inject;

public class MainServiceClass {

    private final MudClientClassFieldsResolver mudClientClassFieldsResolver;
    private AppletClassFieldsResolver appletClassFieldsResolver;
    private final HooksFileIO hooksFileIO;
    private final SourceFileIO sourceFileIO;
    private final Console console;

    @Inject
    public MainServiceClass(MudClientClassFieldsResolver mudClientClassFieldsResolver,
                            AppletClassFieldsResolver appletClassFieldsResolver,
                            HooksFileIO hooksFileIO, SourceFileIO sourceFileIO,
                            Console console) {
        this.mudClientClassFieldsResolver = mudClientClassFieldsResolver;
        this.appletClassFieldsResolver = appletClassFieldsResolver;
        this.hooksFileIO = hooksFileIO;
        this.sourceFileIO = sourceFileIO;
        this.console = console;
    }

    public void doSomething() {

        var template = hooksFileIO.readTemplateFile();

        resolveFieldNames(appletClassFieldsResolver, template.applet.fields, template.applet.qualifiedName);
        resolveFieldNames(mudClientClassFieldsResolver, template.mudClient.fields, template.mudClient.qualifiedName);

        hooksFileIO.saveHooksFile(template);
    }

    public <T extends FieldMatcher> void resolveFieldNames(ClassFieldsBaseResolver<T> classFieldsResolver,
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
