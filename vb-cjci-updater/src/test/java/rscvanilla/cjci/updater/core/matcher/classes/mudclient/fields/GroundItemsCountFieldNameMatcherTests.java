package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class GroundItemsCountFieldNameMatcherTests extends BaseTests {

    private GroundItemsCountFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new GroundItemsCountFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();
        var match = new StringBuilder()
                .append("   private int pr;").append(lineSeparator)
                .append("   private int ***ps***;").append(lineSeparator)
                .append("   private com.rsc.b.b pt;")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("ps"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
