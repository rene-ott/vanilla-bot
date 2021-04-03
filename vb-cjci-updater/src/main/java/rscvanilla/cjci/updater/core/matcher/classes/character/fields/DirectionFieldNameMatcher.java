package rscvanilla.cjci.updater.core.matcher.classes.character.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.character.CharacterClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("direction")
public class DirectionFieldNameMatcher extends ClassMemberNameBaseMatcher implements CharacterClassFieldNameMatcher {

    public DirectionFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}public int\\[] [a-zA-Z]{2} = new int\\[10];\\R" +
            " {3}public int\\[] [a-zA-Z]{2} = new int\\[10];\\R" +
            " {3}private int )(?<fieldName>[a-zA-Z]{2})(?<post> = 0;)",
            Pattern.MULTILINE
        );
    }
}
