package rscvanilla.cjci.updater.core.matcher.classes.mudclient.methods;

import rscvanilla.cjci.model.annotations.YamlClassMemberKey;
import rscvanilla.cjci.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.MudClientClassMethodNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("intercepted_show_game_message")
public class InterceptedShowGameMessageMethodNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassMethodNameMatcher {

    public InterceptedShowGameMessageMethodNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre>public final void )(?<fieldName>[a-zA-Z])(?<post>\\(h var1, String var2, String var3, String var4, String var5, int var6\\))",
            Pattern.MULTILINE
        );
    }
}
