package rscvanilla.hook.updater.core.matcher.classes.mudclient.fields;

import rscvanilla.hook.model.annotations.YamlClassMemberKey;
import rscvanilla.hook.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.hook.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("player_position_y")
public class PlayerPositionYFieldNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassFieldNameMatcher {

    public PlayerPositionYFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}public com\\.rsc\\.b\\.e [a-zA-Z]{2};\\R" +
            " {3}public int [a-zA-Z]{2};\\R" +
            " {3}public int )(?<fieldName>[a-zA-Z]{2})(?<post>;\\R" +
            " {3}public boolean [a-zA-Z]{2};)",
            Pattern.MULTILINE
        );
    }
}
