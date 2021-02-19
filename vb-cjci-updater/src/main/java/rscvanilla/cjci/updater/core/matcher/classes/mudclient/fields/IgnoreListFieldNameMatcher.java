package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("ignore_list")
public class IgnoreListFieldNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassFieldNameMatcher {

    public IgnoreListFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}private final String\\[] [a-zA-Z]{2} = new String\\[500];\\R" +
            " {3}private final String\\[] )(?<fieldName>[a-zA-Z]{2})(?<post> = new String\\[100];\\R" +
            " {3}private final int\\[] [a-zA-Z]{2} = new int\\[500];)",
            Pattern.MULTILINE
        );
    }
}
