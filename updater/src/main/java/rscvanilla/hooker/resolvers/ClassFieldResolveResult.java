package rscvanilla.hooker.resolvers;

import rscvanilla.hooker.matchers.FieldMatcherResult;
import rscvanilla.hooker.matchers.FieldMatcherResultStatus;
import rscvanilla.hooker.models.common.ClassMember;

public class ClassFieldResolveResult {

    private final FieldMatcherResult newFileMatcherResult;
    private final FieldMatcherResult oldFileMatcherResult;
    private final ClassMember classMember;
    private final String className;

    public ClassFieldResolveResult(FieldMatcherResult newFileMatcherResult,
                                   FieldMatcherResult oldFileMatcherResult,
                                   ClassMember classMember,
                                   String className) {

        this.newFileMatcherResult = newFileMatcherResult;
        this.oldFileMatcherResult = oldFileMatcherResult;
        this.classMember = classMember;
        this.className = className;
    }

    public FieldMatcherResult getNewFileResult() {
        return newFileMatcherResult;
    }

    public FieldMatcherResult getOldFileResult() {
        return oldFileMatcherResult;
    }

    public ClassMember getClassField() {
        return classMember;
    }

    public boolean isFieldNameAccepted() {
        return newFileMatcherResult.getStatus() == FieldMatcherResultStatus.SINGLE;
    }

    public String getAcceptedFieldName() {
        return newFileMatcherResult.getFieldName();
    }

    public String getClassName() { return className; }
}
