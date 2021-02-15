package rscvanilla.cjci.updater.core.matcher.classes.packetbuilderbase.methods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class PutStringMethodNameMatcherTests extends BaseTests {

    private PutStringMethodNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new PutStringMethodNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readPacketBuilderBase();

        var match = new StringBuilder()
            .append("   public final void ***q***(String var1) {").append(lineSeparator)
            .append("      byte[] var2 = var1.getBytes();")
            .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("q"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
