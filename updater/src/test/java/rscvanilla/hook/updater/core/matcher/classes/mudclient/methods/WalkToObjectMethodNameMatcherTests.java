package rscvanilla.hook.updater.core.matcher.classes.mudclient.methods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.hook.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class WalkToObjectMethodNameMatcherTests extends BaseTests {

    private WalkToObjectMethodNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new WalkToObjectMethodNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("   private void ***x***(int var1, int var2, int var3, int var4) {").append(lineSeparator)
                .append("      int var5;")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("x"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
