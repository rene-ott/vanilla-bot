package rscvanilla.hook.updater.core.matcher.classes.rscharacter.fields;

import rscvanilla.hook.model.annotations.YamlClassMemberKey;
import rscvanilla.hook.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.hook.updater.core.matcher.classes.rscharacter.RSCharacterClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("health_level")
public class HealthLevelFieldNameMatcher extends ClassMemberNameBaseMatcher implements RSCharacterClassFieldNameMatcher {

    public HealthLevelFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}public com\\.rsc\\.a\\.a\\.a\\[] [a-zA-Z]{2} = new com\\.rsc\\.a\\.a\\.a\\[12];\\R" +
            " {3}public int [a-zA-Z]{2} = 0;\\R" +
            " {3}public int )(?<fieldName>[a-zA-Z]{2})(?<post> = 0;\\R" +
            " {3}public int [a-zA-Z]{2} = 0;\\R)",
            Pattern.MULTILINE
        );
    }
}
