package rscvanilla.cjci.updater.core.matcher.classes.mudclient.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.cjci.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class SelectedSpellFieldNameMatcherTests extends BaseTests {

    private SelectedSpellFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new SelectedSpellFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("      this.qM = 0;").append(lineSeparator)
                .append("      this.qN = -1;").append(lineSeparator)
                .append("      this.***qO*** = -1;").append(lineSeparator)
                .append("      this.qP = \"\";").append(lineSeparator)
                .append("      this.qQ = false;")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("qO"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
