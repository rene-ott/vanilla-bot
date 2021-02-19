package rscvanilla.cjci.updater.core.matcher.classes.rsnonplayercharacter.methods;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.rsnonplayercharacter.RSNonPlayerCharacterClassMethodNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("get_info")
public class GetInfoMethodNameMatcher extends ClassMemberNameBaseMatcher implements RSNonPlayerCharacterClassMethodNameMatcher {

    public GetInfoMethodNameMatcher() {
        pattern = Pattern.compile(
        "(?<pre> {3}public com\\.rsc\\.a\\.a\\.g )(?<fieldName>[a-zA-Z]{1,2})(?<post>\\(\\) \\{)",
        Pattern.MULTILINE
        );
    }
}
