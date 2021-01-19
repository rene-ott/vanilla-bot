package hooker.matchers.mudclient;

import hooker.matchers.BaseFieldMatcher;

import java.util.regex.Pattern;

public class NpcListFieldMatcher extends BaseFieldMatcher implements MudClientClassFieldMatcher {

    public NpcListFieldMatcher() {
        pattern = Pattern.compile(
            " {3}private final j\\[] [a-zA-Z]{2} = new j\\[500];\\R" +
            " {3}private final j\\[] (?<fieldName>[a-zA-Z]{2}) = new j\\[500];",
            Pattern.MULTILINE
        );
    }
}
