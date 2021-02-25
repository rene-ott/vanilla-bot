package rscvanilla.cjci.updater.core.matcher.classes.panel.methods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class SetTextMethodNameMatcherTests extends BaseTests {

    private SetTextMethodNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new SetTextMethodNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readPanelClass();

        var match = new StringBuilder()
            .append("   public final void ***a***(int var1, String var2) {").append(lineSeparator)
            .append("      this.fK[var1] = var2;")
            .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("a"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
