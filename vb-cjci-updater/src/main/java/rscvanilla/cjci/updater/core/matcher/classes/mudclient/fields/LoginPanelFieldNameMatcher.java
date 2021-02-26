package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("login_panel")
public class LoginPanelFieldNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassFieldNameMatcher {

    public LoginPanelFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {6}this\\.)(?<fieldName>[a-zA-Z]{2})(?<post> = new com\\.rsc\\.c\\.e\\(this\\.[a-zA-Z]{2}\\(\\), 50\\);\\R" +
            " {6}int var2 = )",
            Pattern.MULTILINE
        );
    }
}
