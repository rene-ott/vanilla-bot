package rscvanilla.cjci.updater.core.matcher.classes.character.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.character.CharacterClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("bubble_timeout")
public class BubbleTimeoutFieldNameMatcher extends ClassMemberNameBaseMatcher implements CharacterClassFieldNameMatcher {

    public BubbleTimeoutFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre>public class i extends d \\{\\R" +
            " {3}public int [a-zA-Z]{2};\\R" +
            " {3}public int )(?<fieldName>[a-zA-Z]{2})(?<post> = 0;\\R" +
            " {3}public int [a-zA-Z]{2} = 0;)",
            Pattern.MULTILINE
        );
    }
}
