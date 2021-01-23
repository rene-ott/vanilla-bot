package rscvanilla.hook.updater.core.matcher.classes.mudclient.methods;

import rscvanilla.hook.model.annotations.YamlClassMemberKey;
import rscvanilla.hook.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.hook.updater.core.matcher.classes.mudclient.MudClientClassMethodNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("walk_to_area")
public class WalkToAreaMethodNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassMethodNameMatcher {

    public WalkToAreaMethodNameMatcher() {
        pattern = Pattern.compile(
            "xxx",
            Pattern.MULTILINE
        );
    }
}
