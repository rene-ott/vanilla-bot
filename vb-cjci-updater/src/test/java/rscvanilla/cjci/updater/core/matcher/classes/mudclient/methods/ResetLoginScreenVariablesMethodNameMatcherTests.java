package rscvanilla.cjci.updater.core.matcher.classes.mudclient.methods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class ResetLoginScreenVariablesMethodNameMatcherTests extends BaseTests {

    private ResetLoginScreenVariablesMethodNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new ResetLoginScreenVariablesMethodNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();
        var match = new StringBuilder()
            .append("   private void ***ds***() {").append(lineSeparator)
            .append("      this.pH = 0;").append(lineSeparator)
            .append("      this.qf = 0;").append(lineSeparator)
            .append("      this.po = f.rJ;")

            .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("ds"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
