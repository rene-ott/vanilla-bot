package rscvanilla.hook.updater.core.matcher.classes.mudclient.methods;

import rscvanilla.hook.model.annotations.YamlClassMemberKey;
import rscvanilla.hook.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.hook.updater.core.matcher.classes.mudclient.MudClientClassMethodNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("walk_to_object")
public class WalkToObjectMethodNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassMethodNameMatcher {

    public WalkToObjectMethodNameMatcher() {
        pattern = Pattern.compile(
        "(?<pre> {3}private void )(?<fieldName>[a-zA-Z])(?<post>\\(int var1, int var2, int var3, int var4\\) \\{\\R" +
        " {6}int var5;)",
        Pattern.MULTILINE
        );
    }
}
