package rscvanilla.hook.updater.core.matcher;

public interface ClassMemberNameMatcher {
    ClassMemberNameMatch match(String fileContent);
}
