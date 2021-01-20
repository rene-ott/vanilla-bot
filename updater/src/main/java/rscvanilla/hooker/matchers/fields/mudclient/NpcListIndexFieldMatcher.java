package rscvanilla.hooker.matchers.fields.mudclient;

import rscvanilla.hooker.matchers.FieldMatcherBase;

import java.util.regex.Pattern;

public class NpcListIndexFieldMatcher extends FieldMatcherBase implements MudClientClassFieldMatcher {

    public NpcListIndexFieldMatcher() {
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
