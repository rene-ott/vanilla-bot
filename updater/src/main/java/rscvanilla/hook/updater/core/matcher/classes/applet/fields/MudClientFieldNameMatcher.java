package rscvanilla.hook.updater.core.matcher.classes.applet.fields;

import rscvanilla.hook.model.annotations.YamlClassMemberKey;
import rscvanilla.hook.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.hook.updater.core.matcher.classes.applet.AppletClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("mud_client")
public class MudClientFieldNameMatcher extends ClassMemberNameBaseMatcher implements AppletClassFieldNameMatcher {

    public MudClientFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre>) {3}d (?<fieldName>[a-zA-Z]{2});\\R" +
            " {3}private c [a-zA-Z]{2};" +
            " {3}private a [a-zA-Z]{2};" +
            " {3}private Graphics [a-zA-Z]{2};",
            Pattern.MULTILINE
        );
    }
}
