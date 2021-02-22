package rscvanilla.cjci.updater.core.matcher.classes.mudclient.methods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class InitGameScreenVariablesMethodNameMatcherTests extends BaseTests {

    private InitGameScreenVariablesMethodNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new InitGameScreenVariablesMethodNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
            .append("   private void ***dw***() {").append(lineSeparator)
            .append("      this.T.rO = 0;").append(lineSeparator)
            .append("      this.re = 0;")
            .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("dw"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
