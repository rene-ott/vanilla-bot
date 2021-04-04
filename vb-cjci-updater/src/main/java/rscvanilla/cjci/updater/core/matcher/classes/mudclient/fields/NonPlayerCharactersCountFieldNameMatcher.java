package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("non_player_characters_count")
public class NonPlayerCharactersCountFieldNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassFieldNameMatcher {

    public NonPlayerCharactersCountFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}private com\\.rsc\\.b\\.c [a-zA-Z]{2};\\R" +
            " {3}private int [a-zA-Z]{2};\\R" +
            " {3}private final int\\[] [a-zA-Z]{2};\\R" +
            " {3}private final int\\[] [a-zA-Z]{2};\\R" +
            " {3}private int )(?<fieldName>[a-zA-Z]{2})(?<post>;)",
            Pattern.MULTILINE
        );
    }
}
