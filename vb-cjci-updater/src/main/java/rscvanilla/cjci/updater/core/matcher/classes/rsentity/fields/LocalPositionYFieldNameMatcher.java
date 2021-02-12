package rscvanilla.cjci.updater.core.matcher.classes.rsentity.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.classes.rsentity.RSEntityClassFieldNameMatcher;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("local_position_y")
public class LocalPositionYFieldNameMatcher extends ClassMemberNameBaseMatcher implements RSEntityClassFieldNameMatcher {

    public LocalPositionYFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre>public abstract class d \\{\\R" +
            " {3}protected int [a-zA-Z]{2};\\R" +
            " {3}protected int [a-zA-Z]{2};\\R" +
            " {3}protected int [a-zA-Z]{2};\\R" +
            " {3}protected int [a-zA-Z]{2};\\R" +
            " {3}protected int )(?<fieldName>[a-zA-Z]{2})(?<post>;\\R" +
            " {3}protected int [a-zA-Z]{2};\\R" +
            " {3}protected int [a-zA-Z]{2};\\R" +
            " {3}private boolean [a-zA-Z]{2};\\R)",
            Pattern.MULTILINE
        );
    }
}
