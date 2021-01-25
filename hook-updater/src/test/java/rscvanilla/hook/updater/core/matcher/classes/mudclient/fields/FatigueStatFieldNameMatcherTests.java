package rscvanilla.hook.updater.core.matcher.classes.mudclient.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.hook.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class FatigueStatFieldNameMatcherTests extends BaseTests {

    private FatigueStatFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new FatigueStatFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("   private String rb;").append(lineSeparator)
                .append("   private int rc;").append(lineSeparator)
                .append("   private int ***rd***;").append(lineSeparator)
                .append("   private int re;").append(lineSeparator)
                .append("   private boolean rf;")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("rd"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
