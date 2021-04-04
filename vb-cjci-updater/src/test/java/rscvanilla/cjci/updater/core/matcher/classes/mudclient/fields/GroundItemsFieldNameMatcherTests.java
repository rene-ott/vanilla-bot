package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class GroundItemsFieldNameMatcherTests extends BaseTests {

    private GroundItemsFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new GroundItemsFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("   private m[] oD;").append(lineSeparator)
                .append("   private com.rsc.e.f[] ***oE***;").append(lineSeparator)
                .append("   private com.rsc.d.b.d oF;")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("oE"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
