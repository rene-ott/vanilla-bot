package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("player_characters")
public class PlayerCharactersFieldNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassFieldNameMatcher {

    public PlayerCharactersFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}private final k\\[] [a-zA-Z]{2} = new k\\[256];\\R" +
            " {3}private final k\\[] )(?<fieldName>[a-zA-Z]{2})(?<post> = new k\\[256];\\R" +
            " {3}private final k\\[] [a-zA-Z]{2} = new k\\[2000];)",
            Pattern.MULTILINE
        );
    }
}
