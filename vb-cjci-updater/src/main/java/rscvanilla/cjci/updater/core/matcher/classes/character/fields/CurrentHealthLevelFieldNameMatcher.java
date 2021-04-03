package rscvanilla.cjci.updater.core.matcher.classes.character.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.character.CharacterClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("current_health_level")
public class CurrentHealthLevelFieldNameMatcher extends ClassMemberNameBaseMatcher implements CharacterClassFieldNameMatcher {

    public CurrentHealthLevelFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}public com\\.rsc\\.a\\.a\\.a\\[] [a-zA-Z]{2} = new com\\.rsc\\.a\\.a\\.a\\[12];\\R" +
            " {3}public int )(?<fieldName>[a-zA-Z]{2})(?<post> = 0;\\R" +
            " {3}public int [a-zA-Z]{2} = 0;\\R)",
            Pattern.MULTILINE
        );
    }
}
