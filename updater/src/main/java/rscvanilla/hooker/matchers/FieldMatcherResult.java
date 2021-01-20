package rscvanilla.hooker.matchers;

public class FieldMatcherResult {

    private FieldMatcherResultStatus status = FieldMatcherResultStatus.MISSING;

    private String match;
    private String section;
    private String fieldName;

    public void setValues(String fieldName, String match, String section) {
        this.match = match;
        this.fieldName = fieldName;
        this.section = section;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getSection() {
        return section;
    }

    public String getMatch() {
        return match;
    }

    public FieldMatcherResultStatus getStatus() {
        return status;
    }

    public void setStatus(FieldMatcherResultStatus status) {
        this.status = status;
    }
}
