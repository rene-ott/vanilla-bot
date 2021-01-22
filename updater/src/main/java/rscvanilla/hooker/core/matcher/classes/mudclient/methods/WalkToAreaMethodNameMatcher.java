package rscvanilla.hooker.core.matcher.classes.mudclient.methods;

import rscvanilla.hooker.annotations.YamlClassMemberKey;
import rscvanilla.hooker.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.hooker.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;
import rscvanilla.hooker.core.matcher.classes.mudclient.MudClientClassMethodNameMatcher;

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
