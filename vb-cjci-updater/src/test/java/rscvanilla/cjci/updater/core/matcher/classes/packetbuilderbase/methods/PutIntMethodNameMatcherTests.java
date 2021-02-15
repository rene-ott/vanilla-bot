package rscvanilla.cjci.updater.core.matcher.classes.packetbuilderbase.methods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class PutIntMethodNameMatcherTests extends BaseTests {

    private PutIntMethodNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new PutIntMethodNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readPacketBuilderBase();

        var match = new StringBuilder()
            .append("   public final void ***aN***(int var1) {").append(lineSeparator)
            .append("      this.rN[this.rO++] = (byte)(var1 >> 24);")
            .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("aN"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
