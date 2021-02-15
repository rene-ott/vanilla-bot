package rscvanilla.cjci.updater.core.matcher.classes.packetbuilderbase.methods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class PutShortMethodNameMatcherTests extends BaseTests {

    private PutShortMethodNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new PutShortMethodNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readPacketBuilderBase();

        var match = new StringBuilder()
            .append("   public final void ***aL***(int var1) {").append(lineSeparator)
            .append("      this.rN[this.rO++] = (byte)(var1 >> 8);")
            .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("aL"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
