package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("is_admin")
public class IsAdminFieldNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassFieldNameMatcher {

    public IsAdminFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}public boolean [a-zA-Z]{2} = false;\\R" +
            " {3}public boolean [a-zA-Z]{2} = false;\\R" +
            " {3}public boolean [a-zA-Z]{2} = false;\\R" +
            " {3}public boolean )(?<fieldName>[a-zA-Z]{2})(?<post>;\\R" +
            " {3}public int [a-zA-Z]{2};\\R" +
            " {3}public int [a-zA-Z]{2};\\R" +
            " {3}public int [a-zA-Z]{2} = 0;)",
            Pattern.MULTILINE
        );
    }
}
