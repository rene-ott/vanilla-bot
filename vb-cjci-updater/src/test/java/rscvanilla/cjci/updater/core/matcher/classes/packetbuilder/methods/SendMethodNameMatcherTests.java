package rscvanilla.cjci.updater.core.matcher.classes.packetbuilder.methods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class SendMethodNameMatcherTests extends BaseTests {

    private SendMethodNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new SendMethodNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readPacketBuilder();

        var match = new StringBuilder()
                .append("   public final void ***dW***() {").append(lineSeparator)
                .append("      if (!this.se) {").append(lineSeparator)
                .append("         throw new IllegalStateException(\"packet construction not in process!\");")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("dW"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
