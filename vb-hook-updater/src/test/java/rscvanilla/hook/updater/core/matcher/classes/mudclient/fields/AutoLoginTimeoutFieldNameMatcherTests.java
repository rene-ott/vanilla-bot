package rscvanilla.hook.updater.core.matcher.classes.mudclient.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.hook.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class AutoLoginTimeoutFieldNameMatcherTests extends BaseTests {

    private AutoLoginTimeoutFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new AutoLoginTimeoutFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("      this.oR = -1;").append(lineSeparator)
                .append("      this.oS = 1;").append(lineSeparator)
                .append("      this.oT = 0;").append(lineSeparator)
                .append("      this.***oU*** = 0;").append(lineSeparator)
                .append("      this.oV = 0;")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("oU"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
