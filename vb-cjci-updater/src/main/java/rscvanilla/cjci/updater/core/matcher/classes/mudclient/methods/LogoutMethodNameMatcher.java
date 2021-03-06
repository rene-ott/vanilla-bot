package rscvanilla.cjci.updater.core.matcher.classes.mudclient.methods;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassMethodNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("logout")
public class LogoutMethodNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassMethodNameMatcher {

    public LogoutMethodNameMatcher() {
        pattern = Pattern.compile(
        "(?<pre> {3}private void )(?<fieldName>[a-zA-Z]{1,2})(?<post>\\(\\) \\{\\R" +
        " {6}if \\(this\\.[a-zA-Z]{2} != f\\.[a-zA-Z]{2}\\) \\{)",
        Pattern.MULTILINE
        );
    }
}
