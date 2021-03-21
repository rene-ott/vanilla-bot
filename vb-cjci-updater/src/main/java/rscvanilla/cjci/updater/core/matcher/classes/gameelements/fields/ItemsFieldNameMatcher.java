package rscvanilla.cjci.updater.core.matcher.classes.gameelements.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.applet.AppletClassFieldNameMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.gameelements.GameElementsClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("items")
public class ItemsFieldNameMatcher extends ClassMemberNameBaseMatcher implements GameElementsClassFieldNameMatcher {

    public ItemsFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre>public class a \\{\\R" +
            " {3}public static final ArrayList [a-zA-Z]{2} = new ArrayList\\(\\);\\R" +
            " {3}private static final ArrayList )(?<fieldName>[a-zA-Z]{2})(?<post> = new ArrayList\\(\\);)",
            Pattern.MULTILINE
        );
    }
}
