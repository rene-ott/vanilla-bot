package rscvanilla.hooker.core.matcher.classes.mudclient.fields;

import rscvanilla.hooker.annotations.YamlClassMemberKey;
import rscvanilla.hooker.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.hooker.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("npc_list_index")
public class NpcListIndexFieldNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassFieldNameMatcher {

    public NpcListIndexFieldNameMatcher() {
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
