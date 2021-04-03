package rscvanilla.cjci.updater.core.matcher.classes.playercharacter.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.playercharacter.PlayerCharacterClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("name")
public class NameFieldNameMatcher extends ClassMemberNameBaseMatcher implements PlayerCharacterClassFieldNameMatcher {

    public NameFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre>public class k extends i \\{\\R" +
            " {3}public String )(?<fieldName>[a-zA-Z]{2})(?<post>;\\R" +
            " {3}public int [a-zA-Z]{2} = 0;\\R)",
            Pattern.MULTILINE
        );
    }
}
