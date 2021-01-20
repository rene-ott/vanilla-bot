package rscvanilla.hooker.matchers.mudclient;

import rscvanilla.hooker.matchers.FieldMatcherBase;

import java.util.regex.Pattern;

public class NpcListFieldMatcher extends FieldMatcherBase implements MudClientClassFieldMatcher {

    public NpcListFieldMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}private final j\\[] [a-zA-Z]{2} = new j\\[500];\\R" +
            " {3}private final j\\[] )(?<fieldName>[a-zA-Z]{2})(?<post> = new j\\[500];)",
            Pattern.MULTILINE
        );
    }
}
