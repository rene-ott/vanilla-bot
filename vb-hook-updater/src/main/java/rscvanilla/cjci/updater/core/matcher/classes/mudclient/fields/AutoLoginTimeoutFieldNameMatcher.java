package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("auto_login_timeout")
public class AutoLoginTimeoutFieldNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassFieldNameMatcher {

    public AutoLoginTimeoutFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {6}this\\.[a-zA-Z]{2} = -1;\\R" +
            " {6}this\\.[a-zA-Z]{2} = 1;\\R" +
            " {6}this\\.[a-zA-Z]{2} = 0;\\R" +
            " {6}this\\.)(?<fieldName>[a-zA-Z]{2})(?<post> = 0;\\R" +
            " {6}this\\.[a-zA-Z]{2} = 0;)",
            Pattern.MULTILINE
        );
    }
}
