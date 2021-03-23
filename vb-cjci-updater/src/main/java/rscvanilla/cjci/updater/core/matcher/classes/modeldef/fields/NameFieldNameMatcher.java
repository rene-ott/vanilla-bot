package rscvanilla.cjci.updater.core.matcher.classes.modeldef.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.modeldef.ModelDefClassFieldNameMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("name")
public class NameFieldNameMatcher extends ClassMemberNameBaseMatcher implements ModelDefClassFieldNameMatcher {

    public NameFieldNameMatcher() {
        pattern = Pattern.compile(
                "(?<pre>public abstract class d \\{\\R" +
                        " {3}public String )(?<fieldName>[a-zA-Z]{2})(?<post>;\\R" +
                        " {3}public String [a-zA-Z]{2};\\R" +
                        " {3}public int [a-zA-Z]{2};)",
                Pattern.MULTILINE
        );
    }
}
