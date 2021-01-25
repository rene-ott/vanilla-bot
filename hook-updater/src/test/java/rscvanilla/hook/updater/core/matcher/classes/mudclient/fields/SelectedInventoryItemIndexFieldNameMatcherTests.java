package rscvanilla.hook.updater.core.matcher.classes.mudclient.fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rscvanilla.hook.updater.core.matcher.classes.BaseTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class SelectedInventoryItemIndexFieldNameMatcherTests extends BaseTests {

    private SelectedInventoryItemIndexFieldNameMatcher matcher;

    @BeforeEach
    public void setMatcher() {
        matcher = new SelectedInventoryItemIndexFieldNameMatcher();
    }

    @Test
    public void testMatchField() {
        var mudClient = readClassMudClient();

        var match = new StringBuilder()
                .append("      this.qM = 0;").append(lineSeparator)
                .append("      this.***qN*** = -1;").append(lineSeparator)
                .append("      this.qO = -1;").append(lineSeparator)
                .append("      this.qP = \"\";").append(lineSeparator)
                .append("      this.qQ = false;")
                .toString();

        var result = matcher.match(mudClient);
        assertThat(result.getMemberName(), equalTo("qN"));
        assertThat(result.getMatch(), equalTo(match));
    }
}
