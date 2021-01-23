package rscvanilla.hook.updater.core.matcher.classes.mudclient.interceptors;

import rscvanilla.hook.model.annotations.YamlClassMemberKey;
import rscvanilla.hook.updater.core.matcher.ClassMemberNameBaseMatcher;
import rscvanilla.hook.updater.core.matcher.classes.mudclient.MudClientClassInterceptorNameMatcher;

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
