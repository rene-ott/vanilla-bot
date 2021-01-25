package rscvanilla.hook.updater.core.matcher.classes.mudclient.interceptors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.hook.updater.core.matcher.classes.BaseTests;
import rscvanilla.hook.updater.core.matcher.classes.mudclient.methods.ShowLoginScreenMethodNameMatcher;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class GameCaptchaInterceptorNameMatcherTests extends BaseTests {

    private GameCaptchaInterceptorNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new GameCaptchaInterceptorNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("private void ***b***(com.rsc.f.a var1, int var2, int var3)")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("b"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
