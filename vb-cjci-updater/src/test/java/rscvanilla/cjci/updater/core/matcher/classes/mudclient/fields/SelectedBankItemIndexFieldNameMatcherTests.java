package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class SelectedBankItemIndexFieldNameMatcherTests extends BaseTests {

    private SelectedBankItemIndexFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new SelectedBankItemIndexFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
            .append("      this.oP = 0;").append(lineSeparator)
            .append("      this.oQ = -2;").append(lineSeparator)
            .append("      this.***oR*** = -1;").append(lineSeparator)
            .append("      this.oS = 1;").append(lineSeparator)
            .append("      this.oT = 0;")
            .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("oR"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
