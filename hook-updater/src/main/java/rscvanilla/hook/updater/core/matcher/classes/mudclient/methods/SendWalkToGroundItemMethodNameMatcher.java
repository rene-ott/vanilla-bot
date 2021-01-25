package rscvanilla.hook.updater.core.matcher.classes.mudclient.methods;

import rscvanilla.hook.model.annotations.YamlClassMemberKey;
import rscvanilla.hook.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.hook.updater.core.matcher.classes.mudclient.MudClientClassMethodNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("send_walk_to_ground_item")
public class SendWalkToGroundItemMethodNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassMethodNameMatcher {

    public SendWalkToGroundItemMethodNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}private boolean )(?<fieldName>[a-zA-Z]{1,2})(?<post>\\(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7\\) \\{)",
            Pattern.MULTILINE
        );
    }
}
