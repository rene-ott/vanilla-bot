package hooker.matchers.mudclient;

import hooker.matchers.BaseFieldMatcher;

import java.util.regex.Pattern;

public class NpcListIndexFieldMatcher extends BaseFieldMatcher implements MudClientClassFieldMatcher {

    public NpcListIndexFieldMatcher() {
        pattern = Pattern.compile(
            " {3}private com\\.rsc\\.b\\.c [a-zA-Z]{2};\\R" +
            " {3}private int [a-zA-Z]{2};\\R" +
            " {3}private final int\\[] [a-zA-Z]{2};\\R" +
            " {3}private final int\\[] [a-zA-Z]{2};\\R" +
            " {3}private int (?<fieldName>[a-zA-Z]{2});",
            Pattern.MULTILINE
        );
    }
}
