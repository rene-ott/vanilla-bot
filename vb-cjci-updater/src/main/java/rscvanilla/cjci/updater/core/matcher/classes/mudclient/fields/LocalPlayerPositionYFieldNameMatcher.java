package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("local_player_position_y")
public class LocalPlayerPositionYFieldNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassFieldNameMatcher {

    public LocalPlayerPositionYFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}public com\\.rsc\\.b\\.e [a-zA-Z]{2};\\R" +
            " {3}public int [a-zA-Z]{2};\\R" +
            " {3}public int )(?<fieldName>[a-zA-Z]{2})(?<post>;\\R" +
            " {3}public boolean [a-zA-Z]{2};)",
            Pattern.MULTILINE
        );
    }
}
