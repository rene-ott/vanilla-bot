package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("options_menu_texts_count")
public class OptionsMenuTextsCountFieldNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassFieldNameMatcher {

    public OptionsMenuTextsCountFieldNameMatcher() {
        pattern = Pattern.compile(
                "(?<pre> {3}private final int [a-zA-Z]{2} = 30;\\R" +
                " {3}private int )(?<fieldName>[a-zA-Z]{2})(?<post> = 0;\\R" +
                " {3}private final int [a-zA-Z]{2} = 9;)",
            Pattern.MULTILINE
        );
    }
}
