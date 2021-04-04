package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("login_panel_password_control_id")
public class LoginPanelPasswordControlIdFieldNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassFieldNameMatcher {

    public LoginPanelPasswordControlIdFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {12}this\\.[a-zA-Z]{2} = 2;\\R" +
            " {12}this\\.[a-zA-Z]{2} = this\\.[a-zA-Z]{2}\\.[a-zA-Z]{1,2}\\(this\\.[a-zA-Z]{2}\\);\\R" +
            " {12}this\\.[a-zA-Z]{2} = this\\.[a-zA-Z]{2}\\.[a-zA-Z]{1,2}\\(this\\.)(?<fieldName>[a-zA-Z]{2})(?<post>\\);)",
            Pattern.MULTILINE
        );
    }
}
