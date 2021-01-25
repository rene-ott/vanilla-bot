package rscvanilla.hook.updater.core.matcher.classes.mudclient.interceptors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.hook.updater.core.matcher.classes.BaseTests;
import rscvanilla.hook.updater.core.matcher.classes.mudclient.methods.ShowLoginScreenMethodNameMatcher;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class GameMessageInterceptorNameMatcherTests extends BaseTests {

    private GameMessageInterceptorNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new GameMessageInterceptorNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("public final void ***a***(h var1, String var2, String var3, String var4, String var5, int var6)")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("a"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
