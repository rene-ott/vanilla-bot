package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class MouseButtonClickFieldNameMatcherTests extends BaseTests {

    private MouseButtonClickFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new MouseButtonClickFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("      this.m = 0;").append(lineSeparator)
                .append("      this.z = 0;").append(lineSeparator)
                .append("      this.***s*** = 0;").append(lineSeparator)
                .append("      this.pB = false;").append(lineSeparator)
                .append("      this.n(false);")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("s"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
