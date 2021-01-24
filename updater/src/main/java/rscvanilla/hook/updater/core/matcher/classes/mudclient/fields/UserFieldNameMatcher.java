package rscvanilla.hook.updater.core.matcher.classes.mudclient.fields;

import rscvanilla.hook.model.annotations.YamlClassMemberKey;
import rscvanilla.hook.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.hook.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("user")
public class UserFieldNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassFieldNameMatcher {

    public UserFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}public int [a-zA-Z]{2};\\R" +
            " {3}k )(?<fieldName>[a-zA-Z]{2})(?<post>;\\R" +
            " {3}private g\\[] [a-zA-Z]{2};)",
            Pattern.MULTILINE
        );
    }
}
