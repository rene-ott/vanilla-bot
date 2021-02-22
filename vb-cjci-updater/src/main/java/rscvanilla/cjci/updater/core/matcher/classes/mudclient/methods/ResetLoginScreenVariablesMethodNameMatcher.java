package rscvanilla.cjci.updater.core.matcher.classes.mudclient.methods;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassMethodNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("reset_login_screen_variables")
public class ResetLoginScreenVariablesMethodNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassMethodNameMatcher {

    public ResetLoginScreenVariablesMethodNameMatcher() {
        pattern = Pattern.compile(
        "(?<pre> {3}private void )(?<fieldName>[a-zA-Z]{1,2})(?<post>\\(\\) \\{\\R" +
        " {6}this\\.[a-zA-Z]{2} = 0;\\R" +
        " {6}this\\.[a-zA-Z]{2} = 0;\\R" +
        " {6}this\\.[a-zA-Z]{2} = f\\.[a-zA-Z]{2};)",
        Pattern.MULTILINE
        );
    }
}
