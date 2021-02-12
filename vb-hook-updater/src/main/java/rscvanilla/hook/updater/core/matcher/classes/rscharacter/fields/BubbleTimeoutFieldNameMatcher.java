package rscvanilla.hook.updater.core.matcher.classes.rscharacter.fields;

import rscvanilla.hook.model.annotations.YamlClassMemberKey;
import rscvanilla.hook.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.hook.updater.core.matcher.classes.rscharacter.RSCharacterClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("bubble_timeout")
public class BubbleTimeoutFieldNameMatcher extends ClassMemberNameBaseMatcher implements RSCharacterClassFieldNameMatcher {

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
