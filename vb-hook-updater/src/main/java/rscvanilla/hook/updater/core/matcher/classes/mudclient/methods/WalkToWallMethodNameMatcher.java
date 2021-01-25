package rscvanilla.hook.updater.core.matcher.classes.mudclient.methods;

import rscvanilla.hook.model.annotations.YamlClassMemberKey;
import rscvanilla.hook.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.hook.updater.core.matcher.classes.mudclient.MudClientClassMethodNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("walk_to_wall")
public class WalkToWallMethodNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassMethodNameMatcher {

    public WalkToWallMethodNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}private void )(?<fieldName>[a-zA-Z])(?<post>\\(int var1, int var2, int var3\\) \\{\\R" +
            " {6}if \\(var3 == 0\\) \\{)",
            Pattern.MULTILINE
        );
    }
}
