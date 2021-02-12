package rscvanilla.hook.updater.core.matcher.classes.rscharacter.fields;

import rscvanilla.hook.model.annotations.YamlClassMemberKey;
import rscvanilla.hook.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.hook.updater.core.matcher.classes.rscharacter.RSCharacterClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("combat_level")
public class CombatLevelFieldNameMatcher extends ClassMemberNameBaseMatcher implements RSCharacterClassFieldNameMatcher {

    public CombatLevelFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}public int [a-zA-Z]{2} = 0;\\R" +
            " {3}public int )(?<fieldName>[a-zA-Z]{2})(?<post> = -1;\\R" +
            " {3}public String [a-zA-Z]{2};\\R)",
            Pattern.MULTILINE
        );
    }
}
