package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("combat_style")
public class CombatStyleFieldNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassFieldNameMatcher {
    public CombatStyleFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {6}this\\.[a-zA-Z]{2} = 0;\\R" +
            " {6}this\\.)(?<fieldName>[a-zA-Z]{2})(?<post> = 0;\\R" +
            " {6}this\\.[a-zA-Z]{2} = 0;\\R" +
            " {6}this\\.[a-zA-Z]{2} = f\\.[a-zA-Z]{2};\\R" +
            " {6}this\\.[a-zA-Z]{2} = 0;)",
            Pattern.MULTILINE
        );
    }
}
