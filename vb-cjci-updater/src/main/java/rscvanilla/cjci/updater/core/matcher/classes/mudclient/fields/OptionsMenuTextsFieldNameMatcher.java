package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("options_menu_texts")
public class OptionsMenuTextsFieldNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassFieldNameMatcher {

    public OptionsMenuTextsFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {6}this\\.[a-zA-Z]{2} = 0;\\R" +
            " {6}this\\.)(?<fieldName>[a-zA-Z]{2})(?<post> = new String\\[20];\\R" +
            " {6}this\\.[a-zA-Z]{2} = 1;)",
            Pattern.MULTILINE
        );
    }
}
