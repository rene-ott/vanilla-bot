package rscvanilla.cjci.updater.core.matcher.classes.mudclientbase.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class PacketBuilderFieldNameMatcherTests extends BaseTests {

    private PacketBuilderFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new PacketBuilderFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClientBase();

        var match = new StringBuilder()
            .append("   protected final com.rsc.f.e ***T*** = new com.rsc.f.e(5000);")
            .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("T"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
