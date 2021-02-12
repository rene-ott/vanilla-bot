package rscvanilla.cjci.updater.core.matcher.classes.mudclient.methods;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassMethodNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("show_login_screen")
public class ShowLoginScreenMethodNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassMethodNameMatcher {

    public ShowLoginScreenMethodNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}private void )(?<fieldName>[a-zA-Z]{2})(?<post>\\(\\) \\{\\R" +
            " {6}int var1 = 65;\\R" +
            " {6}if \\(this\\.[a-zA-Z]{2} > 0\\) \\{)",
            Pattern.MULTILINE
        );
    }
}
