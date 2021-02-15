package rscvanilla.cjci.updater.core.matcher.classes.packetbuilder.methods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;
import rscvanilla.cjci.updater.core.matcher.classes.mudclient.methods.LoginMethodNameMatcher;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class SetOpCodeMethodNameMatcherTests extends BaseTests {

    private SetOpCodeMethodNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new SetOpCodeMethodNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readPacketBuilder();

        var match = new StringBuilder()
                .append("   public void ***aO***(int var1) {").append(lineSeparator)
                .append("      if (this.se) {").append(lineSeparator)
                .append("         throw new IllegalStateException(\"Another packet construction in process!\");")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("aO"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
