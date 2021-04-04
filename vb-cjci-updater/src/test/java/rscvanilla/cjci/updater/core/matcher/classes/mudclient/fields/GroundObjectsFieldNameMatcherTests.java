package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class GroundObjectsFieldNameMatcherTests extends BaseTests {

    private GroundObjectsFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new GroundObjectsFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("   private g[] oB;").append(lineSeparator)
                .append("   private com.rsc.e.e[] ***oC***;").append(lineSeparator)
                .append("   private m[] oD;")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("oC"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
