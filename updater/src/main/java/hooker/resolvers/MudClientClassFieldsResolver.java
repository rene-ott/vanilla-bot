package hooker.resolvers;

import com.google.common.base.CaseFormat;
import model.common.ClassField;
import hooker.matchers.mudclient.MudClientClassFieldMatcher;
import model.mudclient.MudClientClassFields;

import javax.inject.Inject;
import java.util.*;
import java.util.stream.Collectors;

public class MudClientClassFieldsResolver {

    private final List<MudClientClassFieldMatcher> fieldResolvers;
    private List<ClassField> classFields;

    private int classFieldListIndex;

    private String newFileContent;
    private String oldFileContent;

    @Inject
    public MudClientClassFieldsResolver(Set<MudClientClassFieldMatcher> fieldResolvers) {

        this.fieldResolvers = new ArrayList<>(fieldResolvers);
    }

    public void setFileContent(String newFileContent, String oldFileContent) {
        this.newFileContent = newFileContent;
        this.oldFileContent = oldFileContent;
    }

    // TODO: Move try catch to separate method
    // TODO: Sort
    public void setClassFields(MudClientClassFields classFields) {

        // TODO: Validate resolver.count == field.count
        this.classFields = Arrays.stream(classFields.getClass().getDeclaredFields()).map(it -> {
            try {
                return (ClassField) it.get(classFields);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }).collect(Collectors.toList());
    }

    public boolean hasNextField() {
        return classFieldListIndex < classFields.size();
    }

    public ClassFieldResolveResult resolveField() {
        var selectedClassField = classFields.get(classFieldListIndex);
        var selectedFieldMatcher = getFieldMatcherByFieldName(selectedClassField.key);

        var newFile = selectedFieldMatcher.match(newFileContent);
        var oldFile = selectedFieldMatcher.match(oldFileContent);

        classFieldListIndex++;

        return new ClassFieldResolveResult(newFile, oldFile, selectedClassField);
    }

    // TODO: Throw exception if null
    private MudClientClassFieldMatcher getFieldMatcherByFieldName(String name) {
        for (var fieldResolver : fieldResolvers) {
            var className = fieldResolver.getClass().getSimpleName();
            var classNameWithoutSuffix = className.replace("FieldMatcher", "");
            var formattedClassName = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, classNameWithoutSuffix);

            if (formattedClassName.equals(name)) {
                return fieldResolver;
            }
        }

        return null;
    }
}
