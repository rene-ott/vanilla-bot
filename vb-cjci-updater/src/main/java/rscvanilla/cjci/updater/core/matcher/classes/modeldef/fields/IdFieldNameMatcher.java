package rscvanilla.cjci.updater.core.matcher.classes.modeldef.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.modeldef.ModelDefClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("id")
public class IdFieldNameMatcher extends ClassMemberNameBaseMatcher implements ModelDefClassFieldNameMatcher {

    public IdFieldNameMatcher() {
        pattern = Pattern.compile(
                "(?<pre>public abstract class d \\{\\R" +
                        " {3}public String [a-zA-Z]{2};\\R" +
                        " {3}public String [a-zA-Z]{2};\\R" +
                        " {3}public int )(?<fieldName>[a-zA-Z]{2})(?<post>;)",
                Pattern.MULTILINE
        );
    }
}
