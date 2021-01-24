package rscvanilla.hook.updater.core.matcher.classes.mudclient.fields;

import rscvanilla.hook.model.annotations.YamlClassMemberKey;
import rscvanilla.hook.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.hook.updater.core.matcher.classes.mudclient.MudClientClassFieldNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("mouse_button_click")
public class MouseButtonClickFieldNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassFieldNameMatcher {

    public MouseButtonClickFieldNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {6}this\\.[a-zA-Z] = 0;\\R" +
            " {6}this\\.[a-zA-Z] = 0;\\R" +
            " {6}this\\.)(?<fieldName>[a-zA-Z])(?<post> = 0;\\R" +
            " {6}this\\.[a-zA-Z]{2} = false;\\R" +
            " {6}this\\.[a-zA-Z]\\(false\\);)",
            Pattern.MULTILINE
        );
    }
}
