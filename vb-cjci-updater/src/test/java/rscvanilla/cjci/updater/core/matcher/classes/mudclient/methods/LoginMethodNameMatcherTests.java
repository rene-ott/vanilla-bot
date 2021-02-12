package rscvanilla.cjci.updater.core.matcher.classes.mudclient.methods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class LoginMethodNameMatcherTests extends BaseTests {

    private LoginMethodNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new LoginMethodNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("   private void ***f***(boolean var1) {").append(lineSeparator)
                .append("      this.oK = var1;").append(lineSeparator)
                .append("      if (this.qh > 0) {")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("f"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
