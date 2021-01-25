package rscvanilla.hook.updater.core.matcher.classes.mudclient.methods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.hook.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class ShowLoginScreenMethodNameMatcherTests extends BaseTests {

    private ShowLoginScreenMethodNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new ShowLoginScreenMethodNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("   private void ***cT***() {").append(lineSeparator)
                .append("      int var1 = 65;").append(lineSeparator)
                .append("      if (this.rn > 0) {")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("cT"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
