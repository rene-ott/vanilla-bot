package rscvanilla.hooker.resolvers;

import com.google.common.base.CaseFormat;
import rscvanilla.hooker.contracts.WithClassFields;
import rscvanilla.hooker.matchers.FieldMatcher;
import rscvanilla.hooker.models.common.ClassField;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ClassFieldsBaseResolver<T> {

    protected final List<T> fieldMatchers;
    protected List<ClassField> classFields;

    protected int classFieldListIndex;

    protected String newFileContent;
    protected String oldFileContent;

    public ClassFieldsBaseResolver(Set<T> fieldMatchers) {
        this.fieldMatchers = new ArrayList<>(fieldMatchers);
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
        var selectedFieldMatcher = getFieldMatcherByYamlFieldName(selectedClassField.fieldName);

        var newFile = selectedFieldMatcher.match(newFileContent);
        var oldFile = oldFileContent == null ? null : selectedFieldMatcher.match(oldFileContent);

        classFieldListIndex++;

        return new ClassFieldResolveResult(newFile, oldFile, selectedClassField, getYamlClassName());
    }

    private String getYamlClassName() {
        return CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, getClass().getSimpleName().replace("ClassFieldsResolver", ""));
    }

    private String getYamlClassFieldName(Object fieldMatcher) {
        return CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, fieldMatcher.getClass().getSimpleName().replace("FieldMatcher", ""));
    }

    // TODO: Throw exception if null
    @SuppressWarnings("unsafe")
    private <T extends FieldMatcher> T getFieldMatcherByYamlFieldName(String name) {
        for (var fieldMatcher : fieldMatchers) {
            if (getYamlClassFieldName(fieldMatcher).equals(name)) {
                return (T) fieldMatcher;
            }
        }

        return null;
    }
}
