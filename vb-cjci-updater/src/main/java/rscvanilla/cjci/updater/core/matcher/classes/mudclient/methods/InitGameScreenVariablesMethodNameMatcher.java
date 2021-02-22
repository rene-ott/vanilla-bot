package rscvanilla.cjci.updater.core.matcher.classes.mudclient.methods;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassMethodNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("init_game_screen_variables")
public class InitGameScreenVariablesMethodNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassMethodNameMatcher {

    public InitGameScreenVariablesMethodNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}private void )(?<fieldName>[a-zA-Z]{1,2})(?<post>\\(\\) \\{\\R" +
            " {6}this\\.T\\.[a-zA-Z]{2} = 0;\\R" +
            " {6}this\\.[a-zA-Z]{2} = 0;)",
            Pattern.MULTILINE
        );
    }
}
