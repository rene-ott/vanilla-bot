package rscvanilla.cjci.updater.core.matcher;

public class ClassMemberNameMatch {

    private ClassMemberNameMatchStatus status = ClassMemberNameMatchStatus.MISSING;

    private String match;
    private String section;
    private String fieldName;

    public void setValues(String fieldName, String match, String section) {
        this.match = match;
        this.fieldName = fieldName;
        this.section = section;
    }

    public String getMemberName() {
        return fieldName;
    }

    public String getSection() {
        return section;
    }

    public String getMatch() {
        return match;
    }

    public ClassMemberNameMatchStatus getStatus() {
        return status;
    }

    public void setStatus(ClassMemberNameMatchStatus status) {
        this.status = status;
    }
}
