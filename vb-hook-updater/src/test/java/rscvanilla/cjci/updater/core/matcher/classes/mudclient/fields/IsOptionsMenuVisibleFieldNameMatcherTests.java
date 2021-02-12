package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class IsOptionsMenuVisibleFieldNameMatcherTests extends BaseTests {

    private IsOptionsMenuVisibleFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new IsOptionsMenuVisibleFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("   private boolean qW;").append(lineSeparator)
                .append("   private boolean qX;").append(lineSeparator)
                .append("   private boolean ***qY***;").append(lineSeparator)
                .append("   public int qZ;").append(lineSeparator)
                .append("   private int ra;").append(lineSeparator)
                .append("   private String rb;")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("qY"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
