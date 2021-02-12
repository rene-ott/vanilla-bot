package rscvanilla.cjci.updater.core.matcher.classes.applet.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class MudClientFieldNameMatcherTests extends BaseTests {

    private MudClientFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new MudClientFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassApplet();

        var match = new StringBuilder()
                .append("   d ***aD***;").append(lineSeparator)
                .append("   private c aE;").append(lineSeparator)
                .append("   private a aF;").append(lineSeparator)
                .append("   private Graphics aG;")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("aD"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
