package hooker.resolvers;

import hooker.matchers.FieldMatcherResult;
import hooker.matchers.FieldMatcherResultStatus;
import model.common.ClassField;

public class ClassFieldResolveResult {

    private final FieldMatcherResult newFileMatcherResult;
    private final FieldMatcherResult oldFileMatcherResult;
    private final ClassField classField;

    public ClassFieldResolveResult(FieldMatcherResult newFileMatcherResult,
                                   FieldMatcherResult oldFileMatcherResult,
                                   ClassField classField) {

        this.newFileMatcherResult = newFileMatcherResult;
        this.oldFileMatcherResult = oldFileMatcherResult;
        this.classField = classField;
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
}
