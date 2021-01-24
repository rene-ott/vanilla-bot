package rscvanilla.hook.updater.core.matcher.classes.mudclient.methods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.hook.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class WalkToAreaMethodNameMatcherTests extends BaseTests {

    private WalkToAreaMethodNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new WalkToAreaMethodNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("   private void ***c***(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("c"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
