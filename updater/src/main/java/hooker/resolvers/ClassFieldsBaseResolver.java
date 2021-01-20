package hooker.resolvers;

import com.google.common.base.CaseFormat;
import contracts.WithClassFields;
import hooker.matchers.FieldMatcher;
import model.common.ClassField;
import model.mudclient.MudClientClassFields;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ClassFieldsBaseResolver<T> {

    protected final List<T> fieldResolvers;
    protected List<ClassField> classFields;

    protected int classFieldListIndex;

    protected String newFileContent;
    protected String oldFileContent;

    public ClassFieldsBaseResolver(Set<T> fieldResolvers) {
        this.fieldResolvers = new ArrayList<>(fieldResolvers);
    }

    // TODO: Move try catch to separate method
    // TODO: Sort
    public void setClassFields(WithClassFields classFields) {

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

    public void setFileContent(String newFileContent, String oldFileContent) {
        this.newFileContent = newFileContent;
        this.oldFileContent = oldFileContent;
    }

    public ClassFieldResolveResult resolveField() {
        var selectedClassField = classFields.get(classFieldListIndex);
        var selectedFieldMatcher = getFieldMatcherByFieldName(selectedClassField.key);

        var newFile = selectedFieldMatcher.match(newFileContent);
        var oldFile = oldFileContent == null ? null : selectedFieldMatcher.match(oldFileContent);

        classFieldListIndex++;

        return new ClassFieldResolveResult(newFile, oldFile, selectedClassField);
    }

    // TODO: Throw exception if null
    // TODO: Add unchecked cast
    private <T extends FieldMatcher> T getFieldMatcherByFieldName(String name) {
        for (var fieldResolver : fieldResolvers) {
            var className = fieldResolver.getClass().getSimpleName();
            var classNameWithoutSuffix = className.replace("FieldMatcher", "");
            var formattedClassName = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, classNameWithoutSuffix);

            if (formattedClassName.equals(name)) {
                return (T) fieldResolver;
            }
        }

        return null;
    }
}
