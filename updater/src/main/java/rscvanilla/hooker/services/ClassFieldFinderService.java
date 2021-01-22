package rscvanilla.hooker.services;

import rscvanilla.hooker.contracts.WithClassMembers;
import rscvanilla.hooker.models.HooksFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rscvanilla.hooker.console.Console;
import rscvanilla.hooker.matchers.ClassMemberNameMatcher;
import rscvanilla.hooker.resolvers.ClassFieldsBaseResolver;
import rscvanilla.hooker.resolvers.classes.AppletClassFieldsResolver;
import rscvanilla.hooker.resolvers.classes.MudClientClassFieldsResolver;

import javax.inject.Inject;

public class ClassFieldFinderService {

    private final SourceFileService sourceFileService;
    private final Console console;
    private final MudClientClassFieldsResolver mudClientClassFieldsResolver;
    private final AppletClassFieldsResolver appletClassFieldsResolver;

    private static final Logger logger = LoggerFactory.getLogger(ClassFieldFinderService.class);

    @Inject
    public ClassFieldFinderService(SourceFileService sourceFileService,
                                   Console console,
                                   MudClientClassFieldsResolver mudClientClassFieldsResolver,
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

    private <T extends ClassMemberNameMatcher> void findFieldNamesWithResolver(ClassFieldsBaseResolver<T> classFieldsResolver,
                                                                               WithClassMembers classFields,
                                                                               String qualifiedName) {
        var newFile = sourceFileService.readNewFile(qualifiedName);
        var oldFile = sourceFileService.readOldFile(qualifiedName);

        classFieldsResolver.setFileContent(newFile, oldFile);
        classFieldsResolver.setClassFields(classFields);

        while(classFieldsResolver.hasNextField()) {
            var resolvedField = classFieldsResolver.resolveField();
            console.printFieldResolveResult(resolvedField, qualifiedName);

            if (resolvedField.isFieldNameAccepted()) {
                resolvedField.getClassField().value = resolvedField.getAcceptedFieldName();
            }
        }
    }
}
