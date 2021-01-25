package rscvanilla.hook.updater.core.matcher.classes.mudclient.fields;

import rscvanilla.hook.model.annotations.YamlClassMemberKey;
import rscvanilla.hook.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.hook.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("player_list")
public class PlayerListFieldNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassFieldNameMatcher {

    public PlayerListFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}private final k\\[] [a-zA-Z]{2} = new k\\[256];\\R" +
            " {3}private final k\\[] )(?<fieldName>[a-zA-Z]{2})(?<post> = new k\\[256];\\R" +
            " {3}private final k\\[] [a-zA-Z]{2} = new k\\[2000];)",
            Pattern.MULTILINE
        );
    }
}
