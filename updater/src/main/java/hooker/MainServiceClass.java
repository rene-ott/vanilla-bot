package hooker;

import hooker.resolvers.MudClientClassFieldsResolver;
import hooker.services.HooksFileService;
import hooker.services.SourceFileService;

import javax.inject.Inject;

public class MainServiceClass {

    private MudClientClassFieldsResolver mudClientClassFieldsResolver;
    private HooksFileService hooksFileService;
    private SourceFileService sourceFileService;

    @Inject
    public MainServiceClass(MudClientClassFieldsResolver mudClientClassFieldsResolver,
                            HooksFileService hooksFileService, SourceFileService sourceFileService) {
        this.mudClientClassFieldsResolver = mudClientClassFieldsResolver;
        this.hooksFileService = hooksFileService;
        this.sourceFileService = sourceFileService;
    }

    public void doSomething() {

        var hooksFileTemplate = hooksFileService.readTemplateFile();

        var newFile = sourceFileService.readNewFile(hooksFileTemplate.mudClient.qualifiedName);
        var oldFile = sourceFileService.readOldFile(hooksFileTemplate.mudClient.qualifiedName);

        mudClientClassFieldsResolver.setClassFields(hooksFileTemplate.mudClient.fields);
        mudClientClassFieldsResolver.setFileContent(newFile, oldFile);

        while(mudClientClassFieldsResolver.hasNextField()) {
            var resolvedField = mudClientClassFieldsResolver.resolveField();
            System.out.println(String.format("============FIELD KEY (%s)============", resolvedField.getClassField().key));
            System.out.println("NEW: "+ resolvedField.getNewFileResult().getMatchedFieldName());
            System.out.println("OLD: "+ resolvedField.getOldFileResult().getMatchedFieldName());
            resolvedField.getClassField().value = resolvedField.getNewFileResult().getMatchedFieldName();
        }

        hooksFileService.saveHooksFile(hooksFileTemplate);
    }
}
