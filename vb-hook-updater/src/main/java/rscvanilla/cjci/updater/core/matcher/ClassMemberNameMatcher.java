package rscvanilla.cjci.updater.core.matcher;

public interface ClassMemberNameMatcher {
    ClassMemberNameMatch match(String fileContent);
}
