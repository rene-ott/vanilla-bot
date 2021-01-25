package rscvanilla.hook.updater.core.matcher.classes.mudclient.interceptors;

import rscvanilla.hook.model.annotations.YamlClassMemberKey;
import rscvanilla.hook.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.hook.updater.core.matcher.classes.mudclient.MudClientClassInterceptorNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("game_message")
public class GameMessageInterceptorNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassInterceptorNameMatcher {

    public GameMessageInterceptorNameMatcher() {
        pattern = Pattern.compile(
            "(?<pre>public final void )(?<fieldName>[a-zA-Z])(?<post>\\(h var1, String var2, String var3, String var4, String var5, int var6\\))",
            Pattern.MULTILINE
        );
    }
}
