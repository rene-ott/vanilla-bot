package rscvanilla.cjci.updater.core.matcher.classes.mudclient.methods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class LogoutMethodNameMatcherTests extends BaseTests {

    private LogoutMethodNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new LogoutMethodNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("   private void ***dy***() {").append(lineSeparator)
                .append("      if (this.po != f.rJ) {")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("dy"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
