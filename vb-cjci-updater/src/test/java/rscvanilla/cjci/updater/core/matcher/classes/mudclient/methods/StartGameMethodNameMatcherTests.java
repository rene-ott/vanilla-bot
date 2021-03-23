package rscvanilla.cjci.updater.core.matcher.classes.mudclient.methods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class StartGameMethodNameMatcherTests extends BaseTests {

    private StartGameMethodNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new StartGameMethodNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("   protected void ***f***() {").append(lineSeparator)
                .append("      int var1 = 0;")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("f"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
