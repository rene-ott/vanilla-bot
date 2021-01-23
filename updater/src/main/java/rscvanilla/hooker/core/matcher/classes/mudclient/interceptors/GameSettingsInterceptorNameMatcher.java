package rscvanilla.hooker.core.matcher.classes.mudclient.interceptors;

import rscvanilla.hooker.annotations.YamlClassMemberKey;
import rscvanilla.hooker.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.hooker.core.matcher.classes.mudclient.MudClientClassInterceptorNameMatcher;
import rscvanilla.hooker.core.matcher.classes.mudclient.MudClientClassMethodNameMatcher;

import java.util.regex.Pattern;

@YamlClassMemberKey("game_settings")
public class GameSettingsInterceptorNameMatcher extends ClassMemberNameBaseMatcher implements MudClientClassInterceptorNameMatcher {

    public GameSettingsInterceptorNameMatcher() {
        pattern = Pattern.compile(
            "xxx",
            Pattern.MULTILINE
        );
    }
}
