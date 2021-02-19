package rscvanilla.cjci.updater.core.matcher.classes.packetbuilderbase.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;
import rscvanilla.cjci.updater.core.matcher.classes.mudclientbase.fields.PacketBuilderFieldNameMatcher;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class BufferedBytesFieldNameMatcherTests extends BaseTests {

    private BufferedBytesFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new BufferedBytesFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readPacketBuilderBase();

        var match = new StringBuilder()
            .append("   public byte[] ***rN***;")
            .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("rN"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
