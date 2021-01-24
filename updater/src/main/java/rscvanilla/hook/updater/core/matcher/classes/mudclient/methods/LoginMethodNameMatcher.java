package rscvanilla.hook.updater.core.matcher.classes.mudclient.methods;

import rscvanilla.hook.model.annotations.YamlClassMemberKey;
import rscvanilla.hook.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.hook.updater.core.matcher.classes.mudclient.MudClientClassMethodNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("login")
public class LoginMethodNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassMethodNameMatcher {

    public LoginMethodNameMatcher() {
        pattern = Pattern.compile(
        "(?<pre> {3}private void )(?<fieldName>[a-zA-Z]{1,2})(?<post>\\(boolean var1\\) \\{\\R" +
        " {6}this\\.[a-zA-Z]{2} = var1;\\R" +
        " {6}if \\(this\\.[a-zA-Z]{2} > 0\\) \\{)",
        Pattern.MULTILINE
        );
    }
}
