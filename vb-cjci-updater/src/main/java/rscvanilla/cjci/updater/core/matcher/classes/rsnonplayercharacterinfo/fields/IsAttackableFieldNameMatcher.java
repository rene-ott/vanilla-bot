package rscvanilla.cjci.updater.core.matcher.classes.rsnonplayercharacterinfo.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("is_attackable")
public class IsAttackableFieldNameMatcher extends ClassMemberNameBaseMatcher implements RSNonPlayerCharacterInfoClassFieldNameMatcher {

    public IsAttackableFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}private final int [a-zA-Z]{2};\\R" +
            " {3}private final boolean )(?<fieldName>[a-zA-Z]{2})(?<post>;\\R" +
            "\\R" +
            " {3}public g)",
            Pattern.MULTILINE
        );
    }
}
