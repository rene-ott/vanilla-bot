package rscvanilla.hooker.resolvers;

import rscvanilla.hooker.matchers.FieldMatcherResult;
import rscvanilla.hooker.matchers.FieldMatcherResultStatus;
import rscvanilla.hooker.models.common.ClassField;

public class ClassFieldResolveResult {

    private final FieldMatcherResult newFileMatcherResult;
    private final FieldMatcherResult oldFileMatcherResult;
    private final ClassField classField;
    private final String className;

    public ClassFieldResolveResult(FieldMatcherResult newFileMatcherResult,
                                   FieldMatcherResult oldFileMatcherResult,
                                   ClassField classField,
                                   String className) {

        this.newFileMatcherResult = newFileMatcherResult;
        this.oldFileMatcherResult = oldFileMatcherResult;
        this.classField = classField;
        this.className = className;
    }

    public FieldMatcherResult getNewFileResult() {
        return newFileMatcherResult;
    }

    public FieldMatcherResult getOldFileResult() {
        return oldFileMatcherResult;
    }

    public ClassField getClassField() {
        return classField;
    }

    public boolean isFieldNameAccepted() {
        return newFileMatcherResult.getStatus() == FieldMatcherResultStatus.SINGLE;
    }

    public String getAcceptedFieldName() {
        return newFileMatcherResult.getFieldName();
    }

    public String getClassName() { return className; }
}
