package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class OptionsMenuTextsFieldNameMatcherTests extends BaseTests {

    private OptionsMenuTextsFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new OptionsMenuTextsFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
            .append("      this.pH = 0;").append(lineSeparator)
            .append("      this.***pI*** = new String[20];").append(lineSeparator)
            .append("      this.pM = 1;")
            .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("pI"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
