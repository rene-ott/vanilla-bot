package rscvanilla.hooker.resolvers;

import rscvanilla.hooker.matchers.ClassMemberNameMatch;
import rscvanilla.hooker.matchers.FieldMatcherResultStatus;
import rscvanilla.hooker.models.common.ClassMember;

public class ClassFieldResolveResult {

    private final ClassMemberNameMatch newFileMatcherResult;
    private final ClassMemberNameMatch oldFileMatcherResult;
    private final ClassMember classMember;
    private final String className;

    public ClassFieldResolveResult(ClassMemberNameMatch newFileMatcherResult,
                                   ClassMemberNameMatch oldFileMatcherResult,
                                   ClassMember classMember,
                                   String className) {

        this.newFileMatcherResult = newFileMatcherResult;
        this.oldFileMatcherResult = oldFileMatcherResult;
        this.classMember = classMember;
        this.className = className;
    }

    public ClassMemberNameMatch getNewFileResult() {
        return newFileMatcherResult;
    }

    public ClassMemberNameMatch getOldFileResult() {
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
