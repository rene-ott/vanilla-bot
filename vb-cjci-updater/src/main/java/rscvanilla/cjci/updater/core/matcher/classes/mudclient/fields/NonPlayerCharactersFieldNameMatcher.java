package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("non_player_characters")
public class NonPlayerCharactersFieldNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassFieldNameMatcher {

    public NonPlayerCharactersFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}private final j\\[] [a-zA-Z]{2} = new j\\[500];\\R" +
            " {3}private final j\\[] )(?<fieldName>[a-zA-Z]{2})(?<post> = new j\\[500];)",
            Pattern.MULTILINE
        );
    }
}
