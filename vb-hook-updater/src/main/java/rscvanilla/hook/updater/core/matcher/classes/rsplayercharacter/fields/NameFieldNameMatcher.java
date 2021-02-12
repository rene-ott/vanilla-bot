package rscvanilla.hook.updater.core.matcher.classes.rsplayercharacter.fields;

import rscvanilla.hook.model.annotations.YamlClassMemberKey;
import rscvanilla.hook.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.hook.updater.core.matcher.classes.rsplayercharacter.RSPlayerCharacterClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("name")
public class NameFieldNameMatcher extends ClassMemberNameBaseMatcher implements RSPlayerCharacterClassFieldNameMatcher {

    public NameFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre>public class k extends i \\{\\R" +
            " {3}public String )(?<fieldName>[a-zA-Z]{2})(?<post>;\\R" +
            " {3}public int [a-zA-Z]{2} = 0;\\R)",
            Pattern.MULTILINE
        );
    }
}
