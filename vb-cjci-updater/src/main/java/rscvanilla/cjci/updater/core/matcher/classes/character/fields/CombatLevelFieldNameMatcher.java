package rscvanilla.cjci.updater.core.matcher.classes.character.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.character.CharacterClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("combat_level")
public class CombatLevelFieldNameMatcher extends ClassMemberNameBaseMatcher implements CharacterClassFieldNameMatcher {

    public CombatLevelFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}public int [a-zA-Z]{2} = 0;\\R" +
            " {3}public int )(?<fieldName>[a-zA-Z]{2})(?<post> = -1;\\R" +
            " {3}public String [a-zA-Z]{2};\\R)",
            Pattern.MULTILINE
        );
    }
}
