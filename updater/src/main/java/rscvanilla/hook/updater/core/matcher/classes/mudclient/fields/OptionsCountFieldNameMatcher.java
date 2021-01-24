package rscvanilla.hook.updater.core.matcher.classes.mudclient.fields;

import rscvanilla.hook.model.annotations.YamlClassMemberKey;
import rscvanilla.hook.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.hook.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("options_count")
public class OptionsCountFieldNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassFieldNameMatcher {

    public OptionsCountFieldNameMatcher() {
        pattern = Pattern.compile(
                "(?<pre> {3}private final int [a-zA-Z]{2} = 30;\\R" +
                " {3}private int )(?<fieldName>[a-zA-Z]{2})(?<post> = 0;\\R" +
                " {3}private final int [a-zA-Z]{2} = 9;)",
            Pattern.MULTILINE
        );
    }
}
