package rscvanilla.hooker.core.searcher;

public class ClassMemberInfo {
    private final String yamlKey;
    private final String memberName;

    public ClassMemberInfo(String yamlKey, String memberName) {
        this.yamlKey = yamlKey;
        this.memberName = memberName;
    }

    public String getYamlKey() {
        return yamlKey;
    }

    public String getMemberName() {
        return memberName;
    }
}
