package rscvanilla.hook.updater.core.matcher.classes.mudclient.fields;

import rscvanilla.hook.model.annotations.YamlClassMemberKey;
import rscvanilla.hook.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.hook.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("fatigue_stat")
public class FatigueStatFieldNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassFieldNameMatcher {

    public FatigueStatFieldNameMatcher() {
        pattern = Pattern.compile(
                "(?<pre> {3}private String [a-zA-Z]{2};\\R" +
                " {3}private int [a-zA-Z]{2};\\R" +
                " {3}private int )(?<fieldName>[a-zA-Z]{2})(?<post>;\\R" +
                " {3}private int [a-zA-Z]{2};\\R" +
                " {3}private boolean [a-zA-Z]{2};)",
            Pattern.MULTILINE
        );
    }
}
