package rscvanilla.hooker.matchers.fields.applet;

import rscvanilla.hooker.matchers.FieldMatcherBase;

import java.util.regex.Pattern;

public class MudClientFieldMatcher extends FieldMatcherBase implements AppletClassFieldMatcher {

    public MudClientFieldMatcher() {
        pattern = Pattern.compile(
            "(?<pre>) {3}d (?<fieldName>[a-zA-Z]{2});\\R" +
            " {3}private c [a-zA-Z]{2};" +
            " {3}private a [a-zA-Z]{2};" +
            " {3}private Graphics [a-zA-Z]{2};",
            Pattern.MULTILINE
        );
    }
}
