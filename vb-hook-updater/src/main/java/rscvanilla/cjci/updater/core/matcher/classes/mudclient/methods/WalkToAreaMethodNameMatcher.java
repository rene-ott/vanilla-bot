package rscvanilla.cjci.updater.core.matcher.classes.mudclient.methods;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassMethodNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("walk_to_area")
public class WalkToAreaMethodNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassMethodNameMatcher {

    public WalkToAreaMethodNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}private void )(?<fieldName>[a-zA-Z]{1,2})(?<post>\\(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8\\) \\{)",
            Pattern.MULTILINE
        );
    }
}
