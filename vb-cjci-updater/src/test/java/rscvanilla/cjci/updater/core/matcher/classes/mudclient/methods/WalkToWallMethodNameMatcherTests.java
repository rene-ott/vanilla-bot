package rscvanilla.cjci.updater.core.matcher.classes.mudclient.methods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class WalkToWallMethodNameMatcherTests extends BaseTests {

    private WalkToWallMethodNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new WalkToWallMethodNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("   private void ***w***(int var1, int var2, int var3) {").append(lineSeparator)
                .append("      if (var3 == 0) {")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("w"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
