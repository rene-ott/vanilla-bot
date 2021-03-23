package rscvanilla.cjci.updater.core.matcher.classes.mudclient.methods;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassMethodNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("start_game")
public class StartGameMethodNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassMethodNameMatcher {

    public StartGameMethodNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}protected void )(?<fieldName>[a-zA-Z])(?<post>\\(\\) \\{\\R" +
            " {6}int var1 = 0;)",
            Pattern.MULTILINE
        );
    }
}
