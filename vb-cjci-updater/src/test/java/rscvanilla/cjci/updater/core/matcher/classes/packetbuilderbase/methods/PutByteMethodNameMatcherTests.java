package rscvanilla.cjci.updater.core.matcher.classes.packetbuilderbase.methods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class PutByteMethodNameMatcherTests extends BaseTests {

    private PutByteMethodNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new PutByteMethodNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readPacketBuilderBase();

        var match = new StringBuilder()
            .append("   public final void ***aK***(int var1) {").append(lineSeparator)
            .append("      this.rN[this.rO++] = (byte)var1;")
            .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("aK"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
