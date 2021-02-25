package rscvanilla.cjci.updater.core.matcher.classes.panel.methods;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.panel.PanelClassMethodNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("set_text")
public class SetTextMethodNameMatcher extends ClassMemberNameBaseMatcher implements PanelClassMethodNameMatcher {

    public SetTextMethodNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre> {3}public final void )(?<fieldName>[a-zA-Z]{1,2})(?<post>\\(int var1, String var2\\) \\{\\R" +
            " {6}this\\.[a-zA-Z]{1,2}\\[var1] = var2;)",
            Pattern.MULTILINE
        );
    }
}
