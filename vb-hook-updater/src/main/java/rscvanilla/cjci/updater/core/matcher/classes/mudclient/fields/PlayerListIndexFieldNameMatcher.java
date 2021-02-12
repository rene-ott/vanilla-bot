package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("player_list_index")
public class PlayerListIndexFieldNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassFieldNameMatcher {

    public PlayerListIndexFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {6}this\\.[a-zA-Z]{2} = false;\\R" +
            " {6}this\\.[a-zA-Z]{2} = false;\\R" +
            " {6}this\\.)(?<fieldName>[a-zA-Z]{2})(?<post> = 0;\\R" +
            " {6}this\\.[a-zA-Z]{2} = -1;)",
            Pattern.MULTILINE
        );
    }
}
