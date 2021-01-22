package rscvanilla.hooker.core.matcher.classes.mudclient.fields;

import rscvanilla.hooker.annotations.YamlClassMemberKey;
import rscvanilla.hooker.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.hooker.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("npc_list")
public class NpcListFieldNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassFieldNameMatcher {

    public NpcListFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}private final j\\[] [a-zA-Z]{2} = new j\\[500];\\R" +
            " {3}private final j\\[] )(?<fieldName>[a-zA-Z]{2})(?<post> = new j\\[500];)",
            Pattern.MULTILINE
        );
    }
}
