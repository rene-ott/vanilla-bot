package rscvanilla.hooker.services;

import contracts.WithClassFields;
import model.HooksFile;
import rscvanilla.hooker.console.Console;
import rscvanilla.hooker.matchers.FieldMatcher;
import rscvanilla.hooker.resolvers.ClassFieldsBaseResolver;
import rscvanilla.hooker.resolvers.classes.AppletClassFieldsResolver;
import rscvanilla.hooker.resolvers.classes.MudClientClassFieldsResolver;

import javax.inject.Inject;

public class ClassFieldFinderService {

    private final SourceFileService sourceFileService;
    private final Console console;
    private final MudClientClassFieldsResolver mudClientClassFieldsResolver;
    private final AppletClassFieldsResolver appletClassFieldsResolver;

    @Inject
    public ClassFieldFinderService(SourceFileService sourceFileService,
                                   Console console, MudClientClassFieldsResolver mudClientClassFieldsResolver,
                                   AppletClassFieldsResolver appletClassFieldsResolver) {
        this.sourceFileService = sourceFileService;
        this.console = console;
        this.mudClientClassFieldsResolver = mudClientClassFieldsResolver;
        this.appletClassFieldsResolver = appletClassFieldsResolver;
    }

    public void findAllFieldNamesForHooks(HooksFile template) {
        findFieldNamesWithResolver(appletClassFieldsResolver, template.applet.fields, template.applet.qualifiedName);
        findFieldNamesWithResolver(mudClientClassFieldsResolver, template.mudClient.fields, template.mudClient.qualifiedName);
    }

    private <T extends FieldMatcher> void findFieldNamesWithResolver(ClassFieldsBaseResolver<T> classFieldsResolver,
                                                                    WithClassFields classFields,
                                                                    String qualifiedName) {
        var newFile = sourceFileService.readNewFile(qualifiedName);
        var oldFile = sourceFileService.readOldFile(qualifiedName);

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
